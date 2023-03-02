package exceptions;

import java.io.IOException;

public class Main {
    public static void main(String[] args) {
       // ExceptionsDemo.show();

        ExceptionsDemo exceptionsDemo = new ExceptionsDemo();
        try {
            exceptionsDemo.show();
        } catch (Throwable e) {
            System.out.println("an unexpeted error ocurred");
        }
    }
}
