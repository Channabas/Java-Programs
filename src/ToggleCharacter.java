public class ToggleCharacter {
    public static void main(String[] args) {
        String str="POORNIMA";
        String res="";
        for(int i=0;i<str.length();i++){
            char ch=str.charAt(i);

            if(Character.isUpperCase(ch)){
                res+=(char)(ch+32);
            }
            else if(Character.isLowerCase(ch)){
                res+=(char)(ch-32);
            }
            else{
                res+=str.charAt(i);
            }

        }
        System.out.print(res+" ");
    }
}
