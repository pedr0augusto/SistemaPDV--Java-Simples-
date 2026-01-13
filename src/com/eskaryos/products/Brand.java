package com.eskaryos.products;

public class Brand {

    private String name;
    private Type type;

    public Brand (String name, Type type) {
        this.type = type;
        this.name = name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public void setType(Type type) {
        this.type = type;
    }
    public String getName() {
        return this.name;
    }
    public Type getType() {
        return this.type;
    }
}
