package exceptions;

//Cheked -> Exception
//Unchecked (runtime) -> RuntimeException
public class insufficientFundsException extends Exception{
    public insufficientFundsException(){
        super("Insufficient funds in your account");
    }

    public insufficientFundsException(String message){
        super(message);
    }
}
