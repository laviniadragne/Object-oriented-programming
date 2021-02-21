package main;

import commands.*;
import diagram.DiagramComponent;

import java.util.LinkedList;
import java.util.List;

/**
 * The layer between the client and the commands that need to be executed on the receivers (DiagramCanvas and DiagramComponent).
 * <br>
 * It is independent of the subtypes of commands, it just receives a command, runs it and implements a redo/undo mechanism.
 */
public class Invoker {

        private List<DrawCommand> undoCommands = new LinkedList<>();
        private List<DrawCommand> redoCommands = new LinkedList<>();

    /**
     * Clear up all the used resources, start fresh :D
     */
    public void restart() {
      // TODO

        undoCommands = new LinkedList<>();
        redoCommands = new LinkedList<>();
    }

    /**
     * Executes a given command
     * @param command
     */
    public void execute(DrawCommand command) {
        // Adauga comanda in lista
        undoCommands.add(command);

        command.execute();
    }

    /**
     * Undo the latest command
     */
    public void undo() {
        // TODO
        // Hint: use data structures to keep track of commands
        // Do not use the java.util.Stack, its implementation is based on vector which is inefficient and deprecated.
        // Use a class that implements the Deque interface, e.g. LinkedList https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/Deque.html

        // aplic comanda pe ultimul element din lista
        int i = undoCommands.size()-1;
        undoCommands.get(i).undo();

        // adaug in lista de redo
        redoCommands.add(undoCommands.get(i));
        // o elimin din lista de undo
        undoCommands.remove(i);
    }

    /**
     * Redo command previously undone. Cannot perform a redo after an execute, only after at least one undo.
     */
    public void redo() {
        // TODO

        // aplic comanda pe ultimul element din lista
        int i = redoCommands.size()-1;
        redoCommands.get(i).execute();

        // adaug in lista de undo
        undoCommands.add(redoCommands.get(i));
        // o elimin din lista de redo
        redoCommands.remove(i);

    }
}
