
SELECT employeeName 
from employees 
where departmentID = (select departmentID from employees where employeeName = "John");

SELECT departmentName
FROM departments
WHERE departmentID IN (
  SELECT departmentID
  FROM employees
  GROUP BY departmentID
  HAVING COUNT(*) > 1
);

SELECT projectName , projectID 
FROM projects WHERE departmentID 
NOT IN (select departmentID FROM departments);

SELECT departmentID FROM departments WHERE departmentID = (select departmentID from employees GROUP BY departmentID ORDER BY COUNT(departmentID) DESC LIMIT 1);

SELECT employeeName , employeeID from employees where departmentID = (select departmentID from departments where departmentName = "Sales");

SELECT departmentName
FROM departments WHERE departmentID NOT IN (SELECT departmentID FROM projects);

SELECT employeeName
FROM employees WHERE departmentID NOT IN (SELECT departmentID from projects);

SELECT d.departmentName, COUNT(e.employeeID) AS employee_count
FROM departments d
LEFT JOIN employees e ON d.departmentID = e.departmentID
GROUP BY d.departmentName
HAVING COUNT(e.employeeID) > 2;


SELECT p.projectName
FROM projects p
INNER JOIN employees e ON p.departmentID = e.departmentID
INNER JOIN departments d ON e.departmentID = d.departmentID
WHERE d.departmentName = 'IT';


SELECT employeeName
FROM employees
WHERE departmentID NOT IN (
    SELECT departmentID
    FROM departments
    WHERE departmentName = 'Marketing'
);

