package shapes;

import util.Input;

import java.util.Scanner;

public class Circle extends Input {

Scanner sc = new Scanner(System.in);

    private double radius;

    public double getRadius() {
        return this.radius = sc.nextDouble();
    }

    public void setRadius(double r) {
        this.radius = r;
    }

    //===Constructor
    public Circle(){
       this.setRadius(radius);
    }

    //===Area Instance Method
    public double getArea(){
       return Math.PI * (Math.pow(this.radius, 2));
    }

    //===Circumference Instance Method
    public double getCircumference(){
        return (2 * Math.PI * this.radius);
    }

}
