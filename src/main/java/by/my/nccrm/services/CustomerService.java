package by.my.nccrm.services;

import by.my.nccrm.model.Customer;

import java.util.Collection;

/**
 * Created by Anton Lizunou on 19/02/2017.
 */
public interface CustomerService {
    void saveCustomer(Customer customer);
    void updateCustomer(Customer customer);
    void deleteCustomer(Customer customer);
    Collection<Customer> findCustomerByFirstName(String firstName);
    Collection<Customer> findCustomerByLastName(String lastName);
    Collection<Customer> findCustomerByFullName(String firstName, String lastName);
}
