package shapes;

public class Square extends Quadrilateral implements Measurable {

    public Square(Double side){
        super(side, side);
    }

    @Override
    public double getPerimeter() {
        return 4 * width;
    }
    @Override
    public double getArea() {
        return Math.pow(width, 2);
    }

//    //Measurable Implementation
    @Override
    public void setWidth(double s) {
        this.width = s;
    }
    @Override
    public void setLength(double s) {
        this.length = s;
    }

}
