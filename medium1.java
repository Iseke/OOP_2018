
import java.util.*;
class medium1{

    public static void main(String []argh)
    {
        Scanner sc = new Scanner(System.in);

        while (sc.hasNext()) {
            Stack<Character> stack = new Stack<>();
            String input=sc.nextLine();

            for(int i=0;i<input.length();i++){
                if(!stack.isEmpty()){


                    switch(input.charAt(i)){
                        case ')':
                            if(stack.peek()=='('){
                                stack.pop();
                            }
                            break;
                        case '}':
                            if(stack.peek()=='{'){
                                stack.pop();
                            }
                            break;
                        case ']':
                            if(stack.peek()=='['){
                                stack.pop();
                            }
                            break;
                        default:
                            stack.push(input.charAt(i));
                            break;
                    }
                }
                else if (stack.isEmpty()){
                    stack.push(input.charAt(i));
                }
            }
            if(stack.isEmpty()){
                System.out.println("yes");
            }
            else{
                System.out.println("no");

            }
        }

    }
}



