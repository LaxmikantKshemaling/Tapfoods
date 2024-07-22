package com.tap.model;

public class CartItem {
    // Declaring private instance variables
    private int itemId; // ID of the cart item
    private int restaurantId; // ID of the restaurant to which the item belongs
    private String name; // Name of the item
    private int quantity; // Quantity of the item in the cart
    private double price; // Price of the item
    
    // Default constructor
    public CartItem() {
        // Empty constructor
    }

    // Parameterized constructor with all fields
    public CartItem(int itemId, int restaurantId, String name, int quantity, double price) {
        super();
        this.itemId = itemId;
        this.restaurantId = restaurantId;
        this.name = name;
        this.quantity = quantity;
        this.price = price;
    }

    // Getter and setter methods for private variables
    public int getItemId() {
        return itemId;
    }

    public void setItemId(int itemId) {
        this.itemId = itemId;
    }

    public int getRestaurantId() {
        return restaurantId;
    }

    public void setRestaurantId(int restaurantId) {
        this.restaurantId = restaurantId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    // Overriding toString method to display cart item information
    @Override
    public String toString() {
        return "CartItem [itemId=" + itemId + ", restaurantId=" + restaurantId + ", name=" + name + ", quantity="
                + quantity + ", price=" + price + "]";
    }
}