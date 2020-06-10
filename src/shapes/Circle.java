package shapes;

import java.util.Scanner;

public class Circle {
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


//    circumference = 2 x pi x radius
//    area = pi x (radius ^ 2)
//12.57
//    25.13

    // c-5 31.42
    // a-5 78.54
}
