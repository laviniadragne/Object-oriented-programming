package Task1;

public class Main {

    public static void main(String[] args) {

        MyHashMap<MyInteger, Double> hashMap = new MyHashMap<>(10);

        hashMap.put(new MyInteger(0), 2.6);
        hashMap.put(new MyInteger(1), 4.5);
        hashMap.put(new MyInteger(2), 3.9);
        hashMap.put(new MyInteger(3), 1.1);
        hashMap.put(new MyInteger(4), 2.3);
        hashMap.put(new MyInteger(5), 5.3);

        // Afisez tot dictionarul
        hashMap.toString();

        // Verific functia de get
        System.out.println("Verificare functia get: ");
        MyInteger myInteger = new MyInteger(3);
        System.out.println("Pentru cheia: 3, valoarea este: " + hashMap.get(myInteger));
    }

}

