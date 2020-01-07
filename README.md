# SpringBoot-webapp-security-demo-MySQL
Spring boot security webapp using MYSQL Database

What is it?
----------
Spring boot security webapp by logging/authenticating users from MySQL

Created below classes:
AppSecurityConfig.java: This is the configuration class of whole security flow like having aruthentication provider, 
calling UserDetils Service, setting the password, encrypting the passwords.

MyUserDetailsService.java: This will implement the UserDetailsService and override the methods to fetch the username, and this will Autowired to User Repository
This will return the UserPrincipal

UserRepository.java
User.java
UsrePrincipal.java
