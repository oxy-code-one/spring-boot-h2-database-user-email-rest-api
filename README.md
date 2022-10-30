# spring-boot-h2-database-user-email-rest-api

Spring boot API with h2 database and JPA ORM .


I have Installed the Spring Tool Suite 4 fro eclipse from https://spring.io/tools#suite-three (Linux version).

For api testing I have used postman https://www.postman.com/downloads/

The project uses in memory H2 database along with JPA for Object Relational Mapping(ORM)
Project details.
  Routing is handled by controller package.
  Storing and retrieving of data is handled within service package.
  Interface for daabase operations is in dao package.
  The classes for data models are in model package.
  
Unit tests-
  create user request with empty request body.
  create user request with missing or improper body
  create user request with proper body
  create user request with already used email 
  
  get user request with invalid id 
  get user request with valid id
  
  create email request with empty request body.
  create email request with missing or improper body
  create email request with proper body
  create email request without subject field
  
  get email count with invalid userId
  get email count with valid userId 

Integration tests -
  create email request with non registered user from
  create email request with non existing user to
  


Documentation for the APIs :
  
  ********* Creating new User -> url post http:localhost:8080/user
Sample request body
{
    "firstName":"Shubham",
    "lastName":"Singh",
    "emailAddress":"shubham321@gmail.com",
    "phoneNumber":"0000011111"
}

  ********* get list of Users -> url get http:localhost:8080/users 
Sample response body
[
    {
        "firstName": "Shubham",
        "lastName": "Singh",
        "emailAddress": "shubhams97531@gmail.com",
        "phoneNumber": "8291312180"
    },
    {
        "firstName": "Shubham",
        "lastName": "Singh",
        "emailAddress": "shubhams531@gmail.com",
        "phoneNumber": "8291312180"
    }
]

  ********* get user by id -> url get http:localhost:8080/user/{id}
Sample request url 
http:localhost:8080/user/shubhams531@gmail.com

Sample response body
{
    "firstName":"Shubham",
    "lastName":"Singh",
    "emailAddress":"shubham321@gmail.com",
    "phoneNumber":"0000011111"
}



  ********* Creating a new email -> url post http:localhost:8080/email
Sample request body
{
    "from":"shubham31@gmail.com",
    "to":"shubhams321@gmail.com",
    "subject":"Hello world",
    "body":"This is shubham singh."
}
  ********* get count of email from User -> url get http:localhost:8080/email/count?user={userID}
