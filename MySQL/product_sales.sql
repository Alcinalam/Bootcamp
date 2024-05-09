show databases;
use sys;

create table product (
	id int,
	name varchar (255),
    price decimal (10,2),
    description text,
    created_at timestamp default current_timestamp
);

select * from product;

insert into product values (1,'Laptop', 999.99,'High-performance laptop with SSD storage',current_timestamp());
insert into product values (2,'Smartphone', 599.50,'4G smartphone with advanced camera features',current_timestamp());
insert into product values (3,'Headphones', 79.99,'Wireless headphones with noise-canceling technology',current_timestamp());

select * from product order by name ;
select max(price) as max_price from product ;
select * from product where price = (select max(price) from product);
select count(*) as product_count from product ;
select * from product where name = 'Laptop';
select avg (price) as avg_price from product ;
select * from product order by current_timestamp limit 1;
select sum(price) as total_price from product ;
select min(price) as min_price_for_phone , max(price) as max_price_for_phone from product where name like '%phone%';
select description as product_description from product where lower(description) like '%wireless%'  ;




create table Sales (
	id int,
	product_id int,
    product_name varchar(255),
	unit_price decimal (10,2),
	quantity_sold int,
	discount_amount decimal (10,2),
	tax_rate decimal (5,2),
	shipping_cost decimal (10,2),
	handling_fee decimal (10,2)
);
insert into Sales values (1,1,'Laptop',999.99,2,0,5,10.5,5.25);
insert into Sales values (2,2,'Smartphone',599.50,5,25.75,7.5,5.75,3.25);
insert into Sales values (3,3,'Headphones',79.99,10,5,5,2.99,1.5);

select * from Sales;
