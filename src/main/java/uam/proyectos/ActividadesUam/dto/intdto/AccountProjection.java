package uam.proyectos.ActividadesUam.dto.intdto;

import java.math.BigDecimal;

public interface AccountProjection {
    Long getId();
    String getNombre();
    BigDecimal getTotal();
    String getCanal();
}
