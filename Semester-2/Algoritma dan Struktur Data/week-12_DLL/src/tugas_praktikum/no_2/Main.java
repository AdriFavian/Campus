import java.util.Scanner;

public class Main {
    public static void menu() {
        System.out.println("===============================");
        System.out.println("DATA FILM LAYAR LEBAR");
        System.out.println("===============================");
        System.out.println("1. Tambah Data Awal");
        System.out.println("2. Tambah Data Akhir");
        System.out.println("3. Tambah Data Index Tertentu");
        System.out.println("4. Hapus Data Pertama");
        System.out.println("5. Hapus Data Terakhir");
        System.out.println("6. Hapus Data Tertentu");
        System.out.println("7. Cetak");
        System.out.println("8. Cari ID Film");
        System.out.println("9. Urut Data Rating Film-DESC");
        System.out.println("10. Keluar");
        System.out.println("===============================");
    } 
    public static void main(String[] args) throws Exception {
        Scanner sc1 = new Scanner(System.in);
        Scanner sc2 = new Scanner(System.in);
        int id, idx, pilih;
        double rating;
        String judul;

        DLL listFilm = new DLL();

        do {
            menu();
            pilih = sc1.nextShort();
            switch (pilih) {
                case 1:
                    System.out.println("Masukkan Data Film Posisi Awal");
                    System.out.print("ID FIlm: ");
                        id = sc1.nextInt();
                    System.out.print("Judul Film: ");
                        judul = sc2.nextLine();
                    System.out.print("Rating FIlm: ");
                        rating = sc1.nextDouble();
                    listFilm.addFirst(id, judul, rating);
                    break;
                case 2:
                    System.out.println("Masukkan Data Film Posisi Akhir");
                    System.out.print("ID FIlm: ");
                        id = sc1.nextInt();
                    System.out.print("Judul Film: ");
                        judul = sc2.nextLine();
                    System.out.print("Rating FIlm: ");
                        rating = sc1.nextDouble();
                    listFilm.addLast(id, judul, rating);
                    break;
                case 3:
                    System.out.println("Masukkan Data Film");
                    System.out.print("Urutan ke- ");
                        idx = sc1.nextInt();
                    System.out.print("ID FIlm: ");
                        id = sc1.nextInt();
                    System.out.print("Judul Film: ");
                        judul = sc2.nextLine();
                    System.out.print("Rating FIlm: ");
                        rating = sc1.nextDouble();
                    listFilm.add(id, judul, rating, idx);
                    System.out.println("Data Film ini akan masuk di urutan ke-" + idx);
                    break;
                case 4:
                    listFilm.removeFirst();
                    break;
                case 5:
                    listFilm.removeLast();
                    break;
                case 6:
                    System.out.print("Masukkan Urutan Data Film yang ingin dihapus");
                        idx = sc1.nextInt();
                    listFilm.remove(idx);
                    break;
                case 7:
                    System.out.println("Cetak Data");
                    listFilm.print();
                    break;
                case 8:
                    System.out.print("Masukkan ID Film yang Anda cari");
                        int idDicari = sc1.nextInt();
                    Film18 found = listFilm.cariFilm(idDicari);
                    int posisi = listFilm.cariPosisi(idDicari);
                    if (found != null) {
                        System.out.println("Data Id Film: " + idDicari + " berada di node ke- " + posisi);
                        System.out.println("IDENTITAS");
                        System.out.println(" ID Film: " + found.id);
                        System.out.println(" Judul Film: " + found.judul);
                        System.out.println(" IMDB Rating: " + found.rating);
                    } else {
                        System.out.println("Film dengan ID " + idDicari + "tidak ada di dalam list!");
                    }
                    break;
                case 9:   
                    listFilm.sortDesc();
                    listFilm.print();
                    break;
                case 10:
                    System.exit(0);
                    break;
                default:
                    System.out.println("cek masukkan menu anda!");
                    break;
            }
        } while (pilih <= 10 && pilih > 0);
        sc1.close();
        sc2.close();
    } 
}