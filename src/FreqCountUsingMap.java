import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class FreqCountUsingMap {
    public static void main(String[] args) {
        String str="Channabasava";
        Map<Character,Integer>map=new HashMap<>();
        List<Character>list=new LinkedList<>();
        for(char ch:str.toCharArray()){
            map.put(ch,map.getOrDefault(ch,0)+1);
        }
        for(Map.Entry<Character,Integer>entry:map.entrySet()){
            if(entry.getValue()==2){
              list.add(entry.getKey());
            }
        }
        System.out.println(list+"");
    }
}
