select 
    E1.employee_id, 
    E1.name, 
    Count(E2.employee_id) as reports_count,
    round(avg(E2.age)) as average_age
from 
    Employees e1 inner join Employees E2
on 
    E1.employee_id=E2.reports_to 
group by 
    E1.employee_id, E1.name
order by
    employee_id
