Select person_name from (select person_name, turn ,sum(weight) Over (order by turn) as total_weight from Queue) p1
where total_weight <=1000 
order by turn desc limit 1;