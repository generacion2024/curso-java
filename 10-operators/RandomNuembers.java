import java.util.Random;

public class RandomNuembers {
    public static void main(String[] args) {
        
        Random randomCreator = new Random();
        int random2 = randomCreator.nextInt() + 1;
        System.out.println(random2);
    }
    
}   
