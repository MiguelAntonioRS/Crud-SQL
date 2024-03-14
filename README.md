Student Management CRUD Application

This is a Java application that utilizes Swing for the graphical user interface (GUI) and JDBC to interact with a database. The application allows performing basic Create, Read, Update, and Delete (CRUD) operations on student records.
## Requirements

* Java Development Kit (JDK) 8 or higher.
* MySQL Server (or another compatible database management system).
* Apache Maven (optional, only if you want to build the project from source code).

## Database Setup

  Install and configure a local or remote SQL server.
  Create a database named `db_students`.
  Execute the `db_students.sql` script to create the `TBStudents` table which should have columns `id int identity Specification`, ```matricula varchar(50)```, ```nombre varchar(50)```, ```email varchar(100)```, ```edad int```, ```sexo char(1)```, ```activo int```.

## Execution

1.  Clone or download this repository.
   ```
git clone https://github.com/MiguelAntonioRS/Crud-SQL.git
```
2. Open a terminal (or CMD) and navigate to the project location.
3. Compile the project (optional if the compiled JAR file has not been downloaded):
    ```
    mvn compile
    ```
4. Run the application:
    ```
    java -jar StudentCRUD.jar
    ```
5. The application should start, and the user interface should be displayed.

## Usage

Once the application is up and running, you can perform the following operations:

* Add: Fill in the input fields and click "Save".
* Modify: Click on a row in the table to select a student, modify the data in the input fields, and click "Modify".
* Delete: Click on a row in the table to select a student and click "Delete".
* Clear: Clears all input fields.

## Contributions

Contributions are welcome. If you have any ideas to improve this application, feel free to open an issue or send a pull request.


