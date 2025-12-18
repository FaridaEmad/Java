public class Main {
    public static void main(String[] args) {

        Complex c1 = new Complex(5,6);
        Complex c2 = new Complex(2,3);
        System.out.print("Added: ");
        Complex c3 = Complex.add(c1,c2);
        c3.print();

        System.out.print("Subtracted: ");
        Complex c4 = Complex.subtract(c1,c2);
        c4.print();

        Student s1 = new Student();
        s1.setName("Farida Emad Eldin");
        s1.setAge(22);
        s1.setTrack("Data Management");
        s1.printAllData();
    }
}