package Tugas.nomor2;

public class Main {
    public static void main(String[] args) {
        Queue queue = new Queue();

        queue.enqueue(111, "Anton");
        queue.enqueue(112, "Prita");
        queue.enqueue(113, "Yusuf");

        queue.print();

        System.out.println("Mengeluarkan 1 mahasiswa dari antrian");
        queue.dequeue();

        queue.print();
    }
}

