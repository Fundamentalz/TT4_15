package sg.dbs.seed.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;
import sg.dbs.seed.model.Payment;

@Component
public interface PaymentRepo extends JpaRepository<Payment, Integer> {
}
