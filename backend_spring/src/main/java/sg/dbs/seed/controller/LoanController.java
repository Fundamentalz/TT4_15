package sg.dbs.seed.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import sg.dbs.seed.model.Loan;
import sg.dbs.seed.repo.CustomerLoanRepo;
import sg.dbs.seed.repo.LoanRepo;

import java.util.List;

@RestController
@RequestMapping("/api/loan")
@CrossOrigin(origins="http://localhost:3000")
public class LoanController {

    @Autowired
    LoanRepo lRepo;

    @Autowired
    CustomerLoanRepo clRepo;

//    @GetMapping("/all")
//    public List<Loan> findAllLoans(@RequestParam("id") Integer id) {
//        Customer customer =
//    }

}
