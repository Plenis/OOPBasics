package OOPBasics;

public class Shape {
    void whatShape() {
        System.out.println("This is a shape: ");
    }

    public static void main(String[] args) {
        Shape shape = new Shape();
        shape.whatShape();

        Circle circle = new Circle();
        circle.draw();
        circle.resize();
        circle.whatShape();

        Rectangle rectangle = new Rectangle();
        rectangle.whatShape();

    }
}
