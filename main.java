
import java.util.Stack;

public class Main {
  // A utility function to return precedence of a given operator
  // Higher returned value means higher precedence
  static int precedence(char ch) {
    switch (ch) {
    case '+':
    case '-':
      return 1;

    case '*':
    case '/':
      return 2;

    case '^':
      return 3;
    }
    return -1;
  }

  // This method converts given infix expression
  // to postfix expression.
  static String infixToPostfix(String exp) {
    // initializing empty String for result
    String result = new String("");

    // initializing empty stack
    Stack<Character> stack = new Stack<>();

    for (int i = 0; i < exp.length(); ++i) {
      char c = exp.charAt(i);

      if (c == ' ')
        continue;

      // If the scanned character is an operand
      // (number here),extract the number
      // Add it to output. 
      else if (Character.isDigit(c)) {
        int n = 0;

        // extract the characters and store it in num
        while (Character.isDigit(c)) {
          n = n * 10 + (int) (c - '0');
          i++;
          if(i < exp.length())
            c = exp.charAt(i);
          else
            break;
        }
        i--;

        result += String.valueOf(n) + " ";
      }
      else if (Character.isLetter(c)) 
        result += c + " "; 

      // If the scanned character is an '(', push it to the stack.
      else if (c == '(')
        stack.push(c);

      // If the scanned character is an ')', pop and output from the stack
      // until an '(' is encountered.
      else if (c == ')') {
        while (!stack.isEmpty() && stack.peek() != '(')
          result += stack.pop() + " "; ;

        if (!stack.isEmpty() && stack.peek() != '(')
          return "Invalid Expression"; // invalid expression
        else
          stack.pop();
      } else { // an operator is encountered
        while (!stack.isEmpty() && precedence(c) <= precedence(stack.peek())) {
          if (stack.peek() == '(')
            return "Invalid Expression";
          result += stack.pop() + " "; ;
        }
        stack.push(c);
      }
    }

    // pop all the operators from the stack
    while (!stack.isEmpty()) {
      if (stack.peek() == '(')
        return "Invalid Expression";
      result += stack.pop();
    }
    
    return result;
  }

  // This method evaluates value of a postfix expression
  static int evaluatePostfix(String exp) {
    // create a stack
    Stack<Integer> stack = new Stack<>();

    // Scan all characters one by one
    for (int i = 0; i < exp.length(); i++) {
      char c = exp.charAt(i);
      
      if (c == ' ')
        continue;
      // If the scanned character is an operand (number here),
      // push it to the stack.
      else if (Character.isDigit(c))
        stack.push(c - '0');

      // If the scanned character is an operator, pop two
      // elements from stack apply the operator
      else {
        int val1 = stack.pop();
        int val2 = stack.pop();

        switch (c) {
        case '+':
          stack.push(val2 + val1);
          break;

        case '-':
          stack.push(val2 - val1);
          break;

        case '/':
          stack.push(val2 / val1);
          break;

        case '*':
          stack.push(val2 * val1);
          break;

        case '^':
          stack.push((int)Math.pow(val2, val1));
          break;
        }
      }
    }
    return stack.pop();
  }

  public static void main(String[] args) {
    // infix to postfix 
    String exp1 = "a+b*(c^d-e)^(f+g*h)-i";
    System.out.print("Infix to postfix: " + exp1);
    System.out.println(" -> " + infixToPostfix(exp1));

    exp1 = "11+b*(c^d-e)^(f+g*4433)-i";
    System.out.print("Infix to postfix: " + exp1);
    System.out.println(" -> " + infixToPostfix(exp1));


    // postfix expression evaluations
    String exp2 = "2 3 1 * + 9 -";
    System.out.print("Postfix evaluation: " + exp2);
    System.out.println(" -> " + evaluatePostfix(exp2));

    exp2 = "230 10 12 * + 10 -"; // for clear separation added spaces
    System.out.print("Postfix evaluation: " + exp2);
    System.out.println(" -> " + evaluatePostfix(exp2)); // correct answer 340

    String exp3 = "230 + 10 * 12 - 10";
    String exp4 = infixToPostfix(exp3);
    System.out.print("Infix to postfix: " + exp3);
    System.out.println(" -> " + exp4);
    System.out.println("  and its evaluation -> " + evaluatePostfix(exp4)); // correct answer 340
  }
}