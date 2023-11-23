### **CRUD methods for database**

packet SQL contains:
- model of StudentTable with some limits for fields,
- enum with SQL_Statements and
- enum with Limits for age and grade value.

In base packet:
- DB_Connector - setting for connection to database, but url, user and password for database used from System Variables.
- Student.java - contain CRUD methods for database and implements 2 methods from another interface.
- Interface GetFromUserValue - contain 2 methods with checking limits for get correct value of age and grade from user.
- Main.java - execute in main() method all CRUD methods.
