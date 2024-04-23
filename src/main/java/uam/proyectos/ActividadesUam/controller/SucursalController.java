package uam.proyectos.ActividadesUam.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import uam.proyectos.ActividadesUam.dto.SucursalDto;
import uam.proyectos.ActividadesUam.dto.intdto.AccountProjection;
import uam.proyectos.ActividadesUam.service.IntAccountService;

import java.util.List;

@RestController
@RequestMapping("/v1/sucursal")
public class SucursalController {
    private final IntAccountService accountService;

    @Autowired
    public SucursalController(IntAccountService accountService) {
        this.accountService = accountService;
    }

    @GetMapping("/all-jbdc")
    public List<SucursalDto> getAllSucursalesByJbdc() {
        return accountService.findSucursalesByJbdc();
    }

    @GetMapping("/all-jpa")
    public List<AccountProjection> getAllSucursalesByJpa() {
        return accountService.findSucursalesByJpa();
    }
}
