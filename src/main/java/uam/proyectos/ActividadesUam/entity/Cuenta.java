package uam.proyectos.ActividadesUam.entity;

import jakarta.persistence.*;
import lombok.*;

import java.math.BigDecimal;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "account")
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Cuenta {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String nombre;

    private String website;

    @Column(precision = 9, scale = 6)
    private BigDecimal latitud;

    @Column(name = "LONGITUDE", precision = 9, scale = 6)
    private BigDecimal longitud;

    @Column(name = "PRIMARY_POC")
    private String primaryPoc;

    @OneToMany(cascade = CascadeType.ALL,fetch = FetchType.LAZY, mappedBy = "cuenta")
    private Set<Orden> ordenes = new HashSet<>(0);

}