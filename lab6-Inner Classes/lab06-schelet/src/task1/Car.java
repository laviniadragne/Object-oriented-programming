package task1;

public class Car {


    private Integer price;
    public enum CarType {
        Mercedes,
        Dacia,
        Fiat;
    }
    private Integer year;
    private CarType type;

    public Car(Integer price, Integer year, CarType type) {
        this.price = price;
        this.year = year;
        this.type = type;
    }
    public CarType getType() {
        return type;
    }

    public Integer getPrice() {
        return price;
    }

    public Integer getYear() {
        return year;
    }
}
