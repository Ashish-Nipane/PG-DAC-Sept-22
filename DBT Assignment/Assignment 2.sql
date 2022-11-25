create database a2;
use a2;
show tables;
/*
Create the table SEMP with the following structure:-
	EMPNO 		CHAR(4)
	EMPNAME 	CHAR(20)
	BASIC 		FLOAT
	DEPTNO 		CHAR(2)
	DEPTHEAD 	CHAR(4)
*/
create table SEMP(
EMPNO CHAR(4),
EMPNAME CHAR(20),
BASIC FLOAT,
DEPTNO CHAR(2),
DEPTHEAD CHAR(4)
);

desc semp;

/*
Create the table SDEPT with the following structure:-
	DEPTNO 		CHAR(2)
	DEPTNAME 	CHAR(15)
*/

create table SDEPT(
DEPTNO CHAR(2),
DEPTNAME CHAR(15)
);

desc SDEPT;

/*
Insert into the SDEPT table the following values:-
	10, Development
	20, Training
*/

insert into SDEPT values
(10,'Development'),
(20,'Training')
;

select * from SDEPT;

/*
Insert into the SEMP table the following values:-
	0001, SUNIL, 6000, 10
	0002, HIREN, 8000, 20
	0003, ALI, 4000, 10, 0001
	0004, GEORGE, 6000, 0002
*/

insert into SEMP values
('0001', 'SUNIL', 6000, 10, null),
('0002', 'HIREN', 8000, 20, null),
('0003', 'ALI', 4000, 10, '0001'),
('0004', 'GEORGE', 6000, null, '0002');

select * from SEMP;

create table SUPPLIER(
Sno VARCHAR(10),
Sname VARCHAR(20),
Status int(10),
City VARCHAR(10)
);

desc supplier;
alter table supplier modify Sno varchar(10) primary key;

create table PARTS(
Pno VARCHAR(10),
Pname VARCHAR(20),
Color varchar(10),
Weight int(10),
City VARCHAR(10)
);

desc parts;
alter table parts modify Pno varchar(10) primary key;

create table PROJECTS(
Jno VARCHAR(10),
Jname VARCHAR(20),
City VARCHAR(10)
);

DESC projects;
alter table projects modify Jno varchar(10) primary key;

create table `SUPPLIER-PARTS-PROJECT`(
Sno VARCHAR(10),
Pno VARCHAR(10),
Jno VARCHAR (10),
Qty int(10)
);

desc `SUPPLIER-PARTS-PROJECT`;
alter table `SUPPLIER-PARTS-PROJECT` add foreign key(Sno) references Supplier(Sno); 
alter table `SUPPLIER-PARTS-PROJECT` add foreign key(Pno) references Parts(Pno);
alter table `SUPPLIER-PARTS-PROJECT` add foreign key(Jno) references Projects(Jno);

insert into supplier values
('S1','SMITH',20,'LONDON'),
('S2','JONES',10,'PARIS'),
('S3','BLAKE',30,'PARIS'),
('S4','CLARK',20,'LONDON'),
('S5','ADAMS',30,'ATHENS');

Select * from a2.supplier;

insert into parts values
('P1','NUT','RED',12,'LONDON'),
('P2','BOLT','GREEN',17,'PARIS'),
('P3','SCREW','BLUE',17,'ROME'),
('P4','SCREW','RED',14,'LONDON'),
('P5','CAM','BLUE',12,'PARIS'),
('P6','COG','RED',19,'LONDON');

select * from a2.parts;

insert into projects values
('J1','SORTER','PARIS'),
('J2','DISPLAY','ROME'),
('J3','OCR','ATHENS'),
('J4','CONSOLE','ATHENS'),
('J5','RAID','LONDON'),
('J6','EDS','OSLO'),
('J7','TAPE','LONDON');

SELECT * from a2.projects;

insert into `supplier-parts-project` values
('S1','P1','J1',200),
('S1','P1','J4',700),
('S2','P3','J1',400),
('S2','P3','J2',200),
('S2','P3','J3',200),
('S2','P3','J4',500),
('S2','P3','J5',600),
('S2','P3','J6',400),
('S2','P3','J7',800),
('S2','P5','J2',100),
('S3','P3','J1',200),
('S3','P4','J2',500),
('S4','P6','J3',300),
('S4','P6','J7',300),
('S5','P2','J2',200),
('S5','P2','J4',100),
('S5','P5','J5',500),
('S5','P5','J7',100),
('S5','P6','J2',200),
('S5','P1','J4',100),
('S5','P3','J4',200),
('S5','P4','J4',800),
('S5','P5','J4',400),
('S5','P6','J4',500);

select * from `supplier-parts-project`;

-- Display all the data from the S table.
select * from a2.supplier;

-- Display only the S# and SNAME fields from the S table.
select Sno, Sname from a2.supplier;

-- Display the PNAME and COLOR from the P table for the CITY=”London”.
select Pname, Color from a2.parts where city='LONDON';

-- Display all the Suppliers from London.
select * from a2.supplier where city = 'LONDON';

-- Display all the Suppliers from Paris or Athens.
select * from a2.supplier where city = 'LONDON' OR city = 'ATHENS';

-- Display all the Projects in Athens.
select * from a2.projects WHERE city ='ATHENS';

-- Display all the Partnames with the weight between 12 and 14 (inclusive of both).
select Pname, Weight from a2.parts where Weight between 12 and 14;

-- Display all the Suppliers with a Status greater than or equal to 20.
select * from a2.supplier where Status >= 20;

-- Display all the Suppliers except the Suppliers from London.
select * from a2.supplier where city != 'LONDON';

-- Display only the Cities from where the Suppliers come from.
select distinct(city) from a2.supplier;

-- Assuming that the Part Weight is in GRAMS, display the same in MILLIGRAMS and KILOGRAMS.
select Pname, weight as 'Weight in gram', Weight*1000 as 'Weight in Miligram', Weight/1000 as 'Weight in Kilogram' from a2.parts;
