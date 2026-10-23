import java.util.Scanner;

public class SearchArray {
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        int[] numbers = {1, 9, 2, 8, 3, 5, 4};
        String[] fruits = {"apple", "orange", "banana"};
        int targetNum = 2;
        String targetString;
        boolean numFound = false;
        boolean stringFound = false;

        System.out.print("Enter a fruit to search for: ");
        targetString = scanner.nextLine();

        for(int i = 0; i < numbers.length; i++){
            if(targetNum == numbers[i]){
                System.out.println("Element found at index: " + i);
                numFound = true;
                break;
            }
        }

        for(int i = 0; i < numbers.length; i++){
            if(fruits[i].equals(targetString)){
                System.out.println("Element found at index: " + i);
                stringFound = true;
                break;
            }
        }

        if(!numFound){
            System.out.println("Element not found in the array");
        }
        if(!stringFound){
            System.out.println("Element not found in the array");
        }

        scanner.close();
    }
    
}
