package uam.proyectos.ActividadesUam.repository;

import uam.proyectos.ActividadesUam.dto.SucursalDto;

import java.util.List;

public interface ConsultaJbdc {
    public List<SucursalDto> findSucursales();
}
