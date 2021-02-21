package commands;

import diagram.DiagramCanvas;
import diagram.DiagramComponent;

public class DrawRectangle implements DrawCommand{
    DiagramCanvas diagramCanvas;
    DiagramComponent diagramComponent;

    @Override
    public void execute() {
        DiagramComponent diagramComponent = new DiagramComponent();
        diagramCanvas.addComponent(diagramComponent);
        this.diagramComponent = diagramComponent;
    }

    @Override
    public void undo() {
        diagramCanvas.removeComponent(diagramComponent);
    }

    public DrawRectangle(DiagramCanvas diagramCanvas){
        this.diagramCanvas = diagramCanvas;
    }

    @Override
    public String toString() {
        return "DrawRectangle{" +
                "diagramCanvas=" + diagramCanvas +
                '}';
    }
}
