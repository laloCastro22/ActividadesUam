package uam.proyectos.ActividadesUam.entity;

import jakarta.persistence.*;
import lombok.*;

import java.math.BigDecimal;
import java.util.Date;

@Entity
@Table(name = "orders")
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Orden {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "ACCOUNT_ID")
    private Cuenta cuenta;

    @Column(name = "OCCURRED_AT")
    private Date occurredAt;


    private Integer posterQty;
    private Integer total;

    @Column(name = "standard_amt_usd", precision = 10, scale = 2)
    private BigDecimal standardAmtUsd;

    @Column(name = "gloss_amt_usd", precision = 10, scale = 2)
    private BigDecimal glossAmtUsd;

    @Column(name = "poster_amt_usd", precision = 10, scale = 2)
    private BigDecimal posterAmtUsd;

    @Column(name = "total_amt_usd", precision = 10, scale = 2)
    private BigDecimal totalAmtUsd;


}