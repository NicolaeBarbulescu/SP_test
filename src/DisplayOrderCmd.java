import Models.Order;
import Models.Product;

public class DisplayOrderCmd {
    Order order;
    DisplayOrderCmd (Order order)
    {
        // Display order
        this.order = order;
    }

    void execute()
    {
        // Display order
        float total = 0;
        for(Product p : order.getComanda().keySet())
        {
            System.out.print(order.getComanda().get(p)+ " x " );
            System.out.println(p.getName()+ " x " + p.getPrice());
            total += p.getPrice() * order.getComanda().get(p);
        }
        System.out.println("TOTAL: " + total + " RON");
    }
}
