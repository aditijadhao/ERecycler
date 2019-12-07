# Erecycler
A javafx project

JRE 8 and Java 8 versions required to execute this project

Install mysql version 5.5

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


#Eclipse 

#execution

Download all files from this repository. link for repository:  https://github.com/aditijadhao/Erecycler

Open Eclipse.

Import the erecyclePro file into eclipse workspace

Run as Java Application

Select the matching item as smartecyclePro- smartecyclepro

App will open
