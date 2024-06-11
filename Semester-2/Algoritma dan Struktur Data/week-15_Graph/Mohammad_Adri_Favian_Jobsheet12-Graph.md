# Week 15 - JOBSHEET 12 - Graph

**Nama :** Mohammad Adri Favian<br>
**NIM :** 2341720185<br>
**Kelas :** TI-1B<br>
**Absen :** 18

---

## Praktikum

### Percobaan 1: Implementasi Graph menggunakan Linked List

### Langkah-langkah Percobaan

- Full Kode Program
    - [Node18.java](./src/Node18.java)
    - [DoubleLinkedList18.java](./src/DoubleLinkedList18.java)
    - [Graph18.java](./src/Graph18.java)
    - [GraphMain18.java](./src/GraphMain18.java)

### Verifikasi Hasil Percobaan

- Hasil running pada langkah 14

    ```powershell
    InDegree dari Gedung A: 0
    OutDegree dari Gedung A: 2
    Degree dari Gedung A: 2
    Gedung A terhubung dengan
    C (100 m), B (50 m),
    Gedung B terhubung dengan
    D (70 m),
    Gedung C terhubung dengan
    D (40 m),
    Gedung D terhubung dengan
    E (60 m),
    Gedung E terhubung dengan
    F (80 m),
    ```

- Hasil running pada langkah 17

    ```powershell
    Gedung A terhubung dengan
    C (100 m), B (50 m),
    Gedung C terhubung dengan
    D (40 m),
    Gedung D terhubung dengan
    E (60 m),
    Gedung E terhubung dengan
    F (80 m),
    ```

### Pertanyaan

1. Perbaiki kode program Anda apabila terdapat error atau hasil kompilasi kode tidak sesuai!    
    **Jawab:**  
    - error pada method remove() di class `DoubleLinkedList18.java`.    
    - error: tidak mengurangi nilai size setelah penghapusan yang menyebabkan pesan error `Nilai indeks di luar batas` pada saat dijalankan.    

2. Pada class Graph, terdapat atribut list[] bertipe DoubleLinkedList. Sebutkan tujuan pembuatan    
variabel tersebut!  
    **Jawab:**  
    - iterasi melalui semua node dalam graf
    - jika node saat ini sama dengan tujuan yang ingin dihapus dari node asal,  
        maka menjalankan method `remove(tujuan)` pada list dari node asalnya.

3. Jelaskan alur kerja dari method **removeEdge**!  
    **Jawab:**  
    - method **removeEdge** digunakan untuk menghapus `edge` antara 2 node (vertex) dalam graf.
    - Alur kerja:
        - Method menerima dua parameter: asal (source) dan tujuan (destination).
        - Looping melalui setiap vertex di dalam graf.
        - Jika vertex saat ini sama dengan tujuan, maka:
            - Memanggil method remove pada daftar di list[asal] dengan parameter tujuan.
            - Method remove akan menghapus node yang berisi data sama dengan tujuan dari linked list yang terkait dengan vertex asal.
        - Jika vertex saat ini (i) tidak sama dengan tujuan, maka tidak melakukan tindakan apapun.

4. Apakah alasan pemanggilan method **addFirst()** untuk menambahkan data, bukan method add jenis lain saat digunakan pada method **addEdge** pada class Graph? 
    **Jawab:**  
    - Karena method `addFirst` lebih efisien dan sederhana dalam penggunaannya.
    - Method addFirst() menambahkan elemen baru di awal linked list.
    - lebih efisien dibandingkan metode lain seperti addLast() yang membutuhkan traversing seluruh list untuk menambahkan di akhir.

5. Modifikasi kode program sehingga dapat dilakukan pengecekan apakah terdapat jalur antara suatu node dengan node lainnya, seperti contoh berikut (Anda dapat memanfaatkan Scanner).
    ```powershell
    Masukkan gedung asal: 2
    Masukkan gedung tujuan: 3
    Gedung C dan D bertetangga

    Masukkan gedung asal: 2
    Masukkan gedung tujuan: 5
    Gedung C dan F tidak bertetangga
    ```

    **Jawab:**

    ```java
    public void pengecekanEdge(int asal, int tujuan) throws Exception {
        for (int i = 0; i < list[asal].size(); i++) {
            if (list[asal].get(i) == tujuan) {
                System.out.println("Gedung " + (char) ('A' + asal) + " dan " + (char) ('A' + tujuan) + " bertetangga");
            } else {
                System.out.println("Gedung " + (char) ('A' + asal) + " dan " + (char) ('A' + tujuan) + " tidak bertetangga");
            }
        }
    }
    ```

### Percobaan 2:  Implementasi Graph menggunakan Matriks

- Full Kode Program
    - [GraphMatriks18.java](./src/GraphMatriks18.java)
    - [GraphMain18.java](./src/GraphMain18.java)

### Verifikasi Hasil Percobaan

```powershell
Gedung A: Gedung A (0 m), Gedung B (50 m), Gedung C (0 m), Gedung D (0 m), 
Gedung B: Gedung A (60 m), Gedung B (0 m), Gedung C (70 m), Gedung D (0 m), 
Gedung C: Gedung A (0 m), Gedung B (80 m), Gedung C (0 m), Gedung D (40 m), 
Gedung D: Gedung A (90 m), Gedung B (0 m), Gedung C (0 m), Gedung D (0 m), 
Hasil setelah penghapusan edge
Gedung A: Gedung A (0 m), Gedung B (50 m), Gedung C (0 m), Gedung D (0 m), 
Gedung B: Gedung A (60 m), Gedung B (0 m), Gedung C (70 m), Gedung D (0 m), 
Gedung C: Gedung A (0 m), Gedung B (0 m), Gedung C (0 m), Gedung D (40 m), 
Gedung D: Gedung A (90 m), Gedung B (0 m), Gedung C (0 m), Gedung D (0 m), 
```

### Pertanyaan

1. Perbaiki kode program Anda apabila terdapat error atau hasil kompilasi kode tidak sesuai!    
    **Jawab:**
    ```java
      public void removeEdge(int asal, int tujuan) {
        matriks[asal][tujuan] = 0; //sebelumnya -1;
    }
    ```

2. Apa jenis graph yang digunakan pada Percobaan 2? 
    **Jawab:**
    - Adjacency Matrix karena menggunakan array 2 dimensi.

3. Apa maksud dari dua baris kode berikut?  
    ```java
    gdg.makeEdge(1, 2, 70);
    gdg.makeEdge(2, 1, 80);
    ```

    **Jawab:**  
    - membuat edge (node) dengan bobot nilainya dari ujung ke ujung.

4. Modifikasi kode program sehingga terdapat method untuk menghitung degree, termasuk inDegree dan outDegree!   
    **Jawab:**  

    ```java
        public void degree(int index) {
        int inDegree = 0, outDegree = 0;
        //in
        for (int i = 0; i < vertex; i++) {
            if (matriks[i][index] != 0) {
                inDegree++;
            }
        }
        //out
        for (int i = 0; i < vertex; i++) {
            if (matriks[index][i] != 0) {
                outDegree++;
            }
        }
        System.out.println("InDegree dari Gedung " + (char) ('A' + index) + ": " + inDegree);
        System.out.println("ouotDegree dari Gedung " + (char) ('A' + index) + ": " + outDegree);
        System.out.println("Degree dari Gedung " + (char) ('A' + index) + ": " + (inDegree + outDegree));
    }
    ```

    Output:

    ```powershell
    Gedung A: Gedung A (0 m), Gedung B (50 m), Gedung C (0 m), Gedung D (0 m),
    Gedung B: Gedung A (60 m), Gedung B (0 m), Gedung C (70 m), Gedung D (0 m),
    Gedung C: Gedung A (0 m), Gedung B (80 m), Gedung C (0 m), Gedung D (40 m),
    Gedung D: Gedung A (90 m), Gedung B (0 m), Gedung C (0 m), Gedung D (0 m),
    Hasil setelah penghapusan edge
    Gedung A: Gedung A (0 m), Gedung B (50 m), Gedung C (0 m), Gedung D (0 m),
    Gedung B: Gedung A (60 m), Gedung B (0 m), Gedung C (70 m), Gedung D (0 m),
    Gedung C: Gedung A (0 m), Gedung B (0 m), Gedung C (0 m), Gedung D (40 m),
    Gedung D: Gedung A (90 m), Gedung B (0 m), Gedung C (0 m), Gedung D (0 m),
    InDegree dari Gedung A: 2
    ouotDegree dari Gedung A: 1
    Degree dari Gedung A: 3
    ```

## Latihan Praktikum

1. Modifikasi kode program pada class GraphMain sehingga terdapat menu program yang bersifat 
dinamis, setidaknya terdiri dari: 
    - Add Edge 
    - Remove Edge 
    - Degree 
    - Print Graph 
    - Cek Edge 

    **Jawab:**

    ```java
    import java.util.Scanner;

    public class GraphMain18 {
        public static void menu() {
            System.out.println("Pilih menu: ");
            System.out.println("1. Tambah Edge");
            System.out.println("2. Hapus Edge");
            System.out.println("3. Degree");
            System.out.println("4. Tampilkan Graph");
            System.out.println("5. Periksa Edge");
            System.out.println("6. Keluar");
            System.out.println("=========================");
        }
        
        public static void main(String[] args) throws Exception {
            Scanner sc = new Scanner(System.in);
            int asal, tujuan, pilihMenu;
            Graph18 gedung = new Graph18(6);

            do {
                menu();
                pilihMenu = sc.nextInt();
                switch (pilihMenu) {
                    case 1:
                        System.out.println("Tambahkan lintasan antar gedung");
                        System.out.print("Masukkan indeks node (gedung) asal: ");
                        asal = sc.nextInt();
                        System.out.print("Masukkan indeks node (gedung) tujuan: ");
                        tujuan = sc.nextInt();
                        System.out.print("Masukkan jarak lintasan dari node asal ke node tujuan: ");
                        int jarak = sc.nextInt();
                        gedung.addEdge(asal, tujuan, jarak);
                        break;
                    case 2:
                        System.out.println("Hapus lintasan antar gedung");
                        System.out.print("Masukkan indeks node (gedung) asal: ");
                        asal = sc.nextInt();
                        System.out.print("Masukkan indeks node (gedung) tujuan: ");
                        tujuan = sc.nextInt();
                        gedung.removeEdge(asal, tujuan);
                        break;
                    case 3:
                        System.out.print("Masukkan indeks node yang ingin dicek degree-nya: ");
                        asal = sc.nextInt();
                        gedung.degree(asal);
                        break;
                    case 4:
                        System.out.println("Tampilkan semua node (gedung) yang ada pada graf:");
                        gedung.printGraph();
                        break;
                    case 5:
                        System.out.println("Periksa lintasan antar node (gedung)");
                        System.out.print("Masukkan indeks node asal: ");
                        asal = sc.nextInt();
                        System.out.print("Masukkan indeks node tujuan: ");
                        tujuan = sc.nextInt();
                        gedung.pengecekanEdge(asal, tujuan);
                        break;
                    case 6:
                        System.exit(0);
                        break;
                    default:
                        System.out.println("Pilihan tidak valid. Silakan pilih lagi.");
                }
            } while (pilihMenu != 6);
            sc.close();
        }
    }
    ```

2. Tambahkan method updateJarak pada Percobaan 1 yang digunakan untuk mengubah jarak antara dua node asal dan tujuan!   
    **Jawab:**

    ```java
    public void updateJarak(int asal, int tujuan, int jarak) throws Exception{
        boolean found = false;
        for (int i = 0; i < list[asal].size(); i++) {
            if (list[asal].get(i) == tujuan) {
                list[asal].updateJarak(i, jarak);
                found = true;
                break;
            }
        }
        if (found) {
            System.out.println("Berhasil diupdate");
        } else {
            System.out.println("Edge tidak ditemukan");
        }
    }
    ```

3. Tambahkan method hitungEdge untuk menghitung banyaknya edge yang terdapat di dalam graf!
    **Jawab:**

