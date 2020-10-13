package shapes;

public class ShapesTest {
    public static void main(String[] args) {

        Rectangle[] group = new Rectangle[2];

        group[0] = new Rectangle(4, 5);
        // polymorph
//        group[1] = new Square(5);

//        for (Rectangle rect : group) {
//                System.out.println("rect.getArea() = " + rect.getArea());
//                System.out.println("rect.getPerimeter() = " + rect.getPerimeter());
//        }

        System.out.println("First with a rectangle");
        Measurable myShape = new Rectangle(3,4);
        System.out.println(myShape.getArea());
        System.out.println(myShape.getPerimeter());

        System.out.println("Now with a square");
        myShape = new Square(7);
        // myShape.getLength(5); // cannot access
        System.out.println(myShape.getArea());
        System.out.println(myShape.getPerimeter());
    }
}
