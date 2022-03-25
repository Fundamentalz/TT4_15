package sg.dbs.seed.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import sg.dbs.seed.model.Customer;
import sg.dbs.seed.model.CustomerLoan;
import sg.dbs.seed.model.Loan;
import sg.dbs.seed.repo.CustomerLoanRepo;
import sg.dbs.seed.repo.CustomerRepo;
import sg.dbs.seed.repo.LoanRepo;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/api/loan")
@CrossOrigin(origins="http://localhost:3000")
public class LoanController {

    @Autowired
    LoanRepo lRepo;

    @Autowired
    CustomerLoanRepo clRepo;

    @Autowired
    CustomerRepo cRepo;

    // Get all of the loan by customer
    @GetMapping("/all")
    public List<Loan> findAllLoansByCustomer(@RequestParam String email) {
        Customer customer = cRepo.findByEmail(email);
        Integer customer_id = customer.getId();

        List<CustomerLoan> customerLoans = (List<CustomerLoan>) clRepo.findCustomerLoansByCustomerID(customer_id);

        List<Loan> loans = new ArrayList<>();

        for (CustomerLoan cl : customerLoans) {
            loans.add(cl.getLoan());
        }

        return loans;
    }

    // Creating a new loan
    @PostMapping("/new")
    public Map<String, String> createLoan(@RequestBody Loan newLoan) {
        
    }


}
