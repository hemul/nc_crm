package by.my.nccrm.model;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.CoreMatchers.notNullValue;
import static org.junit.Assert.assertThat;

public class UserTest {

    @Test
    public void userIsCreatedUsingDefaultConstructor() throws Exception {
        User user = new User();
        assertThat(user, is(notNullValue()));
    }
}