
import java.util.Random;
import java.util.Scanner;

public class RockPaperScissor {
    private static final byte ROCK = 1;
    private static final byte PAPER = 2;
    private static final byte SCISSOR = 3;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        System.out.println("1=Piedra, 2=Papel, 3=Tijera");
        System.out.print("Tu elección: ");
        
        try {
            byte user = scanner.nextByte();
            
            if (user < 1 || user > 3) {
                System.out.println("Error: Debes ingresar 1, 2 o 3");
                return;
            }

            byte cpu = (byte)(random.nextInt(3) + 1);

            System.out.printf("CPU=%s, Tú=%s\n",
                choiceToString(cpu), choiceToString(user));

            if (user == cpu) {
                System.out.println("¡Empate!");
            } else if ((user == ROCK && cpu == SCISSOR)
                    || (user == PAPER && cpu == ROCK)
                    || (user == SCISSOR && cpu == PAPER)) {
                System.out.println("¡Tú ganas!");
            } else {
                System.out.println("¡CPU gana!");
            }
        } finally {
            scanner.close();
        }
    }

    private static String choiceToString(byte c) {
        switch (c) {
            case ROCK: return "Piedra";
            case PAPER: return "Papel";
            case SCISSOR: return "Tijera";
            default: return "Desconocido";
        }
    }
}

