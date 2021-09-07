package design_pattern.decorator;

public class CircleFill extends Decorator {

    public CircleFill(Shape shape) {
        super(shape);
    }

    private void setFillColor(){
        System.out.print(",set fill color");
    }

    public void draw(){
        shape.draw();
        setFillColor();
    }

}
