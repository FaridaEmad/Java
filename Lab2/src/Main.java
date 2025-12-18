public class Main {
    public static void main(String[] args) {
        Circle c1 = new Circle(5);
        System.out.println("Circle Area: "+c1.calculateArea());
        Triangle t1 = new Triangle(5,4);
        System.out.println("Triangle Area: "+t1.calculateArea());
        Rectangle r1 = new Rectangle(4,5);
        System.out.println("Rectangle Area: "+r1.calculateArea());
        Picture p1 = new Picture();
        System.out.println("Sum of all Areas:"+p1.sumAreas(c1,t1,r1));

        System.out.println("------------------------------------");

        Child ch1 = new Child(1,2,3);
        System.out.println("Sum of Child numbers: "+ ch1.sum());
    }
}