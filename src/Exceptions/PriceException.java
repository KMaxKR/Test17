package Exceptions;

public class PriceException extends RuntimeException{
    public PriceException(String messageError){
        System.out.println(messageError);
    }
}
