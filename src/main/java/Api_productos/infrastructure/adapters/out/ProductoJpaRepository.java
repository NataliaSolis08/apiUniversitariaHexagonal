package Api_productos.infrastructure.adapters.out;

import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductoJpaRepository extends JpaRepository<ProductoJpaEntity, Long> {
}
