package shapes;

public class CircleApp {

    public static void main(String[] args) {

        Circle c1 = new Circle();

        System.out.println("What is the radius of your circle?");
        double radius = c1.getRadius();
        double area = c1.getArea();
        double circumference = c1.getCircumference();

        System.out.printf("The radius of your cirlce is: %.2f\nThe area of your circle is: %.2f\nThe circumference of your circle is: %.2f", radius, area, circumference);


    }
}
