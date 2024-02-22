USE COMPANY;
CREATE TABLE jobs(job_id int PRIMARY KEY, job_title varchar(50) NOT NULL,min_salary int, max_salary int);

CREATE TABLE regions(region_id int PRIMARY KEY, region_name varchar(100));

CREATE TABLE countries(country_id int PRIMARY KEY, country_name varchar(100), region_id int, foreign key(region_id) references regions(region_id));

CREATE TABLE locations(location_id int PRIMARY KEY, street_address varchar(100), postal_code int,city varchar(100),state_province varchar(100),country_id int,foreign key(country_id) references countries(country_id));

CREATE TABLE departments(department_id int PRIMARY KEY,department_name varchar(100),location_id int,foreign key(location_id) references locations(location_id));

CREATE TABLE employees(employee_id int PRIMARY KEY,first_name varchar(100),last_name varchar(100),email varchar(100),phone_number int,hire_date date,job_id int,salary int,manager_id int,department_id int,foreign key (job_id) references jobs(job_id), foreign key (department_id) references departments(department_id));

CREATE TABLE dependents(dependent_id int PRIMARY KEY, first_name varchar(100),last_name varchar(100),relationship varchar(100),employee_id int,foreign key(employee_id) references employees(employee_id));

ALTER TABLE employees ADD FOREIGN KEY(manager_id) references employees(employee_id);

ALTER TABLE departments RENAME TO Dept;

ALTER TABLE employees MODIFY COLUMN salary smallint;

ALTER TABLE employees ADD COLUMN commission int;



ALTER TABLE employees MODIFY COLUMN salary smallint;

INSERT INTO regions(region_id,region_name) VALUES (1,'Europe');
INSERT INTO regions(region_id,region_name) VALUES(2,'Americas'); 
INSERT INTO regions(region_id,region_name)VALUES (3,'Asia');
INSERT INTO regions(region_id,region_name) VALUES (4,'Middle East and Africa');

INSERT INTO countries(country_id,country_name,region_id) VALUES(1,'Argentina',2);
INSERT INTO countries(country_id,country_name,region_id)VALUES (2,'Australia',3);
INSERT INTO countries(country_id,country_name,region_id)VALUES (3,'Belgium',1);
INSERT INTO countries(country_id,country_name,region_id) VALUES(4,'Brazil',2);
INSERT INTO countries(country_id,country_name,region_id)VALUES (5,'Canada',2);
INSERT INTO countries(country_id,country_name,region_id)VALUES (6,'United States of America',2);

INSERT INTO locations(location_id,street_address,postal_code,city,state_province,country_id) VALUES (1700,'2004 Charade Rd','98199','Seattle','Washington',6);
INSERT INTO locations(location_id,street_address,postal_code,city,state_province,country_id) VALUES (1400,'2014 Jabberwocky Rd','26192','Southlake','Texas',6);
INSERT INTO locations(location_id,street_address,postal_code,city,state_province,country_id) VALUES (1500,'2011 Interiors Blvd','99236','South San Francisco','California',6);

INSERT INTO jobs(job_id,job_title,min_salary,max_salary) VALUES(1,'Public Accountant',4200,9000);
INSERT INTO jobs(job_id,job_title,min_salary,max_salary)VALUES (2,'Accounting Manager',8200,16000);
INSERT INTO jobs(job_id,job_title,min_salary,max_salary)VALUES (3,'Administration Assistant',3000,6000);
INSERT INTO jobs(job_id,job_title,min_salary,max_salary)VALUES (4,'President',20000,40000);


INSERT INTO Dept(department_id,department_name,location_id) VALUES(1,'Administration',1700);
