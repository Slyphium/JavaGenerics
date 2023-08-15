package Generics;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        Inventory<Product> myInventory = new Inventory<>();

        myInventory.addItem(new Product("Product A", 10.0));
        myInventory.addItem(new Product("Product B", 20.0));
        myInventory.addItem(new Product("Product C", 30.0));
        myInventory.addItem(new Product("Product D", 40.0));

        List<Product> productList = myInventory.getItems();

        double priceTotal = productList.stream()
                .mapToDouble(product -> product.getPrice())
                .sum();

        System.out.println("Total price of all products: $" + priceTotal);
    }
}






