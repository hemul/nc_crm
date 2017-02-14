package by.my.nccrm.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.math.BigInteger;

@Entity
public class User {

    private BigInteger id;

    @Id public BigInteger getId() {
        return id;
    }

    public void setId(BigInteger id) {
        this.id = id;
    }
}
