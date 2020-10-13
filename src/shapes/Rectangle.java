package shapes;

public class Rectangle extends Quadrilateral implements Measurable{
    public Rectangle(double length,double width){
        super(length,width);
    }

    @Override
    public void setLength(double length) {
        this.length = length;
    }

    @Override
    public void setWidth(double width) {
        this.width = width;
    }

    @Override
    public double getPerimeter() {
        return 2 * this.getLength() + 2 * this.getWidth();
    }

    @Override
    public double getArea() {
        return this.getLength() * this.getWidth();
    }
//
//    protected double length;
//    protected double width;
//
//    public Rectangle(double aLength, double aWidth){
//        this.length = aLength;
//        this.width = aWidth;
//    }
//
//    public double getArea(){
//        return this.width * this.length;
//    }
//
//    public double getPerimeter(){
//        return (2*this.length) + (2*this.width);
//    }

}
