package LambdaExp;

import java.util.function.BiPredicate;
import java.util.function.Predicate;

public class predicate {

    public static void main(String[] args) {

        // statement that determines whether a value could be true or false
        Predicate<Integer> predicate = num -> num > 10;
        boolean value = predicate.test(1);
        System.out.println(value);

        Predicate<String> predicate1 = rol -> rol.equals("ADMIN");
        String rol = predicate1.test("ADMIN") ? "es administrador":"no es administador";
        System.out.println(rol);

        BiPredicate<String,String> predicate2 = (string1,string2) ->string1.equals(string2);
        System.out.println("son iguales las cadenas = " +predicate2.test("hola","hola"));

        BiPredicate<Integer,Integer> comparator = (a,b) -> a > b;

        System.out.println("4 es mayor que 3: "+ comparator.test(4,3));
    }
}
