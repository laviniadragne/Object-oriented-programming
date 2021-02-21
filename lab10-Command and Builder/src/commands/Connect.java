package commands;

import diagram.DiagramCanvas;

public class Connect implements DrawCommand{
    DiagramCanvas diagramCanvas;
    String componentId;
    int index;

    @Override
    public void execute() {
        diagramCanvas.getComponent(index).connectTo(componentId);
    }

    @Override
    public void undo() {
        diagramCanvas.getComponent(index).removeConnection(componentId);
    }

    public Connect(DiagramCanvas diagramCanvas, int index, String componentId) {
        this.diagramCanvas = diagramCanvas;
        this.index = index;
        this.componentId = componentId;
    }

    @Override
    public String toString() {
        return "Connect{" +
                "diagramCanvas=" + diagramCanvas +
                ", componentId='" + componentId + '\'' +
                ", index=" + index +
                '}';
    }
}
