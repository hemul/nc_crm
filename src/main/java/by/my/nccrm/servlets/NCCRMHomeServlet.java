package by.my.nccrm.servlets;

import by.my.nccrm.dao.NCCRMDao;
import by.my.nccrm.model.Customer;
import by.my.nccrm.model.CustomerTitle;
import by.my.nccrm.model.CustomerType;
import by.my.nccrm.services.CustomerService;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;

public class NCCRMHomeServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doAction(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doAction(request, response);
    }

    private void doAction(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        PrintWriter out = response.getWriter();
        out.println("Home Servlet");
        String firstName = request.getParameter("firstName");
        String lastName = request.getParameter("lastName");

        ConfigurableApplicationContext context = (ConfigurableApplicationContext) getServletContext().getAttribute("ApplicationContext");

        CustomerService customerService = context.getBean("customerService", CustomerService.class);

        try {
            CustomerTitle title = new CustomerTitle();
            title.setTitle("Mr");

            CustomerType type = new CustomerType();
            type.setCustomerType("Residential");

            Customer customer = new Customer();
            customer.setFirstName(firstName);
            customer.setLastName(lastName);
            customer.setTitle(title);
            customer.setType(type);
            customer.setModifiedWhen(new Date());

            customerService.saveCustomer(customer);
        } catch (Throwable ex) {
            ex.printStackTrace();
        }
    }
}
