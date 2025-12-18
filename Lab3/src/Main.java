public class Main {
    public static void main(String[] args) {
        System.out.print("60 + 50 = ");
        System.out.println(Calculator.calculate(60,'+',50));
        System.out.print("60 - 50 = ");
        System.out.println(Calculator.calculate(60,'-',50));
        System.out.print("60 * 50 = ");
        System.out.println(Calculator.calculate(60,'*',50));
        System.out.print("60 / 50 = ");
        System.out.println(Calculator.calculate(60,'/',50));
    }
}