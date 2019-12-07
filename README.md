# Erecycler
A javafx project
# ERecycler
JRE 8 and Java 8 versions required to execute this project

Install mysql version 5.5

Create new javafx project in eclipse named Erecyler

Delete all packages and files under src

Download all files from this repository

Create a package smartecyclepro

Copy all java files, controller files, fxml files and paste it in smartrecyclepro package of the javafx project created

Create a folder with the name images in smartecyclepro package

copy images which were downloaded into this images folder

Import the required jar files (jfoenix-8.0.8.jar, jfxrt.jar, jfxswt.jar, mysql-connector-5.1.18.jar)

Create a database named Erecycler in mysql

#MySQL queries

create database smartrecycle 

use smartrecycle

DROP TABLE IF EXISTS `userdetails`;

CREATE TABLE `userdetails` (
  `uid` int(11) NOT NULL AUTO_INCREMENT,
  `pid` int(11) NOT NULL,
  `fname` varchar(50) NOT NULL,
  `lname` varchar(50) NOT NULL,
  `address` varchar(50) NOT NULL,
  `city` varchar(50) NOT NULL,
  `zipcode` varchar(50) NOT NULL,
  `udate` varchar(50) NOT NULL,
  `utime` varchar(50) NOT NULL,
  PRIMARY KEY (`uid`)
);


DROP TABLE IF EXISTS `product`;

CREATE TABLE `product` (
  `pid` int(11) NOT NULL AUTO_INCREMENT,
  `brand` varchar(50) NOT NULL,
  `productname` varchar(50) NOT NULL,
  `myear` varchar(10) NOT NULL,
  `pcondition` varchar(50) NOT NULL,
  `eprice` varchar(10) NOT NULL,
  PRIMARY KEY (`pid`)
);

DROP TABLE IF EXISTS `brand`;

CREATE TABLE `brand` (
  `brandname` varchar(30) NOT NULL
);

#execution

During execution of the project we have to select SmartecyclePro 
