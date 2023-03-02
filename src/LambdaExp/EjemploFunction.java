package LambdaExp;

import java.util.function.BiFunction;
import java.util.function.Function;

public class EjemploFunction {
    public static void main(String[] args) {

        System.out.println("------ LAMBDA FUNCTIONS --------");

        Function<String,String> function1 = param -> "hola que tal "+param;
        String resultadoF = function1.apply("Jesus");
        System.out.println(resultadoF);

        Function<String,String> function2 = String::toUpperCase;
        System.out.println(function2.apply("Jesus"));

        BiFunction<String,String,String> biFunction1 = (param1,param2) -> param1.concat(param2);
        System.out.println(biFunction1.apply("Jesus","Cruz"));

        BiFunction <Integer,Integer,Integer> biFunction2 = (param1,param2) -> param1+param2;
        System.out.println(biFunction2.apply(2,2));




    }
}
