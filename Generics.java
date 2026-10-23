public class Generics {
    public static void main(String[] args) {
        
        Box<Double> box = new Box<>();

        box.setItem(3.14);
        System.out.println(box.getItem());

        Product<String, Double> product1 = new Product<>("Apple", 0.50);
        Product<String, Integer> product2 = new Product<>("Ticket", 15);


        System.out.println(product1.getPrice());
        System.out.println(product2.getItem());
    }
    
}
