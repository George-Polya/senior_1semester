package problem4_strategy;
/*
* 2016112158 김희수
* 정렬을 시행할시 QuickSort할댄 Shell, Merge를 주석처리 할것
* */

public class SortApp {
    public static void main(String[] args) {
        SortedList studentRecords = new SortedList();
        studentRecords.add("Samual");
        studentRecords.add("Jimmy");
        studentRecords.add("Sandra");
        studentRecords.setSortStrategy(new QuickSort());
        studentRecords.sort();
        studentRecords.setSortStrategy(new ShellSort());
        studentRecords.sort();
        studentRecords.setSortStrategy(new MergeSort());
        studentRecords.sort();

    }
}
