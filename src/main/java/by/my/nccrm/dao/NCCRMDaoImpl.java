package by.my.nccrm.dao;

import by.my.nccrm.model.Customer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.Collection;
import java.util.Collections;

@Repository
public class NCCRMDaoImpl implements NCCRMDao {
    private static final Logger LOG = LoggerFactory.getLogger(NCCRMDaoImpl.class);

    @PersistenceContext
    private EntityManager entityManager;

    public void setEntityManager(EntityManager entityManager) {
        LOG.debug("Injected Entity Manager: {}", entityManager);
        this.entityManager = entityManager;
    }

    public EntityManager getEntityManager() {
        return entityManager;
    }

    @Override
    public void saveCustomer(Customer customer) {
        entityManager.persist(customer.getTitle());
        entityManager.persist(customer.getType());
        entityManager.persist(customer);
    }

    @Override
    public void updateCustomer(Customer customer) {
        entityManager.merge(customer);
    }

    @Override
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
