package shapes;

public class Rectangle extends Quadrilateral implements Measurable{

    public Rectangle(double l, double w){
        super(l, w);
    }

    @Override
    public double getArea() {
        return this.length * this.width;
    }
    @Override
    public double getPerimeter() {
        return (2 * this.length) + (2 * this.width);
    }

    //Measurable Implementation
    @Override
    public void setWidth(double w) {
        this.width = w;
    }
    @Override
    public void setLength(double l) {
        this.length = l;
    }

}
