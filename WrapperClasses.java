public class WrapperClasses {
    public static void main(String[] args){

        // Autoboxing
        Integer a = 123;
        Double b = 3.14;
        Character c = '$';
        Boolean d = true;

        String e = Integer.toString(123);
        String f = Double.toString(3.14);
        String g = Character.toString('@'); 
        String h = Boolean.toString(false);

        String i = e + f + g + h;
        System.out.println(i);

        int j = Integer.parseInt("123");
        double k = Double.parseDouble("3.14");
        char l = "Pizza".charAt(0);
        boolean m = Boolean.parseBoolean("true");

        char letter = 'b';
        System.out.println(Character.isLetter(letter));
        System.out.println(Character.isUpperCase(letter));

        // Unboxing
        int w = a;
        double x = b;
        char y = c;
        boolean z = d; 

    }
    
}
