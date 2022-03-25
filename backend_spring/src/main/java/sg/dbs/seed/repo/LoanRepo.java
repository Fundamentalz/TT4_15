package sg.dbs.seed.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Component;
import sg.dbs.seed.model.Loan;

public interface LoanRepo extends JpaRepository<Loan, Integer> {

    @Query("SELECT l FROM Loan l WHERE l.id =: id")
    Loan findByID(@Param("id") Integer id);
}
