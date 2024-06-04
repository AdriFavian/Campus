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
    - [DoubleLinkedListsMain.java](./src/doublelinkedlist/DoubleLinkedLists.java)
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
    - 

2. Perhatikan class Node, di dalamnya terdapat atribut next dan prev. Untuk apakah atribut tersebut?</br>
    **Jawab**:</br>
    - 

3. Perhatikan konstruktor pada class DoubleLinkedLists. Apa kegunaan inisialisasi atribut head dan size seperti pada gambar berikut ini?</br>
    **Jawab**:</br>
    - 

4. Pada method addFirst(), kenapa dalam pembuatan object dari konstruktor class Node prev dianggap sama dengan null? </br>
    ```java
    Node newNode = new Node(null, item, head);
    ```
    </br>
    **Jawab**:</br>
    -

5. Perhatikan pada method addFirst().  Apakah arti statement head.prev = newNode ?</br>
    **Jawab**:</br>
    - 

6. Perhatikan isi method addLast(), apa arti dari pembuatan object Node dengan mengisikan parameter prev dengan current, dan next dengan null?</br>
    ```java
    Node newNode = new Node(current, item, null); 
    ```
    </br>
    **Jawab**:</br>
    - 

7. Pada method add(), terdapat potongan kode program sebagai berikut: </br>
    ```java
     if (current.prev == null) {
                Node newNode = new Node(null, item, current);
                current.prev = newNode;
                head = newNode;
    ```
    </br>
    jelaskan maksud dari kode tersebut</br>
    **Jawab**:</br>
    - 

## Kegiatan Praktikum 2



