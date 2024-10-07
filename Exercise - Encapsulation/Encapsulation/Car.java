package Encapsulation;

public class Car{
    private String color;
    private double price;
    private char size; 

    public Car(String color, double price, char size){
        this.color = color; 
        this.price = price; 
        this.size = Character.toUpperCase(size);
    }

    public String getColor(){
        return color;
    }

    public double getPrice(){
        return price;
    }

    public char getSize(){
        return size;
    }

    public void setColor(String color){
        this.color= color;
    }

    public void setPrice(double price){
        this.price= price;
    }
    public void setSize(char size){
        this.size= Character.toUpperCase(size);
    }

    public String toString(){
        String sizeDescriptor;
        switch (size) {
            case 'S':
                sizeDescriptor = "small";
                break;
            case 'M':
                sizeDescriptor = "medium";
                break;
            case 'L':
                sizeDescriptor = "large";
                break;
            default:
                sizeDescriptor = "unknown";
        }
        return String.format("Car (%s) - P%.2f - %s", color, price, sizeDescriptor);
    }
}