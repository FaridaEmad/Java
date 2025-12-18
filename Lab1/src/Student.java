public class Student {
    private String name;
    private int age;
    private String track;

    public Student(){}

    public Student(String name, int age, String track) {
        this.name = name;
        this.age = age;
        this.track = track;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getTrack() {
        return track;
    }

    public void setTrack(String track) {
        this.track = track;
    }

    public void printAllData(){
        System.out.println("Name: "+this.name);
        System.out.println("Age: "+this.age);
        System.out.println("Track: "+this.track);
    }
}
