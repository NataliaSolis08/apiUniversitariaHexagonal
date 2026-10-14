package Api_productos.application.ports.out;

import Api_productos.domain.model.Producto;
import java.util.List;

public interface ProductoRepositoryPort {
    Producto guardar(Producto producto);
    List<Producto> listarTodos();
}
