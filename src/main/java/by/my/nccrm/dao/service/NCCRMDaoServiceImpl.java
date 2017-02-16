package by.my.nccrm.dao.service;

import by.my.nccrm.model.Customer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import java.util.Collection;
import java.util.Collections;

@Service public class NCCRMDaoServiceImpl implements NCCRMDaoService {
    private EntityManager entityManager;
    @Autowired private EntityManagerFactory entityManagerFactory;

    @Override public EntityManager getEntityManager() {
        System.out.println("getting EM....");
        if (null == entityManager) {
            createEntityManager();
        }
        return entityManager;

    }

    private void createEntityManager() {
        System.out.println("ManagerFactory: " + entityManagerFactory);
        entityManager = entityManagerFactory.createEntityManager();
    }

    @Override public void saveCustomer(Customer customer) {
        entityManager.persist(customer);
    }

    @Override public void updateCustomer(Customer customer) {
        entityManager.merge(customer);
    }

    @Override public void deleteCustomer(Customer customer) {
        entityManager.remove(customer);
    }

    @Override public Collection<Customer> findCustomerByFirstName(String firstName) {
        return Collections.EMPTY_SET;
    }

    @Override public Collection<Customer> findCustomerByLastName(String lastName) {
        return Collections.EMPTY_SET;
    }

    @Override public Collection<Customer> findCustomerByFullName(String firstName, String lastName) {
        return Collections.EMPTY_SET;
    }
}
