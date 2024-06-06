public class Film18 {
    int id;
    String judul;
    double rating;
    Film18 prev, next;

    Film18(Film18 prev, int id, String judul, double rating, Film18 next) {
        this.prev = prev;
        this.id = id;
        this.judul = judul;
        this.rating = rating;
        this.next = next;
    }
}