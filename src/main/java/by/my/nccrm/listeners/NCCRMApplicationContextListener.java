package by.my.nccrm.listeners;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import javax.servlet.ServletContext;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

/**
 * Created by Anton Lizunou on 19/02/2017.
 */
public class NCCRMApplicationContextListener implements ServletContextListener{

    private ConfigurableApplicationContext context;

    @Override
    public void contextInitialized(ServletContextEvent servletContextEvent) {
        ServletContext servletContext = servletContextEvent.getServletContext();
        context = new ClassPathXmlApplicationContext("app_config.xml");
        Runtime.getRuntime().addShutdownHook(new Thread(){
            @Override
            public void run() {
                context.close();
            }
        });
        servletContext.setAttribute("ApplicationContext", context);
    }

    @Override
    public void contextDestroyed(ServletContextEvent servletContextEvent) {
        context.close();
    }
}
