package Exceptions;

public class NameException extends RuntimeException{
    public NameException(String messageError){
        System.out.println(messageError);
    }
}
