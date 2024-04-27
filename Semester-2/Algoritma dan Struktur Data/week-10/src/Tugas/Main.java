package src.Tugas;

public class Main {
    public static void main(String[] args) {
        Queue queue = new Queue(5); // kapasitas antrian = 5

        // add pembeli
        queue.enqueue(new Pembeli("Winarno", 8123456));
        queue.enqueue(new Pembeli("Winardi", 8123457));
        queue.enqueue(new Pembeli("Wateman", 8123458));
        queue.enqueue(new Pembeli("Warno", 8123459));
        queue.enqueue(new Pembeli("Eko", 8123460));

        // semua pembeli dalam antrian
        queue.daftarPembeli();

        // pembeli di depan dan di belakang antrian
        queue.peek();
        queue.peekRear();
        System.out.println("----------------------------");

        System.out.println("menampilkan posisi pembeli berdasarkan nama");
        queue.peekPosition("Adri");
        queue.peekPosition("Warno");
        System.out.println("----------------------------");
        
        System.out.println("Mengeluarkan 1 pembeli dari antrian");
        queue.dequeue();
        queue.daftarPembeli();
        System.out.println("----------------------------");

        System.out.println("Menambahkan pembeli baru");
        queue.enqueue(new Pembeli("Fajar", 8123461));
        queue.daftarPembeli();
    }
}