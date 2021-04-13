import java.util.Stack;

public class infix2postfix {
          // if operator
    static int precedence(char c){
        switch (c){
            case '+':
            case '-':
                return 1;
            case '*':
            case '/':
                return 2;
            case '^':
                return 3;
        }
        // if something else
        return -1;
    }

    static String infixToPostFix(String expression){

      String result = "";
      Stack<Character> stack = new Stack<>();
      for (int i = 0; i <expression.length() ; i++) {
          char c = expression.charAt(i);

         
          

          if (Character.isDigit(c)) {
            int n = 0;
    
            // multi=digit number
            while (Character.isDigit(c)) {
              n = n*10 + (int) (c - '0');
              i++;
              if(i < expression.length())
                c = expression.charAt(i);
              else
                break;
            }
            i--;
    
            result += String.valueOf(n) + " ";
          }

        

        else if (c == '('){
            if (Character.isDigit(expression.charAt(i-1)))
                stack.push('*');
        stack.push(c);


        }


        else if (c == ')') {
            while (!stack.isEmpty() && stack.peek() != '(')
              result += stack.pop() + " ";
    
            if (!stack.isEmpty() && stack.peek() != '(')
              return "Invalid Expression"; 
            else
              stack.pop();
          }
          else if (precedence(c) > 0) { 
            while (!stack.isEmpty() && precedence(c) <= precedence(stack.peek())) {
              
              result += stack.pop() + " ";
            }
            stack.push(c);
          }
          else {
              return "Invalid Expression";
          }

  }
  while (!stack.isEmpty()) {
    if (stack.peek() == '(')
      return "Invalid Expression";
    result += stack.pop();
  }
  
  return result;
}
}