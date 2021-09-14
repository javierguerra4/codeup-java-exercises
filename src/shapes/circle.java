package shapes;

public class circle {
    private double radius;

    public double getArea(){
        return Math.PI * (Math.pow(radius, 2));
    }

    public double GetCircumference(){
        return 2 * Math.PI * radius;
    }
    public circle(double radius){
        this.radius = radius;
    }
}
