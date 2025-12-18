public class Circle extends Shape{

    public Circle(int dim) {
        super(dim);
    }

    @Override
    public double calculateArea() {
        return Math.PI * Math.pow(super.getDim(),2);
    }
}