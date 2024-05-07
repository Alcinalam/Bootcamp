-- inner join (multiply 2 set of records)
select *
from customer2 inner join order2;

-- inner join -> find all orders with its customer data
-- approach 1
select c.first_name, c.last_name, c.phone,c.email, o.total_amount
from customer2 c inner join order2 o on c.id = o.customer_id
where o.total_amount > 30; -- execute after table join

-- approach 2
select c.first_name, c.last_name, c.phone, c.email, o.total_amount
from customer2 c , order2 o
where c.id = o.customer_id
and o.total_amount > 30; 