package uam.proyectos.ActividadesUam.entity;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "SALES_REP")
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class SalesRep {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String nombre;

    @ManyToOne
    @JoinColumn(name = "REGION_ID")
    private Region region;

}
