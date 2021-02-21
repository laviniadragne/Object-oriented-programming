package task0;

class Car0 {
    public Engine0 getEngine(int fuelCapacity) {

        return new Engine0 () {
            private int fuelCapacity = 11;

            public int getFuelCapacity() {
                return fuelCapacity;
            }
        };
    }
}

interface Engine0 {
    public int getFuelCapacity();
}

//class Car0 {
//    class OttoEngine implements Engine0 {
//        private int fuelCapacity;
//
//        public OttoEngine(int fuelCapacity) {
//            this.fuelCapacity = fuelCapacity;
//        }
//
//        public int getFuelCapacity() {
//            return fuelCapacity;
//        }
//    }
//
//    public Car0.OttoEngine getEngine() {
//        Car0.OttoEngine engine = new Car0.OttoEngine(11);
//        return engine;
//    }
//}

public class Test0 {
    public static void main(String[] args) {
        Car0 car = new Car0();
        System.out.println(car.getEngine(10).getFuelCapacity());

        // Engine0 firstEngine = car.getEngine(10);
        //class Engine0 secondEngine = car.new OttoEngine(10);

        // System.out.println(firstEngine.getFuelCapacity());
        //System.out.println(secondEngine.getFuelCapacity());
    }
}
