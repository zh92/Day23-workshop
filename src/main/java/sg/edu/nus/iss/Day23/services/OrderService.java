package sg.edu.nus.iss.Day23.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import sg.edu.nus.iss.Day23.models.Order;
import sg.edu.nus.iss.Day23.repositories.OrderRepo;

@Service
public class OrderService {
    
    @Autowired
    private OrderRepo orderRepo;

    public List<Order> getOrdersById(int id) {
        return orderRepo.getOrderById(id);
    }
}
