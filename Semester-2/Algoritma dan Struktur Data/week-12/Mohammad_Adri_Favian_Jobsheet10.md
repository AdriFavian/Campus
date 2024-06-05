# Week 12 - JOBSHEET 10 - Double Linked List

**Nama :** Mohammad Adri Favian<br>
**NIM :** 2341720185<br>
**Kelas :** TI-1B<br>
**Absen :** 18

---
## Kegiatan Praktikum 1

### Percobaan 1

- Full Program
    - [Node.java](./src/doublelinkedlist/Node.java)
    - [DoubleLinkedLists.java](./src/doublelinkedlist/DoubleLinkedLists.java)
    - [DoubleLinkedListsMain.java](./src/doublelinkedlist/DoubleLinkedListsMain.java)

### Verifikasi Hasil Percobaan

```java
Linked Lists kosong
Size : 0
======================================
7       3       4
berhasil diisi
Size : 3
======================================
7       40      3       4
berhasil diisi
Size : 4
======================================
Linked Lists kosong
Size : 0
======================================
```

### Pertanyaan Percobaan

1. Jelaskan perbedaan antara single linked list dengan double linked lists!</br>
    **Jawab**:</br>
    - perbedaan terletak pada pointernya. Pada single linked list pointer hanya ada 1, yaitu next. Merujuk ke node selanjutnya
    - Pada double linked list terdapat 2 pointer, yaitu next dan previous. Merujuk node selanjutnya dan sebelum node.

2. Perhatikan class Node, di dalamnya terdapat atribut next dan prev. Untuk apakah atribut tersebut?</br>
    **Jawab**:</br>
    - digunakan untuk menghubungkan node sekarang (current) dengan node sebelumnya (prev), ke node selanjutnya (next).

3. Perhatikan konstruktor pada class DoubleLinkedLists. Apa kegunaan inisialisasi atribut head dan size seperti pada kode berikut ini?</br>
    ```java
        public DoubleLinkedLists() {
        head = null;
        size = 0;
    }
    ```

    **Jawab**:</br>
    - untuk mengatur kondisi awal dari pembuatan double linked lists
    - diberi nilai null pada head dan size = 0 dikarenakan double linked lists memang masih kosong saat pertama kali dibuat.

4. Pada method addFirst(), kenapa dalam pembuatan object dari konstruktor class Node prev dianggap sama dengan null? </br>
    ```java
    Node newNode = new Node(null, item, head);
    ```
    
    **Jawab**:</br>
    - Dikarenakan pada node baru yang disisipkan pada posisi pertama akan menjadi head baru, dimana tidak ada node yang dapat dirujuk sebagai node sebelumnya, sehingga prev berisi null.

5. Perhatikan pada method addFirst().  Apakah arti statement head.prev = newNode ?</br>
    **Jawab**:</br>
    - prev dari head yang lama akan merujuk ke node yang baru yaitu node yang disisipkan di posisi pertama yang menjadi head baru pada double linkes lists.

6. Perhatikan isi method addLast(), apa arti dari pembuatan object Node dengan mengisikan parameter prev dengan current, dan next dengan null?</br>
    ```java
    Node newNode = new Node(current, item, null); 
    ```
    
    **Jawab**:</br>
    - parameter prev diisi current: agar pointer prev dari tail yang baru dari double linked lists ini merujuk ke tail yang lama yaitu current.
    - parameter next diisi null: karena tail baru ini tidak merujuk ke node lain karena diposisikam di akhir di double linked lists.

7. Pada method add(), terdapat potongan kode program sebagai berikut: </br>
    ```java
     if (current.prev == null) {
        Node newNode = new Node(null, item, current);
        current.prev = newNode;
        head = newNode;
    ```
    
    jelaskan maksud dari kode tersebut</br>
    **Jawab**:</br>
    - `if (current.prev == null)`: mengecek apakah node saat ini (current) adalah head saat ini pada list, pointer prev merujuk ke node sebelumnya. Jika current.prev = null, ini berarti tidak ada node sebelum current, sehingga menjadikan sebagai head.
    - `Node newNode = new Node(null, item, current)`: membuat node baru, parameter prev diisi null, karena ini akan menjadi kepala baru (tidak ada node sebelumnya), parameter next diisi current, karena node baru disisipkan sebelum head saat ini.
    - `current.prev = newNode`: dikarenakan current sekarang menjadi node, pointer prev diupdate menjadi merujuk ke newNode yang baru dibuat.
    - `head = newNode`: head diupdate merujuk ke newNode.

## Kegiatan Praktikum 2

### Tahapan Percobaan

- Menambahkan method baru di class DoubleLinkedLists:
    - removeFirst()
    - removeLast()
    - remove(int index)
    </br>
Kode Program diupdate: [DoubleLinkedLists.java](./src/doublelinkedlist/DoubleLinkedLists.java)

- Tambahan di class Main: [DoubleLinkedListsMain.java](./src/doublelinkedlist/DoubleLinkedListsMain.java)

### Verifikasi Hasil Percobaan

```java
50      40      10      20
berhasil diisi
Size : 4
======================================
40      10      20
berhasil diisi
Size : 3
======================================
40      10
berhasil diisi
Size : 2
======================================
40
berhasil diisi
Size : 1
```

### Pertanyaan Percobaan

1. Apakah maksud statement berikut pada method removeFirst()?</br>
    ```java
    head = head.next; 
    head.prev = null; 
    ```
    
    **Jawab**:</br>
     - `head=head.next`: memindahkan pointer head dari node saat ini ke node setelahnya.
    - `head.prev = null`: pointer prev dari node baru bernilai null, sehingga tidak merujuk lagi ke head yang lama 


2. Bagaimana cara mendeteksi posisi data ada pada bagian akhir pada method removeLast()?</br>
    **Jawab**:</br>
    - dilakukan dengan cara mengecek pointer next dari posisi node saat ini. Jika next nya bernilai null, maka node tersebut ada pada posisi terakhir.
    - Pengecekan dimulai dari head. Jika next dari head null, berarti head adalah elemen awal dan akhir. Jika tidak, head dimasukkan ke current dan current berpindah ke node selanjutnya sampai ditemukan current.next == null, yang menandakan posisi current sudah berada di akhir linked list.

3. Jelaskan alasan potongan kode program di bawah ini tidak cocok untuk perintah remove!</br>
    ```java
    Node tmp = head.next;
    head.next=tmp.next;
    tmp.next.prev=head;
    ```
    
    **Jawab**:</br>
    - Kode tersebut hanya bekerja untuk menghapus node kedua (setelah node head), bukan untuk node dengan indeks tertentu.

4. Jelaskan fungsi kode program berikut ini pada fungsi remove!</br>
    ```java
    current.prev.next = current.next;
    current.next.prev = current.prev;
    ```
    
    **Jawab**:</br>
    - berfungsi untuk menghapus node current dari double linked lists.
    - Kode ini memutus node current dari daftar dua arah dengan:
        - Menghubungkan node sebelumnya (prev) dari current ke node berikutnya (next) dari current, melewati current.
        - Menghubungkan node berikutnya (next) dari current ke node sebelumnya (prev) dari current, juga melewati current.

## Kegiatan Praktikum 3

### Tahapan Percobaan

- Menambahkan method baru di class DoubleLinkedLists:
    - getFirst()
    - getLast()
    - get(int index)
    </br>
Kode Program diupdate: [DoubleLinkedLists.java](./src/doublelinkedlist/DoubleLinkedLists.java)

- Tambahan di class Main: [DoubleLinkedListsMain.java](./src/doublelinkedlist/DoubleLinkedListsMain.java)

### Verifikasi Hasil Percobaan

```java
Linked Lists kosong
Size : 0
======================================
7       3       4
berhasil diisi
Size : 3
======================================
7       40      3       4
berhasil diisi
Size : 4
======================================
Data awal pada Linked Lists adalah 7
Data akhir pada Linked Lists adalah 4
Data indeks ke-1 pada Linked Lists adalah 40
```
### Pertanyaan Percobaan

1. Jelaskan method size() pada class DoubleLinkedLists! </br>
    **Jawab**:</br>
    - method sederhana yang mengembalikan nilai ukuran (jumlah elemen) dari double linked list.

2. Jelaskan cara mengatur indeks pada double linked lists supaya dapat dimulai dari indeks ke-1! </br>
    **Jawab**:</br>
    -  dengan mengisi nilai awal variabel counter index menjadi 1 yang semula adalah 0.

    ```java
    Node current = head;
    int i = 1; //sebelumnya 0
    while (i<index) {
        current = current.next;
        i++;
    }
    ```

3. Jelaskan perbedaan karakteristik fungsi Add pada Double Linked Lists dan Single Linked Lists!</br>
    **Jawab**:</br>
    Perbedaan utama terletak pada pengelolaan referensi node sebelumnya (prev):

    - Double Linked Lists:</br>
        - Setiap node memiliki dua referensi: prev dan next.
        - Kita harus mengatur kedua referensi ini saat menambahkan node baru, baik di awal, tengah, maupun akhir. 

    - Single Linked Lists:</br>
        - Setiap node hanya memiliki satu referensi: next.
        - Kita hanya perlu mengatur referensi next dari node sebelumnya dan node yang ditambahkan saat menambahkan node baru
        - lebih sederhana

4.  Jelaskan perbedaan logika dari kedua kode program di bawah ini! </br>
    ```java
    // kode pertama
    public boolean isEmpty() {
    if (size == 0) {
    return true;
    } else {
    return false;
    }
    }
    ```
    ```java
    // kode kedua
    public boolean isEmpty() {
    return head == null;
    }
    ```

    **Jawab**:</br>
    - Kedua kode tersebut memiliki tujuan yang sama, yaitu untuk memeriksa apakah linked list kosong atau tidak.
    - perbedaan logika:
        - kode pertama: Bergantung pada atribut `size` untuk menentukan apakah linked list kosong.
        - kode kedua: Bergantung pada atribut `head` untuk menentukan apakah linked list kosong.
        - kode pertama: Lebih rentan terhadap kesalahan jika ada bug dalam pengelolaan `size`. Misalnya, jika ada operasi penambahan atau penghapusan yang tidak mengupdate `size` dengan benar, hasil dari `isEmpty()` bisa salah.
        - kode kedua: Lebih langsung, karena hanya memeriksa apakah `head` menunjuk ke `node`. Jika linked list kosong, `head` selalu `null`.


## Tugas Praktikum
Buat program antrian vaksinasi menggunakan queue berbasis double linked list sesuai ilustrasi 
dan menu di bawah ini! (counter jumlah antrian tersisa di menu cetak(3) dan data orang yang 
telah divaksinasi di menu Hapus Data(2) harus ada)  

- Full Program
    - [Node.java](./src/tugas_praktikum/no_1/Node.java)
    - [VaksinasiMain.java](./src/tugas_praktikum/no_1/VaksinasiMain.java)
    - [DoubleLinkedLists.java](./src/tugas_praktikum/no_1/DoubleLinkedLists.java)

Output:
- Menu Awal dan Penambahan Data 

```go
+++++++++++++++++++++++++++++
PENGANTRI VAKSIN EXTRAVAGANZA
+++++++++++++++++++++++++++++
1. Tambah Data Penerima Vaksin
2. Hapus Data Pengantri Vaksin
3. Daftar Penerima Vaksin
4. Keluar
+++++++++++++++++++++++++++++
1
-----------------------------
Masukkan Data Penerima Vaksin
-----------------------------
Nomor Antrian: 123
Nama Penerima: Joko
```

- Cetak Data

```powershell
+++++++++++++++++++++++++++++
PENGANTRI VAKSIN EXTRAVAGANZA
+++++++++++++++++++++++++++++
1. Tambah Data Penerima Vaksin
2. Hapus Data Pengantri Vaksin
3. Daftar Penerima Vaksin
4. Keluar
+++++++++++++++++++++++++++++
3
+++++++++++++++++++++++
Daftar Pengantri Vaksin
+++++++++++++++++++++++
|No.   |Nama        |
|123   |Joko        |
|124   |Mely        |
|135   |Johan        |
|146   |Rosi        |
Sisa Antrian: 4
```

- Hapus Data

```powershell
+++++++++++++++++++++++++++++
PENGANTRI VAKSIN EXTRAVAGANZA
+++++++++++++++++++++++++++++
1. Tambah Data Penerima Vaksin
2. Hapus Data Pengantri Vaksin
3. Daftar Penerima Vaksin
4. Keluar
+++++++++++++++++++++++++++++
2
Joko telah selesai divaksinasi.
```
```powershell
+++++++++++++++++++++++
Daftar Pengantri Vaksin
+++++++++++++++++++++++
|No.   |Nama        |
|124   |Mely        |
|135   |Johan        |
|146   |Rosi        |
Sisa Antrian: 3
```
</br>
</br>

Buatlah program daftar film yang terdiri dari id, judul dan rating menggunakan double linked 
lists, bentuk program memiliki fitur pencarian melalui ID Film dan pengurutan Rating secara 
descending. Class Film wajib diimplementasikan dalam soal ini. 