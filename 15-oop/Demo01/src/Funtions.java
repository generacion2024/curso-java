import base.Square;

public class Funtions {
    
    public static void Foo(Square sqFoo) {
        Square newSq = (Square) sqFoo.clone();
        sqFoo.side *= 2;
        return newSq;

    }

    public static void main(String[] args) {

        Square aq1 = new Square(10);
        Square dSq = Foo(Sq1);
        System.out.println(sql);  // side 10
        System.out.println(dSq);   // side 20
    }
}
