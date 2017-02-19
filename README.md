# nccrm
## Application settings:
* Tomcat 8 settings:
1. Add folowing **Resource** section in **context.xml**:
<Resource name="jdbc/NCCRMDB" auth="Container" 
          type="javax.sql.DataSource"
	      driverClassName="org.postgresql.Driver"
          url="jdbc:postgresql://localhost:5432/nccrm"
	      username="nccrm" password="nccrm"
	      maxActive="30" maxIdle="30" maxTotal="100" maxWaitMillis="10000" initialSize="10"/>
	 
* PostgreSQL 9.5 settings:
1. Create schema nccrm.
2. Create user nccrm with password nccrm.

###TODO:
- [x] Rework spring JPA configuration
- [x] Rework DAO Servise Layer
- [] Add constraints to Entity beans
