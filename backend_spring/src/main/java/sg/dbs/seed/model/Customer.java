package sg.dbs.seed.model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.Collection;
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

    @Column(name="customer_email")
    private String email;

    @Column(name="customer_password")
    private String password;

    @Column(name="customer_name")
    private String name;

    @Column(name="customer_phone")
    private String phone;

    @Column(name="customer_address")
    private String address;

    @Column(name="balance")
    private Double balance;

    @OneToMany (mappedBy = "customer")
    // to customerloan
    private Collection<CustomerLoan> customerLoans;
}
