package OOPBasics;

public class Circle extends GraphicObject implements Holder{

    @Override
    void draw() {
        System.out.println("Drawing a circle");
    }

    @Override
    void resize() {
        System.out.println("Resized");
    }


    @Override
    public void whatShape() {
        System.out.println("This is a circle");
    }
}
