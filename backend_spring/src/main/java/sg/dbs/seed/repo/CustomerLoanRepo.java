package sg.dbs.seed.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;
import sg.dbs.seed.model.CustomerLoan;

@Component
public interface CustomerLoanRepo extends JpaRepository<CustomerLoan, Integer> {
}
