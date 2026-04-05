package CollectionsFramework;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListExample2 {

    public static void main(String[] args) {

        ArrayList<String> list = new ArrayList<>();
        list.add("A");
        list.add("B");
        list.add("C");

        // 1. For loop
        for (int i = 0; i < list.size(); i++) {
            System.out.println("For loop: " + list.get(i));
        }

        // 2. Enhanced for loop
        for (String s : list) {
            System.out.println("Enhanced loop: " + s);
        }

        // 3. Iterator
        Iterator<String> it = list.iterator();
        while (it.hasNext()) {
            System.out.println("Iterator: " + it.next());
        }
    }
}

