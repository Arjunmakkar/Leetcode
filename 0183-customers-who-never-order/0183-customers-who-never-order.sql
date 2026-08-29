# Write your MySQL query statement belowselect na
select name as Customers from Customers left join Orders on customers.id=orders.customerId where orders.customerId is null;