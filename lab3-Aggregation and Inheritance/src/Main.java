public class Main {

    public static void main(String[] args) {
	// write your code here
        Lindt a = new Lindt("candy", "Moldovan", 3, 3, 3);
        Lindt b = new Lindt("candy", "Moldovan", 3, 3, 3);
        Lindt c = new Lindt("lollipops", "Romanian", 3, 5, 8);
        System.out.println("Task3:");
        System.out.println(a.equals(b));
        System.out.println(a.equals(c));

        CandyBag cadou = new CandyBag();
        Baravelli d = new Baravelli("toffee", "Ukrainian", 10, 2);
        Baravelli e = new Baravelli("chocolates", "Chinese", 1, 4);
        ChocAmor f = new ChocAmor("truffles", "Bulgarian", 11);

        cadou.getCadou().add(a);
        cadou.getCadou().add(c);
        cadou.getCadou().add(d);
        cadou.getCadou().add(e);
        cadou.getCadou().add(f);

        Area felicitare = new Area(cadou, 25, "Union");
        System.out.println("\nTask6:");
        felicitare.getBirthdayCard();


    }
}
