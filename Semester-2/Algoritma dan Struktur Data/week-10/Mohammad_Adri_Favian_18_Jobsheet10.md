# Week 10 - JOBSHEET 10 - QUEUE

**Nama :** Mohammad Adri Favian<br>
**NIM :** 2341720185<br>
**Kelas :** TI-1B<br>
**Absen :** 18

---
## Praktikum 1

### Langkah-langkah Percobaan

- Full program ada di [Queue.java](./src/Praktikum1/Queue.java) dan [QueueMain.java](./src/Praktikum1/QueueMain.java)

Output:

```powershell
    Masukkan kapasitas queue: 3
    Masukkan operasi yang diinginkan:
    1. Enqueue
    2. Dequeue
    3. Print
    4. Peek
    5. Clear
    ------------------
    input menu: 1
    Masukkan data baru: 15
    Masukkan operasi yang diinginkan:
    1. Enqueue
    2. Dequeue
    3. Print
    4. Peek
    5. Clear
    ------------------
    input menu: 1
    Masukkan data baru: 31
    Masukkan operasi yang diinginkan:
    1. Enqueue
    2. Dequeue
    3. Print
    4. Peek
    5. Clear
    ------------------
    input menu: 4
    ELemen terdepan: 15
```

### Pertanyaan

1. Pada konstruktor, mengapa nilai awal atribut front dan rear bernilai -1, sementara atribut size 
bernilai 0? </br>
**Jawab**:</br>
- Karena nilai -1 dan 0 pada setiap atribut tersebut digunakan untuk menandakan bahwa queue kosong.</br>

2. Pada method Enqueue, jelaskan maksud dan kegunaan dari potongan kode berikut!    
    ```java
    if (rear == max -1) {
        rear = 0;
    }
    ```

    **Jawab**:</br>
    - kode tersebut digunakan untuk mengatur nilai `rear` ke 0 ketika `rear` mencapai maksimum (`max -1`)
    - Hal ini dilakukan untuk memanfaatkan ruang yang tersedia di awal array.
    - Sehingga kita bisa memasukkan elemen baru ke array tanpa memerlukan ruang tambahan.

3. Pada method Dequeue, jelaskan maksud dan kegunaan dari potongan kode berikut! 
    ```java
    if (front == max -1) {
        front = 0;
    }
    ```

    **Jawab**:</br>
    - kode tersebut digunakan untuk mengatur nilai `front` ke 0 ketika `front` mencapai maksimum (`max -1`)
    - Hal ini dilakukan agar operasi dequeue dapat dilakukan kembali dari awal array, sehingga memaksimalkan penggunaan ruang

4. Pada method print, mengapa pada proses perulangan variabel i tidak dimulai dari 0 (int i=0), 
melainkan int i=front? 
    **Jawab**:</br>
    - Untuk memastikan bahwa elemen yang dicetak adalah elemen yang pertama kali masuk (`front`)
    - Hal ini dilakukan agar tidak ada elemen yang dicetak yang tidak ada di queue.

5. Perhatikan kembali method print, jelaskan maksud dari potongan kode berikut! 
    ```java
    i = (i + 1) % max;
    ```
    **Jawab**:</br>
    - Ketika indeks `i` mencapai nilai maksimum (`max-1`), operasi modulo (`% max`) akan mengembalikan `i` ke 0.
    - Hal ini dilakukan agar proses perulangan terus berlanjut dari awal sampai akhir.
    - Sehingga ketika proses pencetekan, dilakukan dari elemen terdepan sampai terakhir.

6. Tunjukkan potongan kode program yang merupakan queue overflow!
    **Jawab**:</br>
    - Potongan kode yang menunjukkan kondisi queue overflow adalah:
    ```java
    if (isFull()) {
            System.out.println("Queue sudah penuh!");
    ```

7. Pada saat terjadi queue overflow dan queue underflow, program tersebut tetap dapat berjalan 
dan hanya menampilkan teks informasi. Lakukan modifikasi program sehingga pada saat terjadi 
queue overflow dan queue underflow, program dihentikan! 

    **Jawab**:</br>
    - dengan menambahkan `System.exit(0);` pada kondisi queue overflow dan queue underflow
    - hal ini membuat program berhenti ketika terjadi queue overflow atau queue underflow

---
## Praktikum 2

### Langkah - langkah percobaan

- Full program ada di [NasabahMain.java](./src/Praktikum2/NasabahMain.java) dan [Nasabah.java](./src/Praktikum2/Nasabah.java)

Output:

```powershell
Masukkan kapasitas queue: 8
Daftar menu: 
1. Antrian baru
2. Antrian keluar
3. Cek antrian tedepan
4. Cek semua antrian
----------------------
Pilih menu: 1
No Rekening: 12345
Nama: Dewi
Alamat: Malang
Umur: 23
Saldo: 1300000
Daftar menu: 
1. Antrian baru
2. Antrian keluar
3. Cek antrian tedepan
4. Cek semua antrian
----------------------
Pilih menu: 1
No Rekening: 32940
Nama: Susan
Alamat: Surabaya
Umur: 39
Saldo: 42000000
Daftar menu:
1. Antrian baru
2. Antrian keluar
3. Cek antrian tedepan
4. Cek semua antrian
----------------------
Pilih menu: 4
12345 Dewi Malang 23 1300000.0
32940 Susan Surabaya 39 4.2E7
Jumlah elemen = 2
```

### Pertanyaan

1. Pada class QueueMain, jelaskan fungsi IF pada potongan kode program berikut! 
    ```java
    if (!"".equals(data.norek) && !"".equals(data.nama) && !"".equals(data.alamat)
            && data.umur != 0 && data.saldo != 0) {
        System.out.println("Antrian yang keluar: " + data.norek + " " + data.nama + " " 
            + data.alamat + " " + data.umur + " " + data.saldo);
        break;
    }
    ```
    **Jawab**:</br>
    - berfungsi untuk memeriksa apakah objek `data` dari tipe `Nasabah` memiliki semua atribut (tidak kosong)
    - Jika benar, maka informasi tersebut akan ditampilkan

2. Lakukan modifikasi program dengan menambahkan method baru bernama **peekRear** pada class 
Queue yang digunakan untuk mengecek antrian yang berada di posisi belakang! Tambahkan pula 
daftar menu **5. Cek Antrian paling belakang** pada class **QueueMain** sehingga method **peekRear** 
dapat dipanggil!
    **Jawab**:</br>

    - method **peekRear**:
    ```java
    public Nasabah peekRear() {
        if (isEmpty()) {
            System.out.println("Queue kosong!");
            return null;
        } else {
            return data[rear];
        }
    }
    ```

    - memanggil menu nomor 5:
    ```java
    case 5:
        Nasabah rearNasabah = antri.peekRear();
        if (rearNasabah != null) {
            System.out.println("Antrian paling belakang: " + rearNasabah.norek + " " 
            + rearNasabah.nama + " " + rearNasabah.alamat + " " + rearNasabah.umur 
            + " " + rearNasabah.saldo);
        }
        break;
    ```
    </br>
---
## Tugas

1. Buatlah program antrian untuk mengilustrasikan pesanan disebuah warung. Ketika seorang 
pembeli akan mengantri, maka dia harus mendaftarkan nama, dan nomor HP seperti yang 
digambarkan pada Class diagram berikut: 

Full program ada di package [Tugas](./src/Tugas):
- [Main.java](./src/Tugas/Main.java)
- [Pembeli.java](./src/Tugas/Pembeli.java)
- [Queue.java](./src/Tugas/Queue.java)

Output:

```powershell
Daftar Pembeli Warung:
1. Winarno - 8123456
2. Winardi - 8123457
3. Wateman - 8123458
4. Warno - 8123459
5. Eko - 8123460
Pembeli di depan: Winarno
Pembeli di belakang: Eko
----------------------------
menampilkan posisi pembeli berdasarkan nama
Adri tidak ditemukan dalam antrian!
Warno berada di posisi 4
----------------------------
Mengeluarkan 1 pembeli dari antrian
Daftar Pembeli Warung:
1. Winardi - 8123457
2. Wateman - 8123458
3. Warno - 8123459
4. Eko - 8123460
----------------------------
Menambahkan pembeli baru
Daftar Pembeli Warung:
1. Winardi - 8123457
2. Wateman - 8123458
3. Warno - 8123459
4. Eko - 8123460
5. Fajar - 8123461
```












