public class Recursion1to100 {
    public static void main(String[] args) {
        int i=1;


        print1to100(i);
    }

    static void print1to100(int i){

        if(i>=101){
            return;
        }
        System.out.println(i);
        print1to100(i+1);
    }
}
