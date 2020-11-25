import Models.Order;

public class Main {
    public static void main(String[] args)
    {
        // CreateOrderCmd va crea comanda cu continutul de mai sus
        Order order = new CreateOrderCmd().execute();

        // Va afisa comanda precum mai sus
        new DisplayOrderCmd(order).execute();
    }
}
