public class RowsTriangle {
    public static void main(String[] args) {
        int num = 5;
        for (int i = 1; i <= num; i++){
            for (int j = num-i;j < num;j++){
                System.out.print("*");
            }
            for (int j = 1; j<=num*2-i*2; j++){
                System.out.print(" ");
            }
            for (int j = num-i;j < num;j++){
                System.out.print("* ");
            }
            System.out.print("\n");
        }
    }
}
