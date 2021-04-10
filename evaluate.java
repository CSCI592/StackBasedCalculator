import java.util.Stack;

public class evaluate{
static int evaluatePostfix(String exp) {
    Stack<Integer> stack = new Stack<>();
    for (int i = 0; i < exp.length(); i++) {
        char c = exp.charAt(i);
        // if number 
        if (Character.isDigit(c))
        stack.push(c - '0');

        // if operator
        else {
            int num1 = stack.pop();
            int num2 = stack.pop();
    
            switch (c) {
            case '+':
              stack.push(num2 + num1);
              break;
    
            case '-':
              stack.push(num2 - num1);
              break;
    
            case '/':
              stack.push(num2 / num1);
              break;
    
            case '*':
              stack.push(num2 * num1);
              break;
    
            case '^':
              stack.push((int)Math.pow(num2, num1));
              break;
            }
        }
    }

    return stack.pop();
}
}