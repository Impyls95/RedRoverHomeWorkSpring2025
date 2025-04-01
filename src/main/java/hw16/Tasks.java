package hw16;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Tasks {
    public static void main(String[] args) {

        // Task 1

        List<String> myList = new ArrayList<>(List.of("White",
                "Tan",
                "Yellow",
                "Orange",
                "Red",
                "Pink",
                "Purple",
                "Blue"
        ));

        Iterator<String> iter = myList.iterator();

        while (iter.hasNext()) {
            String elem = iter.next();
            if (elem.contains("L") || elem.contains("l")) {
                iter.remove();
            }
        }

        System.out.println(myList);

        // Task 2

        List<Integer> myList2 = new ArrayList<>();

        for (int i = 100; i < 1001; i++) {
            myList2.add(i);
        }

        System.out.println(myList2);

        // Task 3 && extra

        Iterator<Integer> iter2 = myList2.iterator();

        while(iter2.hasNext()) {
            Integer elem = iter2.next();
            if (elem % 2 == 0) {
                iter2.remove();
            }
        }

        System.out.println(myList2);
    }
}
