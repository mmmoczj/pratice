package design_pattern.decorator;

public class CircleEdge extends Decorator {

    public CircleEdge(Shape shape) {
        super(shape);
    }

    private void setEdgeColor(){
        System.out.print(",set edge color");
    }

    public void draw(){
        shape.draw();
        setEdgeColor();
    }
}
