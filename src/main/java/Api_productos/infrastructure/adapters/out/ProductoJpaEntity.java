package Api_productos.infrastructure.adapters.out;

import jakarta.persistence.*;

@Entity
@Table(name = "productos")
public class ProductoJpaEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nombre;
    private Double precio;

    public ProductoJpaEntity() {}

    public ProductoJpaEntity(String nombre, Double precio) {
        this.nombre = nombre;
        this.precio = precio;
    }

    // Getters y Setters
    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }
    public String getNombre() { return nombre; }
    public void setNombre(String nombre) { this.nombre = nombre; }
    public Double getPrecio() { return precio; }
    public void setPrecio(Double precio) { this.precio = precio; }
}
