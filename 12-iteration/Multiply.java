

import java.util.Scanner;

public class Multiply {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("¿Deseas ver la tabla de un número específico o todas las tablas del 1 al 10?");
        System.out.print("Escribe un número (1-10) o 'todas': ");
        String entrada = scanner.nextLine().toLowerCase();

        if (entrada.equals("todas")) {
            for (int i = 1; i <= 10; i++) {
                mostrarTabla(i);
                System.out.println(); // Separación entre tablas
            }
        } else {
            try {
                int numero = Integer.parseInt(entrada);
                if (numero >= 1 && numero <= 10) {
                    mostrarTabla(numero);
                } else {
                    System.out.println("Por favor, introduce un número entre 1 y 10.");
                }
            } catch (NumberFormatException e) {
                System.out.println("Entrada inválida. Debes ingresar un número o la palabra 'todas'.");
            }
        }

        scanner.close();
    }

    public static void mostrarTabla(int numero) {
        System.out.println("Tabla del " + numero + ":");
        for (int i = 1; i <= 10; i++) {
            System.out.println(numero + " x " + i + " = " + (numero * i));
        }
    }
}
