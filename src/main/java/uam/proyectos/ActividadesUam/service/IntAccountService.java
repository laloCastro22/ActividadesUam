package uam.proyectos.ActividadesUam.service;

import org.springframework.stereotype.Service;
import uam.proyectos.ActividadesUam.dto.SucursalDto;
import uam.proyectos.ActividadesUam.dto.intdto.AccountProjection;

import java.util.List;
@Service
public interface IntAccountService {
    List<SucursalDto> findSucursalesByJbdc();
    List<AccountProjection> findSucursalesByJpa();
}
