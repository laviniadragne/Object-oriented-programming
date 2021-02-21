package main;

import commands.*;
import diagram.DiagramCanvas;

/**
 * Receives commands in clear text from the user and transforms them in DrawCommand objects. It uses the Invoker to
 * execute the given commands.
 */
public class Client {

    private Invoker invoker;
    private DiagramCanvas diagramCanvas;

    Client() {
        invoker = new Invoker();
        diagramCanvas = new DiagramCanvas();
    }

    public void showDiagram() {
        // TODO
        diagramCanvas.show();
    }

    public void newDiagram() {
        // TODO
        DiagramCanvas newDiagramCanvas = new DiagramCanvas();
        this.diagramCanvas = newDiagramCanvas;
    }

    public void executeAction(String commandName, String ...args) {
        // TODO - uncomment:
        DrawCommand command;
        try {
            CommandType commandType = CommandType.fromString(commandName);
            command = getCommand(commandType, args);
            if (command == null) {
                throw new IllegalArgumentException();
            }

        } catch(IllegalArgumentException ex) {
            System.out.println("Invalid command: " + commandName);
            System.out.println("Available commands:");
            for (CommandType type : CommandType.values()) {
                System.out.println("\t- " + type.text);
            }
            return;
        }

        // TODO - Execute the action
        invoker.execute(command);

    }

    private DrawCommand getCommand(CommandType type, String ...args) throws IllegalArgumentException {
        // TODO factory method to create DrawCommand subclasses.
        // If there is an exception when parsing the string arguments (NumberFormatException) catch it and
        // throw an IllegalArgumentException


        switch (type) {
            case CHANGE_COLOR -> {
                int index = Integer.parseInt(args[0]);
                return new ChangeColor(diagramCanvas, index, args[1]);
            }
            case CHANGE_TEXT -> {
                int index = Integer.parseInt(args[0]);
                return new ChangeText(diagramCanvas, index, args[1]);

            }
            case CONNECT -> {
                int index = Integer.parseInt(args[0]);
                return new Connect(diagramCanvas, index, args[1]);

            }
            case DRAW_RECTANGLE -> {
                return new DrawRectangle(diagramCanvas);
            }
            case RESIZE -> {
                int index = Integer.parseInt(args[0]);
                int percent = Integer.parseInt(args[1]);
                return new Resize(diagramCanvas, index, percent);
            }
            default -> throw new IllegalArgumentException("Ai introdus gresit parametrii");

        }

        //return null;
    }

    public void undo(){
        // TODO
        invoker.undo();
    }

    public void redo() {
        // TODO
        invoker.redo();
    }
}
