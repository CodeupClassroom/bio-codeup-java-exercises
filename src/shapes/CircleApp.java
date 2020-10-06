package shapes;

import util.Input;

public class CircleApp {

    public static void main(String[] args) {
        Input input = new Input();
        double rad = input.getDouble(0,100000);
        Circle pokerChip = new Circle(rad);
        System.out.println("pokerChip.getCircumference() = " + pokerChip.getCircumference());
        System.out.println("pokerChip.getArea() = " + pokerChip.getArea());
    }
}
