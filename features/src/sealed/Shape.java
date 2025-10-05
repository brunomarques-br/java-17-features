package sealed;

public sealed interface Shape permits Circle, Rectangle, Triangle {

    // using instanceof pattern
    default String getDescription() {
        if(this instanceof  Circle c){
            return "Circle with radius: " + c.radius();
        }else if(this instanceof  Rectangle r){
            return "Rectangle with area: " + (r.width() * r.height());
        }else if(this instanceof  Triangle t){
            return "Triangle with sides: " + t.sideA() + ", " + t.sideB() + ", " + t.sideC();
        }else{
            return "Shape not permitted";
        }
    }

}
