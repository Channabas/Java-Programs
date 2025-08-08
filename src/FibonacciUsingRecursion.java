public class FibonacciUsingRecursion {
    public static void main(String[] args) {
        int a=1,b=2; int n=7;
        System.out.println(a);
        System.out.println(b);
        fibonacci(a,b,n-2);
    }

    static void fibonacci(int a,int b,int n){
        if(n==0){
            return;
        }
      int c=a+b;
        System.out.println(c);

        fibonacci(b,c,n-1);

        a=b;
        b=c;
      }



    }

