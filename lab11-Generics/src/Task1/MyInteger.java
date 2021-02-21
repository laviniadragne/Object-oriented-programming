package Task1;

import java.util.Objects;

// Clasa suprascrie metoda hashCode din Object
public class MyInteger implements Comparable<MyInteger>{

    private final Integer value;

    public MyInteger(Integer value) {
        this.value = value;
    }

    @Override
    public int compareTo(MyInteger o) {
        return value.compareTo(o.value);
    }

    @Override
    public int hashCode() {
        return Objects.hash(value);
    }

    @Override
    public String toString() {
        return "MyInteger{" +
                "value=" + value +
                '}';
    }
}
