package Api_productos.infrastructure.adapters.in;

import Api_productos.application.ports.in.CrearProductoUseCase;
import Api_productos.domain.model.Producto;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/productos")
public class ProductoController {

    private final CrearProductoUseCase crearProductoUseCase;

    public ProductoController(CrearProductoUseCase crearProductoUseCase) {
        this.crearProductoUseCase = crearProductoUseCase;
    }

    @PostMapping
    public Producto crear(@RequestBody Producto producto) {
        return crearProductoUseCase.crearProducto(producto);
    }
}
