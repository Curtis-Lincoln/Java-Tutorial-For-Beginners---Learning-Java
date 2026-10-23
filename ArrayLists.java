import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class ArrayLists {
    public static void main(String[] args){

        ArrayList<String> fruits = new ArrayList<>();

        fruits.add("Apple");
        fruits.add("Orange");
        fruits.add("Banana");
        fruits.add("Coconut");

        fruits.remove(1);
        fruits.set(0, "Pineapple");

        System.out.println(fruits.get(0));
        System.out.println(fruits.size());

        Collections.sort(fruits);

        System.out.println(fruits);

        for(String fruit : fruits){
            System.out.println(fruit);
        }

        Scanner scanner = new Scanner(System.in);
        int numOfFood;
        String food;

        ArrayList<String> foods = new ArrayList<>();

        System.out.print("Enter the # of food you would like: ");
        numOfFood = scanner.nextInt();
        scanner.nextLine();

        for(int i = 1; i <= numOfFood; i ++){
            System.out.print("Enter food #" + i + ": ");
            food = scanner .nextLine();
            foods.add(food);
        }

        System.out.println(foods);

        scanner.close();

    }
    
}
