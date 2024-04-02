package P5;
import java.util.Scanner;
public class BukuMain18 {
    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);
        Scanner s1 = new Scanner(System.in);

        PencarianBuku18 data = new PencarianBuku18();
        int jumBuku = 3;

        System.out.println("-----------------------------------------------------");
        // System.out.println("Masukkan data Buku secara Urut dari KodeBuku Terkecil : ");
        System.out.println("Masukkan data Buku  : ");
        for (int i = 0; i < jumBuku; i++) {
            System.out.println("-------------------");
            System.out.print("Kode Buku \t: ");
            int kodeBuku = s.nextInt();
            System.out.print("Judul buku \t: ");
            String judulBuku = s1.nextLine();
            System.out.print("Tahun Terbit \t: ");
            int tahunTerbit = s.nextInt();
            System.out.print("Pengarang \t: ");
            String pengarang = s1.nextLine();
            System.out.print("Stock \t\t: ");
            int stock = s.nextInt();

            Buku18 m = new Buku18(kodeBuku, judulBuku, tahunTerbit, pengarang, stock);
            data.tambah(m);
        }
        System.out.println("----------------------------------------------");
        System.out.println("Data keseluruhan Buku: ");
        data.tampil();

        System.out.println("______________________________________");
        System.out.println("______________________________________");
        System.out.println("Pencarian Data");
        // System.out.println("Masukkan Kode Buku yang dicari");
        System.out.println("Masukkan Judul Buku yang dicari");
        System.out.print("Judul Buku : ");
        // int cari = s.nextInt();
        String cari = s1.next();

        System.out.println("menggunakan Sequential Search");
        if (data.getFindCount() == 0){
            System.out.println("Data tidak dapat ditemukan");
        } else if (data.getFindCount() == 1) {
            int posisi = data.FindJudulSeq(cari);
            data.Tampilposisi(cari, posisi);
            data.TampilData(cari, posisi);
        } else {
            System.out.println("Peringatan : Terdapat lebih dari satu hasil judul buku yang anda cari");
        }

        int posisi = data.FindJudulSeq(cari);
        data.Tampilposisi(cari, posisi);
        data.TampilData(cari, posisi);

        // Buku18 dataBuku = data.FindBuku(cari);
        // dataBuku.tampilDataBuku();

        System.out.println("====================================================");
        System.out.println("Menggunakan Binary Search");
        posisi = data.FindBinarySearch(cari, 0, jumBuku-1);
        data.Tampilposisi(cari, posisi);
        data.TampilData(cari, posisi);
    }
}
