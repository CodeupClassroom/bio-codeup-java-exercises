package shapes;

public class ShapesTest {
    public static void main(String[] args) {

        Rectangle[] group = new Rectangle[2];

        group[0] = new Rectangle(4, 5);
        // polymorph
        group[1] = new Square(5);

        for (Rectangle rect : group) {
                System.out.println("rect.getArea() = " + rect.getArea());
                System.out.println("rect.getPerimeter() = " + rect.getPerimeter());
        }

    }
}
