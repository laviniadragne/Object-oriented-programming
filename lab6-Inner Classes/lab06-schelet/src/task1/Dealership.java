package task1;

import java.util.Random;

// task 1 si 2
public class Dealership {
    private class BrandOffer implements Offer {

        @Override
        public int getDiscount(Car car) {
            if(car.getType().equals(Car.CarType.Dacia)) {
                return ((5 * car.getPrice()) / 100);
            }
            if(car.getType().equals(Car.CarType.Mercedes)) {
                return ((7 * car.getPrice()) / 100);
            }
            if(car.getType().equals(Car.CarType.Fiat)) {
                return ((9 * car.getPrice()) / 100);
            }
            return 0;
        }
    }
    public BrandOffer getBrandOffer(){
        BrandOffer brandOffer = new BrandOffer();
        return brandOffer;
    }
    private class DealerOffer implements Offer {

        @Override
        public int getDiscount(Car car) {
            return (2020 - car.getYear()) * 100;
        }
    }
    public DealerOffer getDealerOffer(){
        DealerOffer delaerOffer = new DealerOffer();
        return delaerOffer;
    }
    private class SpecialOffer implements Offer {

        @Override
        public int getDiscount(Car car) {
            Random ran = new Random();
            return ran.nextInt(300);
        }
    }
    public SpecialOffer getSpecialOffer(){
        SpecialOffer specialOffer = new SpecialOffer();
        return specialOffer;
    }
    public int getFinalPrice(Car car){
        Dealership dealership = new Dealership();
        Dealership.BrandOffer off1 = new BrandOffer();
        Dealership.DealerOffer off2 = new DealerOffer();
        Dealership.SpecialOffer off3 = new SpecialOffer();

        int discount;
        int discoBrand = dealership.getBrandOffer().getDiscount(car);
        int discoDealer = dealership.getDealerOffer().getDiscount(car);
        int discoSpecial = dealership.getSpecialOffer().getDiscount(car);

        System.out.println("Applying Brand discount: " + discoBrand + " euros");
        System.out.println("Applying Dealer discount: " + discoDealer + " euros");
        System.out.println("Applying Special discount: " + discoSpecial + " euros");

        discount = car.getPrice() - discoBrand - discoDealer - discoSpecial;
        System.out.println("Final price: " + discount + " euros");

        return discount;
    }
    void negotiate(Car car, Offer offer){
        Random ran = new Random();
        int apply = ran.nextInt(2);

        System.out.println("Initial price: " + car.getPrice() + " euros");

        int new_price = getFinalPrice(car);

        if(apply == 1) {
            int client_disco = offer.getDiscount(car);
            new_price = new_price - client_disco;
            System.out.println("Applying Client discount: " + offer.getDiscount(car) + " euros");
        }
        else {
            System.out.println("Applying Client discount: " + 0 + " euros");
        }

        System.out.println("Final price after negotiation: " + new_price + " euro.");
        System.out.println("\n");
    }

}
