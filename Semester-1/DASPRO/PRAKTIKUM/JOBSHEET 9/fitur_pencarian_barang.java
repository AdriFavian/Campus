import java.util.Scanner;

public class fitur_pencarian_barang {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] namaBarang = new String[10];
        int[] jumlahBarang = new int[10];
        String[] kategoriBarang = new String[10];
        String[] tanggalMasuk = new String[10];

        for (int i = 0; i < 10; i++) {
            System.out.println("Masukkan nama barang:");
            namaBarang[i] = scanner.nextLine();
            System.out.println("Masukkan jumlah barang:");
            jumlahBarang[i] = scanner.nextInt();
            scanner.nextLine();
            System.out.println("Masukkan kategori barang:");
            kategoriBarang[i] = scanner.nextLine();
            System.out.println("Masukkan tanggal masuk (dd/mm/yyyy):");
            tanggalMasuk[i] = scanner.nextLine();
        }

        // Pencarian data barang
        System.out.println("Masukkan nama barang yang ingin dicari:");
        String namaCari = scanner.nextLine();

        boolean isDataFound = false;
        for (int i = 0; i < 10; i++) {
            if (namaBarang[i].equals(namaCari)) {
                System.out.println("Nama Barang: " + namaBarang[i]);
                System.out.println("Kategori Barang: " + kategoriBarang[i]);
                System.out.println("Jumlah Barang: " + jumlahBarang[i]);
                isDataFound = true;
                break;
            }
        }

        if (!isDataFound) {
            System.out.println("Data barang tidak ditemukan.");
        }
    }
}
