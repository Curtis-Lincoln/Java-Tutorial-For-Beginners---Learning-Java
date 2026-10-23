public class StringMethods {
    public static void main(String[] args){

        String name = "Curtis Lincoln";

        int length = name.length();
        char letter = name.charAt(0);
        int index = name.indexOf("o");
        int lastIndex = name.lastIndexOf("i");

        System.out.println(length);
        System.out.println(letter);
        System.out.println(index);
        System.out.println(lastIndex);

        name = name.toUpperCase();
        name = name.toLowerCase();
        name = name.trim();
        name = name.replace("o", "a");

        if(name.isEmpty()){
            System.out.println("Your name is empty");
        }
        else{
            System.out.println("Hello " + name);
        }

        if(name.contains(" ")){
            System.out.println("Your name contains a space");
        }
        else{
            System.out.println("Your name doesn't contain a space");
        }

        if(name.equals("password")){
            System.out.println("Your name can't be passowrd");
        }
        else{
            System.out.println("Hello " + name);
        }

        if(name.equalsIgnoreCase("password")){
            System.out.println("Your name can't be passowrd");
        }
        else{
            System.out.println("Hello " + name);
        }
    }
    
}
