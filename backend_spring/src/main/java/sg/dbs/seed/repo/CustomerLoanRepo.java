package sg.dbs.seed.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Component;
import sg.dbs.seed.model.Customer;
import sg.dbs.seed.model.CustomerLoan;

import java.util.Collection;

@Component
public interface CustomerLoanRepo extends JpaRepository<CustomerLoan, Integer> {
    @Query("SELECT cl FROM CustomerLoan cl WHERE cl.customer.id =:id")
    Collection<CustomerLoan> findCustomerLoansByCustomerID(@Param("id") Integer id);

}
