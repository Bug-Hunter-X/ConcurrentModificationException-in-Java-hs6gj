import java.util.*;

public class ConcurrentModificationExceptionExampleSolution {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>(Arrays.asList("a", "b", "c"));

        // Solution 1: Using an Iterator
        Iterator<String> iterator = list.iterator();
        while (iterator.hasNext()) {
            String str = iterator.next();
            if (str.equals("b")) {
                iterator.remove();
            }
        }
        System.out.println("Solution 1: " + list);

        //Solution 2: Create a new list
        list = new ArrayList<>(Arrays.asList("a", "b", "c"));
        List<String> newList = new ArrayList<>();
        for (String str : list) {
            if (!str.equals("b")) {
                newList.add(str);
            }
        }
        list = newList; //Reassign list
        System.out.println("Solution 2: " + list);
        
        //Solution 3: Using List.removeIf() (Java 8+)
        list = new ArrayList<>(Arrays.asList("a", "b", "c"));
        list.removeIf(str -> str.equals("b"));
        System.out.println("Solution 3: " + list);
    }
}