package by.my.nccrm.dao;

import by.my.nccrm.dao.service.NCCRMDaoService;
import by.my.nccrm.model.Customer;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.Collection;

/**
 * Created by anli0415 on 16.02.2017.
 */

public class NCCRMDaoImpl implements NCCRMDao{
    @Autowired
    private NCCRMDaoService service;

    @Override public void checkService() {
        System.out.println(service);
    }

    @Override public void saveCustomer(Customer customer) {
        service.saveCustomer(customer);
    }

    @Override public void updateCustomer(Customer customer) {
        service.updateCustomer(customer);
    }

    @Override public void deleteCustomer(Customer customer) {
        service.deleteCustomer(customer);
    }

    @Override public Collection<Customer> findCustomerByFirstName(String firstName) {
        return service.findCustomerByFirstName(firstName);
    }

    @Override public Collection<Customer> findCustomerByLastName(String lastName) {
        return service.findCustomerByLastName(lastName);
    }

    @Override public Collection<Customer> findCustomerByFullName(String firstName, String lastName) {
        return service.findCustomerByFullName(firstName, lastName);
    }
}
