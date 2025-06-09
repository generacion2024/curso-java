public class Out {
    
    public static void main(String[] args) {

        String name = "Pepe";
        String surname = "Pérez";
        int age = 33;

        // println -> expresin
        String result = "Hola " + name + " " +  surname + "\n¿como estás a tus " + age +" años?";
        //System.out.println("Hola" + "" + name + " " + surname +"\n¿como estas?");
        System.out.println(result);

        System.out.printf("Hola %s %s\n¿como estas a tus %s años?", name, surname);
        System.out.printf(result, name, surname, age);

        // println -> template string
        

        // System.out.println("""
         //     Hola %s %s
           //   ¿como estas a tus %s años,   
          //       """);
          System.out.println("""
             Hola %s %s
             ¿como estas a tus %s años,   
                """);
    }
}

