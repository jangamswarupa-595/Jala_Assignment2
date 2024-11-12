package Collections;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListOperations {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        for (int i = 1; i <= 10; i++) {
            list.add("Element" + i);
        }
        list.add("NewElement");
        Iterator<String> iterator = list.iterator();
        System.out.println("ArrayList elements:");
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        list.add(5, "InsertedElement");
        list.remove("Element3");
        list.remove(7);
        list.set(4, "UpdatedElement");
        System.out.println("Element at index 4: " + list.get(4));
        System.out.println("Element at index 2: " + list.get(2));
        System.out.println("Size of ArrayList: " + list.size());
        System.out.println("Is 'Element5' present? " + list.contains("Element5"));
        list.clear();
        System.out.println("Is ArrayList empty after clear? " + list.isEmpty());
    }
}
