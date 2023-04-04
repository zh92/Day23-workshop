use northwind;

/*	order table pk = id -----> order_details table fk = order_id
	products table pk = id ------> order_details table fk = product_id
*/ 

select order_date from orders;

select ord.id, ord.order_date, ord.customer_id, od.quantity, od.unit_price, od.discount, p.standard_cost
from orders as ord
inner join order_details as od
on ord.id = od.order_id
inner join products as p
on p.id = od.product_id;
