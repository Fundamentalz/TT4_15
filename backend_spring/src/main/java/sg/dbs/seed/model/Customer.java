package sg.dbs.seed.model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;

@Entity
@Getter
@Setter
@NoArgsConstructor
public class Customer {

    @Id
    @Column(name = "CustomerId")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String name;

    private String phone;

    private String address;

    private Double balance;

    @OneToMany(mappedBy = "customer")
    private List<CustomerLoan> customerLoans;
}
