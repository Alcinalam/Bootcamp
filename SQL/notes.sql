show databases;
use sys;

-- Create Table
Create table student(
	student_id Int primary key,
    first_name varchar(10),
    last_name varchar(10),
    birthday date,
    is_active boolean
    );
-- select all
select * from student;

-- select column
select birthday from student;

-- adding Column
alter table student add gender varchar(1);

-- drop Column
alter table student drop column is_active;

-- modify Column
alter table student modify column first_name varchar (20);

-- drop a column
alter table student drop column student_id;

-- Create Primary Key
alter table student add student_id int (10);
alter table student add primary key (student_id);

-- insert data apporch 1
insert into student (student_id, first_name, last_name, gender, birthday)
values (1, 'cherry', 'wong', 'F', '2000-01-23');

-- insert data apporch 2
insert into student values ('chris','wong', '2001-03-12', 'M',2);
insert into student values ('kelly','shi', '2000-05-14', 'F',3);
insert into student values ('mandy','wong', '2001-09-28', 'F',4);
insert into student values ('tom','ho', '2001-06-15', 'M',5);
insert into student values ('ben','wen', '2001-09-01', 'M',6);
insert into student values ('Ching','lam', '2000-05-23', 'M',7);
insert into student values ('karen','tsang', null, 'M',8);

-- insert data apporch 3
insert into customer2 values (1,'Vincent','Lau','852 1234567','vincent@gmail.com'),
							 (2,'Oscar','Lo','852 87654321','oscar@gmail.com');

-- delete data
delete from student where first_name is null;

-- distinct 
select distinct gender from student;

-- Between 
select student_id, first_name, last_name from student where birthday between '2000-01-01' and '2000-12-31';

-- In
select first_name, last_name, gender from student where student_id in (2,4);

-- Order by
select student_id, first_name, last_name, gender, birthday from student order by birthday;
select student_id, first_name, last_name, gender, birthday from student order by birthday desc;

-- limit
select student_id, first_name, last_name, gender, birthday from student order by birthday limit 1;

-- like
select first_name from student where first_name like '%c';
select * from student;

 -- dual
 select 1, 'hello' from dual;
 select 2, 'hello' from dual;
 
 -- select with column name change and value input
 select first_name, last_name as LAST, 1 as temp from student;
 
 -- null handling
 select student_id, first_name from student where birthday is not null;
 select student_id from student where birthday is null;
 
 -- Math Operator
 -- = , >= , <=,> , < , <>
 select * from Circle where color <> 'RED' ; -- Not equals to RED, not including null values
 select * from Circle where color = 'RED' or color is null; 
 
 -- Date
 insert into Circle values (9.8, 'BLACK', 'PASTIC', 3, str_to_date('20012013','%d%m%Y'));
 insert into Circle values (1.9, 'PINK', 'PASTIC', 5, STR_TO_DATE('2014,01,31','%Y,%m,%d')); 
 insert into Circle values (9.8, 'BLACK', 'PASTIC', 3, str_to_date('31012014','%d%m%Y'));
 
 -- sort date
 select * from Circle order by create_date asc;
 select * from Circle where create_date is not null order by create_date asc; -- by default "ascending" order
 select * from Circle where create_date is not null order by create_date desc;
 select * from Circle order by create_date desc; -- null values is in the last ordering

-- timestamp current 
 create table product (
	id int,
	name varchar (255),
    price decimal (10,2),
    description text,
    created_at timestamp default current_timestamp
);

select * from product;

insert into product values (1,'Laptop', 999.99,'High-performance laptop with SSD storage',current_timestamp());
 
 -- String
select concat(first_name,' ',last_name) as full_name from customer2;
select substring(last_name,1,2) as first_character from customer2;
select length(first_name),length(last_name) from customer2;
select upper(first_name), lower(first_name),concat(first_name, ' ',upper(last_name)) from customer2;
select c.*,length(trim(c.phone)), length(c.phone) from customer2 c;  -- before and after, eg: '  xxx  '

-- replace
select replace (concat(first_name, ' ' ,last_name), 'Lau', 'Chan') as new_name from customer2;

-- left right
select left(first_name, 2), right (first_name,2 ) from customer2;

-- indexOf
select c.*, instr(first_name,'i') from customer2 c;
select c.*, instr(first_name,'in') from customer2 c;
select c.*, instr(first_name,'Jenny') from customer2 c;
select c.*, instr(first_name,'n') from customer2 c; -- show the first n

-- math
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

-- datediff
select datediff('2023-12-31','2023-01-01') from dual; --  364
select datediff('2023-01-01','2023-12-31') from dual; -- (364)

select now() from dual; -- timestamp

select date_format('2023-12-31', '%Y-%m-%d') from dual;

-- extract
select extract(year from '2023-12-31') from dual;
select extract(month from '2023-12-31') from dual;
select extract(day from '2023-12-31') from dual;

-- check null and replace with value
select ifnull(null,'x') from dual;
select ifnull(null, 12) from dual;

select * from Circle;
select round (ifnull (radius,0) * ifnull (radius,0) * pi(),2) from Circle;
select round (coalesce (radius,0) * coalesce (radius,0) * pi(),2) from Circle; -- coalesce() supported in MySQL / PostgreSQL

-- update with condition
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

-- where can work with group by
select last_name, count(1) as count
from customer2
where upper(ifnull(last_name,'x')) <> 'LAU' -- execute before "group by"
group by last_name;

-- Having
select last_name, count(1) as count
from customer2
where upper(ifnull(last_name,'x')) <> 'lo' -- (filter the row)
group by last_name -- second execution
having count(1)  -- third execution (filter the group)
;

-- inner join with self table (employee m is new)
select e.name as Employee
from employee e inner join employee m on e.managerId = m.id
where e.salary > m.salary
;

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

-- left join (all customers, with order)
-- all data in customer3 retains in the result set
select c.first_name,c.last_name, o.delivery_address, ifnull(o.total_amount,0)
from customer3 c left join order3 o on c.id = o.customer_id;

-- left join (customer without order)
-- similar to "Not exists"
select c.first_name,c.last_name, o.delivery_address, ifnull(o.total_amount,0)
from customer3 c left join order3 o on c.id = o.customer_id
where o.customer_id is null;

-- primary key
-- auto_increment
create table customer3 (
	id integer primary key auto_increment,
	first_name varchar(20),
    last_name varchar(20),
	phone varchar(50),
    email varchar(50)
);

-- another approch of primary key & foreign key references
create table order3 (
	id integer auto_increment,
    customer_id integer,
    delivery_address varchar(100),
    total_amount decimal(10,2),
    primary key (id), -- another way to create primary key
    constraint FK_CustomerOrder foreign key (customer_id) references customer3(id)
);

-- WITH clause
with top_customer as (
	select customer_id, sum(total_amount) as total_spent
		from order3
		group by customer_id
		limit 5	
)
select c.first_name, tc.total_spent
from customer3 c inner join top_customer tc on c.id = tc.customer_id;

select e.name, b.bonus
from  employee e left join bonus b on e.empid = b.empid
where ifnull(b.bonus,0 ) < 1000 -- first make null to 0


