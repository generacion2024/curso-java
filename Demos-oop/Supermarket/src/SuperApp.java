import containers.Box;
import containers.IContainer;
import products.IOrder;
import orders.Order;


public class SuperApp{
    public static void main(String[] args) throws Exception {
        System.out.println("Bienvenido a nuestro supermercado onLine");

        IOrder order1 = new Order("R001");
        System.out.println(order1);

        IContainer box1 = new Box("B007", length:50, width:50, heght:50);
        IContainer box1 = new Box("B005", heigth:50, width:50, resistence:5);

        System.err.println();
    }
}
