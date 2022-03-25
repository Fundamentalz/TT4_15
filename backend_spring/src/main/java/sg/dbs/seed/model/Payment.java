package sg.dbs.seed.model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.time.LocalDate;

@Getter
@Setter
@NoArgsConstructor
@Entity
public class Payment {
    @Id
    @Column(name = "PaymentId")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private LocalDate payment_date;

    private Double payment_amount;

    @ManyToOne
    private Loan loan;

}
