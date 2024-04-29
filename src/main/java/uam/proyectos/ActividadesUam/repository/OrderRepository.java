package uam.proyectos.ActividadesUam.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import uam.proyectos.ActividadesUam.entity.Orden;

@Repository
public interface OrderRepository extends JpaRepository<Orden, Long> {
}
