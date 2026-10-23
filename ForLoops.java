import java.util.Scanner;

public class ForLoops {
    public static void main(String[] args) throws InterruptedException{

        for(int i = 0; i < 10; i++){
            System.out.println(i);
        }

        for(int i = 10; i > 10; i--){
            System.out.println(i);
        }

        for(int i = 1; i <= 10; i+=2){
            System.out.println(i);
        }

        for(int i = 10; i > 0; i-=2){
            System.out.println(i);
        }

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter how many times you want to loop: ");
        int max = scanner.nextInt();

        for(int j = 0; j < max; j++){
            System.out.println(j);
        }

        System.out.print("How many seconds to countdown from?: ");
        int start = scanner.nextInt();

        for(int k = start; k > 0; k--){
            System.out.println(k);
            Thread.sleep(1000);
        }

        System.out.println("HAPPY NEW YEAR!");

        scanner.close();
    }
    
}
