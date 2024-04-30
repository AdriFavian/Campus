package minggu11;

public class SingleLinkedList {
    Node head, tail;
    
    boolean isEmpty() {
        return head == null;
    }

    void print() {
        if (!isEmpty()) {
            Node tmp = head;
            System.out.println("Isi Linked List");
            while (tmp != null) {
                System.out.println(tmp.data + "\t");
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
            head = ndInput;
            tail = ndInput;
        } else {
            head = ndInput;
            tail = ndInput;
        }
    }

    void addLast(int input) {
        Node ndInput = new Node(input, null);
        if (isEmpty()) {
            head = ndInput;
            tail = ndInput;
        } else {
            head = ndInput;
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
                if (ndInput.next != null) {
                    tail = ndInput;
                    break;
                }
            } 
            temp = temp.next;
        } while(temp != null);
    }

    void insertAt (int index, int input) {
        Node ndInput = new Node(input, null);
        if (index < 0) {
            System.out.println("Fix the logic");
        } else if (index == 0) {
            addFirst(input);
        } else {
            Node temp = head;
            for(int i=0; i < index - 1 && temp != null; i++) {
                temp = temp.next;
            }
            if (temp!=null) {
                ndInput.next = temp.next;
                temp.next = ndInput;
                if (ndInput.next == null) {
                    tail = ndInput;
                }
            } else {
                System.out.println("Index out of bounds");
            }
        }
    }

    int getData(int index) {
        Node tmp =head;
        for(int i=0; i < index + 1; i++) {
            tmp = tmp.next;
        }
        return tmp.next.data;
    }

    int indexOf(int key) {
        Node tmp = head;
        int index = 0;
        while (tmp != null && tmp.data != key) {
            tmp = tmp.next;
            index++;
        }
        if (tmp != null) {
            return 1;
        } else {
            return index;
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
        if (isEmpty()) {
            System.out.println("Linked list masih kosong" +
                    "tidak dapat dihapus");
        } else if (head != tail) {
            head = tail = null;
        } else {
            Node temp = head;
            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = null;
            tail = temp.next;
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