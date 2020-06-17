package shapes;


public class ShapesTest {

    Measurable myShape;

    public static void main(String[] args) {

        Measurable myShape;

        myShape = new Square(3.0);

        Measurable square1 = new Square(3.0);
        Measurable rectangle1 = new Rectangle(3, 5);

        System.out.println("Square");
        System.out.println("Area: " + square1.getArea());
        System.out.println("Perimeter: " + square1.getPerimeter());
        System.out.println("===================");

        System.out.println("Rectangle");
        System.out.println("Area: " + rectangle1.getArea());
        System.out.println("Perimeter: " + rectangle1.getPerimeter());

//            @Override
//            public double getPerimeter() {
//                return 0;
//            }
//
//            @Override
//            public double getArea() {
//                return 0;
//            }


//        Rectangle box1 = new Rectangle(5, 4);
//
//        System.out.println("=========");
//        System.out.printf("This shape has a length of: %d and a width of %d.\n", box1.length, box1.width);
//        System.out.println("Area: " + box1.getArea() + "\n" + "Perimeter: " + box1.getPerimeter());
//
//        System.out.println("=========");
//
//        Rectangle box2 = new Square(5);
//
//        System.out.printf("This shape has a length of: %d and a width of %d.\n", box2.length, box2.width);
//        System.out.println("Area: " + box2.getArea() + "\n" + "Perimeter: " + box2.getPerimeter());

    }
}
