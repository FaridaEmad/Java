public class Rectangle extends Shape{
    private int hieght;

    public Rectangle(int dim, int hieght) {
        super(dim);
        this.hieght = hieght;
    }

    public int getHieght() {
        return hieght;
    }

    public void setHieght(int hieght) {
        this.hieght = hieght;
    }

    @Override
    public double calculateArea() {
        return super.getDim() * this.hieght;
    }
}
