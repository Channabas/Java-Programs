import java.util.*;

public class GroupAnagrams {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number of Strings");
        int n=sc.nextInt();
        sc.nextLine();

        String[]arr=new String[n];
        System.out.print("Enter the Strings");
        for(int i=0;i<n;i++){
            arr[i]=sc.next();
        }

        Map<String, List<String>> map=new HashMap<>();
        for(String word:arr){
            char[]chars=word.toCharArray();
            Arrays.sort(chars);

            String sortedword=new String(chars);


            if(!map.containsKey(sortedword)){
                map.put(sortedword,new ArrayList<>());
            }

            map.get(sortedword).add(word);
        }


        for(List<String>group:map.values()){
            System.out.println(group);
        }




    }
}