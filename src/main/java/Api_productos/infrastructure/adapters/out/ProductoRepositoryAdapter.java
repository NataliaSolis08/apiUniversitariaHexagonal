package Api_productos.infrastructure.adapters.out;

import Api_productos.application.ports.out.ProductoRepositoryPort;
import Api_productos.domain.model.Producto;
import org.springframework.stereotype.Component;
import java.util.List;
import java.util.stream.Collectors;

@Component
public class ProductoRepositoryAdapter implements ProductoRepositoryPort {

    private final ProductoJpaRepository jpaRepository;

    public ProductoRepositoryAdapter(ProductoJpaRepository jpaRepository) {
        this.jpaRepository = jpaRepository;
    }

    @Override
    public Producto guardar(Producto producto) {
        // Convertir de Dominio a JPA
        ProductoJpaEntity entity = new ProductoJpaEntity(producto.getNombre(), producto.getPrecio());
        ProductoJpaEntity guardado = jpaRepository.save(entity);
        // Convertir de JPA a Dominio y retornar
        return new Producto(guardado.getId(), guardado.getNombre(), guardado.getPrecio());
    }

    @Override
    public List<Producto> listarTodos() {
        return jpaRepository.findAll().stream()
                .map(e -> new Producto(e.getId(), e.getNombre(), e.getPrecio()))
                .collect(Collectors.toList());
    }
}
