package Tugas.nomor1;

public class SingleLinkedList {
    Mahasiswa head, tail;

    boolean isEmpty() {
        return head == null;
    }

    void print() {
        if (!isEmpty()) {
            Mahasiswa tmp = head;
            System.out.println("Isi Linked List:");
            while (tmp != null) {
                System.out.println("NIM: " + tmp.NIM + ", Nama: " + tmp.Nama);
                tmp = tmp.next;
            }
        } else {
            System.out.println("Linked list kosong!");
        }
    }

    void addFirst(int NIM, String Nama) {
        Mahasiswa mhs = new Mahasiswa(NIM, Nama);
        if (isEmpty()) {
            head = mhs; 
            tail = mhs;
        } else {
            mhs.next = head;
            head = mhs;
        }
    }
    
    void addLast(int NIM, String Nama) {
        Mahasiswa mhs = new Mahasiswa(NIM, Nama);
        if (isEmpty()) {
            head = mhs; 
            tail = mhs;
        } else {
            tail.next = mhs;
            tail = mhs;
        }
    }

    void insertAfter(String key, int newNIM, String newNama) {
        Mahasiswa mhs = new Mahasiswa(newNIM, newNama);
        Mahasiswa tmp = head;
        while (tmp != null) {
            if (String.valueOf(tmp.NIM).equals(key)) {
                mhs.next = tmp.next;
                tmp.next = mhs;
                if (mhs.next == null) {
                    tail = mhs;
                }
                break;
            }
            tmp = tmp.next;
        }
    }

    void insertAt(int index, int NIM, String Nama) {
        Mahasiswa mhs = new Mahasiswa(NIM, Nama);
        if (index < 0) {
            System.out.println("Indeks tidak valid!");
        } else if (index == 0) {
            addFirst(NIM, Nama);
        } else {
            Mahasiswa tmp = head;
            for (int i=0; i < index - 1; i++) {
                tmp = tmp.next;
            }
            mhs.next = tmp.next;
            tmp.next = mhs;
            if (mhs.next == null) {
                tail = mhs;
            }
        }
    }
}
