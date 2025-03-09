SELECT employee_id from Employees
WHERE salary < 30000 and manager_id NOT IN (SELECT employee_id from Employees)
order by employee_id