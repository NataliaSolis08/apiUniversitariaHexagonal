package Api_productos.application.service;

import Api_productos.application.ports.in.CrearProductoUseCase;
import Api_productos.application.ports.out.ProductoRepositoryPort;
import Api_productos.domain.model.Producto;

public class ProductoService implements CrearProductoUseCase {
    private final ProductoRepositoryPort repositoryPort;

    public ProductoService(ProductoRepositoryPort repositoryPort) {
        this.repositoryPort = repositoryPort;
    }

    @Override
    public Producto crearProducto(Producto producto) {
        return repositoryPort.guardar(producto);
    }
}
