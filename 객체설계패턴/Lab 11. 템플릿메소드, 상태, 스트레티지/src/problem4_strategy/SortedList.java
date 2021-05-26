package problem4_strategy;

import java.util.ArrayList;
import java.util.List;

public class SortedList {
    private List<String> list = new ArrayList<>();
    private SortStrategy sortStrategy;

//    public SortedList(SortStrategy sortStrategy) {
//        this.sortStrategy = sortStrategy;
//    }

    public void setSortStrategy(SortStrategy sortStrategy) {
        this.sortStrategy = sortStrategy;
    }

    public void add(String name) {
        list.add(name);
    }

    public void sort() {
        list = sortStrategy.sort(list);

        for (String name : list) {
            System.out.println(" " + name);
        }
        System.out.println();
    }
}
