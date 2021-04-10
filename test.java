public class test{

    public static void main(String[] args) {
        String exp1 = "7+9*(2^4-8)*(9+2*1)-6";
        //infix2postfix postExp = new infix2postfix();
        String exp2 = infix2postfix.infixToPostFix(exp1);
      System.out.println(exp2);
      System.out.println(evaluate.evaluatePostfix(exp2));
  
    }
  }