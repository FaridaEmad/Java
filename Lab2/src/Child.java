public class Child extends Parent{
    private int num3;

    public Child() {}

    public Child(int num1, int nm2, int num3) {
        super(num1, nm2);
        this.num3 = num3;
    }

    public int getNum3() {
        return num3;
    }

    public void setNum3(int num3) {
        this.num3 = num3;
    }

    @Override
    public int sum() {
        return super.sum() + num3;
    }
}
