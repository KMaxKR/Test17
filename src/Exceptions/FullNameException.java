package Exceptions;

public class FullNameException extends RuntimeException{
    public FullNameException(String messageError){
        System.out.println(messageError);
    }
}
