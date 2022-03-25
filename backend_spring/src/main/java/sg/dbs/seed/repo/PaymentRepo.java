package sg.dbs.seed.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Component;
import sg.dbs.seed.model.Customer;
import sg.dbs.seed.model.Payment;

@Component
public interface PaymentRepo extends JpaRepository<Payment, Integer> {

    @Query("SELECT p FROM Payment p WHERE p.id =: id")
    Payment findByID(@Param("id") Integer id);

    @Query("SELECT p FROM Payment p WHERE p.payment_date =: payment_date")
    Payment findPaymentDate(@Param("payment_date") String payment_date);

    @Query("SELECT p FROM Payment p WHERE p.payment_amount =: payment_amount")
    Payment findPaymentAmount(@Param("payment_amount") Double payment_amount);
}
