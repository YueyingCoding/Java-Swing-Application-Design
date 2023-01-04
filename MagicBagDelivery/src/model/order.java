/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.time.LocalDate;

/**
 *
 * @author chengzhishi
 */
public class order {
    private int OrderNumber;
    private String OrderType;
    private float TotalAmount;
    private LocalDate OrderDate;
    private Market Market;
    private customer Customer;
    private deliveryperson DeliveryPerson;
    private String Status;

    public String getStatus() {
        return Status;
    }

    public void setStatus(String Status) {
        this.Status = Status;
    }
    

    public deliveryperson getDeliveryPerson() {
        return DeliveryPerson;
    }

    public void setDeliveryPerson(deliveryperson DeliveryPerson) {
        this.DeliveryPerson = DeliveryPerson;
    }
    
    

    public customer getCustomer() {
        return Customer;
    }

    public void setCustomer(customer Customer) {
        this.Customer = Customer;
    }
    

    public LocalDate getOrderDate() {
        return OrderDate;
    }

    public void setOrderDate(LocalDate OrderDate) {
        this.OrderDate = OrderDate;
    }

    public Market getMarket() {
        return Market;
    }

    public void setMarket(Market Market) {
        this.Market = Market;
    }
    
    

    public float getTotalAmount() {
        return TotalAmount;
    }

    public void setTotalAmount(float TotalAmount) {
        this.TotalAmount = TotalAmount;
    }
    
    
    public String getOrderType() {
        return OrderType;
    }

    public void setOrderType(String OrderType) {
        this.OrderType = OrderType;
    }

    
    

    public int getOrderNumber() {
        return OrderNumber;
    }

    public void setOrderNumber(int OrderNumber) {
        this.OrderNumber = OrderNumber;
    }
            
    @Override
    public String toString(){
        String od = String.valueOf(OrderDate);
        return od;
    }        
}
