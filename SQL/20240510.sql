create table department(
	id serial primary key, -- serial = int + auto_increment
	department_name varchar(50)
);

create table employee (
	id serial primary key,
	employee_name varchar(50),
	department_id int references department(id) -- foreign key
);

-- insert into department values (1,'IT'); --autoincrement, 
delete from department;
insert into department (department_name) values ('MK');
insert into department (department_name) values ('IT');
insert into department (department_name) values ('Sales');
insert into department (department_name) values ('HR');

insert into employee (employee_name,department_id) values ('Vincent',2);
insert into employee (employee_name,department_id) values ('Sally',1);
insert into employee (employee_name,department_id) values ('Jenny',3);
insert into employee (employee_name,department_id) values ('Cherry',3);


select * from department;
select * from employee;

select *
from department d left join employee e on d.id = e.department_id

-- Similar to NOT Exists
select *
from department d full outer join employee e on d.id = e.department_id
where e.id is null;

-- Not Exists
select d.*
from department d
where not exists (select 1 from employee e where e.department_id = d.id)
;

select *
from department d inner join employee e on e.department_id = d.id;

select *
from department d, employee e
where e.department_id = d.id
;

-- PostreSQL
-- distinct on + order by
-- distinct one column, but you can select some other columns
select distinct on (department_id) department_id, id, employee_name
from employee
order by department_id asc, id desc; -- determine the representative by "order by"

-- MySql (the coloum for distinct and select are same)
-- result -> 1,2,3,
select distinct department_id
from employee;





