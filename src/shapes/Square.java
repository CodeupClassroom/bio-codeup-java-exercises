package shapes;

public class Square extends Rectangle {

    public Square(double side) {
        super(side, side);
    }

    @Override
    public double getArea(){
        System.out.println("Square getArea");
        return Math.pow(this.width, 2);
    }

    @Override
    public double getPerimeter(){
        System.out.println("Square getPerimeter");
        return 4 * this.length;
    }

}
