public class RangeOfPrime {
    public static void main(String[] args) {
        int startRange=10;
        int endRange=25;


        for(int i=startRange;i<=endRange;i++){
            int count=0;
            for(int j=1;j<=i;j++){
                if(i%j==0){
                    count++;
                }
            }
            if(count==2){
                System.out.println(i);
            }
        }
    }
}
