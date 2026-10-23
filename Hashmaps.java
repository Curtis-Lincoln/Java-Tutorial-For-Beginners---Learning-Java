import java.util.HashMap;

public class Hashmaps {
    public static void main(String[] args) {
        
        HashMap<String, Double> map = new HashMap<>();

        map.put("Apple", 0.50);
        map.put("Orange", 0.75);
        map.put("Banana", 0.25);
        map.put("Coconut", 1.00);

        map.remove("Apple");

        System.out.println(map.get("Coconut"));

        if(map.containsKey("Orange")){
            System.out.println(map.get("Orange"));
        }
        else{
            System.out.println("Key not found");
        }

        System.out.println(map.containsValue(1.00));
        System.out.println(map.size());

        for(String key : map.keySet()){
            System.out.println(key + " : $" + map.get(key));
        }
    }
}
