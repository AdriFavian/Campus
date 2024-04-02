package P7;

public class MergeSortMain18 {
    public static void main(String[] args) {
        int data[] = {10,40,30,50,70,20,100,90};
        System.out.println("Sorting dengan Merge Sort");
        MergeSorting18 mSort = new MergeSorting18();
        System.out.println("Data awal: ");
        mSort.printArray(data);
        mSort.mergeSort(data);
        System.out.println("\nSetelah Diurutkan: ");
        mSort.printArray(data);
    }
}
