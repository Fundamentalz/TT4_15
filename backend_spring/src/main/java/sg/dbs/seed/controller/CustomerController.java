package sg.dbs.seed.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import sg.dbs.seed.model.Customer;
import sg.dbs.seed.repo.CustomerRepo;
import sg.dbs.seed.service.CustomerService;

@RestController
@RequestMapping("/api/customer")
@CrossOrigin(origins="http://localhost:3000")
public class CustomerController {

    @Autowired
    private CustomerRepo cRepo;

    @Autowired
    private CustomerService cService;

    @PostMapping("/login")
    public Customer authenticateLogin(@RequestParam String email, @RequestParam String password) {
        Boolean authenticated = cService.authenticateUser(email, password);

        if (authenticated) {
            Customer customer = cRepo.findByEmail(email);
            return customer;
        } else {
            return null;
        }
    }
}
