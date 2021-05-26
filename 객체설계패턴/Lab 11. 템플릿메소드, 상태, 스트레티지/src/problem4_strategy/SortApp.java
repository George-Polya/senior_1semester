package problem4_strategy;

public class SortApp {
    public static void main(String[] args) {
        SortedList studentRecords = new SortedList();
        studentRecords.add("Samual");
        studentRecords.add("Jimmy");
        studentRecords.add("Sandra");
//        studentRecords.setSortStrategy(new QuickSort());
//        studentRecords.sort();
        studentRecords.setSortStrategy(new ShellSort());
        studentRecords.sort();
//        studentRecords.setSortStrategy(new MergeSort());
//        studentRecords.sort();

    }
}
