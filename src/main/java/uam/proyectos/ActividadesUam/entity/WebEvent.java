package uam.proyectos.ActividadesUam.entity;


import jakarta.persistence.*;
import lombok.*;

import java.util.Date;

@Entity
@Table(name = "web_events")
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class WebEvent {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "ACCOUNT_ID")
    private Cuenta account;

    @Column(name = "OCCURRED_AT")
    private Date occurredAt;

    private String channel;

}