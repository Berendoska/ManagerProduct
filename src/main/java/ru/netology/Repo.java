package ru.netology;

public class Repo {

    static Product[] products = new Product[0];

    public void add(Product product) {
        Product[] tmp = new Product[products.length + 1];
        for (int i = 0; i < products.length; i++) {
            tmp[i] = products[i];
        }

        tmp[tmp.length -1] = product;
        products = tmp;

    }

    public static Product[] remove(int remove) {
        Product[] tmp = new Product[products.length - 1];
        int index = 0;
        for (Product product : products) {
            if (product.getId() != remove) {
                tmp[index] = product;
            }
        }

        products = tmp;
        return tmp;
    }

    public Product[] findAll() {
        return products;

    }
}
