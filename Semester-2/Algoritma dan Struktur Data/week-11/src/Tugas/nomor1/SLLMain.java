package Tugas.nomor1;

public class SLLMain {
    public static void main(String[] args) {
        SingleLinkedList list = new SingleLinkedList();
        // menambahkan menggunakan 4 macam penambahan data
        list.addFirst(111, "Anton");
        list.addLast(112, "Prita");
        list.insertAfter("111", 113, "Yusuf");
        list.insertAt(2, 114, "Doni");
        list.insertAt(3, 115, "Sari");

        list.print();
    }
}
