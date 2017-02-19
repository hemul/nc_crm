package by.my.nccrm.dao;

import by.my.nccrm.model.Customer;

import javax.persistence.EntityManager;
import java.util.Collection;

public interface NCCRMDao {
    void saveCustomer(Customer customer);
    void updateCustomer(Customer customer);
    void deleteCustomer(Customer customer);
    Collection<Customer> findCustomerByFirstName(String firstName);
    Collection<Customer> findCustomerByLastName(String lastName);
    Collection<Customer> findCustomerByFullName(String firstName, String lastName);
}
