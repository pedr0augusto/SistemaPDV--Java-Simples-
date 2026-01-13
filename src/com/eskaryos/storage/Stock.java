package com.eskaryos.storage;

import com.eskaryos.products.Product;

import java.util.HashMap;

public class Stock {

    private HashMap<Integer, Product> stock;

    public Stock() {
        stock = new HashMap<>();
    }

    public void addProduct(Product product) {
        stock.put(product.getId(),product);
    }

    public Product getProduct(String name) {
        for (Product p : stock.values()) {
            if(p.getName().equalsIgnoreCase(name)) {
                return p;
            }
        }
        return null;
    }
    public Product getProduct(Integer id) {
        if(stock.containsKey(id)) {
            return stock.get(id);
        }
        return null;
    }
    public void addStock(Integer id, int value) {
        if(stock.containsKey(id)) {
            stock.get(id).addStock(value);
        }
    }
    public void removeStock(Integer id, int value) {
        if(stock.containsKey(id)) {
            if(stock.get(id).getStock() - value > 0) {
                stock.get(id).removeStock(value);
            }
        }
    }
}
