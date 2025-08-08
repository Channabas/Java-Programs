import java.util.*;

public class P1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        int start = 0;
        int end = 0;
        int max_length = 0;
        int max_start = 0;
        List<Character> list = new LinkedList<>();

        while(end<str.length()){
            char ch=str.charAt(end);

            while(list.contains(ch)){
                list.remove(0);
                start++;
            }
            list.add(ch);

            if(list.size()>max_length){
                max_length=list.size();
                max_start=start;
            }
            end++;
        }
        System.out.println("Longest substring without repeating characters");
        System.out.println("largest unique substring is "+str.substring(max_start,max_start+max_length));
        System.out.println("Length of largest unique substring is " +max_length);

    }

}





