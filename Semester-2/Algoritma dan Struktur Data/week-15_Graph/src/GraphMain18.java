import java.util.Scanner;

public class GraphMain18 {
    public static void menu() {
        System.out.println("Pilih menu: ");
        System.out.println("1. Tambah Edge");
        System.out.println("2. Hapus Edge");
        System.out.println("3. Degree");
        System.out.println("4. Tampilkan Graph");
        System.out.println("5. Periksa Edge");
        System.out.println("6. Keluar");
        System.out.println("=========================");
    }
    
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int asal, tujuan, pilihMenu;
        Graph18 gedung = new Graph18(6);

        do {
            menu();
            pilihMenu = sc.nextInt();
            switch (pilihMenu) {
                case 1:
                    System.out.println("Tambahkan lintasan antar gedung");
                    System.out.print("Masukkan indeks node (gedung) asal: ");
                    asal = sc.nextInt();
                    System.out.print("Masukkan indeks node (gedung) tujuan: ");
                    tujuan = sc.nextInt();
                    System.out.print("Masukkan jarak lintasan dari node asal ke node tujuan: ");
                    int jarak = sc.nextInt();
                    gedung.addEdge(asal, tujuan, jarak);
                    break;
                case 2:
                    System.out.println("Hapus lintasan antar gedung");
                    System.out.print("Masukkan indeks node (gedung) asal: ");
                    asal = sc.nextInt();
                    System.out.print("Masukkan indeks node (gedung) tujuan: ");
                    tujuan = sc.nextInt();
                    gedung.removeEdge(asal, tujuan);
                    break;
                case 3:
                    System.out.print("Masukkan indeks node yang ingin dicek degree-nya: ");
                    asal = sc.nextInt();
                    gedung.degree(asal);
                    break;
                case 4:
                    System.out.println("Tampilkan semua node (gedung) yang ada pada graf:");
                    gedung.printGraph();
                    break;
                case 5:
                    System.out.println("Periksa lintasan antar node (gedung)");
                    System.out.print("Masukkan indeks node asal: ");
                    asal = sc.nextInt();
                    System.out.print("Masukkan indeks node tujuan: ");
                    tujuan = sc.nextInt();
                    gedung.pengecekanEdge(asal, tujuan);
                    break;
                case 6:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Pilihan tidak valid. Silakan pilih lagi.");
            }
        } while (pilihMenu != 6);
        sc.close();
    }
}
