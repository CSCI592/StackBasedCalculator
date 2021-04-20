// this class takes the postfix expression and returns the final valuse of the expession


import java.util.Stack;
public class evaluate{
static Object evaluatePostfix(String exp) {
    Stack<Double> stack = new Stack<>();
    for (int i = 0; i < exp.length(); i++) {
        char c = exp.charAt(i);
         
        if (exp == "Invalid Expression")
          return (Integer) null;
        if (c==' ')
          continue;
          // multi-digit numbers handler 
        else if (Character.isDigit(c) || exp.charAt(i)=='.'){
          double x = 0;
          double y =0;
            // handling numbers before the decimal point
          while (Character.isDigit(c)){
            x = x * 10 + (int) (c - '0'); 
            i++;
            if (i<exp.length())
              c = exp.charAt(i);
            
            else
              break;
            

          }
          // handling numbers after the decimal point
          if (c =='.'){
            int a= 1;
            
            i++;
            c = exp.charAt(i);
            while (Character.isDigit(c)){
              y =  (double) (c - '0') / (10*a) + y; 
              i++;
              a++;
              if (i<exp.length()){
                c = exp.charAt(i);
              }
              else{
                break;
              }
          }
        }
          i--;
          stack.push(x+y);


        }

        // if operator
        else {
            Double num1 = stack.pop();
            Double num2 = stack.pop();
    
            switch (c) {
            case '+':
              stack.push(num2 + num1);
              break;
    
            case '-':
              stack.push(num2 - num1);
              break;
    
            case '/':
              if (num1 == 0)
                return (Integer) null;

              stack.push(num2 / num1);
              break;
    
            case '*':
              stack.push(num2 * num1);
              break;
    
            case '^':
              stack.push((double)Math.pow(num2, num1));
              break;
            }
        }
    }

    return stack.pop();
}
}