package sg.edu.nus.iss.Day23.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import sg.edu.nus.iss.Day23.models.Order;
import sg.edu.nus.iss.Day23.payload.SearchRequest;
import sg.edu.nus.iss.Day23.services.OrderService;

@RestController
@RequestMapping(path="/order/total", produces = MediaType.APPLICATION_JSON_VALUE)
public class OrderController {

    @Autowired
    private OrderService orderSvc;

    @PostMapping
    public String getRsvps(@ModelAttribute("orderId") SearchRequest searchRequest,
                            Model model) {
        SearchRequest sr = new SearchRequest();
        model.addAttribute("null", sr);
        return "orderlist";
    }
    // @GetMapping
    // public String searchOrder(Model model) {
    //     SearchRequest sr = new SearchRequest();
    //     model.addAttribute("searchRequest", sr);
    //     return "search";
    // }

    // @PostMapping("/search")
    // public String getOrdersById(@ModelAttribute("searchRequest") SearchRequest searchRequest, Model model) {
    //     List<Order> orders = orderSvc.getOrdersById(searchRequest.getId());
    //     model.addAttribute("orders", orders);
    //     return "orderlist";

    // }
    
}
