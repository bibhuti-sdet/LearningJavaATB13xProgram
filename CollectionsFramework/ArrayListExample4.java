package CollectionsFramework;

import java.util.ArrayList;

public class ArrayListExample4 {
    public static void main(String[] args) {

        ArrayList<String> list = new ArrayList<>();
        list.add("Java");
        list.add("Selenium");
        list.add("Katalon");

        System.out.println("Contains Java? " + list.contains("Java"));
        System.out.println("Size: " + list.size());
    }
}
