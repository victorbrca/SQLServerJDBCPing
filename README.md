# SQLServerJDBCPing
A simple SQLServer JDBC ping for Linux

Instructions
===

a. Download Microsoft JDBC Driver for SQL Server - [link](https://docs.microsoft.com/en-us/sql/connect/jdbc/download-microsoft-jdbc-driver-for-sql-server?view=sql-server-ver15)

b. Install Java

c. Download 'SQLServerJDBCPing.java'

d. Set `JAVA_HOME` and PATH

e. Create the Java class file

Example

```
javac -cp .:mssql-jdbc-9.2.1.jre8.jar SQLServerJDBCPing.java
```

f. Execute the script with the JDBC URL as argument

```
java -cp .:mssql-jdbc-9.2.1.jre8.jar SQLServerJDBCPing "jdbc:sqlserver://db.database.windows.net:1433;database=db-name;user=user;password=secretepassword"
```
