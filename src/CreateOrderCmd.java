import Models.Order;
import Models.Product;

import java.util.HashMap;

public class CreateOrderCmd {



    Order execute()
    {
        Order order= new Order();
        HashMap<Product, Integer> c = new HashMap<Product, Integer>();
        Product p1 = new Product( 7.5f, "Supe pui");
        Product p2 = new Product(15, "Friptura de porc la tava");
        Product p3 = new Product(13,"Snitel vienez");
        Product p4 = new Product(6,"Cartofi Wedges");
        Product p5 = new Product(5,"Salata rosii");
        Product p6 = new Product(3, "Apa minerale");
        c.put(p1,2);
        c.put(p2,1);
        c.put(p3,1);
        c.put(p4,2);
        c.put(p5,2);
        c.put(p6,2);
        order.setComanda(c);
        return order;
    }
}
