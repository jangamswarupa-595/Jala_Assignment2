package Collections;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetOperations {
    public static void main(String[] args) {
        HashSet<String> set = new HashSet<>();
        for (int i = 1; i <= 10; i++) {
            set.add("Element" + i);
        }
        set.add("NewElement");
        System.out.println("HashSet elements:");
        Iterator<String> iterator = set.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
        set.remove("Element5");
        System.out.println("Is 'Element3' in the set? " + set.contains("Element3"));
        System.out.println("Is HashSet empty? " + set.isEmpty());
        System.out.println("Size of HashSet: " + set.size());
        set.clear();
        System.out.println("Is HashSet empty after clear? " + set.isEmpty());
    }
}

