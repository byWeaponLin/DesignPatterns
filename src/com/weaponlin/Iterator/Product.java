package com.weaponlin.Iterator;

/**
 * Created by Weapon Lin on 2017/1/15.
 */
public class Product {
    private int id;
    private String name;
    private double price;

    public Product(){

    }

    public Product(int id, String name, double price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Product{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", price=" + price +
                '}';
    }
}
