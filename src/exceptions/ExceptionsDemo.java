package exceptions;

import javax.imageio.IIOException;
import javax.naming.InsufficientResourcesException;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ExceptionsDemo {

    public void show() {

        Account account = new Account();
        try {
            account.withdraw(10);
            //account.deposit(-1);
        } catch (insufficientFundsException e) {
            System.out.println(e.getMessage());
        }
    }

}
