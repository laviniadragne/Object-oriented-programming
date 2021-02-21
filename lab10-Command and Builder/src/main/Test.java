package main;

public class Test {
    public static void main(String[] args) {
        Client client = new Client();

        // Execute various tests

        testDraw(client);
        System.out.println(new String(new char[80]).replace("\0", "-"));

        testTextAndColor(client);
        System.out.println(new String(new char[80]).replace("\0", "-"));

        testResize(client);
        System.out.println(new String(new char[80]).replace("\0", "-"));

        testConnect(client);
        System.out.println(new String(new char[80]).replace("\0", "-"));

        testAllCommands(client);
        System.out.println(new String(new char[80]).replace("\0", "-"));

        testSimpleUndoRedo(client);
        System.out.println(new String(new char[80]).replace("\0", "-"));

        testComplexUndoRedo(client);
        System.out.println(new String(new char[80]).replace("\0", "-"));
    }

    private static void testDraw(Client client) {
        client.newDiagram();

        client.executeAction("draw rectangle");
        client.executeAction("draw rectangle");
        client.executeAction("draw rectangle");
        client.executeAction("draw rectangle");
        client.executeAction("draw rectangle");

        client.showDiagram();
    }

    private static void testTextAndColor(Client client) {
        System.out.println("Diagrama initiala: ");
        testDraw(client);

        client.executeAction("change color", "0", "RED");
        client.executeAction("change color", "1", "BLUE");
        client.executeAction("draw rectangle");
        client.executeAction("change text", "0", "MyClass1");
        client.executeAction("change text", "5", "MyClass2");

        System.out.println("Diagrama modifica textul si culoarea: ");
        client.showDiagram();
        System.out.println();
    }

    private static void testConnect(Client client) {
        // TODO
        System.out.println("Diagrama initiala: ");
        testDraw(client);

        client.executeAction("connect", "0", "3");
        client.executeAction("connect", "1", "2");
        client.executeAction("connect", "2", "1");
        client.executeAction("connect", "3", "0");
        client.executeAction("connect", "4", "4");

        System.out.println("Diagrama modificata cu connect: ");
        client.showDiagram();
        System.out.println();

    }

    private static void testResize(Client client) {
        // TODO
        System.out.println("Diagrama initiala: ");
        testDraw(client);

        client.executeAction("resize", "0", "2");
        client.executeAction("resize", "1", "3");
        client.executeAction("resize", "2", "4");
        client.executeAction("resize", "3", "5");
        client.executeAction("resize", "4", "6");

        System.out.println("Diagrama modificata cu resize: ");
        client.showDiagram();
        System.out.println();

    }

    private static void testAllCommands(Client client) {
        // TODO
        System.out.println("Toate comenzile: ");

        testDraw(client);
        testTextAndColor(client);
        testConnect(client);
        testResize(client);

        System.out.println();
    }

    private static void testSimpleUndoRedo(Client client) {
        client.newDiagram();

        client.executeAction("draw rectangle");
        client.executeAction("change color", "0", "ORANGE");
        client.showDiagram();

        client.executeAction("draw rectangle");
        client.showDiagram();

        System.out.println("UNDO======================");
        client.undo();
        client.showDiagram();

        System.out.println("REDO=================");
        client.redo();
        client.showDiagram();
    }

    private static void testComplexUndoRedo(Client client) {
        // TODO
        client.newDiagram();

        client.executeAction("draw rectangle");
        client.executeAction("draw rectangle");
        client.executeAction("draw rectangle");
        client.executeAction("draw rectangle");
        client.executeAction("draw rectangle");

        client.executeAction("change color", "0", "BLACK");
        client.executeAction("change text", "1", "NEW TEXT");
        client.executeAction("connect", "2", "3");
        client.executeAction("resize", "4", "4");
        client.executeAction("change color", "4", "PINK");
        client.executeAction("change text", "2", "MYTEXT");
        client.executeAction("resize", "0", "5");
        client.executeAction("connect", "3", "0");


        client.showDiagram();
        client.undo();

        client.showDiagram();

        client.undo();
        client.showDiagram();

        client.redo();
        client.showDiagram();

        client.showDiagram();
        client.undo();

        client.showDiagram();

        client.undo();
        client.showDiagram();

        client.redo();
        client.showDiagram();


    }
}
