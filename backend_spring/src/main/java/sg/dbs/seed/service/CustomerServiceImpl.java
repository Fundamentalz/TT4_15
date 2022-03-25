package sg.dbs.seed.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Component;
import sg.dbs.seed.model.Customer;
import sg.dbs.seed.repo.CustomerRepo;

@Component
public class CustomerServiceImpl implements CustomerService {

    @Autowired
    CustomerRepo cRepo;

    @Override
    public Boolean authenticateUser(String email, String password) {
        Customer customer = cRepo.findByEmail(email);

        BCryptPasswordEncoder encoder = new BCryptPasswordEncoder();

        if (encoder.matches(password, customer.getPassword())) {
            return true;
        } else {
            return false;
        }
    }
}
