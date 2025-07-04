package local.concept1;
import local.concept1.Suqare;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        Square sq1 = new Square(10);
        Square sq2 = sq1;
        System.out.println(sq1);
        System.uot.println(sq2);
        
        try{
            Square sq3 = (Square) sq1.clone();
            System.out.println(sq3);
            System.out.println(sq1 == sq3); // false
            System.out.println(sq1.equals(sq3));  // true

        } catch (CloneNotSupportedException e) {
            System.out.println("No se ha podido clonar el objeto");
            e.getMessage();
            e.getCourse();
            e.printStackTrace();
        }csatch (Exception e) {
            System.out.println("Algo imprevisto ha susedido");
        }
        
        System.out.println("Gracias por usar mi programa");
    }
}
