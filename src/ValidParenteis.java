import java.util.Stack;

public class ValidParenteis {
    public static void main(String[] args) {
        String str="[{()}";
       boolean res=validParentehsis(str);
        System.out.println(res);
    }

    static boolean validParentehsis(String str) {
        Stack<Character> stack = new Stack<Character>();
        for (char ch : str.toCharArray()) {
            if (ch == '[' || ch == '{' || ch == '(') {
                stack.push(ch);
            } else {
                if (stack.isEmpty()) {
                    return false;
                }

                    char top=stack.pop();
                    if(ch==')' && top!='(' ||ch==']'&&top!='['||ch=='}'&&top!='{'){
                        return false;
                    }
                }
            }
        return stack.isEmpty();

        }

    }








