create database a1; -- creating database
use a1; -- use that db a1

-- create table manufacturers with give attributes
create table manufacturers(
Code int(10),
Name varchar(255) not null
);

-- create table products with give attributes
CREATE TABLE Products(
Code int(10),
Name VARCHAR(255) NOT NULL ,
Price DECIMAL(10,4) NOT NULL ,
Manufacturer int(10) NOT NULL
);

desc products; -- to see table created 

desc Manufacturers; -- to see table created

show tables; -- command to see tables available in our db

-- to insert values in table
insert into Manufacturers values(1,'Sony'),
(2,'Creative Labs'),
(3,'Hewlett-Packard'),
(4,'lomega'),
(5,'Fujitsu'),
(6,'Winchester');

select * from Manufacturers; -- shows table values that entered

-- insert values to table 
insert into Products values
(1,'Hard drive',240,5),
(2,'Memory',120,6),
(3,'ZIP drive',150,4),
(4,'Floppy disk',5,6),
(5,'Monitor',240,1),
(6,'DVD drive',180,2),
(7,'CD drive',90,2),
(8,'Printer',270,3),
(9,'Toner cartridge',66,3),
(10,'DVD burner',180,2);

select * from a1.products; -- show all rows and column from table

-- Select the names of all the products in the store
select Name from a1.products;

-- Select the names and the prices of all the products in the store
select Name , Price from a1.products;

-- Select the name of the products with a price less than or equal to $200.
select name from a1.products where Price <= 200;

-- Select all the products with a price between $60 and $120.
select * from a1.products where price between 60 and 120;

-- Select the name and price in cents (i.e., the price must be multiplied by 100).
select name, price*100 as price from a1.products;

-- Compute the average price of all the products.
select avg(price) from a1.products;

-- Compute the average price of all products with manufacturer code equal to 2.
select avg(price) from a1.products where Manufacturer = 2;

-- Compute the number of products with a price larger than or equal to $180.
select count(price) from a1.products where price >= 180;

-- Select the name and price of all products with a price larger than or equal to $180, and sort first by price (in descending order), and then by name (in ascending order).
select name, price from a1.products where price >= 180 order by price desc, name;

-- Select all the data from the products, including all the data for each product's manufacturer.
select products.code, products.name, products.price, manufacturers.name
from a1.products, a1.manufacturers 
where products.manufacturer = manufacturers.code
order by code;

-- Select the product name, price, and manufacturer name of all the products
select products.name, products.price, manufacturers.name as 'manufacturer name' from a1.products, a1.manufacturers where products.manufacturer = manufacturers.code;

-- Select the average price of each manufacturer's products, showing only the manufacturer's code.
select manufacturer as 'manufacturers code', avg(price) from a1.products group by Manufacturer;

-- Select the average price of each manufacturer's products, showing the manufacturer's name.
select manufacturers.name as 'manufacturers name', avg(products.price) as 'average price' from a1.manufacturers, a1.products 
where manufacturers.code = products.Manufacturer
group by manufacturers.name;

-- Select the names of manufacturer whose products have an average price larger than or equal to $150.
select manufacturers.name, avg(products.price) from a1.products, a1.manufacturers
where manufacturers.code = products.Manufacturer
group by Manufacturer having avg(price) >= 150;

-- Select the name and price of the cheapest product.
select name, price from a1.products where price = (select min(price) from a1.products);
-- OR 
select name, price from a1.products order by price limit 1;

-- Select the name of each manufacturer along with the name and price of its most expensive product.
select manufacturers.name, products.name , products.price from a1.manufacturers, a1.products
where manufacturers.code = products.manufacturer 
and products.price = (select max(products.price) from a1.products 
where manufacturers.code = products.manufacturer);

-- Add a new product: Loudspeakers, $70, manufacturer 2.
alter table products modify column Code int(10) auto_increment;
insert into a1.products(name, price, manufacturer) values ('Loudspeakers',70,2);
-- OR
insert into a1.products values (11, 'Loudspeakers', 70, 2);

-- Update the name of product 8 to "Laser Printer".
update a1.products set Name = 'Laser Printer' where Code = 8;

-- Apply a 10% discount to all products.
select *, (Price*0.9) as 'Discounted Price' from a1.products;
-- OR
update a1.products set products.price = price*0.9;

-- Apply a 10% discount to all products with a price larger than or equal to $120.
select *, (Price-price*0.1) as 'Discounted Price' from a1.products where price >= 120;
-- OR
update a1.products set products.price = price*0.9 where products.price >= 120;