import java.util.Stack;

public class evaluate{
static int evaluatePostfix(String exp) {
    Stack<Integer> stack = new Stack<>();
    for (int i = 0; i < exp.length(); i++) {
        char c = exp.charAt(i);
        // if number 
        if (c==' ')
          continue;
        else if (Character.isDigit(c)){
          int x = 0;

          while (Character.isDigit(c)){
            x = x * 10 + (int) (c - '0'); 
            i++;
            if (i<exp.length()){
              c = exp.charAt(i);
            }
            else{
              break;
            }

          }
          i--;
          stack.push(x);


        }

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