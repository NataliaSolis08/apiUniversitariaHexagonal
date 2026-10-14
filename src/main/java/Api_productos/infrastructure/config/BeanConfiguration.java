package Api_productos.infrastructure.config;

import Api_productos.application.ports.out.ProductoRepositoryPort;
import Api_productos.application.service.ProductoService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BeanConfiguration {

    @Bean
    public ProductoService productoService(ProductoRepositoryPort repositoryPort) {
        return new ProductoService(repositoryPort);
    }
}