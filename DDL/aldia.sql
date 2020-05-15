-- Database for Hackathon Project Vital Basic Income

-- Deletes the db if already present
DROP DATABASE IF EXISTS aldia;

-- Creates the VBI db
CREATE DATABASE aldia;

-- Select the VBI database
USE aldia;


CREATE TABLE user_info(
  id INT(6) UNSIGNED AUTO_INCREMENT PRIMARY KEY,
  username VARCHAR(50) NOT NULL,
  password VARCHAR(500) NOT NULL,
  role VARCHAR(50)
);

CREATE TABLE person(
	person_id INT(6) UNSIGNED AUTO_INCREMENT PRIMARY KEY,
	curp varchar(20) NOT NULL ,
    name varchar (40),
    celular_phone varchar (15),
    DOB datetime NOT NULL,
    formal_job boolean default false,
    last_paycheck_income decimal default 0,
    another_government_program boolean default false,
    single boolean default true,
    pension boolean,
    pension_amount decimal,
    amount_approved decimal,
    VBIPoints numeric default 0,
    account_number varchar (10) NOT NULL,
    clabe varchar (18) NOT NULL,
    tarjeta varchar (16) NOT NULL,
    bank varchar (20) NOT NULL,
    program_status varchar (15),
    user_id INT(6) UNSIGNED,
    CONSTRAINT person_fk_user
		FOREIGN KEY (user_id)
        REFERENCES user_info(id)
   
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