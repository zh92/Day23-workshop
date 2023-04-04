package sg.edu.nus.iss.Day23.models;

import java.sql.Date;

public class Order {
    //select ord.id, ord.order_date, ord.customer_id, od.quantity, od.unit_price, od.discount, p.standard_cost
    private Integer id;
    private Date orderDate;
    private Integer customerId;
    private Float quantity;
    private Float unitPrice;
    private Double discount;
    private Float standardCost;
    
    public Order() {
    }
    
    public Order(Integer id, Date orderDate, Integer customerId, Float quantity, Float unitPrice, Double discount,
            Float standardCost) {
        this.id = id;
        this.orderDate = orderDate;
        this.customerId = customerId;
        this.quantity = quantity;
        this.unitPrice = unitPrice;
        this.discount = discount;
        this.standardCost = standardCost;
    }

    public Integer getId() {
        return id;
    }
    public void setId(Integer id) {
        this.id = id;
    }
    public Date getOrderDate() {
        return orderDate;
    }
    public void setOrderDate(Date orderDate) {
        this.orderDate = orderDate;
    }
    public Integer getCustomerId() {
        return customerId;
    }
    public void setCustomerId(Integer customerId) {
        this.customerId = customerId;
    }
    public Float getQuantity() {
        return quantity;
    }
    public void setQuantity(Float quantity) {
        this.quantity = quantity;
    }
    public Float getUnitPrice() {
        return unitPrice;
    }
    public void setUnitPrice(Float unitPrice) {
        this.unitPrice = unitPrice;
    }
    public Double getDiscount() {
        return discount;
    }
    public void setDiscount(Double discount) {
        this.discount = discount;
    }
    public Float getStandardCost() {
        return standardCost;
    }
    public void setStandardCost(Float standardCost) {
        this.standardCost = standardCost;
    }
    
   
}
