public class Complex {
    private int x;
    private int y;

    public Complex(){}

    public Complex(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public void print(){
        System.out.println(this.x + " + " + this.y+"i");
    }

    public static Complex add(Complex c1, Complex c2){
        int xAdded = c1.getX() + c2.getX();
        int yAdded = c1.getY() + c2.getY();

        Complex added = new Complex(xAdded,yAdded);
        return added;
    }

    public static Complex subtract(Complex c1, Complex c2){
        int xSubtracted = c1.getX() - c2.getX();
        int ySubtracted = c1.getY() - c2.getY();

        Complex subtracted = new Complex(xSubtracted,ySubtracted);
        return subtracted;
    }
}
