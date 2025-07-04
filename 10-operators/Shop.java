import java.util.Scanner;

public class Shop {

    static double PACKET_PRICE = 20;


    static int getDataByScanner() {
        Scanner scanner = new Scanner(System.in);
        System.out.printf("Vendemos paquetes de pantalones y camisetas a %s EU\n",PACKET_PRICE );
        System.out.println("Dime el numero de paquetes de pantalones");
        int packets = scanner.nextInt();
        scanner.close();
        return packets;
    }

    public static void main(String[] args) {
        int numPackets = getDataByScanner();
        System.out.println(numPackets);
        double discount;
        int shippingByPacket;
        double total;

         if (numPackets < 5) {

         }else if (numPackets < 10) {
            discount = 0.05;
            shippingByPacket = 10 ;
         }else if (numPackets < 20) {
            discount = 0.1;
            shippingByPacket = 5;
         }else {
            discount = 0.15;
            shippingByPacket = 0;
         }
         // Validos par los productos 2, 3, y 4

         double preTotal = (numPackets * PACKET_PRICE);  // 100
         Double finalDiscount = preTotal * discount; //10% -> 10
         double totalShipping = numPackets * shippingByPacket;
         double finalPrice = total - finalDiscount + totalShipping;

         System.out.println("""
                 Número de paqueters       %d
                 Precio total del producto %.2f EU
                 descuento aplicado        %.2f EU
                 Gastos de envio %s        %.2f EU
                 ---------------------------------
                 TOTAL %s                  %.2f EU
                 """.formatted(numPackets, total, finalDiscount, totalShipping, finalPrice));
        scanner.close();    
         // Precios de los productos
        // final double PRECIO_CAMISETA = 10.0; // precio por camiseta



       /*
       
       final double PRECIO_PANTALON = 20.0; // precio por pantalón
        
        System.out.println("Bienvenido a Shop - Venta al por mayor");
        System.out.println("======================================");
        
        // Solicitar cantidad de camisetas
        System.out.print("Ingrese la cantidad de camisetas: ");
        int cantidadCamisetas = scanner.nextInt();
        
        // Solicitar cantidad de pantalones
        System.out.print("Ingrese la cantidad de pantalones: ");
        int cantidadPantalones = scanner.nextInt();
        
        // Calcular total de paquetes (1 paquete = 1 camiseta o 1 pantalón)
        int totalPaquetes = cantidadCamisetas + cantidadPantalones;
        
        // Calcular subtotal sin descuentos
        double subtotal = (cantidadCamisetas * PRECIO_CAMISETA) + (cantidadPantalones * PRECIO_PANTALON);
        
        double descuento = 0.0;
        double costoEnvio = 0.0;
        
        if (totalPaquetes < 5) {
            System.out.println("No se puede realizar la venta. Mínimo 5 paquetes.");
            return; // Terminar el programa
        } else if (totalPaquetes < 10) {
            descuento = subtotal * 0.05; // 5% de descuento
            costoEnvio = totalPaquetes * 10.0; // 10€ por paquete
            System.out.println("Descuento aplicado: 5%");
            System.out.println("Costo de envío: 10€ por paquete");
        } else if (totalPaquetes <= 20) {
            descuento = subtotal * 0.10; // 10% de descuento
            costoEnvio = totalPaquetes * 5.0; // 5€ por paquete
            System.out.println("Descuento aplicado: 10%");
            System.out.println("Costo de envío: 5€ por paquete");
        } else {
            descuento = subtotal * 0.15; // 15% de descuento
            // Envío gratuito (costoEnvio ya es 0)
            System.out.println("Descuento aplicado: 15%");
            System.out.println("Envío gratuito");
        }
        
        double total = (subtotal - descuento) + costoEnvio;
        
        // Mostrar resumen
        System.out.println("\nResumen de la compra:");
        System.out.println("---------------------");
        System.out.println("Camisetas: " + cantidadCamisetas + " x " + PRECIO_CAMISETA + "€ = " + (cantidadCamisetas * PRECIO_CAMISETA) + "€");
        System.out.println("Pantalones: " + cantidadPantalones + " x " + PRECIO_PANTALON + "€ = " + (cantidadPantalones * PRECIO_PANTALON) + "€");
        System.out.println("Subtotal: " + subtotal + "€");
        System.out.println("Descuento: -" + descuento + "€");
        System.out.println("Costo de envío: " + costoEnvio + "€");
        System.out.println("Total a pagar: " + total + "€");
        System.out.println("Gracias por su compra en Shop!");
        
       */ 
      
       scanner.close();
    }
}
