package Exceptions;

public class RamException extends RuntimeException{
    public RamException(String messageError){
        System.out.println(messageError);
    }
}
