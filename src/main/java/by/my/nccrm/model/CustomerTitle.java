package by.my.nccrm.model;

import javax.persistence.*;
import java.math.BigInteger;

@Entity
@Table(name = "CUSTOMER_TITLES")
public class CustomerTitle {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "id_generator")
    @SequenceGenerator(name="id_generator", sequenceName = "nccrm_id_seq", initialValue=100, allocationSize=50)
    @Column(name = "CUSTOMER_TITLE_ID")
    private BigInteger id;

    @Column(name = "CUSTOMER_TITLE_CAPTION")
    private String title;

    public BigInteger getId() {
        return id;
    }

    public void setId(BigInteger id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}
