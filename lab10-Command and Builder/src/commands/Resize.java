package commands;

import diagram.DiagramCanvas;

public class Resize implements DrawCommand{
    DiagramCanvas diagramCanvas;
    int percent;
    int index;

    @Override
    public void execute() {
        int width = diagramCanvas.getComponent(index).getWeight();
        int height = diagramCanvas.getComponent(index).getHeight();

        width *= percent;
        height *= percent;

        diagramCanvas.getComponent(index).setWeight(width);
        diagramCanvas.getComponent(index).setHeight(height);
    }

    @Override
    public void undo() {
        int width = diagramCanvas.getComponent(index).getWeight();
        int height = diagramCanvas.getComponent(index).getHeight();

        width /= percent;
        height /= percent;

        diagramCanvas.getComponent(index).setHeight(height);
        diagramCanvas.getComponent(index).setWeight(width);
    }

    public Resize(DiagramCanvas diagramCanvas, int index, int percent) {
        this.diagramCanvas = diagramCanvas;
        this.percent = percent;
        this.index = index;
    }

    @Override
    public String toString() {
        return "Resize{" +
                "diagramCanvas=" + diagramCanvas +
                ", percent=" + percent +
                ", index=" + index +
                '}';
    }
}
