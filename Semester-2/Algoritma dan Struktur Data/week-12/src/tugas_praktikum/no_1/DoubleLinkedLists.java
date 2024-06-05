public class DoubleLinkedLists {
    Node head, tail;
    int size;

    public DoubleLinkedLists() {
        head = tail = null;
        size = 0;
    }

    public boolean isEmpty() {
        return head == null;
    }

    public void addLast(int nomorAntrian, String nama) {
        if (isEmpty()) {
            head = tail = new Node(null, nomorAntrian, nama, null);
        } else {
            Node newNode = new Node(tail, nomorAntrian, nama, null);
            tail.next = newNode;
            tail = newNode;
        }
        size++;
    }

    public void removeFirst() {
        if (isEmpty()) {
            System.out.println("Tidak ada pengantri yang bisa dihapus!");
        } else {
            System.out.println(head.nama + " telah selesai divaksinasi.");
            if (head.next == null) {
                head = tail = null;
            } else {
                head = head.next;
                head.prev = null;
            }
            size--;
        }
    }

    public void printQueue() {
        if (isEmpty()) {
            System.out.println("Tidak ada pengantri.");
        } else {
            Node current = head;
            System.out.println("+++++++++++++++++++++++");
            System.out.println("Daftar Pengantri Vaksin");
            System.out.println("+++++++++++++++++++++++");
            System.out.println("|No.   |Nama        |");
            while (current != null) {
                System.out.println("|" + current.nomorAntrian + "   |" + current.nama + "        |");
                current = current.next;
            }
            System.out.println("Sisa Antrian: " + size);
        }
    }
}