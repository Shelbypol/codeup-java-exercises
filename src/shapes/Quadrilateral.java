package shapes;

public abstract class Quadrilateral extends Shape implements Measurable{

    double length;
    double width;

    //CONSTRUCTOR
    public Quadrilateral(double l, double w){
        this.length = l;
        this.width = w;
    }

    //GETTERS & SETTERS
    public double getLength() {
        return length;
    }
    public double getWidth() {
        return width;
    }

    public void setWidth(double w) {
    }

    public void setLength(double l){
    }

}
