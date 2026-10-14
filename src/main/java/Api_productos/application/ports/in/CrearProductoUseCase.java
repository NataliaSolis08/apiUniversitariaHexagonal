package Api_productos.application.ports.in;

import Api_productos.domain.model.Producto;

public interface CrearProductoUseCase {
    Producto crearProducto(Producto producto);
}
