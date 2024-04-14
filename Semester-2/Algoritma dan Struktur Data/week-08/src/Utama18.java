import java.util.Scanner;
public class Utama18 {
    public static void main(String[] args) {
        // Gudang18 gudang = new Gudang18(7);
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan kapasitas gudang: ");
        int kapasitas = sc.nextInt();
        Gudang18 gudang = new Gudang18(kapasitas);

        while (true) {
            System.out.println("\nMenu:");
            System.out.println("1. Tambah barang");
            System.out.println("2. Ambil barang");
            System.out.println("3. Tampilkan tumpukan barang");
            System.out.println("4. Lihat barang teratas");
            System.out.println("5. Lihat barang terbawah");
            System.out.println("6. Cari Barang");
            System.out.println("7. Keluar");
            System.out.print( "Pilih operasi: ");
            int pilihan = sc.nextInt(); 
            sc.nextLine();

            switch (pilihan) {
                case 1:
                    System.out.print( "Masukkan kode barang: ");
                    int kode = sc.nextInt();
                    sc.nextLine();
                    System.out.print( "Masukkan nama barang: ");
                    String nama = sc.nextLine();
                    System.out.print( "Masukkan nama kategori: ");
                    String kategori = sc.nextLine();
                    Barang18 barangBaru = new Barang18 (kode, nama, kategori); 
                    gudang.tambahBarang (barangBaru);
                    break;
                case 2:
                    gudang.ambilBarang();
                    break;
                case 3:
                    gudang.tampilkanBarang();
                    break;
                case 4:
                    gudang.lihatBarangTeratas();
                    break;
                case 5:
                    gudang.lihatBarangTerbawah();
                    break;
                case 6:
                    System.out.print("Masukkan kode atau nama barang yang ingin dicari: ");
                    String input = sc.nextLine();
                    try {
                        int kodeBarang = Integer.parseInt(input);
                        gudang.cariBarang(kodeBarang, null); //kode barang
                    } catch (NumberFormatException e) {
                        gudang.cariBarang(0, input); //nama barang
                    }
                    break;
                case 7:
                    System.out.println("\nKeluar dari program.");
                    return;
                default:
                    System.out.println("Pilihan tidak valid. Silahkan coba lagi :)");
            }
        }
    }
}
