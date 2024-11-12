package Collections;

import java.util.HashMap;

public class HashMapOperations {
    public static void main(String[] args) {
        HashMap<Integer, String> studentMap = new HashMap<>();
        for (int i = 1; i <= 10; i++) {
            studentMap.put(i, "Student" + i);
        }
        studentMap.put(11, "NewStudent");
        System.out.println("Value for key 3: " + studentMap.get(3));
        HashMap<Integer, String> copyMap = new HashMap<>(studentMap);
        System.out.println("Does key 5 exist? " + studentMap.containsKey(5));
        System.out.println("Does value 'Student7' exist? " + studentMap.containsValue("Student7"));
        System.out.println("Is the map empty? " + studentMap.isEmpty());
        System.out.println("Size of the map: " + studentMap.size());
        System.out.println("Keys in the map: " + studentMap.keySet());
        System.out.println("Values in the map: " + studentMap.values());
        studentMap.remove(2);
        HashMap<Integer, String> anotherMap = new HashMap<>(studentMap);
        System.out.println("Contents of anotherMap: " + anotherMap);
    }
}
