package sg.edu.nus.iss.Day23.repositories;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import sg.edu.nus.iss.Day23.models.Order;

@Repository
public class OrderRepo {
    
    @Autowired
    private JdbcTemplate jdbcTemplate;

    private static final String GET_ORDERDETAILSBYID_SQL = """ 
        select ord.id as order_id, ord.order_date, ord.customer_id,
        (od.quantity * od.unit_price * if(od.discount > 0, od.discount, 1)) as total, 
        (od.quantity * p.standard_cost) as cost_price
        from orders as ord
        inner join order_details as od
        on ord.id = od.order_id
        inner join products as p
        on p.id = od.product_id
        where order_id = 42 
        """;

    public List<Order> getOrderById(int id) {
        return jdbcTemplate.query(GET_ORDERDETAILSBYID_SQL, 
            BeanPropertyRowMapper.newInstance(Order.class), id);
    }
}
