What you need to have: 
- JAVA SDK
- Apache Maven 
- MySQL

How to run: 

RUN MySQL Server
1. run this mysql command: 

create database cz3002;
use cz3002;
create table user (
	email varchar(32),
  password varchar(32));
insert into user values ("admin@gmail.com", "admin");

or 

run makedb.sql 

Run Struts2
1. Go to inside the directory
2. Change MySQL credential on User.java file
3. type "mvn jetty:run"

Then, you can login using admin@gmail.com.

If you insert a wrong email or password, you will be redirected back to login page with an error message.
