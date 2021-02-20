public class Area {

    private CandyBag bag;
    private int number;
    private String street;

    public Area() {
        this.bag = null;
        this.number = 0;
        this.street = null;
    }

    public Area(CandyBag bag, int number, String street) {
        this.bag = bag;
        this.number = number;
        this.street = street;
    }

    public void getBirthdayCard(){
        System.out.println("Street: " + street + " number " + number +"\nLa multi ani!\n");
        int i;
        for(i = 0; i < bag.getCadou().size(); i++){
            System.out.println(bag.getCadou().get(i));

            // cu instanceof
//            if(bag.getCadou().get(i) instanceof Lindt){
//                ((Lindt)bag.getCadou().get(i)).printLindtDim();
//            }
//            if(bag.getCadou().get(i) instanceof Baravelli){
//                ((Baravelli)bag.getCadou().get(i)).printBaravelliDim();
//            }
//            if(bag.getCadou().get(i) instanceof ChocAmor){
//                ((ChocAmor)bag.getCadou().get(i)).printChocAmorDim();
//            }

            // fara instanceof
            bag.getCadou().get(i).print();

        }
    }


}
