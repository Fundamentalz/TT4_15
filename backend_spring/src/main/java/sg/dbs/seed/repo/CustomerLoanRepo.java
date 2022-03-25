package sg.dbs.seed.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Component;
import sg.dbs.seed.model.CustomerLoan;
import sg.dbs.seed.model.Loan;

@Component
public interface CustomerLoanRepo extends JpaRepository<CustomerLoan, Integer> {

    @Query("SELECT cl FROM CustomerLoan cl WHERE cl.customerloanid =: CustomerLoanId")
    CustomerLoan findByCustomerLoanId(@Param("id") Integer id);

    @Query("SELECT cl FROM CustomerLoan cl WHERE cl.customerid=: customer")
    CustomerLoan findByCustomerId(@Param("customer") Integer customer);

    @Query("SELECT cl FROM CustomerLoan cl WHERE cl.loanid =: loan")
    CustomerLoan findByLoanId(@Param("loan") Integer loan);
}
