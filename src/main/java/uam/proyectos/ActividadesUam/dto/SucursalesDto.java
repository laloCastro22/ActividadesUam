package uam.proyectos.ActividadesUam.dto;

import lombok.Builder;
import lombok.Data;

import java.util.List;

@Data
@Builder
public class SucursalesDto {
    List<SucursalDto> sucursales;
}
