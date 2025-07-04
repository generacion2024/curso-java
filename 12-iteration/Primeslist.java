public class Primeslist {
    public static void main(String[] args) {
        int limite = 489;
        int contador = 0;

        for (int i = 2; i <= limite; i++) {
            if (esPrimo(i)) {
                contador++;
            }
        }

        System.out.println("Hay " + contador + " números primos entre 1 y " + limite + ".");
    }

    public static boolean esPrimo(int numero) {
        if (numero <= 1) return false;
        for (int i = 2; i <= Math.sqrt(numero); i++) {
            if (numero % i == 0) return false;
        }
        return true;
    }
}
