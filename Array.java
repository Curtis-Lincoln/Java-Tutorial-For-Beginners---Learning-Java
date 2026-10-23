import java.util.Arrays;

public class Array {
    public static void main(String[] args){

        String[] fruits = {"apple", "orange", "banana", "coconut"};

        fruits[0] = "pineapple";
        int numOfFruits = fruits.length;

        System.out.println(fruits[0]);
        System.out.println(numOfFruits);

        Arrays.sort(fruits);
        Arrays.fill(fruits, "pineapple");

        for(int i = 0; i < fruits.length; i++){
            System.out.print(fruits[i] + " ");
        }

        for(String fruit : fruits){
            System.out.print(fruit + " ");
        }
    }
}