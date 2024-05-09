import java.util.*;

public class Collections {
    public static void main(String[] args) {

        Set<String> fruit = new HashSet();
        fruit.add("apple");
        fruit.add("lemon");
        fruit.add("banana");
        fruit.add("orange");
        fruit.add("lemon");
        System.out.println(fruit.size());
        System.out.println(fruit);

        var i = fruit.iterator();
        while (i.hasNext()){
            System.out.println(i.next());
        }

        for(String item : fruit) {
            System.out.println(item);
        }

        List fruit2 = new ArrayList();
        fruit2.add("apple");
        fruit2.add("lemon");
        fruit2.add("banana");
        fruit2.add("orange");
        fruit2.add("lemon");
        System.out.println(fruit2.get(2));
        System.out.println(fruit.size());
        System.out.println(fruit);

        Queue fruit3 = new LinkedList();
        fruit3.add("apple");
        fruit3.add("lemon");
        fruit3.add("banana");
        fruit3.add("orange");
        fruit3.add("lemon");
        System.out.println(fruit3.size());
        System.out.println(fruit3);
        fruit3.remove();
        System.out.println(fruit3);
        System.out.println(fruit3.peek());

        Map<String, Integer> fruitCalories = new HashMap();
        fruitCalories.put("apple", 95);
        fruitCalories.put("lemon", 95);
        fruitCalories.put("banana", 95);
        fruitCalories.put("orange", 95);
        fruitCalories.put("lemon", 95);
        System.out.println(fruit.size());
        System.out.println(fruit);

        for(var entry: fruitCalories.entrySet()){
            System.out.println(entry.getValue());
        }

    }
}
