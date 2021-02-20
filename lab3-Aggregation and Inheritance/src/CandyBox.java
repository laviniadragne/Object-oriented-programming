import java.util.Objects;

public class CandyBox {


    private String flavor;
    private String origin;


    public CandyBox() {
        this.flavor = null;
        this.origin = null;
    }

    public CandyBox(String flavor, String origin) {
        this.flavor = flavor;
        this.origin = origin;
    }

    public String getFlavor() {
        return flavor;
    }

    public String getOrigin() {
        return origin;
    }

    public float getVolume(){
        return 0;
    }

    @Override
    public String toString() {
        return "CandyBox{" +
                "flavor='" + flavor + '\'' +
                ", origin='" + origin + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CandyBox candyBox = (CandyBox) o;
        return Objects.equals(flavor, candyBox.flavor) &&
                Objects.equals(origin, candyBox.origin);
    }

    public void print(){

    }
}

class Lindt extends CandyBox {

    private float length;
    private float width;
    private float height;

    public Lindt() {
        super();
        this.length = 0;
        this.width = 0;
        this.height = 0;
    }

    public Lindt(String flavor, String origin, float length, float width, float height) {
        super(flavor, origin);
        this.length = length;
        this.width = width;
        this.height = height;
    }

    @Override
    public float getVolume(){
        return this.length * this.width * this.height;
    }

    @Override
    public String toString() {

        return "The " + super.getOrigin() + " " + super.getFlavor() + " has volume " + getVolume();
    }

    public void printLindtDim() {
        System.out.println("length: " + length + " width: " + width + " height: " + height);
    }

    @Override
    public void print() {
        printLindtDim();
    }
}

class Baravelli extends CandyBox {

    private float radius;
    private float height;

    public Baravelli() {
        super();
        this.radius = 0;
        this.height = 0;
    }

    public Baravelli(String flavor, String origin, float radius, float height) {
        super(flavor, origin);
        this.radius = radius;
        this.height = height;
    }

    @Override
    public float getVolume(){
        return (float) 3.14 * this.radius * this.radius * this.height;
    }

    @Override
    public String toString() {
        return "The " + super.getOrigin() + " " + super.getFlavor() + " has volume " + getVolume();
    }

    public void printBaravelliDim() {
        System.out.println("radius: " + radius + " height: " + height);
    }

    @Override
    public void print() {
        printBaravelliDim();
    }
}

class ChocAmor extends CandyBox {

    private float lenght;

    public ChocAmor() {
        super();
        this.lenght = 0;
    }

    public ChocAmor(String flavor, String origin, float lenght) {
        super(flavor, origin);
        this.lenght = lenght;
    }

    @Override
    public float getVolume(){
        return this.lenght * this.lenght * this.lenght;
    }

    @Override
    public String toString() {

        return "The " + super.getOrigin() + " " + super.getFlavor() + " has volume " + getVolume();
    }

    public void printChocAmorDim() {
        System.out.println("lenght: " + lenght);
    }

    @Override
    public void print() {
        printChocAmorDim();
    }

}