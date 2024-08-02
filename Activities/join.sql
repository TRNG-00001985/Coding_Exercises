create database emp_database;
use emp_database;
create table departments(departmentID int primary key, departmentname varchar(20) not null);
create table employees(employeeID int , employeeName varchar(20),departmentid int,foreign key (departmentid) references departments(departmentid));
create table projects(projectID int , projectname varchar(20), departmentid int , foreign key(departmentid) references departments(departmentid));
insert into departments(departmentid,departmentname) values(1,"sales"),(2,"hr"),(3,"it"),(4,"marketing");
insert into employees(employeeID, employeeName ,departmentid)values(1,"John",1),(2,"Jane",2),(3,"mark",1),(4,"emily",3);
insert into projects(projectid , projectname , departmentid) values(101,"Project A", 1),(102,"Project B", 2),(103,"Project C", 3),(104,"Project D", 4),(105,"Project E", null);




SELECT e.employeeID, e.employeeName, d.departmentName
FROM employees e
INNER JOIN departments d ON e.departmentid = d.departmentid;

SELECT e.employeeID, e.employeeName, d.departmentName
FROM employees e
LEFT JOIN departments d ON e.departmentid = d.departmentid;

SELECT d.departmentID, d.departmentName, e.employeeName
FROM departments d
LEFT JOIN employees e ON d.departmentID = e.departmentID;

SELECT * FROM employees CROSS JOIN projects;

SELECT employeeID , employeeName
FROM employees
WHERE departmentID > (select departmentID from departments where departmentName = "HR");

SELECT projectid , projectname , departmentName 
FROM projects LEFT JOIN departments 
ON projects.departmentID = departments.departmentID;

SELECT *
FROM employees
WHERE departmentID IS NULL;

SELECT *
FROM departments
WHERE departmentID NOT IN (
    SELECT departmentID FROM employees
);

SELECT d.departmentID, d.departmentName, COUNT(e.employeeID) AS employee_count
FROM departments d
LEFT JOIN employees e ON d.departmentID = e.departmentID
GROUP BY d.departmentID, d.departmentName;

