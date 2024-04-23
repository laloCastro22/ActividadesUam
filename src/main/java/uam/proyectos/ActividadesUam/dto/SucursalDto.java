package uam.proyectos.ActividadesUam.dto;

import lombok.*;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class SucursalDto {
    private Long id;
    private String nombre;
    private Double total;
    private String canal;
}
