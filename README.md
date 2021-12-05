# Hotel Management System
 this is my practice project of MVC pattern software architechture
 
 
 -> this code is based on NetBeans IDE.
 
 
 -> please install mySQL server to create local database.
 
 
 -> create the following tables:
 
   1.  create table admins(username varchar(200), password varchar(50));
   2.  create table users(name varchar(200), email varchar(200), password varchar(50), securityQuestion varchar(500), answer varchar(200), address varchar(200), 
           status varchar(200));
   3.  create table room(roomNo varchar(20), roomType varchar(200), bed varchar(200), price int, status varchar(20), CONSTRAINT roomNo_pk PRIMARY KEY (roomNo));
   4.  create table customer(id int, name varchar(200), mobileNumber varchar(15), nationality varchar(200), gender varchar(20), 
           email varchar(200), idProof varchar(200), address varchar(500), checkIn varchar(50), roomNo varchar(10), bed varchar(20),
           roomType varchar(200), pricePerDay int(10), numberOfDaysStay int(10), totalAmount varchar(200), checkOut varchar(50));
 
