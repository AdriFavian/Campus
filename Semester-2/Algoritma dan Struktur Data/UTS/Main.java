import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int data[] = {17, 40, 47, 22, 20, 30, 0, 15, 31, 31, 20, 44, 8, 28, 13, 27, 44};
        mencariNilai list = new mencariNilai(data);
        int n = data.length;

        list.tampilArray();

        System.out.print("Masukkan nilai yang ingin dicari: ");
        int cari = sc.nextInt();

        System.out.println("-------------------------------------------------------------------------");
        System.out.println("Mencari nilai sebelum data diurutkan (menggunakan Binary Search)");
        int idxBeforeSort = list.binarySearch(data, 0, n-1, cari);
        
        if (idxBeforeSort != -1) {
            System.out.println("Nilai " + cari + " ditemukan di index: " + idxBeforeSort);
        } else {
            System.out.println("Nilai " + cari + " tidak ditemukan dalam data sebelum sorting.");
        }
        
        System.out.println("-------------------------------------------------------------------------");
        System.out.println("Mencari index nilai yang dicari setelah data diurutkan secara Ascending:");
        list.selectionSortAscend();
        list.tampilArray();
        
        int idxAfterAscend = list.binarySearch(data, 0, n-1, cari);
        
        if (idxAfterAscend != -1) {
            System.out.println("Nilai " + cari + " ditemukan di index: " + idxAfterAscend);
        } else {
            System.out.println("Nilai " + cari + " tidak ditemukan dalam data setelah sorting ascending.");
        }
        
        System.out.println("-------------------------------------------------------------------------");
        System.out.println("Mencari index nilai yang dicari setelah data diurutkan secara Descending:");
        list.selectionSortDescend();
        list.tampilArray();
        
        int idxAfterDescend = list.binarySearch(data, 0, n-1, cari);

        if (idxAfterDescend != -1) {
            System.out.println("Nilai " + cari + " ditemukan di index: " + idxAfterDescend);
        } else {
            System.out.println("Nilai " + cari + " tidak ditemukan dalam data setelah sorting descending.");
        }
    sc.close();
    } 
}
