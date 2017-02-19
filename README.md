# nccrm
## Application settings:
1. Tomcat 8 settings:
* Add folowing **Resource** section in **context.xml**:
```xml
<Resource name="jdbc/NCCRMDB" auth="Container" 
        type="javax.sql.DataSource"
        driverClassName="org.postgresql.Driver"
        url="jdbc:postgresql://localhost:5432/nccrm"
        username="nccrm" password="nccrm"
        maxActive="30" maxIdle="30" maxTotal="100" maxWaitMillis="10000" initialSize="10"/>
```

2. PostgreSQL 9.5 settings:
* Create user **nccrm** with password '**nccrm**'.
* Create schema **nccrm** and set user **nccrm** as database owner.

###TODO:
- [x] Rework spring JPA configuration
- [x] Rework DAO Servise Layer
- [] Add constraints to Entity beans
