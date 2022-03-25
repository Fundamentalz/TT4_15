package sg.dbs.seed.model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.Collection;
import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@Entity
public class Loan {

    @Id
    @Column(name = "LoanId")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "loan_amount")
    private Double loan_amount;

    @OneToMany(mappedBy = "loan")
    // to customerloan
    private Collection<CustomerLoan> customerLoans;

    @OneToMany(mappedBy = "loan")
    // to payment
    private Collection<Payment> payments;
}
