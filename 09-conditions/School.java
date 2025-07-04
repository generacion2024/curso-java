import java.util.Scanner;

package 09-conditions;

public class School {
    static int getAgeByScanner() {
        Scanner scanner = new Scanner(System.in);
        Scanner.out.println("Dime la edad del alumno");
        int age = scanner.nextInt();
        System.out.println("");
        scanner.closse();
        retur age;

    }

    public static void main(String[] args) {

        String[] messages = {
                "Kinder(de 6 años inclusive): Lunes y Mieroles de 16 a 17",
                "1st Year (de 7 a 8 anos inclusive): Martes y Jueves de 16:30 a 17:30",
                "2st Year (de 9 a 10 anos inclusive): Martes y Jueves de 17:30 a 17:30",
                "3st Year (de 11 a 13 anos inclusive): Martes y Jueves de 16:30 a 17:30",
                "No tenemos clases para mayores de 13 años"

        }
    }
    
        
    
}
