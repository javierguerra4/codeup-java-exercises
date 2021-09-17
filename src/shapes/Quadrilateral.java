package shapes;

public abstract class Quadrilateral extends Shape implements Measurable{

//THESE ARE THE PROPERTIES
    protected double length;
    protected double width;

//    THIS IS THE GETTER
    public double getLength() {
        return length;
    }

//    THIS IS THE SETTER WITHOUT A METHOD BODY
    public abstract void setLength(double length);


    //    THIS IS THE GETTER

    public double getWidth() {
        return width;
    }


//    THIS IS THE SETTER WITHOUT A METHOD BODY

    public abstract void setWidth(double width);



//THIS IS THE CONSTRUCTOR
    public Quadrilateral(double length, double width){
        this.length = length;
        this.width = width;


    }

}
