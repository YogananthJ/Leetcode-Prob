# Write your MySQL query statement below
select employee.name as Employee from Employee employee 
Join Employee manager
on employee.managerId = manager.id
where employee.salary> manager.salary;