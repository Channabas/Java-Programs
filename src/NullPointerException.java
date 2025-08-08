class MyCustomException extends Exception{
    MyCustomException(String message){
        super(message);
    }
}





public class NullPointerException  {

    static void printLength(String str) throws MyCustomException{
        try{
            System.out.println(str.length());//might throw null pointer exception
        }
        catch( java.lang.NullPointerException e){
            throw new MyCustomException("custom exception:string is null");
        }
    }

    public static void main(String[] args)  {
        try {
            printLength(null);
        }
        catch (MyCustomException e){
            System.out.println("caught null pointer exception "+e.getMessage());
        }

    }
}
