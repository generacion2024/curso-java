import java.util.Scanner;

public class Shop2 {

    static final double SHIRT_PRICE = 30;
    static final double TROUSER_PRICE = 40;

    static int getDataByScanner() {
        Scanner scanner = new Scanner(System.in);
        System.out.printf("Vendemos paquetes de pantalones y camisetas a %s EU\n",SHIRT_PRICE );
        System.out.println("Dime el numero de paquetes de camisatas a %s EUª\n", TROUSER_PRICE);
        System.out.println("Dime el numero de paquetes de pantalones");
        int packets = scanner.nextInt();
        scanner.close();
        int[] resul = {packetsTrauser, packetsShirtys}
        return packets;
        // resturs

    public static void main(String[] args) {
        int numPackets = getDataByScanner();
        System.out.println(numPackets);
        double discount= 0.15;;
        int shippingByPacket = 0;

         if (numPackets < 50) {

         }else if (numPackets < 100) {
            discount = 0.05;
            shippingByPacket = 10 ;
         }else if (numPackets < 20) {
            discount = 0.1;
            shippingByPacket = 5;
         }
         // Validos par los productos 2, 3, y 4

         double total = (numPackets * PACKET_PRICE);  // 100
         Double finalDiscount = total * discount; //10% -> 10
         double totalShipping = numPackets * shippingByPacket;
         double finalPrice = total - finalDiscount + totalShipping;

        if (total >= 1000) {
            promotion = total * 0.10;
            finalPrice = finalPrice - promotion;
        }

         System.out.println("""
                Daquetes de Pantalones   %d
                Daquetes de Pantalones   %d
                Daquetes de Pantalones   %d
                
                 Número de paqueters       %d
                 Precio total del producto %.2f EU
                 descuento aplicado        %.2f EU
                 Gastos de envio %s        %.2f EU
                 ----------------------------------
                 TOTAL                     %.2f EU
                 """.formatted (numPacketsTousers, numPacketsShirt, 
                    numPacketsTotal, total, finalDiscount, totalShipping,
                    amauntTopromotion, finalPrice );
        }
    
}
