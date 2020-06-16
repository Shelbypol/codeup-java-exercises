package shapes;

public class Square extends Rectangle {

//    private int side;

    //Constructor
    public Square(int side) {
//        setLength(side);
//        setWidth(side);
        super(side, side);
    }

    //Methods
//    public int getArea(){
//        return (int)Math.pow(this.side, 2) ;
//    }
//
//    public int getPerimeter(){
//        return 4 * this.side;
//    }
//

    @Override
    public int getArea() {
//        System.out.println("square");
        return (int)Math.pow(width, 2);
    }

    @Override
    public int getPerimeter() {
//        System.out.println("square");
        return 4 * width;
    }

//    //Getters & Setters
//    public int getSide() {
//        return side;
//    }
//    public void setSide(int side) {
//        this.side = side;
//    }
}
