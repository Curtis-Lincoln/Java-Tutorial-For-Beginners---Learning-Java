public class Car3 {

    String make;
    String model;
    int year;
    String colour;

    Car3(String make, String model, int year, String colour){
        this.make = make;
        this.model = model;
        this.year = year;
        this.colour = colour;
    }

    @Override
    public String toString(){
        return this.colour + " " + this.year + " " + this.make + " " + this.model;
    }
    
}
