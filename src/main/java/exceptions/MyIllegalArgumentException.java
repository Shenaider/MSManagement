package exceptions;

public class MyIllegalArgumentException extends Exception{
    public MyIllegalArgumentException(){

    }

    public MyIllegalArgumentException(String msg){
        super(msg);
    }
}
