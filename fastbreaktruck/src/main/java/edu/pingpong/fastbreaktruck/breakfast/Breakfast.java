package edu.pingpong.fastbreaktruck.breakfast;

import java.util.ArrayList;
import java.util.List;

import edu.pingpong.fastbreaktruck.interfaces.Product;

public class Breakfast {
    private List<Product> products = new ArrayList<Product>();

    public void addProduct(Product product) {
        products.add(product);
    }

    public float getCost() {
        float cost = 0.0f;
        for (Product product : products) {
            cost += product.price();
        }
        return cost;
    }

    public void showProduct() {
        for (Product product : products) {
            System.out.println("Item : " + product.name());
            System.out.println(", Packing : " + product.packing().pack());
            System.out.println(", Price : " + product.price());
        }
    }

}
