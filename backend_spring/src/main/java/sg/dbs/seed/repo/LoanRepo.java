package sg.dbs.seed.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Component;
import sg.dbs.seed.model.Customer;
import sg.dbs.seed.model.Loan;

@Component
public interface LoanRepo extends JpaRepository<Loan, Integer> {

    @Query("SELECT l FROM Loan l WHERE l.loan_amount =: loan_amount")
    Loan findByloanamount(@Param("loan_amount") Integer loan_amount);

    @Query("SELECT l FROM Loan l WHERE l.LoanId =: id")
    Loan findByLoanID(@Param("id") Integer id);
}
