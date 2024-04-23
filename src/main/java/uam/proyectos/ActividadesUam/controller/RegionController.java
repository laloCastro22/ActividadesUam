package uam.proyectos.ActividadesUam.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import uam.proyectos.ActividadesUam.dto.RegionDto;
import uam.proyectos.ActividadesUam.service.IntRegionService;

import java.util.List;

@RestController
@RequestMapping("/v1/region")
public class RegionController {



    private final IntRegionService regionService;

    @Autowired
    private RegionController(IntRegionService regionService) {
        this.regionService = regionService;
    }

    @GetMapping("/all")
    public List<RegionDto> getAllRegions() {
        return regionService.findAll();
    }

}
