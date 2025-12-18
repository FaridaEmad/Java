public class Calculator {
    public static float calculate(float num1, char oper, float num2){
        switch (oper){
            case '+':
                return num1+num2;
            case '-':
                return num1-num2;
            case '*':
                return num1*num2;
            case '/':
                if(num2 == 0)
                {
                    System.out.println("You can't divide on zero!!");
                    return 0;
                }
                return num1/num2;
            default:
                return 0;
        }
    }
}
