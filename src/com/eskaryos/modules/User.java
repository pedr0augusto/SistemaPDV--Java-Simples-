package com.eskaryos.modules;

import java.util.UUID;

public class User {

    private String name;
    private String pass;
    private boolean admin;

    public User (String name, String pass, boolean admin) {
        this.name = name;
        this.pass = pass;
        this.admin = admin;
    }
    public void setAdmin (boolean isadmin) {
        this.admin = isadmin;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setPass(String pass) {
        this.pass = pass;
    }
    public String getName(){
        return this.name;
    }
    public String getPassword(){
        return this.pass;
    }
    public Boolean isAdmin() {
        return this.admin;
    }
}
