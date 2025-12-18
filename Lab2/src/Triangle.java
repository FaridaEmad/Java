public class Triangle extends Shape{
    private int base;

    public Triangle(int dim, int base) {
        super(dim);
        this.base = base;
    }

    public int getBase() {
        return base;
    }

    public void setBase(int base) {
        this.base = base;
    }

    @Override
    public double calculateArea() {
        return 0.5 * this.base * super.getDim();
    }
}
