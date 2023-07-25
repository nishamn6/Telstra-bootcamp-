show databases;
use bootcamp;
 
create table employee(id int,name char(30),dept varchar(30),age int,salary float);
 
desc employee;
insert into employee values(1,'Nisha','Gnt',21,50000);
insert into employee values(2,'Divya','Gnt',22,40000);
insert into employee values(3,'vaishnavi','Gnt',22,60000);
select * from employee;
select id, name from employee;
select id,name,dept,age,salary from employee;
update employee set dept='developer' where id=1;
select * from employee;
update employee set dept='cloud' where id =3;
select * from employee ;
insert into employee values(4,'Raksha','tse',22,60000); 
select * from employee;
update employee set salary= 55000 where id=4;
select * from employee;
update employee set dept='AI' where id=1;	
select name,salary,salary+5000 as bonus ,salary/30 as perDaySalary from employee;
select * from employee where dept='gnt'; -- it displays column only dept =gnt
select * from employee where dept<>'gnt';
select * from employee where dept='gnt' or age<21;
select * from employee where salary between 50000 and 60000 ;
select * from employee where not dept="cloud";
select * from employee where name like 'v%';  -- it display whoes name starts with v
select * from employee where name like '_a%';
select * from employee where name like '%a'; -- it dispays whoes name ends with a.
select * from employee where name like '%a%';
select * from employee;
insert into employee values(5,'gayathri','gnt',20,40000);
insert into employee values(6,'vijaya','tse',21,60000);
insert into employee values(7,'nishani','tse',22,55000);
select *  from employee; 

select * from employee order by name;
select * from employee order by name desc;
select * from employee order by salary;
 
select min(salary) from employee; 
select max(salary) from employee; 

select min(salary),max(salary),avg(salary),count(salary) from employee; 
select id,name,upper(name),lower(name) from employee; 

select round(35000.788,1);
select * from employee;

select dept from employee group by dept;
select dept,sum(salary),count(id) from employee group by dept;
select dept,round(sum(salary)),count(id) from employee group by dept;
select dept,round(sum(salary)),count(id) from employee group by dept
order by count(id) desc;
select dept,round(sum(salary)),count(id) from employee group by dept
having count(id)>=2
order by count(id) desc;

select * from employee where dept is null;
select * from employee where dept is not null;

select * from employee where salary > (select salary from employee where name ='nisha'); -- single row sub query

select * from employee
 where salary > 
 (select salary from employee where dept ='AI');
 
select * from employee where salary =55000; 
select * from employee where salary in(55000,40000); -- in is same as equal to

select * from employee
 where salary > any
 (select salary from employee where dept ='AI');
 
 select * from employee
 where salary > all
 (select salary from employee where dept ='gnt');
 
 -- create table emp2
--  (
--  id int primary key,
--  name varchar(30),
CREATE TABLE emtest LIKE employee;
desc emtest;

create table employeetest
(
name varchar(30)not null,
age int check(age>22),
mobileNo varchar(10),



 




    
    
 
 