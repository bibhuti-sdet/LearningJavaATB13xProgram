package CollectionsFramework;

import java.util.ArrayList;

public class ArrayListExample3 {


    public static void main(String[] args) {

        ArrayList<Integer> numbers = new ArrayList<>();

        numbers.add(10);
        numbers.add(20);
        numbers.add(30);

        // Update element
        numbers.set(1, 25);

        // Remove element
        numbers.remove(0);

        System.out.println("Final List: " + numbers);
    }
}
