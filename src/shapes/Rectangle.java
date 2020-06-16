package shapes;

public class Rectangle extends Quadrilateral implements Measurable{

    public Rectangle(double l, double w){
        super(l, w);
    }

    @Override
    public double getPerimeter() {
        return this.length * this.width;
    }
    @Override
    public double getArea() {
        return (2 * this.length) + (2 * this.width);
    }
}
