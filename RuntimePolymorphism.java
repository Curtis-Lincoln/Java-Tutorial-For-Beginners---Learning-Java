import java.util.Scanner;

public class RuntimePolymorphism {
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        int choice;
        Animal3 animal;

        System.out.print("Would you like a dog or a cat? (1 = dog, 2 = cat): ");
        choice = scanner.nextInt();

        if(choice == 1){
            animal = new Dog3();
            animal.speak();
        }
        else if(choice == 2){
            animal = new Cat3();
            animal.speak();
        }

        scanner.close();
        
        
    }
    
}
