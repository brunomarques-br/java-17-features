import records.Person;
import sealed.math.Circle;
import sealed.math.Rectangle;
import sealed.math.Shape;
import sealed.math.Triangle;

public class Main {

    public static void main(String[] args) {

        // record example
        Person p1 = new Person("Bruno", "bruno@gmail.com", 34);
        System.out.println(p1);

        // sealed interface + record + instanceof pattern
        Shape circle = new Circle(30.4D);
        System.out.println(circle.getDescription());

        Shape rectangle = new Rectangle(30.4D, 30.4D);
        System.out.println(rectangle.getDescription());

        Shape triangle = new Triangle(30.4D, 30.4D, 30.4D);
        System.out.println(triangle.getDescription());

    }
}
