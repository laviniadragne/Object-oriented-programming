package third;

public class Operation implements Minus, Plus, Div, Mult {

    public float number;

    public Operation(float number) {
        this.number = number;
    }

    public float getNumber() {
        return number;
    }

    public void div(float a) {
        if (a != 0) {
            number = number / a;
        }
        else {
            System.out.println("Nu pot imparti la 0!");
        }
    }
    public void minus(float a){
        number = number - a;
    }
    public void plus(float a){
        number = number + a;
    }
    public void mult(float a){
        number = number * a;
    }
}
