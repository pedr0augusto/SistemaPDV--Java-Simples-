package com.eskaryos.modules;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.UUID;

public class Client {

    private String name;
    private HashMap<Integer, List<String>> lastShopping;


    public Client(String name) {
        this.name = name;
        this.lastShopping = new HashMap<>();
    }
    public List<String> getShopping(Integer id) {
        if(lastShopping.containsKey(id)){
            return lastShopping.get(id);
        }
        return null;
    }
    public List<String> getAllShopping() {
        List<String> list = new ArrayList<>();
        for(int i =0; i< lastShopping.size(); i++) {
            List<String> l = lastShopping.get(i);
            list.addAll(l);
        }
        return list;
    }
    public void setName(String name) {
        this.name = name;
    }

    public String getName(){
        return this.name;
    }

}
