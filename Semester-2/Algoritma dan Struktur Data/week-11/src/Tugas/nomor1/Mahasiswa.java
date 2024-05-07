package Tugas.nomor1;

public class Mahasiswa {
    int NIM;
    String Nama;
    Mahasiswa next;

    Mahasiswa(int NIM, String Nama) {
        this.NIM = NIM;
        this.Nama = Nama;
        this.next = null;
    }
}
    