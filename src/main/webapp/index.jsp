<%@ page import="by.my.nccrm.dao.NCCRMDao" %>
<%@ page import="org.springframework.context.ConfigurableApplicationContext" %>
<%@ page import="org.springframework.context.support.ClassPathXmlApplicationContext" %>
<%@ page import="by.my.nccrm.model.CustomerTitle" %>
<%@ page import="java.math.BigInteger" %>
<%@ page import="by.my.nccrm.model.CustomerType" %>
<%@ page import="by.my.nccrm.model.Customer" %>
<%@ page import="java.util.Date" %>
<%@ page import="by.my.nccrm.dao.service.NCCRMDaoService" %>
<html>
<body>
<h2>Hello World!</h2>
<%
    ConfigurableApplicationContext context = new ClassPathXmlApplicationContext("app_config.xml");
    NCCRMDao dao = context.getBean("daoBean", NCCRMDao.class);
    dao.checkService();

    CustomerTitle title = new CustomerTitle();
    title.setId(BigInteger.valueOf(1L));
    title.setTitle("Mr");
    CustomerType type = new CustomerType();
    type.setId(BigInteger.valueOf(5L));
    type.setCustomerType("Residential");

    Customer customer = new Customer();
    customer.setId(BigInteger.valueOf(2L));
    customer.setFirstName("Anton");
    customer.setLastName("Lizunou");
    customer.setTitle(title);
    customer.setType(type);
    customer.setModifiedWhen(new Date());

    dao.saveCustomer(customer);
%>
</body>
</html>
