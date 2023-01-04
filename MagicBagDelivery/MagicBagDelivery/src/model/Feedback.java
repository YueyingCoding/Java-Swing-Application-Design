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
public class Feedback {
    private int ScoreDP;
    private int ScoreMKT;
    private String CommentDP;
    private String CommentMKT;
    private customer Customer;
    private Market market;
    private order Order;

    public customer getCustomer() {
        return Customer;
    }

    public void setCustomer(customer Customer) {
        this.Customer = Customer;
    }

    public Market getMarket() {
        return market;
    }

    public void setMarket(Market market) {
        this.market = market;
    }

    public order getOrder() {
        return Order;
    }

    public void setOrder(order Order) {
        this.Order = Order;
    }
    

    public int getScoreDP() {
        return ScoreDP;
    }

    public void setScoreDP(int ScoreDP) {
        this.ScoreDP = ScoreDP;
    }

    public int getScoreMKT() {
        return ScoreMKT;
    }

    public void setScoreMKT(int ScoreMKT) {
        this.ScoreMKT = ScoreMKT;
    }

    public String getCommentDP() {
        return CommentDP;
    }

    public void setCommentDP(String CommentDP) {
        this.CommentDP = CommentDP;
    }

    public String getCommentMKT() {
        return CommentMKT;
    }

    public void setCommentMKT(String CommentMKT) {
        this.CommentMKT = CommentMKT;
    }
    
}
