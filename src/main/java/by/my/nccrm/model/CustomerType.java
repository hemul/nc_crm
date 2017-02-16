package by.my.nccrm.model;

import javax.persistence.*;
import java.math.BigInteger;

@Entity
@Table(name = "CUSTOMER_TYPES")
public class CustomerType {

    @Id
//    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "id_generator")
    @Column(name = "CUSTOMER_TYPE_ID")
    private BigInteger id;

    @Column(name = "CUSTOMER_TYPE_CAPTION")
    private String customerType;

    public BigInteger getId() {
        return id;
    }

    public void setId(BigInteger id) {
        this.id = id;
    }

    public String getCustomerType() {
        return customerType;
    }

    public void setCustomerType(String customerType) {
        this.customerType = customerType;
    }

}
