/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.time.LocalDate;
import javax.swing.ImageIcon;

/**
 *
 * @author chengzhishi
 */
public class CompletedOrderUserComplain {
    private customer Customer;
    private order Order;
    private String Problem;
    private ImageIcon Image;
    private String Details;
    private String Decision;

    
    public customer getCustomer() {
        return Customer;
    }

    public void setCustomer(customer Customer) {
        this.Customer = Customer;
    }

    public order getOrder() {
        return Order;
    }

    public void setOrder(order Order) {
        this.Order = Order;
    }

    public String getProblem() {
        return Problem;
    }

    public void setProblem(String Problem) {
        this.Problem = Problem;
    }

    public ImageIcon getImage() {
        return Image;
    }

    public void setImage(ImageIcon Image) {
        this.Image = Image;
    }

    public String getDetails() {
        return Details;
    }

    public void setDetails(String Details) {
        this.Details = Details;
    }

    public String getDecision() {
        return Decision;
    }

    public void setDecision(String Decision) {
        this.Decision = Decision;
    }
    
    
    @Override
    public String toString(){
        String OrderNumber = String.valueOf(Order.getOrderNumber());
        return OrderNumber;
    }
    
}
