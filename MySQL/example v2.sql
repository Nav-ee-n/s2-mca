CREATE DATABASE school1;
use school1;
CREATE TABLE student1(rollno int PRIMARY KEY, name varchar(100) NOT NULL, age int NOT NULL, gender varchar(100));
INSERT INTO student1 VALUES(1,'Sudhil',21,'Male');
INSERT INTO student1 VALUES(2,'Raul',21,'Male');
INSERT INTO student1 VALUES(3,'Jishnu',21,'Male');
INSERT INTO student1 VALUES(4,'Bharat',21,'Male');
SELECT * FROM student1;

DELETE FROM student1 WHERE rollno="2";
SELECT * FROM student1;

ALTER TABLE student1 ADD marks int;
UPDATE student1 SET marks=100 WHERE rollno>0;

UPDATE student1 SET marks=50 WHERE rollno="1";

ALTER TABLE student1 DROP COLUMN marks;

ALTER TABLE student1 ADD marks varchar(100);

ALTER TABLE student1 MODIFY COLUMN marks int;
