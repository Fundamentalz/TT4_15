package sg.dbs.seed.model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Getter
@Setter
@NoArgsConstructor
@Entity
public class CustomerLoan {
    @Id
    @Column(name = "CustomerLoanId")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @ManyToOne
    private Customer customer;

    @ManyToOne
    private Loan loan;
}
