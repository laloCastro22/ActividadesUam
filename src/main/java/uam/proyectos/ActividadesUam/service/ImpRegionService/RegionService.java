package uam.proyectos.ActividadesUam.service.ImpRegionService;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import uam.proyectos.ActividadesUam.dto.RegionDto;
import uam.proyectos.ActividadesUam.entity.Region;
import uam.proyectos.ActividadesUam.repository.RegionRepository;
import uam.proyectos.ActividadesUam.service.IntRegionService;

import java.util.List;
@Service
public class RegionService implements IntRegionService {

    private final RegionRepository regionRepository;

    @Autowired
    public RegionService(RegionRepository regionRepository) {
        this.regionRepository = regionRepository;
    }


    @Override
    public List<RegionDto> findAll() {
        List<Region> region = this.regionRepository.findAll();
        return region.stream().map(this::mapRegionToRegionDto).toList();
    }

    private RegionDto mapRegionToRegionDto(Region region) {
        return RegionDto.builder()
                .id(region.getId())
                .name(region.getNombre())
                .build();
    }
}
