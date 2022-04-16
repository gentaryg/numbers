import org.w3c.dom.ls.LSOutput;

import java.util.*;
import java.util.function.Consumer;
import java.util.function.Predicate;

import static java.util.Collections.*;

public class Main {



    public static void main(String[] args) {
        List<Integer> intList = Arrays.asList(1, 2, 5, 16, -1, -2, 0, 32, 3, 5, 8, 23, 4);
        Set<Integer> sortIntList = new TreeSet<>();

        for (int i = 0; i < intList.size(); i++) {
            if (intList.get(i) > 0 && intList.get(i) % 2 == 0 ) {
                sortIntList.add(intList.get(i));
            }
        }
        for (Integer list:sortIntList) {
            System.out.println(list);

        }


    }
}
