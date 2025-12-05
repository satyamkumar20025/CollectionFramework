package ComparableQuestion;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Products implements Comparable<Products> {

    String name;
    double price;

    public Products(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return "Products [name=" + name + ", price=" + price + "]";
    }

    @Override
    public int compareTo(Products p) {
        // Natural ordering by price
        return Double.compare(this.price, p.price);
    }

    public static void main(String[] args) {
        List<Products> products = new ArrayList<>();

        products.add(new Products("kai", 455));
        products.add(new Products("apple", 300));
        products.add(new Products("banana", 200));
        products.add(new Products("mango", 600));
        products.add(new Products("orange", 400));

        System.out.println("Before sorting: " + products);

        // Sort by price, then by name
        products.sort(Comparator.comparing(Products::getPrice).thenComparing(Products::getName));

        System.out.println("\nAfter sorting:");
        for (Products p : products) {
            System.out.println(p.name + " - " + p.price);
        }
    }
}