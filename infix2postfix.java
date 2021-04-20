// This class takes infix expressions as an input and returns the postfix expressions.

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

            // multi-digit number
          if (Character.isDigit(c) || expression.charAt(i)=='.') {
            double x = 0;
            double y =0;
    
            // handling numbers before the decimal point
            while (Character.isDigit(c)) {
              x = x*10 + (int) (c - '0');
              i++;
              if(i < expression.length())
                c = expression.charAt(i);
              else
                break;
            }
            // handling numbers after the decimal point
            if (c=='.'){
                int a= 1;
                
                i++;
                c = expression.charAt(i);
                while (Character.isDigit(c)){
                  y =  (double) (c - '0') / (10*a) + y; 
                  i++;
                  a++;
                  if (i<expression.length()){
                    c = expression.charAt(i);
                  }
                  else{
                    break;
                  }
              }
           
          }
          i--;
    
          result += String.valueOf(x+y) + " ";
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
