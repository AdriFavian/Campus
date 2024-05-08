# Week 11 - JOBSHEET 9 - Linked List

**Nama :** Mohammad Adri Favian<br>
**NIM :** 2341720185<br>
**Kelas :** TI-1B<br>
**Absen :** 18

---
## Praktikum - Pembuatan Single Linked List

### Langkah-langkah Percobaan

- Full Program
    - [Node.java](./src/minggu11/Node.java)
    - [SingleLinkedList.java](./src/minggu11/SingleLinkedList.java)
    - [SLLMain.java](./src/minggu11/SLLMain.java)

### Verifikasi Hasil Percobaan

```powershell
Linked list kosong
Isi Linked List:        890
Isi Linked List:        890     760
Isi Linked List:        700     890     760
Isi Linked List:        700     999     890     760
Isi Linked List:        700     999     890     833     760
```

### Pertanyaan

1. Mengapa hasil compile kode program di baris pertama menghasilkan “Linked List Kosong”?</br>
    **Jawab**:</br>
    - Karena saat awal program dijalankan linked list masih tidak memiliki elemen. Sehingga menghasilkan output linked list kosong.
    
2. Jelaskan kegunaan variable temp secara umum pada setiap method! </br>
    **Jawab**:</br>
    - digunakan sebagai referensi sementara (pointer) untuk navigasi / manipulasi linked list, sehingga tidak mengganggu strukturnya.

3. Perhatikan class SingleLinkedList, pada method insertAt Jelaskan kegunaan kode berikut  

    ```java
    if(temp.next.next==null) tail=temp.next;
    ```

    **Jawab**:</br>
    - digunakan untuk mengupdate pointer `tail` dari linked list. Jika `temp.next.next` adalah null, maka ia adalah node terakhir.

---

##  Modifikasi Elemen pada Single Linked List 

### Langkah-langkah Percobaan

- Full Program
    - [Node.java](./src/minggu11/Node.java)
    - [SingleLinkedList.java](./src/minggu11/SingleLinkedList.java)
    - [SLLMain.java](./src/minggu11/SLLMain.java)

### Verifikasi Hasil Percobaan

```powershell
Linked list kosong
Isi Linked List:        890
Isi Linked List:        890     760
Isi Linked List:        700     890     760
Isi Linked List:        700     999     890     760
Isi Linked List:        700     999     890     833     760
Data pada indeks ke-1=999
Data 3 berada pada indeks ke-4
Isi Linked List:        999     890     833     760
Isi Linked List:        890     833     760
Isi Linked List:        833     760
Isi Linked List:        833
```

### Pertanyaan

1. Mengapa digunakan keyword break pada fungsi remove? Jelaskan! </br>
    **Jawab**:</br>
    - untuk menghentikan iterasi setelah menghapus node yang sesuai dengan key

2. Jelaskan kegunaan kode dibawah pada method remove
    ```java
    else if(temp.next.data == key) {
    temp.next = temp.next.next;
    ```
    **Jawab**:</br>
    - untuk menghapus node yang memiliki data yang sesuai dengan `key`
    - dengan cara mengubah referensi `next` dari node sebelumnya (yang disimpan dalam `temp`)
    - sehingga langsung mengarah ke node berikutnya (yang akan dihapus).

---

## Tugas

1. Implementasikan ilustrasi Linked List Berikut. Gunakan 4 macam penambahan data yang telah 
dipelajari sebelumnya untuk menginputkan data. 

- Full Program
    - [Mahasiswa.java](./src/Tugas/nomor1/Mahasiswa.java)
    - [SingleLinkedList.java](./src/Tugas/nomor1/SingleLinkedList.java)
    - [SLLMain.java](./src/Tugas/nomor1/SLLMain.java)

    Output:</br>
        - menggunakan metode addFirst, addLast, insertAfter, dan insertAt

    ```powershell
    Isi Linked List:
    NIM: 111, Nama: Anton
    NIM: 113, Nama: Yusuf
    NIM: 114, Nama: Doni
    NIM: 115, Nama: Sari
    NIM: 112, Nama: Prita
    ```

2. Buatlah implementasi program antrian layanan unit kemahasiswaan sesuai dengan kondisi yang 
ditunjukkan pada soal nomor 1! Ketentuan 
a. Implementasi antrian menggunakan Queue berbasis Linked List! 
b. Program merupakan proyek baru, bukan modifikasi dari soal nomor 1!

- Full Program
    - [Mahasiswa.java](./src/Tugas/nomor2/Mahasiswa.java)
    - [Main.java](./src/Tugas/nomor2/Main.java)
    - [Queue.java](./src/Tugas/nomor2/Queue.java)

- Output:

```powershell
Isi Queue:
NIM: 111, Nama: Anton
NIM: 112, Nama: Prita
NIM: 113, Nama: Yusuf
Mengeluarkan 1 mahasiswa dari antrian
Isi Queue:
NIM: 112, Nama: Prita
NIM: 113, Nama: Yusuf
```

