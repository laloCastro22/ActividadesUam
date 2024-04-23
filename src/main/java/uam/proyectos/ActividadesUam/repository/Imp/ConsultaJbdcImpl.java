package uam.proyectos.ActividadesUam.repository.Imp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.stereotype.Repository;
import uam.proyectos.ActividadesUam.dto.SucursalDto;
import uam.proyectos.ActividadesUam.repository.ConsultaJbdc;
import uam.proyectos.ActividadesUam.utils.mappers.SucursalMapper;

import java.util.List;

@Repository
public class ConsultaJbdcImpl implements ConsultaJbdc {
    private final NamedParameterJdbcTemplate jdbcTemplate;

    @Autowired
    public ConsultaJbdcImpl(NamedParameterJdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    @Override
    public List<SucursalDto> findSucursales() {
        return jdbcTemplate.query(queryFindSucursales(), new SucursalMapper());
    }

    private String queryFindSucursales() {
        return "SELECT DISTINCT a.ID as id ,a.NAME as nombre, \n" +
                " o.TOTAL as total, we.CHANNEL as canal" +
                " from account a \n" +
                " join  orders o on a.ID = o.ACCOUNT_ID \n" +
                " JOIN web_events we on a.ID = we.ACCOUNT_ID \n";
    }
}
