# Write your MySQL query statement below
select i.id from Weather i join Weather e 
on datediff(i.recordDate,e.recordDate)=1
where i.temperature>e.temperature;