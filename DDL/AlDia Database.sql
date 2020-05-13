-- Database for Hackathon Project Vital Basic Income

-- Deletes the db if already present
DROP DATABASE IF EXISTS aldia;

-- Creates the VBI db
CREATE DATABASE aldia;

-- Select the VBI database
USE aldia;

-- Create the tables
CREATE TABLE Social_Worker(
	id_social_worker varchar (20) NOT NULL PRIMARY KEY,
    name_social_worker varchar (30) NOT NULL,
    dob datetime,
    celular_phone varchar (15)
);

CREATE TABLE Person(
	curp varchar (17) NOT NULL PRIMARY KEY,
    name varchar (40) NOT NULL,
    celular_phone varchar (15),
    DOB datetime NOT NULL,
    formal_job boolean default false,
    last_paycheck_income decimal default 0,
    another_government_program boolean default false,
    single boolean default true,
    pension boolean,
    pension_amount decimal,
    VBIPoints numeric default 0,
    account_number varchar (10) NOT NULL,
    clabe varchar (18) NOT NULL,
    tarjeta varchar (16) NOT NULL,
    bank varchar (20) NOT NULL,
    program_status varchar (15),
    id_social_worker varchar(20),
    CONSTRAINT person_fk_social_worker
		FOREIGN KEY (id_social_worker)
        REFERENCES Social_Worker(id_social_worker)
    /*CONSTRAINT citizen_fk_bank_account 
		FOREIGN KEY (account_number) 
        REFERENCES Bank_Account(account_number)*/
);

CREATE TABLE Help_Other(
	id_help_other varchar (20) PRIMARY KEY NOT NULL,
    name_person varchar (30) NOT NULL,
    phone varchar (15),
    address varchar (30) NOT NULL,
    help_other_date datetime,
    street_left varchar (20) NOT NULL,
    street_right varchar (20) NOT NULL,
    street_indicator varchar (30) NOT NULL,
    ticket_status varchar (15),
    curp varchar (17),
    id_social_worker varchar (20),
    CONSTRAINT person_fk_help_other
		FOREIGN KEY (curp)
        REFERENCES Person(curp),
	CONSTRAINT social_worker_fk_help_others
		FOREIGN KEY (id_social_worker)
        REFERENCES Social_Worker (id_social_worker)
);

INSERT INTO Social_Worker VALUES ("1","Oscar","2000-01-01","1111111111");
INSERT INTO Social_Worker VALUES ("2","Luis","2000-02-02","2222222222");
INSERT INTO Social_Worker VALUES ("3","Alex","2000-03-03","3333333333");
INSERT INTO Social_Worker VALUES ("4","Pepe","2000-04-04","4444444444");
INSERT INTO Social_Worker VALUES ("5","Juan","2000-05-05","5555555555");
INSERT INTO Social_Worker VALUES ("6","Cristina","2000-06-06","6666666666");
INSERT INTO Social_Worker VALUES ("7","Alejandra","2000-07-07","7777777777");
INSERT INTO Social_Worker VALUES ("8","Maria","2000-08-08","8888888888");
INSERT INTO Social_Worker VALUES ("9","Victoria","2000-09-09","9999999999");
INSERT INTO Social_Worker VALUES ("10","Nayely","2000-10-10","1111111111");
/*
CREATE TABLE Program(
	id_program varchar(10) PRIMARY KEY NOT NULL,
    name_program varchar (20) NOT NULL,
    amount decimal,
    begin_date datetime,
    interval_weeks numeric,
    CONSTRAINT Program_fk_Person
		FOREIGN KEY (curp)
        REFERENCES Person(curp)
);

CREATE TABLE Bank_Account(
	account_number varchar (10) NOT NULL PRIMARY KEY,
    clabe varchar (18) NOT NULL,
    tarjeta varchar (16) NOT NULL,
    bank varchar (20) NOT NULL
);*/