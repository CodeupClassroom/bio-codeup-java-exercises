package shapes;

public class Circle {
    private double radius;
    public static int circleCount = 0;


    public Circle(double rad){
        this.radius = rad;
        circleCount++;
    }

    public double getArea(){
        return Math.PI * Math.pow(this.radius,2);
    }

    public double getCircumference(){
        return 2 * Math.PI * this.radius;
    }

//    public static getCircleCount(){
//        return
//    }
}
