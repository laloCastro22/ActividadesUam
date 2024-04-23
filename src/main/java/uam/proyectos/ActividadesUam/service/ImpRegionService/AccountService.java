package uam.proyectos.ActividadesUam.service.ImpRegionService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import uam.proyectos.ActividadesUam.dto.SucursalDto;
import uam.proyectos.ActividadesUam.dto.intdto.AccountProjection;
import uam.proyectos.ActividadesUam.repository.AccountRepository;
import uam.proyectos.ActividadesUam.repository.ConsultaJbdc;
import uam.proyectos.ActividadesUam.service.IntAccountService;

import java.util.List;

@Service
public class AccountService implements IntAccountService {

    private final ConsultaJbdc consultaJbdc;
    private final AccountRepository accountRepository;

    @Autowired
    public AccountService(ConsultaJbdc consultaJbdc, AccountRepository accountRepository) {
        this.consultaJbdc = consultaJbdc;
        this.accountRepository = accountRepository;
    }


    @Override
    public List<SucursalDto> findSucursalesByJbdc() {
        return this.consultaJbdc.findSucursales();
    }

    @Override
    public List<AccountProjection> findSucursalesByJpa() {
        return accountRepository.findAllByQuery();
    }


}

