create database bootcamp_exercise3;
show databases;
use bootcamp_exercise3;

create table customer (
	id int,
    customer_name varchar(255),
    city_id int,
    customer_address varchar(255),
    contact_person varchar(255) null,
    email varchar(128),
    phone varchar(128),
    primary key (id)
);

create table product(
	id int,
    sku varchar(32),
    product_name varchar(128),
    product_description text,
    current_price decimal (8,2),
    quantity_in_stock int,
    primary key(id)
);

create table invoice(
	id int,
    invoice_number varchar(255),
    customer_id int,
    user_account_id int,
    total_price decimal(8,2),
    time_issued varchar(255) null,
    time_due varchar(255) null,
	time_paid varchar(255) null,
    time_canceled varchar(255) null,
    time_refunded varchar(255) null,
    primary key(id),
    foreign key (customer_id) references customer(id)
);

create table invoice_item(
	id int,
    invoice_id int,
    product_id int,
    quantity int,
    price decimal(8,2),
    line_total_price decimal(8,2),
    primary key(id),
    foreign key (invoice_id) references invoice(id),
    foreign key (product_id) references product(id)
);
select * from customer;
select * from product;
select * from invoice;
select * from invoice_item;

DELETE FROM CUSTOMER;
INSERT INTO CUSTOMER VALUES
(1, 'Drogerie Wien', 1, 'Deckergasse 15A', 'Emil Steinbach', 'abc@gmail.com', 123455678);
INSERT INTO CUSTOMER VALUES
(2, 'John', 4, 'Deckergasse 1A', '9upper', 'abck@gmail.com', 12345567);
INSERT INTO CUSTOMER VALUES
(3, 'Mary', 8, 'Deckergasse 18A', '9upper', 'abcd@gmail.com', 1234556789);

DELETE FROM PRODUCT;
INSERT INTO PRODUCT VALUES
(1, '330120', '9UP PRODUCT', 'COMPLETELY 9UP', 60, 122);
INSERT INTO PRODUCT VALUES
(2, '330121', '9UPPER PRODUCT', 'COMPLETELY 9UPPER', 50, 50);
INSERT INTO PRODUCT VALUES
(3, '330122', '9UPPER PRODUCTS', 'SUPER 9UPPER', 40, 600);
INSERT INTO PRODUCT VALUES
(4, '330123', '9UPPER PRODUCTSS', 'SUPER COMPLETELY 9UPPER', 30, 500);

DELETE FROM INVOICE;
INSERT INTO INVOICE VALUES
(1, 123456780, 2, 41, 1423, NULL, NULL, NULL, NULL, NULL);
INSERT INTO INVOICE VALUES
(2, 123456780, 3, 42, 1400, NULL, NULL, NULL, NULL, NULL);
INSERT INTO INVOICE VALUES
(3, 123456780, 2, 43, 17000, NULL, NULL, NULL, NULL, NULL);

DELETE FROM INVOICE_ITEM;
INSERT INTO INVOICE_ITEM VALUES
(1, 1, 1, 40, 23, 920);
INSERT INTO INVOICE_ITEM VALUES
(2, 1, 2, 4, 20, 80);
INSERT INTO INVOICE_ITEM VALUES
(3, 1, 3, 4, 10, 40);
INSERT INTO INVOICE_ITEM VALUES
(4, 1, 2, 4, 30, 120);

-- for each customer without an invoice, return: String customer, the customer id, customer name
-- for each product without an invoice return: String product, the product id, product_name

select 'customer' as '', c.id, c.customer_name
from customer c left join invoice i on c.id = i.customer_id
where i.id is null
union
select 'product', p.id, p.product_name
from product p 
left join invoice_item it on p.id = it.product_id
where it.id is null;


-- Discussion Question
create table employee (
	id integer not null auto_increment primary key,
    employee_name varchar(30) not null,
    salary decimal (8,2),
    phone int (15),
    email varchar (50),
    dept_id integer not null
);

create table department(
	id integer not null auto_increment primary key,
    dept_code varchar (3) not null,
    dept_name varchar (200) not null
);

INSERT INTO EMPLOYEE VALUES (1, 'JOHN', 20000, 90234567, 'JOHN@GMAIL.COM', 1);
INSERT INTO EMPLOYEE VALUES (2, 'MARY', 10000, 90234561, 'MARY@GMAIL.COM', 1);
INSERT INTO EMPLOYEE VALUES (3, 'STEVE', 30000, 90234562, 'STEVE@GMAIL.COM', 3);
INSERT INTO EMPLOYEE VALUES (4, 'SUNNY', 40000, 90234563, 'SUNNY@GMAIL.COM', 4);

INSERT INTO DEPARTMENT VALUES (1, 'HR', 'HUMAN RESOURCES');
INSERT INTO DEPARTMENT VALUES (2, '9UP', 'SUP DEPARTMENT');
INSERT INTO DEPARTMENT VALUES (3, 'SA', 'SALES DEPARTMENT');
INSERT INTO DEPARTMENT VALUES (4, 'IT', 'INFORMATION TECHNOLOGY DEPARTMENT');
INSERT INTO DEPARTMENT VALUES (5, 'IT', 'INFORMATION TECHNOLOGY DEPARTMENT');

select * from department;
select * from employee;

-- n of employee from high to low, if same order by dept.code asc, select dept.code, n of employee
with employee_counts as ( 
	select d.dept_code, count(e.id) as num_of_employee
	from department d
	left join employee e on e.dept_id = d.id 
	group by d.dept_code
)
select dept_code, num_of_employee
from employee_counts
order by num_of_employee desc, dept_code;


	

