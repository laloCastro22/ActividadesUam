package uam.proyectos.ActividadesUam.repository;



import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import uam.proyectos.ActividadesUam.dto.intdto.AccountProjection;
import uam.proyectos.ActividadesUam.entity.Account;

import java.util.List;
@Repository
public interface AccountRepository extends JpaRepository<Account, Long> {

    @Query(value = "SELECT DISTINCT a.ID as id ,a.NAME as nombre, \n" +
            " o.TOTAL as total, we.CHANNEL as canal" +
            " from account a \n" +
            " join orders o on a.ID = o.ACCOUNT_ID \n" +
            " JOIN web_events we on a.ID = we.ACCOUNT_ID \n", nativeQuery = true)
    List<AccountProjection> findAllByQuery();
}
