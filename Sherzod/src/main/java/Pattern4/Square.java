package Pattern4;

public class Square extends Shape {
    @Override
    void draw() {
        System.out.println("Inside square draw()");
    }

    public Square() {
        setType("Square");
    }
}
