package Exceptions;

public class CpuException extends RuntimeException{
    public CpuException(String messageError){
        System.out.println(messageError);
    }
}
