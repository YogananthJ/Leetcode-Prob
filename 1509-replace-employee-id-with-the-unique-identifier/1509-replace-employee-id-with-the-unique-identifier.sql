SELECT euni.unique_id , e.name as name from Employees e
LEFT JOIN EmployeeUNI euni
ON e.id = euni.id