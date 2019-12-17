# Java-CRUD
Java Spring Boot CRUD app

  Simple CRUD application that uses Spring Boot.  Once you clone the repo and open the project in your chosen Java Spring IDE (ie Eclipse, IntelliJ, etc). The only thing that will need your modification is the "application.properties" inside the "src/main/resources" folder.  You will replace {yourUsername} with your MySQL username, and {yourPassword} with your MySQL password. You will also need to create your database using whatever MySQL client your prefer like MySQL Workbench.  And then replace {yourDatabase} with the name of your created database.

--------------------------------------------------------------------------------------
src
  -main
    -resource (folder):
      -application.properties
  
application.properties (file): 
  spring.datasource.url=jdbc:mysql://localhost:3306/{yourDatabase}?useSSL=false
  spring.datasource.username={yourUsername}
  spring.datasource.password={yourPassword}

should look like:
  spring.datasource.url=jdbc:mysql://localhost:3306/javaCRUDdb?useSSL=false
  spring.datasource.username=root
  spring.datasource.password=password
  
Using MySQL Client of your choice (ie: MySQL Workbench), create your database:
  CREATE DATABASE javaCRUDdb;
  
---------------------------------------------------------------------------------------
  
  Now you can run the project as a "Java Application." User.java inside "src/main/java/restservice/entity" is your model that will be used for MySQL to create the User Table where the data that you (C)reate, (R)ead, (U)pdated, and (D)elete will be stored. Using POSTMAN, you can use the GET, POST, PUT, DELETE request to test out the different outcomes. Just make sure your "Headers" "Content-Type" is "application/json" not "plain/text" or you will get an error when running the request in POSTMAN.
  
  Your application should be running under "localhost:8080" or otherwise specified by the console. Use "localhost:8080/users" for all your request.  This was the path created inside the "UserRepository.java" file held within "src/main/java/restservice/repository".  This file also is the interface that creates your GET(read), POST(create), PUT(update), DELETE(delete) commands that are applied to the application from the JPA Repository provided by Spring Boot.
  
  Inside POSTMAN, under the "Headers" tab.  You can add a header, so under "key" type "Content-type" and under "value" type "application/json" that will override the default "plain/text" value in the header.
  
  Inside the RAW BODY input you can type the following (or your own info) to fill the parameters of "username", "password", "name", and "email" to get a result/response after a POST request:
  
 {
  "username": "User",
  "password": "Password",
  "name": "User Name",
  "email": "Email@email.com"
 }
