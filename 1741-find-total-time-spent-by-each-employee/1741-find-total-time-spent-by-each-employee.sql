# Write your MySQL query statement below
SELECT event_day as day,emp_id
,sum(out_time-in_time) AS total_time
FROM Employees
group by
event_day,emp_id;