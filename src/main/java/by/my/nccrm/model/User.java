package by.my.nccrm.model;

import javax.persistence.*;
import java.math.BigInteger;

@Entity
@Table(name = "USERS")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "id_generator")
    @SequenceGenerator(name="id_generator", sequenceName = "nccrm_id_seq", initialValue=100, allocationSize=50)
    @Column(name = "USER_ID")
    private BigInteger id;

    public BigInteger getId() {
        return id;
    }

    public void setId(BigInteger id) {
        this.id = id;
    }
}
