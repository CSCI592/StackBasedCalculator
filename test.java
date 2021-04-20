public class test{

    public static void main(String[] args) {
        String exp1 = "1.1+1.3";
        //infix2postfix postExp = new infix2postfix();
        String exp2 = infix2postfix.infixToPostFix(exp1);
      System.out.println(exp2);
      System.out.println(evaluate.evaluatePostfix(exp2));

      double a=0;
      a= 1/0;

      System.out.println(a);
  
    }
  }
  

  // import java.math.BigDecimal; 