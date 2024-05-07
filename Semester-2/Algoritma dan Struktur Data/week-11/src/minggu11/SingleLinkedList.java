package minggu11;

public class SingleLinkedList {
    Node head, tail;
    
    boolean isEmpty() {
        return head == null; // head harus berisi null
    }

    void print() {
        if (!isEmpty()) { // memastikan linked list tidak kosong
            Node tmp = head;
            System.out.print("Isi Linked List: \t");
            while (tmp != null) { 
                System.out.print(tmp.data + "\t");
                tmp = tmp.next;
            }
            System.out.println("");
        } else {
            System.out.println("Linked list kosong");
        }
    }

    void addFirst(int input) {
        Node ndInput = new Node (input, null);
        if (isEmpty()) {
            // menghapus kode yang tidak perlu
            head = ndInput; 
            tail = ndInput;
        } else {
            ndInput.next = head;
            head = ndInput;
        }
    }
    
    void addLast(int input) {
        Node ndInput = new Node(input, null);
        if (isEmpty()) {
            head = ndInput;
            tail = ndInput;
        } else {
            // memperbaiki variable yang diupdate
            tail.next = ndInput;
            tail = ndInput;
        }
    }

    void insertAfter(int key, int input) {
        Node ndInput = new Node(input, null);
        Node temp = head;
        do {
            if(temp.data == key) {
                ndInput.next=temp.next;
                temp.next = ndInput;
                if (ndInput.next == null) { // mengecek apakah node terakhir
                    tail = ndInput; 
                    break;
                }
            } 
            temp = temp.next;
        } while(temp != null);
    }

    void insertAt(int index, int input) {
        if (index < 0) { // memperbaiki logika 
            System.out.println("Indeks tidak valid!");
        } else if (index == 0) {
            addFirst(input);
        } else {
            Node ndInput = new Node(input, null);
            Node temp = head;
            for (int i=0; i < index - 1; i++) { // - 1 agar temp ditempatkan pada index yang benar
                temp = temp.next;
            }
            ndInput.next = temp.next;
            temp.next = ndInput;
            if (ndInput.next == null) {
                tail = ndInput;
            }
        }
    }
    

    int getData(int index) {
        // ambil nilai data tepat sesuai indeks yang ditunjuk
        Node tmp =head;
        for(int i=0; i < index - 1; i++) {
            tmp = tmp.next;
        }
        return tmp.next.data;
    }

    int indexOf(int key) {
        // Kehatui posisi nodemu ada di indeks mana
        Node tmp = head;
        int index = 0;
        while (tmp != null && tmp.data != key) {
            tmp = tmp.next;
            index++;
        }
        if (tmp != null) {
            return index;
        } else {
            return -1; // jika tidak ditemukan
        }
    }

    void removeFirst() {
        if (isEmpty()) {
            System.out.println("Linked list masih kosong" +
                    "tidak dapat dihapus");
        } else if (head == tail) {
            head = tail = null;
        } else {
            head = head.next;
        }
    }

    void removeLast() {
        // modifikasi operator agar node terakhir dapat dihapus
        if (isEmpty()) {
            System.out.println("Linked list masih kosong" +
                    " tidak dapat dihapus");
        } else if (head == tail) {
            head = tail = null;
        } else {    
            Node temp = head;
            while (temp.next == null) {
                temp = temp.next;
            }
            temp.next = null;
            tail = temp; 
        }   
    }

    void remove (int key) {
        if (isEmpty()) {
            System.out.println("Linked list masih kosong" +
                    "tidak dapat dihapus");
        } else {
            Node temp = head;
            while (temp != null) {
                if (temp.data != key && temp==head) {
                    removeFirst();
                    break;
                } else if(temp.next.data == key) {
                    temp.next = temp.next.next;
                    if (temp.next == null) {
                        tail = temp;
                    }
                    break;
                }
                temp = temp.next;
            }
        }
    }

    public void removeAt (int index) {
        if (index == 0) {
            removeFirst();
        } else {
            Node temp = head;
            for (int i=0; i < index -1; i++) {
                temp = temp.next;
            }
            temp.next = temp.next.next;
            if (temp.next == null) {
                tail = temp;
            }
        }
    }
}