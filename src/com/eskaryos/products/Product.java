package com.eskaryos.products;

public class Product {

    private String name;
    private String description;
    private Brand brand;
    private Type type;
    private double value;
    private int stock;
    private int id;

    public Product (String name,int id, Brand brand, Type type, double value, int stock) {
        this.name = name;
        this.type = type;
        this.value = value;
        this.stock = stock;
        this.description = "";
        this.id = id;
    }

    public void addStock(int value) {
        setStock(getStock()+value);
    }
    public void removeStock(int value) {
        setStock(getStock()-value);
    }
    public Integer getId(){
        return this.id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public Integer getStock(){
        return this.stock;
    }
    public void setStock(Integer stock) {
        this.stock = stock;
    }
    public Double getValue(){
        return this.value;
    }
    public void setValue(Double value) {
        this.value = value;
    }
    public Type getType(){
        return this.type;
    }
    public void setType(Type type) {
        this.type = type;
    }
    public Brand getBrand(){
        return this.brand;
    }
    public void setBrand(Brand brand) {
        this.brand = brand;
    }
    public String getName(){
        return this.name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getDescription(){
        return this.description;
    }
    public void setDescription(String description) {
        this.description = description;
    }
}
