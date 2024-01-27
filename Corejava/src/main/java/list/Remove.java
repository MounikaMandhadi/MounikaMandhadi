package list;

import java.util.ArrayList;
import java.util.List;

public class Remove {

    public static List<String> createList() {
        List<String> arr1 = new ArrayList<String>();
        arr1.add("A");
        arr1.add("B");
        arr1.add("C");
        arr1.add("D");
        arr1.add("E");
        return arr1;
    }

    public static void main(String[] args) {
        List<String> arr1 = createList();
        arr1.remove(new String("E"));
        System.out.println("New Array List: " + arr1);
    }
}
