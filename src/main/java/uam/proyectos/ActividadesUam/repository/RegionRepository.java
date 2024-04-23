package uam.proyectos.ActividadesUam.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import uam.proyectos.ActividadesUam.entity.Region;

@Repository
public interface RegionRepository extends JpaRepository<Region, Long> {
}
