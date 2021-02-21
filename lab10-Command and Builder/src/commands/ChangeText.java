package commands;

import diagram.DiagramCanvas;

public class ChangeText implements DrawCommand{
    DiagramCanvas diagramCanvas;
    String text;
    String oldText;
    int index;

    @Override
    public void execute() {
        oldText = diagramCanvas.getComponent(index).getText();
        diagramCanvas.getComponent(index).setText(text);
    }

    @Override
    public void undo() {
        diagramCanvas.getComponent(index).setText(oldText);
    }

    public ChangeText(DiagramCanvas diagramCanvas, int index, String text) {
        this.diagramCanvas = diagramCanvas;
        this.index = index;
        this.text = text;
    }

    @Override
    public String toString() {
        return "ChangeText{" +
                "diagramCanvas=" + diagramCanvas +
                ", text='" + text + '\'' +
                ", index=" + index +
                '}';
    }
}
