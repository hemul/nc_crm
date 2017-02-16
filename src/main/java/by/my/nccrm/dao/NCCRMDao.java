package by.my.nccrm.dao;

import by.my.nccrm.model.Customer;

import java.util.Collection;

/**
 * Created by anli0415 on 16.02.2017.
 */
public interface NCCRMDao {
    void checkService();
    void saveCustomer(Customer customer);
    void updateCustomer(Customer customer);
    void deleteCustomer(Customer customer);
    Collection<Customer> findCustomerByFirstName(String firstName);
    Collection<Customer> findCustomerByLastName(String lastName);
    Collection<Customer> findCustomerByFullName(String firstName, String lastName);
}
