class MyCustomIndexOutOfBoundsException extends Exception{
    MyCustomIndexOutOfBoundsException(String message){
        super(message);
    }
}



public class IndexOutOfBounds {

    static  int getElement(int[]arr, int index) throws MyCustomIndexOutOfBoundsException{

        try{
            return arr[index];

        }
       catch (IndexOutOfBoundsException e){
            throw new MyCustomIndexOutOfBoundsException("invalid index "+index);
       }
    }

    public static void main(String[] args) {
        int[]numbers={1,2,3,4,5};
        try{
            getElement(numbers,6);
        }
        catch (MyCustomIndexOutOfBoundsException e){
            System.out.println("caught custom exception "+e.getMessage());
        }
    }
}
