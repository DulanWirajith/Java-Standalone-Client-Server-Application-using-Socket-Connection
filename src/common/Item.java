/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package common;

import java.io.Serializable;

/**
 *
 * @author Dulan
 */
public class Item implements Serializable{
    
    private static final long serialVersionUID = 5950169519310163575L;
    
    String id;
    String name;
    
    int rate;
    double price;
    int availableQty;

    public Item() {
    }

    public Item(String id, int availableQty) {
        this.id = id;
        this.availableQty = availableQty;
    }

    public Item(String id, String name, int rate, double price, int availableQty) {
        this.id = id;
        this.name = name;
        this.rate = rate;
        this.price = price;
        this.availableQty = availableQty;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getRate() {
        return rate;
    }

    public void setRate(int rate) {
        this.rate = rate;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getAvailableQty() {
        return availableQty;
    }

    public void setAvailableQty(int availableQty) {
        this.availableQty = availableQty;
    }

   
}
