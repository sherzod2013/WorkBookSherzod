package Pattern1;

/**
 * Created by Sherzod on 10/24/2017.
 */
public class ShapeFactory {
    public Shape getShape(String shape){
        if(shape==null){
            return null;
        }
        if(shape.equalsIgnoreCase("SERCLE")){
            return new Sercle();
        }
        if(shape.equalsIgnoreCase("RECTANGEL")){
            return new Rectangel();
        }
        if(shape.equalsIgnoreCase("SQUARE")){
            return new Square();
        }

        return null;
    }
}
