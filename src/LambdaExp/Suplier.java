package LambdaExp;

import java.util.function.Supplier;

public class Suplier {
    public static void main(String[] args) {
        // It represents a function which does not take in any argument but produces a value of type T
        //        SUPPLIER (proveedor)
        Supplier<String> proveedor = () -> {
            return "hola mundo";
        };
        System.out.println(proveedor.get());

//      CREAR USUARIO CON SUPPLIER
        Supplier<Usuario> createUser = () -> {
            return new Usuario();
        };

        Usuario usuario2 = createUser.get();
        usuario2.setNombre("eme");
        System.out.println(usuario2.getNombre());



    }
}
