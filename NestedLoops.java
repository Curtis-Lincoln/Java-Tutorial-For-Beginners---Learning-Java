import java.util.Scanner;

public class NestedLoops {
    public static void main(String[] args){

        for(int i = 1; i <= 3; i++){
            for(int j = 1; j <= 9; j++){
                System.out.print(j + " ");
            }
            System.out.println();
        }
        
        Scanner scanner = new Scanner(System.in);

        int rows;
        int columns;
        char symbol;

        System.out.print("Enter the number of rows: ");
        rows = scanner.nextInt();

        System.out.print("Enter the number of columns: ");
        columns = scanner.nextInt();

        System.out.print("Enter the symbol to use: ");
        symbol = scanner.next().charAt(0);

        for(int k = 0; k < rows; k++){
            for(int l = 0; l < columns; l++){
                System.out.print(symbol);
            }
            System.out.println();
        }



        scanner.close();
    }
    
}
