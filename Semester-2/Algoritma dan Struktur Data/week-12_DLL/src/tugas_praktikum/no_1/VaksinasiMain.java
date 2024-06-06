import java.util.Scanner;
public class VaksinasiMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        DoubleLinkedLists queue = new DoubleLinkedLists();
        int choice;

        do {
            System.out.println("+++++++++++++++++++++++++++++");
            System.out.println("PENGANTRI VAKSIN EXTRAVAGANZA");
            System.out.println("+++++++++++++++++++++++++++++");
            System.out.println("1. Tambah Data Penerima Vaksin");
            System.out.println("2. Hapus Data Pengantri Vaksin");
            System.out.println("3. Daftar Penerima Vaksin");
            System.out.println("4. Keluar");
            System.out.println("+++++++++++++++++++++++++++++");
            choice = scanner.nextInt();
            scanner.nextLine(); 

            switch (choice) {
                case 1:
                    System.out.println("-----------------------------");
                    System.out.println("Masukkan Data Penerima Vaksin");
                    System.out.println("-----------------------------");
                    System.out.print("Nomor Antrian: ");
                    int nomorAntrian = scanner.nextInt();
                    scanner.nextLine();  
                    System.out.print("Nama Penerima: ");
                    String nama = scanner.nextLine();
                    queue.addLast(nomorAntrian, nama);
                    break;
                case 2:
                    if (!queue.isEmpty()) {
                        queue.removeFirst();
                    } else {
                        System.out.println("Tidak ada pengantri yang bisa dihapus!");
                    }
                    break;
                case 3:
                    queue.printQueue();
                    break;
                case 4:
                    System.out.println("Terima kasih telah menggunakan layanan ini!");
                    break;
                default:
                    System.out.println("Pilihan tidak valid, silakan pilih lagi.");
            }
        } while (choice != 4);

        scanner.close();
    }
}