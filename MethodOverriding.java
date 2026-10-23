public class MethodOverriding {
    public static void main(String[] args){

        Dog2 dog = new Dog2();
        Cat2 cat = new Cat2();
        Fish fish = new Fish();

        dog.move();
        cat.move();
        fish.move();
    }
    
}
