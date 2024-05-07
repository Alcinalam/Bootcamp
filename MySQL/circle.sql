show databases;

use sys;
create table Circle (
	radius decimal(3,2)
    );
    
-- Basic Select Statment
 select * from Circle;
 
 -- Insert data
 -- Approach 1 : insert into xxx (colum_name ...)
 INSERT INTO Circle (radius) VALUES (2.40); -- Decimal(3,2) -> 
 Delete from Circle where radius = 2.40 and color is null;
 insert into Circle values (1.37);
 
 delete from Circle where radius >= 1.35;
 
 update Circle set radius = 1.99 where radius < 1;
 
 -- Add column
 alter table Circle add color varchar(20);
 
 select * from Circle;
 
 
 -- insert
 insert into Circle (color, radius) values ('RED',3.14); -- follow column sequence
 insert into Circle values (3.15, 'YELLOW'); -- follow the default ordering
 
 alter table Circle add material varchar(20);
 
 update Circle set color = 'WHITE' where radius = 2.40;
 update Circle set material = 'WOOD' where material is null;
 
 insert into Circle values (3.8, 'BLACK', 'PASTIC');
 -- whole row deleted
 delete from Circle where radius = 3.14;
 alter table Circle add ID int (10);
 insert into Circle values (3.15, 'YELLOW', 'ABS', 4);
 select * from Circle;
 update Circle set ID = 1 where material = 'WOOD';
 update Circle set ID = 2 where color = 'RED';
 
 -- select where and
 select * from Circle where color = 'RED' or radius < 3;
 select * from Circle where color = 'WHITE' and radius < 3;
 
 -- update
 update Circle set color = 'BLACK' where color = 'RED' or color = 'YELLOW';
 select * from Circle where color is not null;
 
 -- Math Operator
 -- = , >= , <=,> , < , <>
 select * from Circle where color <> 'RED' ; -- Not equals to RED, not including null values
 select * from Circle where color = 'RED' or color is null; 
 
 -- dual
 select 1, 'hello' from dual;
 select 2, 'hello' from dual;
 
 select * from Circle; -- * mean all columns in table
 select radius, color from Circle; -- select some column
 select radius, color, 'hello' from circle;
 select radius as c_radius, color as c_color, 'hello' as abc from Circle;
 
 delete from circle;
 truncate circle; -- Orcale; non-rollback-able
 select * from circle;
 
 -- DISTINCT
 select distinct color from circle; 
 select distinct color from circle where radius > 3;
 
 -- BETWEEN (numbers or date)
 select * from Circle where radius between 2 and 3.14; -- inclusive
 
 alter table Circle add create_date date;
 
 
 insert into Circle values (9.8, 'BLACK', 'PASTIC', 3, str_to_date('20012013','%d%m%Y'));
 insert into Circle values (1.9, 'PINK', 'PASTIC', 5, STR_TO_DATE('2014,01,31','%Y,%m,%d')); 
 insert into Circle values (9.8, 'BLACK', 'PASTIC', 3, str_to_date('31012014','%d%m%Y'));
 
 select * from Circle order by create_date asc;
 select * from Circle where create_date is not null order by create_date asc; -- by default "ascending" order
 select * from Circle where create_date is not null order by create_date desc;
 select * from Circle order by create_date desc; -- null values is in the last ordering
 
 select round (radius * radius * pi(),2) as area, radius, ID , color from Circle;
 
 select 5%2 from dual;
 
 -- LIMIT (use it with ordering)
 select * from Circle where create_date is not null order by create_date desc limit 1;
 
 -- LIKE
 select * from circle where color like 'R%'; -- all color start with R
 select * from circle where color like '%W'; -- all color end with W
 select * from circle where color like '%E%'; -- all color contains ED
 
 select * from circle where color in ('YELLOW','RED'); -- or
 
 create table Customer2 (
	id integer,
	first_name varchar(20),
    last_name varchar(20),
    phone varchar(50),
    email varchar(50)
 );
 
 insert into customer2 values(1,'Vincent','Lau','852 1234567','vincent@gmail.com'),
							 (2,'Oscar','Lo','852 87654321','oscar@gmail.com');
                             
 insert into customer2 values(3,'Jenny','Lau',' 852 87654321 ','jenny@gmail.com');
                             
select concat(first_name,' ',last_name) as full_name from customer2;
select substring(last_name,1,2) as first_character from customer2;
select length(first_name),length(last_name) from customer2;
select upper(first_name), lower(first_name),concat(first_name, ' ',upper(last_name)) from customer2;
select c.*,length(trim(c.phone)), length(c.phone) from customer2 c; 

select replace (concat(first_name, ' ' ,last_name), 'Lau', 'Chan') as new_name from customer2;

select left(first_name, 2), right (first_name,2 ) from customer2;

-- It automatically skips NULL values and does not include the separator for NULL values.
select concat_ws(' ', first_name, last_name), concat (first_name, ' ',last_name) as full_name from customer2;

insert into customer2 values (4,'kelly','陳',' 852 87654321 ','kelly@gmail.com');
select c.*, length(last_name), char_length(last_name) from customer2 c; -- Chinese character as 3, needa char_length
select * from customer2;

-- indexOf
select c.*, instr(first_name,'i') from customer2 c;
select c.*, instr(first_name,'in') from customer2 c;
select c.*, instr(first_name,'Jenny') from customer2 c;
select c.*, instr(first_name,'n') from customer2 c; -- show the first n

select ceil(4.3) from dual; -- 5
select ceil(4.3333) from dual; -- 5
select floor (4.3) from dual;
select floor (4.3333) from dual;
select round (4.353,1), round (4.353,2) from dual;
select abs(-5), abs(5) from dual;
select power(2,3), power(-2,3) from dual;

-- DATEADD
select date_add('2023-07-15', interval 3 month) from dual;
select date_add('2023-07-15', interval 1 day) from dual;
select str_to_date ('2023-07-15','%Y-%m-%d') + 1 from dual;
select date_add('2023-12-31', interval 1 day) from dual;
select date_sub('2024-01-02', interval 2 day) from dual;

select datediff('2023-12-31','2023-01-01') from dual; --  364
select datediff('2023-01-01','2023-12-31') from dual; -- (364)

select now() from dual; -- timestamp

select date_format('2023-12-31', '%Y-%m-%d') from dual;

select extract(year from '2023-12-31') from dual;
select extract(month from '2023-12-31') from dual;
select extract(day from '2023-12-31') from dual;

select ifnull(null,'x') from dual;
select ifnull(null, 12) from dual;

select * from Circle;
select round (ifnull (radius,0) * ifnull (radius,0) * pi(),2) from Circle;
select round (coalesce (radius,0) * coalesce (radius,0) * pi(),2) from Circle; -- coalesce() supported in MySQL / PostgreSQL

select
	c.*,
	case
		when c.color = 'RED' and c.radius > 3 then 'R' -- You can use and, or in case statment
        when c.color = 'YELLOW' then 'Y'
        else 'B'
	end as color_short_name
from circle c;

select * from customer2;
alter table customer2 add membership varchar (1);
alter table customer2 add age int (10);
update customer2 set age = 13 where last_name = 'lau';
update customer2 set age = 20 where last_name = 'lo';
update customer2 set age = 30 where last_name = '陳';
update customer2 set membership = 'G' where upper(last_name) = 'LAU';
update customer2 set membership = 'S' where upper(coalesce(last_name,'x')) <> 'LAU';

-- aggregation function togeter with group by
select membership, count(membership), avg(age), max(age), min(age), sum(age) 
from customer2
group by membership -- first statment to execute
;

-- Wrong SQL, you cannot select a field w/o "group presentation" 
select phone
from customer2
group by last_name;

-- where can work with group by
select last_name, count(1) as count
from customer2
where upper(ifnull(last_name,'x')) <> 'LAU' -- execute before "group by"
group by last_name;

-- Having
select last_name, count(1) as count
from customer2
where upper(ifnull(last_name,'x')) <> 'lo' -- execute before "group by"
group by last_name -- second execution
having count(1)  -- third execution (group level filtering)
;
select * from customer2;

select c.*, 'hello' as greeting
from customer2 c;

select count('hello')
from customer2 c;

-- customer vs order
create table order2(
	id int,
    customer_id int,
    delivery_address varchar(100),
    total_amount decimal (10,2)
);
insert into order2 values (1, 2, 'ABC XYZ', 100.44);
insert into order2 values (2, 2, 'xxxABC XYZ', 22.88);
insert into order2 values (3, 1, 'aaABC XYZ', 12.12);
insert into order2 values (4, 3, 'aaAfffffBC XYZ', 90.12);
delete from customer2 where phone = '852 87 6 5 4321';
select * from customer2;
select * from order2;

-- inner join (multiply 2 set of records)
select *
from customer2 inner join order2;

-- inner join -> find all orders with its customer data
-- approach 1
select c.first_name, c.last_name, c.phone,c.email, o.total_amount
from customer2 c inner join order2 o on c.id = o.customer_id
where o.total_amount > 30; -- execute after table join

-- approach 2
select c.first_name, c.last_name, c.phone, c.email, o.total_amount
from customer2 c , order2 o
where c.id = o.customer_id
and o.total_amount > 30; 