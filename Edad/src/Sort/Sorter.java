package Sort;

public class Sorter {

    private SortStrategy sortStrategy;

    public Sorter(SortStrategy sortStrategy) {
        this.sortStrategy = sortStrategy;
    }

    public void SetSorter(SortStrategy sortStrategy) {
        this.sortStrategy = sortStrategy;
    }

    public void sort(int[] array) {
        sortStrategy.sort(array);
    }
}
