package uam.proyectos.ActividadesUam.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import uam.proyectos.ActividadesUam.entity.Order;

@Repository
public interface OrderRepository extends JpaRepository<Order, Long> {
}
