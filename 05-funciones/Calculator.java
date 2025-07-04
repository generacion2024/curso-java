import java.util.Scanner;

public class Calculator {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); 
        System.out.println("Dime un numero entero");
        int.num1 = scanner.nextInt();
        // scanner.close();
        return num;

        }
        
        public static void main(string[])
        
    
    public static double sumar(double a, double b) {
        return a + b;
    }
    
    public static double restar(double a, double b) {
        return a - b;
    }
    
    public static double producto(double a, double b) {
        return a * b;
    }
    
    public static double division(double a, double b) {
        if(b == 0) {
            System.out.println("Error: No se puede dividir por cero");
            return Double.NaN; // Retorna "Not a Number"
        }
        return a / b;
    }
}



