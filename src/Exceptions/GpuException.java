package Exceptions;

public class GpuException extends RuntimeException{
    public GpuException(String messageError){
        System.out.println(messageError);
    }
}
