public class Arithmetic {
    public static void main(String[] args) {

        int x = 10;
        int y = 2;
        int z;

        z = x + y;
        z = x - y;
        z = x * y;
        z = x / y;
        z = x % y;

        x += y;
        x -= y;
        x *= y;
        x /= y;
        x %= y;

        x++;
        x--;

        double result = 3 + 4 * (7 - 5) / 2.0;

        System.out.println(result);
    }
}
