package Task2;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class Main {

    // Metoda generica ce returneaza suma tuturor elementelor
    public static  <T extends Sumabil> void addSum(Collection<T> c) {

        Iterator<T> iterator = c.iterator();
        Sumabil sum = iterator.next();
        while (iterator.hasNext()) {
            sum.addValue(iterator.next());
        }
        System.out.println();
        System.out.println(sum.toString());
    }

    public static void main(String[] args) {

        Collection<Sumabil> collection = new ArrayList<>();

        Integer [][] matrixTest1 = new Integer[4][4];
        int a = 0;

        // Afisare matricile initiale:
        System.out.println("Matricile initiale sunt:");

        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                matrixTest1[i][j] = a;
                System.out.print(a + " ");
                a++;
            }
            System.out.println();
        }

        System.out.println();

        Integer [][] matrixTest2 = new Integer[4][4];
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                matrixTest2[i][j] = a;
                System.out.print(a + " ");
                a++;
            }
            System.out.println();
        }

        System.out.println();

        Integer [][] matrixTest3 = new Integer[4][4];
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                matrixTest3[i][j] = a;
                System.out.print(a + " ");
                a++;
            }
            System.out.println();
        }

        System.out.println();

        MyMatrix myMatrix1 = new MyMatrix(matrixTest1);
        MyMatrix myMatrix2 = new MyMatrix(matrixTest2);
        MyMatrix myMatrix3 = new MyMatrix(matrixTest3);

        collection.add(myMatrix1);
        collection.add(myMatrix2);
        collection.add(myMatrix3);

        System.out.print("Rezultatul operatiei de adunare este:");
        addSum(collection);
        System.out.println();

        collection.clear();

        MyVector3 myVector1 = new MyVector3(a, a + 1, a + 2);
        a += 3;
        MyVector3 myVector2 = new MyVector3(a, a + 1, a + 2);
        a += 3;
        MyVector3 myVector3 = new MyVector3(a, a + 1, a + 2);

        System.out.println("Vectorii initiali sunt: ");

        collection.add(myVector1);
        System.out.println(myVector1);

        collection.add(myVector2);
        System.out.println(myVector2);

        collection.add(myVector3);
        System.out.println(myVector3);

        System.out.println();
        System.out.println("Rezultatul operatiei de adunare este: ");
        addSum(collection);
    }
}
