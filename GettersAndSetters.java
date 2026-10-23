public class GettersAndSetters {
    public static void main(String[] args){

        Car5 car = new Car5("Charger", "Yellow", 10000);

        car.setColour("Blue");
        car.setPrice(5000);

        System.out.println(car.getColour() + " " + car.getModel() + " " + car.getPrice());
    }
    
}
