package shapes;

public class Rectangle {

    protected int length;
    protected int width;

    public Rectangle(){

    }

    public Rectangle(int l,int w){
        this.length = l;
        this.width = w;
    }

    //Methods
    public int getArea(){
        return (2 * this.length) + (2 * this.width);
    }

    public int getPerimeter(){
        return this.length * this.width;
    }


    //GETTERS & SETTERS
//    public int getLength() {
//        return length;
//    }
//    public void setLength(int length) {
//        this.length = length;
//    }
//    public int getWidth() {
//        return width;
//    }
//    public void setWidth(int width) {
//        this.width = width;
//    }
}
