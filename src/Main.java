import java.sql.Array;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        Tuple monTuple= new Tuple();
        System.out.println("Hello world!");

        Tuple monTuple2= new Tuple(5,1);
        System.out.println(monTuple2.first());
        System.out.println(monTuple2.second());

        System.out.println(monTuple.first());
        System.out.println(monTuple.second());
        monTuple.setFirst(69);
        monTuple.setSecond(420);
        System.out.println(monTuple.first());
        System.out.println(monTuple.second());




    }
}