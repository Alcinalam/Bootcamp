create table countries(
	ID varchar (2) primary key,  -- unique
    country_name varchar(100)
);
insert into countries values ('IL','Israel');
insert into countries values ('IT','Italy');
insert into countries values ('UK','United Kingdom');
alter table countries modify column ID varchar (2);

select * from countries;

create table awards(
	ID int(4),
    main_contribution varchar(1000)
);

insert into awards values ( 2011 ,'algorithms');
insert into awards values ( 2012 ,'secure');
insert into awards values ( 2013 ,'system design');
insert into awards values ( 2014 ,'database design');
insert into awards values ( 2015 ,'key');

select * from awards;

create table winners(
	ID varchar (2) ,
    recipient int,
    year int
);
select * from winners;
insert into winners values ( 58,23, 2011);
insert into winners values ( 59,21, 2012);
insert into winners values ( 60,28, 2012);
insert into winners values ( 61,24, 2013);
insert into winners values ( 61,25, 2015);

-- "primary key" -> unqiue, not null, index
-- "auto_increment -> existing value max + 1
create table scientists(
	ID int primary key auto_increment, -- constraint 
    first varchar (20),
    last varchar (20),
    dob date,
    nationality varchar(2)
);
select * from scientists;
insert into scientists values (21,'shafira','Goldwaser',date_format('2000-04-13','%Y-%m-%d'),'US');
insert into scientists values (24,'kelly','smith',date_format('2003-05-14','%Y-%m-%d'),'UK');
insert into scientists values (23,'mandy','chan',date_format('2004-02-18','%Y-%m-%d'),'IT');
insert into scientists values (25,'bob','chan',date_format('2018-10-30','%Y-%m-%d'),'US');

-- Find the scientists getting the awards in 2015, show scientists first and last name and awards contribution
select s.first, s.last, a.main_contribution
from winners w 
inner join scientists s on w.recipient = s.ID
inner join awards a on w.year = a.ID
where year = 2015;

