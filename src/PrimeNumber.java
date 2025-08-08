public class PrimeNumber {
    public static void main(String[] args) {

int no=7;
        int count=0;
       for(int i=no;i<100;i++){

           for(int j=1;j<=i;j++){
               if(i%j==0){
                   count++;
               }


           }
           if(count==2){
               System.out.println(i+" is Prime");
           }
           else{
               System.out.println(i+" is Not Prime");
           }


       }
    }
}
