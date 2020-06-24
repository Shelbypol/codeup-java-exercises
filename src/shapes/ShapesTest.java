package shapes;


public class ShapesTest {

    public static void main(String[] args) {


        Measurable myShape1 = new Square(4.0);
        Measurable myShape2  = new Rectangle(5, 10);

        Rectangle r1 = new Rectangle(3,10);
        r1.setLength(8);

        System.out.println("Square");
        System.out.println("Area: " + myShape1.getArea());
        System.out.println("Perimeter: " + myShape1.getPerimeter());
        System.out.println("===================");

        System.out.println("Rectangle");

        System.out.println("Area: " + myShape2.getArea());
        System.out.println("Perimeter: " + myShape2.getPerimeter());
        System.out.println("===================");

        System.out.println("Rectangle");
        System.out.println("Area: " + r1.getArea());
        System.out.println("Perimeter: " + r1.getPerimeter());

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
