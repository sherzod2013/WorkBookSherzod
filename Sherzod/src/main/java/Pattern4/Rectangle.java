package Pattern4;

import sun.security.provider.SHA;

public class Rectangle extends Shape {
    public Rectangle() {
        setType("Rectangle");
    }

    @Override
    void draw() {
        System.out.println("Iside rectangle draw() method.");
    }
}
