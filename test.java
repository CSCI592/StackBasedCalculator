public class test{

    public static void main(String[] args) {
        String exp1 = "5(9*2)";
        //infix2postfix postExp = new infix2postfix();
        Object exp2 = evaluate.evaluatePostfix(infix2postfix.infixToPostFix(exp1));
      System.out.println(exp2);
      //System.out.println(evaluate.evaluatePostfix(exp2));
  
    }
  }
  

  // import java.math.BigDecimal; 