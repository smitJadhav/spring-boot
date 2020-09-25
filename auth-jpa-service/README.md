Run this application and then use below information to authenticate and authorize users with JPA-Spring security

1. H2 Database

    Url to access H2 console
    http://localhost:8080/auth-jdbc-service/h2-console/

    Data insert script :

    A) Table ROLE

    INSERT INTO ROLE (NAME) VALUES ('USER');
    INSERT INTO ROLE (NAME) VALUES ('ADMIN');

    B) Table USER

    INSERT INTO USER (ID, CREATED_DATE, MODIFIED_DATE, VERSION, EMAIL, FIRST_NAME, GENDER, IS_ACTIVE, IS_NON_LOCKED, LAST_NAME, MIDDLE_NAME, NUMBER_OF_ATTEMPTS, PASSWORD, STATUS_CHANGE_REASON, TITLE, USER_NAME, ROLE_NAME)
    VALUES (1, '2020-9-24T01:37:56', '2020-9-24T01:37:56', 0, 'abc@gmail.com', 'Tom', 'MALE', TRUE, TRUE, 'Cruise', 'abc', 0, 'hunt', '', 'Sergeant', 'ethan', 'ADMIN');

    INSERT INTO USER (ID, CREATED_DATE, MODIFIED_DATE, VERSION, EMAIL, FIRST_NAME, GENDER, IS_ACTIVE, IS_NON_LOCKED, LAST_NAME, MIDDLE_NAME, NUMBER_OF_ATTEMPTS, PASSWORD, STATUS_CHANGE_REASON, TITLE, USER_NAME, ROLE_NAME)
    VALUES (2, '2020-9-24T01:37:56', '2020-9-24T01:37:56', 0, 'abc@gmail.com', 'Carol', 'FEMALE', TRUE, TRUE, 'Danvers', 'xyz', 0, 'marvel', '', 'captain', 'captain', 'USER');


2. Application Url and details

    A) Enter below url in browser. It will ask you to login. Please login with USER_NAME and PASSWORD as per your table records.

        localhost:8080/auth-jdbc-service/login

    B) You can verify that user with ADMIN role is able to access only admin resource.
       User with USER role is able to access only user resource.

    C) You can try number of combination of roles, and user properties.

    D) Logout url
        localhost:8080/auth-jdbc-service/logout
        
3. This application implemented to have one role per user. If you want to have multiple roles for single user then you need to follow below guidelines.
    
    A) change manyToOne relation to oneToMany in User.java and make appropriate changes in database.

    B) In UserDetailsDTO.java file you need to change authorities to accommodate multiple roles.
    
