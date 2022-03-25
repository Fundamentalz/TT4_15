package sg.dbs.seed.service;

import org.springframework.stereotype.Component;

@Component
public interface CustomerService {
    Boolean authenticateUser(String email, String password);
}
