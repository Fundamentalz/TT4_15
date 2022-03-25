package sg.dbs.seed.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;
import sg.dbs.seed.model.Customer;

@Component
public interface CustomerRepo extends JpaRepository<Customer, Integer> {
}
