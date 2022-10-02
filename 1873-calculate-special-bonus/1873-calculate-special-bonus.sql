# Write your MySQL query statement below
select employee_id,(case 
when employee_id %2=0 OR name like'M%' Then 0
ELSE salary End) as bonus from Employees order by employee_id ;