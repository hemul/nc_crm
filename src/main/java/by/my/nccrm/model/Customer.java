package by.my.nccrm.model;

import javax.persistence.*;
import java.math.BigInteger;
import java.util.Date;

@Entity
@Table(name = "CUSTOMERS")
public class Customer {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "id_generator")
    @SequenceGenerator(name="id_generator", sequenceName = "nccrm_id_seq", initialValue=100, allocationSize=50)
    @Column(name = "CUSTOMER_ID")
    private BigInteger id;

    @ManyToOne
//    @Column(name = "TITLE")
    @JoinColumn(name = "CUSTOMER_TITLE_ID")
    private CustomerTitle title;

    @Column(name = "FIRST_NAME")
    private String firstName;

    @Column(name = "FIRST_NAME_METAPHONE")
    private String firstNameMetaphone;

    @Column(name = "LAST_NAME")
    private String lastName;

    @Column(name = "LAST_NAME_METAPHONE")
    private String lastNameMetaphone;

    @Column(name = "MODIFIED_WHEN")
    private Date modifiedWhen;

    @ManyToOne
//    @Column(name = "TYPE")
    @JoinColumn(name = "CUSTOMER_TYPE_ID")
    private CustomerType type;

    public BigInteger getId() {
        return id;
    }

    public void setId(BigInteger id) {
        this.id = id;
    }

    public CustomerTitle getTitle() {
        return title;
    }

    public void setTitle(CustomerTitle title) {
        this.title = title;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getFirstNameMetaphone() {
        return firstNameMetaphone;
    }

    public void setFirstNameMetaphone(String firstNameMetaphone) {
        this.firstNameMetaphone = firstNameMetaphone;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getLastNameMetaphone() {
        return lastNameMetaphone;
    }

    public void setLastNameMetaphone(String lastNameMetaphone) {
        this.lastNameMetaphone = lastNameMetaphone;
    }

    public Date getModifiedWhen() {
        return modifiedWhen;
    }

    public void setModifiedWhen(Date modifiedWhen) {
        this.modifiedWhen = modifiedWhen;
    }

    public CustomerType getType() {
        return type;
    }

    public void setType(CustomerType type) {
        this.type = type;
    }
}
