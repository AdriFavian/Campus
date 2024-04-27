package src.Tugas;

public class Queue {
    Pembeli[] antrian;
    int front, rear, size, max;

    public Queue(int n) {
        max = n;
        antrian = new Pembeli[max];
        front = 0;
        rear = -1;
        size = 0;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public boolean isFull() {
        return size == max;
    }

    public void enqueue(Pembeli antri) {// menambahkan pembeli ke antrian
        if (!isFull()) {
            rear = (rear + 1) % max;
            antrian[rear] = antri;
            size++;
        } else {
            System.out.println("Antrian sudah penuh!");
        }
    }

    public Pembeli dequeue() {// mengeluarkan pembeli dari antrian
        if (!isEmpty()) {
            Pembeli temp = antrian[front];
            front = (front + 1) % max;
            size--;
            return temp;
        } else {
            System.out.println("Antrian kosong!");
            return null;
        }
    }

    public void peek() {// menampilkan pembeli di depan antrian
        if (!isEmpty()) {
            System.out.println("Pembeli di depan: " + antrian[front].nama);
        } else {
            System.out.println("Antrian kosong!");
        }
    }

    public void peekRear() {// menampilkan pembeli di belakang antrian
        if (!isEmpty()) {
            System.out.println("Pembeli di belakang: " + antrian[rear].nama);
        } else {
            System.out.println("Antrian kosong!");
        }
    }

    public void peekPosition(String namanya) {// menampilkan posisi pembeli berdasarkan nama
        for (int i = 0; i < size; i++) {
            int pos = (front + i) % max;
            if (antrian[pos].nama.equals(namanya)) {
                System.out.println(namanya + " berada di posisi " + (i + 1));
                return;
            }
        }
        System.out.println(namanya + " tidak ditemukan dalam antrian!");
    }

    public void daftarPembeli() {// menampilkan semua pembeli dalam antrian
        if (!isEmpty()) {
            System.out.println("Daftar Pembeli Warung:");
            for (int i = 0; i < size; i++) {
                int pos = (front + i) % max;
                System.out.println((i + 1) + ". " + antrian[pos].nama + " - " + antrian[pos].noHP);
            }
        } else {
            System.out.println("Antrian kosong!");
        }
    }
}