
public class Main {
    public static void main(String[] args) {

        Character character1;
        character1 = new Character("Zelda", 'F');
        Character character2 = new Character("Gorko", 'M');
        character2.isZombi = true;

        System.out.println(character1.name);
        System.out.println("Is zombi?: " + character1.isZombi);
        System.out.println(character2.name);
        System.out.println("Is zombi?: " + character2.isZombi);
    }

    }

    
    



