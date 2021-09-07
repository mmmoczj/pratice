package design_pattern.decorator;

public class main {
    public static void main(String[] args) {
        Shape circle = new Circle();
        Shape circleEdgeColor = new CircleEdge(circle);
        Shape circleFillColor = new CircleFill(circleEdgeColor);
        circleFillColor.draw();
        System.out.println();
    }
}
