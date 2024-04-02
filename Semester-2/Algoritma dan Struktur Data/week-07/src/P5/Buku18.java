package P5;
public class Buku18 {
    int kodeBuku, tahunTerbit, stock;
    String judulBuku, pengarang;

    public Buku18 (int kodeBuku, String judulBuku, int tahunTerbit, String pengarang, int stock){
        this.kodeBuku = kodeBuku;
        this.judulBuku= judulBuku;
        this.tahunTerbit= tahunTerbit;
        this.pengarang= pengarang;
        this.stock= stock;
    }

    public void tampilDataBuku (){
        System.out.println("======================");
        System.out.println("Kode buku: "+kodeBuku);
        System.out.println("Judul buku: "+judulBuku);
        System.out.println("Tahun Terbit: "+tahunTerbit);
        System.out.println("pengarang: "+pengarang);
        System.out.println("Stock: "+stock);
    }
}
