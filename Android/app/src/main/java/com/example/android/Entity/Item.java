package com.example.android.Entity;

public class Item {
    private String name;
    private int stock;
    private int price;

    /**
     * Main constructor for Item, manually set name, stock, and price
     * @param name
     * @param stock
     * @param price
     */
    public Item(String name, int stock, int price) {
        this.name = name;
        this.stock = stock;
        this.price = price;
    }

    public Item() {
        this.name = null;
        this.stock = 0;
        this.price = 0;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    /**
     * Decrease stock by 1
     */
    public void minusStock() {
        stock--;
    }

    /**
     * Increase stock by 1
     */
    public void addStock() {
        stock++;
    }

    @Override
    public String toString() {
        return String.format("Item: %s, Stock %d, Price %d", name, stock, price);
    }
}
