package CollectionsFramework;

import java.util.ArrayList;
import java.util.Collections;

public class MaxMinArrayList {

    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(5);
        list.add(25);

        int max = Collections.max(list);
        int min = Collections.min(list);

        System.out.println("Max: " + max);
        System.out.println("Min: " + min);
    }
}
