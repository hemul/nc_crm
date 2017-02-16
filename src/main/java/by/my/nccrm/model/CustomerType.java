package by.my.nccrm.model;

import javax.persistence.*;
import java.math.BigInteger;

@Entity
@Table(name = "CUSTOMER_TYPES")
public class CustomerType {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "id_generator")
    @SequenceGenerator(name="id_generator", sequenceName = "nccrm_id_seq", initialValue=100, allocationSize=50)
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
