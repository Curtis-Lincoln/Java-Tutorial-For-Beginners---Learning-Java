public class Car5 {

    private final String model;
    private String colour;
    private int price;

    Car5(String model, String colour, int price){
        this.model = model;
        this.colour = colour;
        this.price = price;
    }

    String getModel(){
        return this.model;
    }

    String getColour(){
        return this.colour;
    }

    String getPrice(){
        return "$" + this.price;
    }

    void setColour(String colour){
        this.colour = colour;
    }

    void setPrice(int price){
        if(price < 0){
            System.out.println("Price can't be less zero");
        }
        else{
            this.price = price;
        }
    }
    
}
