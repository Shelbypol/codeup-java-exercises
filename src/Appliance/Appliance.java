package Appliance;

abstract class Appliance {

    private String brand;
    private String color;


    //EMPTY CONSTRUCTOR
    public Appliance(){

    }

    //CONSTRUCTOR
    public Appliance(String brand, String color){
        this.brand = brand;
        this.color = color;
    }

    //ABSTRACT METHODS
    public abstract void makeSound();
    public abstract void doWork();



    //GETTERS && SETTERS
    public String getBrand(){
        return this.brand;
    }
    public void setBrand(String brand) {
        this.brand = brand;
    }
    public String getColor() {
        return color;
    }
    public void setColor(String color) {
        this.color = color;
    }
}
