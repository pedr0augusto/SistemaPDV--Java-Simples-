package com.eskaryos;

import com.eskaryos.modules.Client;
import com.eskaryos.modules.PaymentMethod;
import com.eskaryos.modules.SellerModule;
import com.eskaryos.modules.User;
import com.eskaryos.products.Brand;
import com.eskaryos.products.Product;
import com.eskaryos.products.Type;
import com.eskaryos.storage.Stock;

import java.util.UUID;

public class PDVMain {


    public static void main(String[] args) {
        Stock stock = new Stock();
        Product arroz = new Product("Arroz", 1, new Brand("Pilao", Type.FOOD), Type.FOOD,5.0,1);
        stock.addProduct(arroz);
        Client client = new Client("Pedro");
        User user = new User("Pedro", "123", true);
        SellerModule module = new SellerModule(user, client);

        module.addProduct(1,stock,1);
        module.addProduct(1,stock,1);
        module.addProduct(1,stock,1);

        module.addPaymentMethod(PaymentMethod.MONEY);

        System.out.println(module.getUser());
        System.out.println(module.getClient());
        System.out.println(module.getBallance());

        for (Product p : module.getProducts()){
            System.out.println(p.getName());
        }
    }

}
