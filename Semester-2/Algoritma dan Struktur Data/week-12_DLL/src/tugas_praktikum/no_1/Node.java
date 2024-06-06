public class Node {
    int nomorAntrian;
    String nama;
    Node prev, next;

    Node(Node prev, int nomorAntrian, String nama, Node next) {
        this.prev = prev;
        this.nomorAntrian = nomorAntrian;
        this.nama = nama;
        this.next = next;
    }
}