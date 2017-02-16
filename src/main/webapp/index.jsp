<%@ page import="by.my.nccrm.dao.NCCRMDao" %>
<%@ page import="org.springframework.context.ConfigurableApplicationContext" %>
<%@ page import="org.springframework.context.support.ClassPathXmlApplicationContext" %>
<html>
<body>
<h2>Hello World!</h2>
<%
    ConfigurableApplicationContext context = new ClassPathXmlApplicationContext("app_config.xml");
    NCCRMDao dao = context.getBean("daoBean", NCCRMDao.class);
    dao.checkService();
%>
</body>
</html>
