package uam.proyectos.ActividadesUam.utils.mappers;

import org.springframework.jdbc.core.RowMapper;
import uam.proyectos.ActividadesUam.dto.SucursalDto;

import java.sql.ResultSet;
import java.sql.SQLException;


public class SucursalMapper implements RowMapper<SucursalDto> {

    @Override
    public SucursalDto mapRow(ResultSet rs, int rowNum) throws SQLException {
        SucursalDto sucursal= new SucursalDto();
        sucursal.setId(rs.getLong("id"));
        sucursal.setNombre(rs.getString("nombre"));
        sucursal.setTotal(rs.getDouble("total"));
        sucursal.setCanal(rs.getString("canal"));
        return sucursal;
    }
}
