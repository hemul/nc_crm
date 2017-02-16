package by.my.nccrm.dao.service;

import by.my.nccrm.model.Customer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.jpa.JpaTransactionManager;
import org.springframework.stereotype.Service;
import org.springframework.transaction.TransactionDefinition;
import org.springframework.transaction.TransactionStatus;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.transaction.support.DefaultTransactionDefinition;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import java.util.Collection;
import java.util.Collections;

@Service
public class NCCRMDaoServiceImpl implements NCCRMDaoService {
    private EntityManager entityManager;

    @Autowired
    private JpaTransactionManager txManager;

    @Autowired
    private EntityManagerFactory entityManagerFactory;

    public EntityManagerFactory getEntityManagerFactory() {
        return entityManagerFactory;
    }

    public void setEntityManagerFactory(EntityManagerFactory entityManagerFactory) {
        System.out.println("Setting EM");
        this.entityManagerFactory = entityManagerFactory;
        createEntityManager();
    }

    public JpaTransactionManager getTxManager() {
        return txManager;
    }

    public void setTxManager(JpaTransactionManager txManager) {
        this.txManager = txManager;
    }

    @Override
    public EntityManager getEntityManager() {
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

    @Override
    @Transactional
    public void saveCustomer(Customer customer) {
        EntityTransaction transaction  = entityManager.getTransaction();
        transaction.begin();
        entityManager.persist(customer.getTitle());
//        entityManager.persist(customer.getType());
        entityManager.persist(customer);
        transaction.commit();
    }

    @Override
    @Transactional
    public void updateCustomer(Customer customer) {
        entityManager.merge(customer);
    }

    @Override
    @Transactional
    public void deleteCustomer(Customer customer) {
        entityManager.remove(customer);
    }

    @Override
    public Collection<Customer> findCustomerByFirstName(String firstName) {
        return Collections.EMPTY_SET;
    }

    @Override
    public Collection<Customer> findCustomerByLastName(String lastName) {
        return Collections.EMPTY_SET;
    }

    @Override
    public Collection<Customer> findCustomerByFullName(String firstName, String lastName) {
        return Collections.EMPTY_SET;
    }
}
