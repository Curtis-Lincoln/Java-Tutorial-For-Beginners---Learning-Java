public class AnonymousClasses {
    public static void main(String[] args) {
        
        Dog4 dog1 = new Dog4();
        Dog4 dog2 = new Dog4(){
            @Override
            void speak(){
                System.out.println("Scooby Doo says *Ruh Roh*");
            }
        };
        
        dog1.speak();
        dog2.speak();
    }
    
}
