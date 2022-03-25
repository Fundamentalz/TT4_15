package sg.dbs.seed.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Component;
import sg.dbs.seed.model.Customer;

@Component
public interface CustomerRepo extends JpaRepository<Customer, Integer> {

    @Query("SELECT c FROM Customer c WHERE c.id =: id")
    Customer findByID(@Param("id") Integer id);

    @Query("SELECT c FROM Customer c WHERE c.email = :email")
    Customer findByEmail(@Param("email") String email);

}
