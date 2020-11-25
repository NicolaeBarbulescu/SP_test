package Models;

import Models.Product;

import java.util.HashMap;

public class Order {
    private HashMap<Product,Integer> comanda;

    public HashMap<Product, Integer> getComanda() {
        return comanda;
    }

    public void setComanda(HashMap<Product,Integer> comanda) {
        this.comanda = comanda;
    }
}
