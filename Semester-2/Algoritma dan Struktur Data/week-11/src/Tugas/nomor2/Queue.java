package Tugas.nomor2;

public class Queue {
    Mahasiswa front, rear;

    boolean isEmpty() {
        return front == null;
    }

    void enqueue(int NIM, String Nama) {
        Mahasiswa newMahasiswa = new Mahasiswa(NIM, Nama);
        if (isEmpty()) {
            front = rear = newMahasiswa;
        } else {
            rear.next = newMahasiswa;
            rear = newMahasiswa;
        }
    }

    Mahasiswa dequeue() {
        if (isEmpty()) {
            System.out.println("Queue masih kosong!");
            return null;
        }
        Mahasiswa temp = front;
        front = front.next;
        if (front == null) {
            rear = null;
        }
        return temp;
    }

    void print() {
        if (isEmpty()) {
            System.out.println("Queue masih kosong!");
        } else {
            Mahasiswa temp = front;
            System.out.println("Isi Queue:");
            while (temp != null) {
                System.out.println("NIM: " + temp.NIM + ", Nama: " + temp.Nama);
                temp = temp.next;
            }
        }
    }
}
