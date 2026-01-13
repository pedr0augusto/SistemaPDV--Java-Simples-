package com.eskaryos.modules;

import com.eskaryos.products.Product;
import com.eskaryos.storage.Stock;

import java.util.ArrayList;
import java.util.List;

public class SellerModule {

    private User user;
    private List<Product> products;
    private double ballance;
    private double discount;
    private PaymentMethod paymentMethod;
    private Client client;

    public SellerModule(User user, Client client) {
        this.user = user;
        this.client = client;
        this.products = new ArrayList<>();
        this.ballance = 0.0;
        this.discount = 0.0;
    }

    public void addDiscount (Double value) {
        this.discount = discount + value;
    }
    public void removeDiscount (Double value) {
        this.discount = discount - value;
    }
    public void addPaymentMethod(PaymentMethod method) {
        this.paymentMethod = method;
    }

    public void addProduct(String name, Stock stock, int value) {
        Product p = stock.getProduct(name);
        products.add(p.getId(),p);
        stock.removeStock(p.getId(),value);
        ballance = ballance + p.getValue();
    }
    public void removeProduct(String name, Stock stock, int value) {
        Product p = stock.getProduct(name);
        stock.addStock(p.getId(),value);
        ballance = ballance - p.getValue();
        products.remove(p);
    }

    public void addProduct(int id, Stock stock, int value) {
        Product p = stock.getProduct(id);
        getProducts().add(p);
        stock.removeStock(p.getId(),value);
        ballance = ballance + p.getValue();
    }
    public void removeProduct(int id, Stock stock, int value) {
        Product p = stock.getProduct(id);
        stock.addStock(p.getId(),value);
        ballance = ballance - p.getValue();
        products.remove(p);
    }

    public String getUser(){
        return user.getName();
    }
    public String getClient(){
        return client.getName();
    }
    public double getBallance(){
        return this.ballance;
    }
    public List<Product> getProducts(){
        return this.products;
    }
}
