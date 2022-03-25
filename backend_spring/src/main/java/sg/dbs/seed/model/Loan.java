package sg.dbs.seed.model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.annotations.LazyCollection;
import org.hibernate.annotations.LazyCollectionOption;

import javax.persistence.*;
import javax.validation.constraints.Past;
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

    private Double loan_amount;

    @OneToMany(mappedBy = "loan")
    @LazyCollection(LazyCollectionOption.FALSE)
    private List<CustomerLoan> customerLoans;

    @OneToMany(mappedBy = "payment")
    @LazyCollection(LazyCollectionOption.FALSE)
    private List<Payment> payments;
}
