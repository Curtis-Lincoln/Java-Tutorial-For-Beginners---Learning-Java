public class ArrayOfObjects {
    public static void main(String[] args){

        Car2[] cars = {new Car2("Mustang", "Red"),
                      new Car2("Corvette", "Blue"),
                      new Car2("Charger", "Yellow")};

        for(Car2 car : cars){
            car.colour = "black";
        }

        for(Car2 car : cars){
            car.drive();
        }

    }
    
}
