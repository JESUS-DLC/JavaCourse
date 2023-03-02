package LambdaExp;

import java.util.List;
import java.util.function.BiConsumer;
import java.util.function.Consumer;

public class ConsumerDemo {
    public static void main(String[] args) {
        //Represents an operation that accepts a single input argument and returns no result
        System.out.println("------ CONSUMER --------");
        //        CONSUMER CON UN SOLO ARGUMENTO
        Consumer<String> consumer = saludo ->{
            System.out.println(saludo);
        };
        consumer.accept("message test");

//        CONSUMER CO   N DOS ARGUMENTOS
        BiConsumer<String,Integer> biconsumer = (nombre, edad) -> {
            System.out.println(nombre+ " have "+edad+ " years old");
        };
        biconsumer.accept("Jesus",22);

//        CONSUMER ALTERNATIVA
        Consumer<String> consumer2 = System.out::println;
        consumer2.accept("by consumer");

//      ASIGNAR NOMBRE A INSTANCIA DE USUARIO POR BICONSUMER
        Usuario usuario = new Usuario();
        BiConsumer<Usuario, String> asignarNombre = (persona,nombre) ->{
            persona.setNombre(nombre);
        };
        asignarNombre.accept(usuario,"Jesus");
        System.out.println("se asigno el nombre por biconsumer "+usuario.getNombre());

//       ASIGNAR NOMBRE A INSTANCIA DE USUARIO POR BICONSUMER SIMPLICADOS
        Usuario usuario1 = new Usuario();
        BiConsumer<Usuario,String> asignarNombreSimp = Usuario::setNombre;
        asignarNombreSimp.accept(usuario1,"Emerith");
        System.out.println("se asigno nombre por biconsumer simplicado "+usuario1.getNombre());


        List<String> lista = List.of("a","b","c");

        Consumer<String> printUpper = element -> System.out.println(element.toUpperCase());

        lista.forEach(printUpper);

    }
}
