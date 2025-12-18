public abstract class Shape {

    private int dim;

    public Shape(int dim) {
        this.dim = dim;
    }

    abstract public double calculateArea();

    public int getDim() {
        return dim;
    }

    public void setDim(int dim) {
        this.dim = dim;
    }
}
