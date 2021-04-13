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

          else if (Character.isLetter(c)) 
        result += c + " "; 

        else if (c == '(')
        stack.push(c);


        else if (c == ')') {
            while (!stack.isEmpty() && stack.peek() != '(')
              result += stack.pop() + " ";
    
            if (!stack.isEmpty() && stack.peek() != '(')
              return "Invalid Expression"; 
            else
              stack.pop();
          }
          else { 
            while (!stack.isEmpty() && precedence(c) <= precedence(stack.peek())) {
              if (stack.peek() == '(')
                return "Invalid Expression";
              result += stack.pop() + " ";
            }
            stack.push(c);
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