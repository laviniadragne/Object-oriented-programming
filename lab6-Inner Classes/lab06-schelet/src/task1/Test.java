package task1;

import java.util.ArrayList;
import java.util.Arrays;

public class Test {
    public static void main(String[] args) {

        // task 3
        Car car1 = new Car(20000, 2015, Car.CarType.Mercedes);
        Car car2 = new Car(10000, 2010, Car.CarType.Dacia);
        Car car3 = new Car(15000, 2010, Car.CarType.Fiat);
        Dealership dealership = new Dealership();

        // pretul oferit de Deaalership
//        System.out.println("Task3:");
//        System.out.println(dealership.getFinalPrice(car1));
//        System.out.println(dealership.getFinalPrice(car2));
//        System.out.println(dealership.getFinalPrice(car3));
//        System.out.println("\n");

        // task 4
        Offer clientOffer = new Offer() {
            @Override
            public int getDiscount(Car car) {
                return 300;
            }
        };

        dealership.negotiate(car1, clientOffer);
        dealership.negotiate(car2, clientOffer);
        dealership.negotiate(car3, clientOffer);

        // Fisierele .class generate sunt: Car.class, Car$CraType.class, Dealership.class, Dealership$BrandOffer.class,
        // Dealership$DealerOffer.class, Dealership$SpecialOffer.class, Offer.class, Test.class, Test$1.class.
        // Pentru clasa anonima s-a generat: Test$1.class.

        // task5
        ArrayList<Car> cars = new ArrayList<>();
        Car car4 = new Car(50000, 2020, Car.CarType.Mercedes);
        Car car5 = new Car(21000, 2018, Car.CarType.Fiat);
        Car car6 = new Car(2800, 2008, Car.CarType.Dacia);
        Car car7 = new Car(2000, 2012, Car.CarType.Dacia);

        cars.add(car1);
        cars.add(car2);
        cars.add(car3);
        cars.add(car4);
        cars.add(car5);
        cars.add(car6);
        cars.add(car7);

        // lista inainte de modificari
        System.out.println("Initial list: ");
        cars.forEach((v) -> System.out.println(v.getType() + "- " + v.getPrice() + " euros"));
        
        cars.removeIf((v) -> v.getPrice() >= 20000);

        // lista dupa modificare va afisa toate masinile cu pretul < 20 000
        System.out.println("\nFinal list: ");
        cars.forEach((v) -> System.out.println(v.getType() + "- " + v.getPrice() + " euros"));
    }
}
