public class TernaryOperator {
    public static void main(String[] args){

        int score = 55;
        int number = 3;
        int hours = 13;
        int income = 60000;

        String passOrFail = (score >= 60) ? "PASS" : "FAIL";
        String evenOrOdd = (number % 2 == 0) ? "EVEN" : "ODD";
        String timeOfDay = (hours < 12) ? "A.M." : "P.M.";
        double taxRate = (income >= 40000) ? 0.25 : 0.15;

        System.out.println(passOrFail);
        System.out.println(evenOrOdd);
        System.out.println(timeOfDay);
        System.out.println(taxRate);
    }
    
}
