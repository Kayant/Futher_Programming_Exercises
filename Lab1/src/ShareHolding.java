/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Kayant
 * @version 1.0
 */
class ShareHolding {
    private Sterling price;
    private int quantity;
    private String name;
    
    /**
     * 
     * @param name Used to set the name of the Share
     * @param price Used to set the initial price of the Share
     * @param quantity Used to set the initial amount of Shares been held
     */
    ShareHolding(String name, Sterling price, int quantity) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    /**
     * 
     * @return Name of share 
     */
    public String getName() {
        return name;
    }

    /**
     * 
     * @return Price of share 
     */
    public Sterling getPrice() {
        return price;
    }

    /**
     * 
     * @param price Used to set a new price for the Share 
     */
    public void setPrice(Sterling price) {
        this.price = price;
    }

    /**
     * 
     * @return The amount of shares been held
     */
    public int getQuantity() {
        return quantity;
    }

    /**
     * 
     * @param quantity Used to set the new amount of shares held 
     */
    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
    
}
