/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entity;

/**
 *
 * @author A
 */
public class Consumer {
    private String name;
    private String purchase;
    private Integer quantity;
    
    public Consumer(){
    }

    public Consumer(String name, String purchase, Integer quantity) {
        this.name = name;
        this.purchase = purchase;
        this.quantity = quantity;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPurchase() {
        return purchase;
    }

    public void setPurchase(String purchase) {
        this.purchase = purchase;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    @Override
    public String toString() {
        return "Consumer{" 
                + "name=" + name 
                + ", purchase=" + purchase 
                + ", quantity=" + quantity 
                + '}';
    }
    
    
}
