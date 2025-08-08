class MyCustomArthematicException extends Exception{
    MyCustomArthematicException(String message){
        super(message);
    }
}



public class ArthematicException {

    static int divide(int a,int b) throws MyCustomArthematicException {
        try{
            int sum=a/b;
            return sum;
        }
        catch (ArithmeticException e){
            throw new MyCustomArthematicException("cannot divide by zero");
        }

    }

    public static void main(String[] args) {
        try{
            divide(1,0);
        }
        catch (MyCustomArthematicException e){
            System.out.println("custom ArthematicException is caught "+e.getMessage());
        }
    }
}
