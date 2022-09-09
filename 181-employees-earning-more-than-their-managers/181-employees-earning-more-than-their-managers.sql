# Write your MySQL query statement below
SELECT employee.name as Employee 
FROM Employee employee JOIN Employee manager on employee.managerId = manager.id
WHERE employee.Salary > manager.Salary;