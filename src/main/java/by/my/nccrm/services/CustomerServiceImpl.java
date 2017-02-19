package by.my.nccrm.services;

import by.my.nccrm.dao.NCCRMDao;
import by.my.nccrm.model.Customer;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.Collection;

/**
 * Created by Anton Lizunou on 19/02/2017.
 */
@Service
public class CustomerServiceImpl implements CustomerService{
    private NCCRMDao nccrmDao;

    public NCCRMDao getNccrmDao() {
        return nccrmDao;
    }

    public void setNccrmDao(NCCRMDao nccrmDao) {
        this.nccrmDao = nccrmDao;
    }

    @Override
    @Transactional
    public void saveCustomer(Customer customer) {
        nccrmDao.saveCustomer(customer);
    }

    @Override
    @Transactional
    public void updateCustomer(Customer customer) {
        nccrmDao.updateCustomer(customer);
    }

    @Override
    @Transactional
    public void deleteCustomer(Customer customer) {
        nccrmDao.deleteCustomer(customer);
    }

    @Override
    @Transactional
    public Collection<Customer> findCustomerByFirstName(String firstName) {
        return nccrmDao.findCustomerByFirstName(firstName);
    }

    @Override
    @Transactional
    public Collection<Customer> findCustomerByLastName(String lastName) {
        return nccrmDao.findCustomerByLastName(lastName);
    }

    @Override
    @Transactional
    public Collection<Customer> findCustomerByFullName(String firstName, String lastName) {
        return nccrmDao.findCustomerByFullName(firstName,lastName);
    }
}
