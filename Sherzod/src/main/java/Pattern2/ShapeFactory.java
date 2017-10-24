package Pattern2;

/**
 * Created by Sherzod on 10/24/2017.
 */
public class ShapeFactory extends AbstractFactory {
    @Override
    Color getColor(String color) {
                return null;
    }

    @Override
    Shape getShape(String shapeType) {
        if(shapeType == null){
            return null;
        }

        if(shapeType.equalsIgnoreCase("CIRCLE")){
            return new Sercle();

        }else if(shapeType.equalsIgnoreCase("RECTANGLE")){
            return new Rectangel();

        }else if(shapeType.equalsIgnoreCase("SQUARE")){
            return new Square();
        }

        return null;
    }



}
