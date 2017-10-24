package Pattern2;

import Pattern1.*;

/**
 * Created by Sherzod on 10/24/2017.
 */
public abstract class AbstractFactory {
    abstract Color getColor(String color);
    abstract Shape getShape(String shape);
}
