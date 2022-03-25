package sg.dbs.seed.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.web.bind.annotation.*;
import sg.dbs.seed.model.Customer;
import sg.dbs.seed.repo.CustomerRepo;
import sg.dbs.seed.service.CustomerService;

import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/api/customer")
//@CrossOrigin(origins="http://localhost:3000")
public class CustomerController {

    @Autowired
    private CustomerRepo cRepo;

    @Autowired
    private CustomerService cService;

    @PostMapping("/login")
    public Customer authenticateLogin(@RequestBody String email, @RequestBody String password) {

        Boolean authenticated = cService.authenticateUser(email, password);

        if (authenticated) {
            Customer customer = cRepo.findByEmail(email);
            return customer;
        } else {
            return null;
        }
    }

    @PostMapping("/register")
    public Map<String, String> registerCustomer(@RequestBody String name,
                                                @RequestBody String phone,
                                                @RequestBody String address,
                                                @RequestBody String email,
                                                @RequestBody String password) {

        Map<String, String> response = new HashMap<>();

        // Check for existing user
        Customer c1 = cRepo.findByEmail(email);
        if (c1 != null) {
            response.put("status", "Username error");
            return response;
        } else {
            Customer newCustomer = new Customer();
            newCustomer.setName(name);
            newCustomer.setPhone(phone);
            newCustomer.setAddress(address);
            newCustomer.setEmail(email);
            newCustomer.setPassword(password);

            BCryptPasswordEncoder encoder = new BCryptPasswordEncoder();
            String encodedPassword = encoder.encode(newCustomer.getPassword());
            newCustomer.setPassword(encodedPassword);

            response.put("status", "OK");
            response.put("id", newCustomer.getId().toString());
            return response;
        }
    }
}
