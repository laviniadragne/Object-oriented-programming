package commands;

import diagram.DiagramCanvas;

public class ChangeColor implements DrawCommand{
    DiagramCanvas diagramCanvas;
    String color;
    String oldColor;
    int index;


    @Override
    public void execute() {
        oldColor = diagramCanvas.getComponent(index).getColor();
        diagramCanvas.getComponent(index).setColor(color);
    }

    @Override
    public void undo() {
        diagramCanvas.getComponent(index).setColor(oldColor);
    }

    public ChangeColor(DiagramCanvas diagramCanvas, int index, String color) {
        this.diagramCanvas = diagramCanvas;
        this.color = color;
        this.index = index;
    }

    @Override
    public String toString() {
        return "ChangeColor{" +
                "diagramCanvas=" + diagramCanvas +
                ", color='" + color + '\'' +
                ", index=" + index +
                '}';
    }
}
