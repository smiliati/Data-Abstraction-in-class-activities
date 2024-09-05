import java.util.Stack;

public class matchingParentheses {
    
    public boolean isValid(String s) {

        //check edge cases
        if (s.length() <= 1) {
            return false;
        }
        
        //create empty stack
        Stack<Character> stack = new Stack<>();
        //iterate over the input string
        for (int i=0; i<s.length(); i++) {
            if (Character.toString(s.charAt(i)).equals("(") || Character.toString(s.charAt(i)).equals("[") || Character.toString(s.charAt(i)).equals("{")) {
                //character is an opening parentheses
                stack.push(s.charAt(i));//add it to the stack
            } else {//character is a closing parentheses
                if (stack.isEmpty()) {//s starts with closing parentheses
                    return false;
                } else if ((s.charAt(i) == ')') && (stack.pop() != '(')) {
                    return false;
                } else if ((s.charAt(i) == ']') && (stack.pop() != '[')) {
                    return false;
                } else if ((s.charAt(i) == '}') && (stack.pop() != '{')) {
                    return false;
                } else {
                    return true;
                }
            }
        }


        return true;

    }



}

