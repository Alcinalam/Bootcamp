create database bootcamp_exercise1;
show databases;
use bootcamp_exercise1;

create table regions (
	region_id int primary key,
    region_name varchar(25)
    );
    
create table countries (
	country_id char(2) primary key,
    country_name varchar(40),
    region_id int,
    foreign key (region_id) references regions(region_id)
);

create table locations (
	location_id int primary key,
    street_address varchar(25),
    postal_code varchar(12),
    city varchar(30),
    state_province varchar(12),
    country_id char(2),
    foreign key (country_id) references countries (country_id)
);

create table departments (
	department_id int primary key,
    department_name varchar(30),
    manager_id int,
    location_id int,
    foreign key (location_id) references locations(location_id)
    );
    
create table jobs(
	job_id varchar(10) primary key,
    job_title varchar(35),
    min_salary int,
    max_salary int
);

create table employees (
	employee_id int primary key auto_increment,
    first_name varchar(20),
    last_name varchar(25),
    email varchar(25) unique,
    phone_number varchar(20) unique,
    hire_date date,
    job_id varchar(10),
    salary int,
    commission_pct int,
    manager_id int,
    department_id int,
    foreign key (job_id) references jobs (job_id),
    foreign key (department_id) references departments (department_id) 
);

create table job_history(
	employee_id int,
    start_date date,
    end_date date,
    job_id varchar(10),
    department_id int,
	primary key (employee_id, start_date),
    foreign key (employee_id) references employees (employee_id),
    foreign key (job_id) references jobs (job_id),
    foreign key (department_id) references departments (department_id)    
);
select * from regions;
select * from countries;
select * from locations;
select * from departments;
select * from jobs;
select * from employees;
select * from job_history;

-- regions (REGION_ID, REGION_NAME)
insert into regions values (1,'Asia'),(2,'North America'),(3,'Europe');
                          
-- countries (COUNTRY_ID, COUNTRY_NAME, REGION_ID) 
insert into countries values ('JP','Japan',1),('HK','Hong Kong',1),('SG','Singapore',1),('US','United State',2),
							 ('DE','Germany',3), ('UK','United Kingdom',3);

-- locations (LOCATION_ID, STREET_ADDRESS, POSTAL_CODE, CITY, STATE_PROVINCE, COUNTRY_ID)
insert into locations values (1001, 'daimaru street','100-7684','Toyko',null,'JP');
insert into locations values (1002, '123 main street','12345','New York','NY','US');
insert into locations values (1003,  '456 Elm St', '67890', 'London', null,'UK');
insert into locations values (1004, 'Maple street','45758','Singapore',null,'SG');

-- departments  (DEPARTMENT_ID, DEPARTMENT_NAME, MANAGER_ID, LOCATION_ID)
insert into departments values (10, 'Sales','101', 1001);
insert into departments values (20, 'HR','102', 1003);                             
insert into departments values (30, 'IT','103', 1004);
insert into departments values (40, 'P&S','104', 1002);

-- jobs 
INSERT INTO JOBS (JOB_ID, JOB_TITLE, MIN_SALARY, MAX_SALARY) VALUES
('SALESMAN', 'Salesman', 30000, 60000),
('HR_REP', 'HR Representative', 35000, 70000),
('IT_PROG', 'IT Programmer', 40000, 80000);

INSERT INTO JOBS (job_id, job_title,grade_level) VALUES
('SALESM','Manger', 'G3'),
('SALESAM','Asst.Manger', 'G2'),
('JSALES','Sales', 'G1');


-- employees
INSERT INTO EMPLOYEES (EMPLOYEE_ID, FIRST_NAME, LAST_NAME, EMAIL, PHONE_NUMBER, HIRE_DATE, JOB_ID, SALARY, COMMISSION_PCT, MANAGER_ID, DEPARTMENT_ID) VALUES
(101, 'John', 'Doe', 'john@example.com', '123-456-7890', '2023-01-15', 'SALESMAN', 50000, 0.05, 103, 10),
(102, 'Jane', 'Smith', 'jane@example.com', '987-654-3210', '2023-02-20', 'HR_REP', 55000, 0.07, 103, 20),
(103, 'Michael', 'Johnson', 'michael@example.com', '555-123-4567', '2023-03-25', 'IT_PROG', 60000, 0.06, 103,30);
INSERT INTO EMPLOYEES VALUES (104, 'kelly', 'Tee', 'kellyTee@example.com', '555-1983-4987', '2023-09-18', 'SALESMAN', 55000, 0.06, 102,10);
INSERT INTO EMPLOYEES VALUES (105, 'Carem', 'chan', 'carmenchan@example.com', '923-850-935', '2024-09-21', 'JSALES', 30000, 0.08, 102,10);

-- job_history
INSERT INTO JOB_HISTORY (START_DATE, END_DATE, JOB_ID, DEPARTMENT_ID, EMPLOYEE_ID) VALUES
('2023-01-15', '2023-05-15', 'SALESMAN', 10, 101),
('2023-02-20', '2023-06-20', 'HR_REP', 20, 102),
('2023-03-25', NULL, 'IT_PROG', 30, 103);

-- query
-- find the location_id, street_address, city, state_province, country_name of locations
select l.location_id, l.street_address, l.city, l.state_province, c.country_name
from locations l inner join countries c on l.country_id = c.country_id;

-- find first_name, last_name, department_id of all the employees.
select first_name, last_name, department_id from employees;

-- find first_name, last_name, job_id, department_id of the employees who work in Japan.
select e.first_name, e.last_name, e.job_id, e.department_id
from employees e 
inner join departments d on e.department_id = d.department_id
inner join locations l on d.location_id = l.location_id
where l.country_id = 'JP';

-- find employee_id, last_name along with their manager_id and last_name
select e.employee_id, e.last_name, e.manager_id, m.last_name
from employees e inner join employees m on e.manager_id = m.employee_id;

-- find first_name, last_name and hire date of the employees who was hired after employee 'jane' 
select first_name, last_name 
from employees 
where hire_date > (select hire_date from employees where lower(first_name) = 'jane');

-- get the department_name and number of employees of each the department
select d.department_name, count(e.email)
from departments d inner join employees e on d.department_id = e.department_id
group by department_name;

-- find the employee_id, job_title, number of days between ending date and starting date
-- for all jobs in department ID 30
select e.employee_id, j.job_title, ifnull(datediff(jh.start_date, jh.end_date),'on going')
from employees e 
inner join jobs j on e.job_id = j.job_id
inner join job_history jh on j.job_id = jh.job_id
where jh.department_id = 30;

-- display all department name, manager name, city and country name
select d.department_name, concat(e.first_name,' ',e.last_name) as full_name , l.city , c.country_name
from departments d 
left join employees e on d.manager_id = e.employee_id
inner join locations l on d.location_id = l.location_id
inner join countries c on l.country_id = c.country_id;

-- display the average salary of each department
select d.department_name, round(avg((j.min_salary + j.max_salary)/2),0) as avg_salary
from  employees e
inner join jobs j on e.job_id = j.job_id
inner join departments d on e.department_id = d.department_id
group by d.department_name;

-- create job_grades
create table grade_level (
	grade_level varchar(2) primary key,
    lowest_sal int,
    higest_sal int
    );

insert into grade_level values ('G1',30000,49999);
insert into grade_level values ('G2',50000,69999);
insert into grade_level values ('G3',70000,80000);

rename table grade_level to job_grades;
select * from job_grades; 

-- add column on jobs
alter table jobs add column grade_level varchar(2);

-- add constraint forign key to jobs
alter table jobs add constraint fk_jobs_grade_level
foreign key (grade_level) references job_grades (grade_level);

-- query 
select e.first_name, e.last_name, d.department_name, j.job_title, e.email,e.hire_date, j.grade_level
from  employees e
inner join jobs j on e.job_id = j.job_id
inner join departments d on e.department_id = d.department_id
having grade_level is not null;











					 