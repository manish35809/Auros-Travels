CREATE DATABASE IF NOT EXISTS `auros`; 
USE `auros`;

CREATE TABLE IF NOT EXISTS `quote` (
  `Thought` varchar(100) NOT NULL
);

INSERT INTO `quote` (`Thought`) VALUES
	('The gladdest moment in human life is a departure into unknown lands.');
INSERT INTO `quote` (`Thought`) VALUES
	('Be fearless in the pursuit of what sets your soul on fire.');
INSERT INTO `quote` (`Thought`) VALUES
	('Travel makes one modest. You see what a tiny place you occupy in the world');
INSERT INTO `quote` (`Thought`) VALUES
	('Better to see something once than hear about it a thousand times');
INSERT INTO `quote` (`Thought`) VALUES
	('Adventure may hurt you but monotony will kill you.');
INSERT INTO `quote` (`Thought`) VALUES
	('All you need to know is that its possible.');
INSERT INTO `quote` (`Thought`) VALUES
	('To Travel is to Live');
INSERT INTO `quote` (`Thought`) VALUES
	('The journey not the arrival matters.');
INSERT INTO `quote` (`Thought`) VALUES
	('Life is short and the world is wide');

CREATE TABLE IF NOT EXISTS `users` (
  `ID` int(4) AUTO_INCREMENT UNIQUE,
  `Full_Name` varchar(50) NOT NULL,
  `Mobile_Number` double(10,0) NOT NULL,
  `E_Mail` varchar(50) NOT NULL,
  `User_Name` varchar(50) NOT NULL PRIMARY KEY,
  `Password` varchar(50) NOT NULL,
  `Money` double(10,2) DEFAULT '0.00'
);

CREATE TABLE card_details(
	User_Name VARCHAR(50) NOT NULL PRIMARY KEY,
	Account_Number LONG NOT NULL,
	CVV INT(3) NOT NULL,
	Month INT(2) NOT NULL,
	Year INT(4) NOT NULL,
	Update_Time DATETIME NOT NULL);

CREATE TABLE transactions(
	ID INT(5) AUTO_INCREMENT PRIMARY KEY NOT NULL,
	User_Name VARCHAR(50) NOT NULL,
	Amount DOUBLE(10,2) NOT NULL,
	Info VARCHAR(100) NOT NULL,
	DATE_TIME DATETIME NOT NULL
);

CREATE TABLE train_details(
	Train_Code int(6) PRIMARY KEY,
	Train_Name varchar(50) NOT NULL,
	Description varchar(200) NOT NULL,
	Source varchar(30) NOT NULL,
	Destination varchar(30) NOT NULL,
	Arrival varchar(15) NOT NULL,
	Departure varchar(15) NOT NULL,
	Time_Taken varchar(15) NOT NULL,
	RATE_A int(6) NOT NULL,
	RATE_B int(6) NOT NULL,
	RATE_C int(6) NOT NULL,
	RATE_D int(6) NOT NULL
);

CREATE TABLE Cities(
	ID INT(5) AUTO_INCREMENT UNIQUE,
	City VARCHAR(50) PRIMARY KEY NOT NULL
);

INSERT INTO Cities(City) VALUES 
("Mumbai"),
("Delhi"),
("Bangalore"),
("Hyderabad"),
("Ahmedabad"),
("Chennai")
,("Kolkata"),
("Surat"),
("Pune"),
("Jaipur"),
("Lucknow"),
("Kanpur"),
("Nagpur"),
("Indore"),
("Thane"),
("Agra"),
("Patna"),
("Sri Nagar"),
("Ranchi"),
("Chandigarh"),
("Raipur"),
("Jammu"),
("Thiruvananthapuram"),
("Jodhpur"),
("Pali"),
("Gandhinagar"),
("Shimla"),
("Jalore")
;

CREATE TABLE TICKETS (
	ID int(6) AUTO_INCREMENT PRIMARY KEY,
	User_Name VARCHAR(50) NOT NULL,
	B_Date DATETIME NOT NULL,
	T_DATE DATETIME NOT NULL,
	Train_Code int(6),
	Train_Name varchar(50) NOT NULL,
	Source varchar(30) NOT NULL,
	Destination varchar(30) NOT NULL,
	Departure varchar(15) NOT NULL,
	Arrival varchar(15) NOT NULL,
	Ticket_Class varchar(20) NOT NULL,
	T_Fare double(8,2) NOT NULL,
	Name1 varchar(50),
	Age1 int(3),
	Name2 varchar(50),
	Age2 int(3),
	Name3 varchar(50),
	Age3 int(3),
	Name4 varchar(50),
	Age4 int(3),
	Tickets_Total_Amount double(8,2) NOT NULL
);



