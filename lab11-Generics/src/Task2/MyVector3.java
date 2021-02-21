package Task2;

public class MyVector3 implements Sumabil {
    private Integer x;
    private Integer y;
    private Integer z;

    public MyVector3(Integer x, Integer y, Integer z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    @Override
    public void addValue(Sumabil value) {
        this.x += ((MyVector3) value).x;
        this.y += ((MyVector3) value).y;
        this.z += ((MyVector3) value).z;

    }

    @Override
    public String toString() {
        return "MyVector3{" +
                "x=" + x +
                ", y=" + y +
                ", z=" + z +
                '}';
    }
}
