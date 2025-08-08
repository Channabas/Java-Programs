import java.util.Stack;

public class VP1 {
    public static void main(String[] args) {
        String str = "[({})]";
        boolean res=isValidParanthesis(str);
        System.out.println(res);
    }
    static boolean isValidParanthesis(String str) {
        Stack<Character> stack = new Stack<>();
        for (char ch : str.toCharArray()) {
            if (ch == '{' || ch == '(' || ch == '[') {
                stack.push(ch);
            } else {
                if (stack.isEmpty()) {
                    return false;
                }
                char top=stack.pop();
                if(ch=='}'&&top!='{'||ch==')'&&top!='('||ch==']'&&top!='['){
                    return false;

                }
            }
        }
        return stack.isEmpty();
    }

}
