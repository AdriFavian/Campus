# Week 08 - JOBSHEET 7 - STACK

**Nama :** Mohammad Adri Favian<br>
**NIM :** 2341720185<br>
**Kelas :** TI-1B<br>
**Absen :** 18

---
## Percobaan 1: Penyimpanan Tumpukan Barang dalam Gudang

### Langkah-langkah Percobaan

`Barang18`

```java
public class Barang18 {
    int kode;
    String nama, kategori;

    public Barang18(int kode, String nama, String kategori) {
        this.kode = kode;
        this.nama = nama;
        this.kategori = kategori;
    }
}
```
</br>

`Gudang18`</br></br>
    - fix error: mengubah `isEmpty()` menjadi `cekKosong()` di method `lihatBarangTeratas()`.
    - fix error: mengubah perulangan untuk menampilkan barang di method `tampilkanBarang()` menjadi metode decreament.

```java
public class Gudang18 {
    Barang18[] tumpukan;
    int size, top;

    public Gudang18 (int kapasitas) {
        size = kapasitas;
        tumpukan = new Barang18[size];
        top = -1;
    }

    public boolean cekKosong() {
        if (top == -1) {
            return true;
        } else {
            return false;
        }
    }

    public boolean cekPenuh() {
        if (top == size -1) {
            return true;
        } else {
            return false;
        }
    }

    public void tambahBarang(Barang18 brg) {
        if (!cekPenuh()) {
            top++;
            tumpukan[top] = brg;
            System.out.println("Barang " + brg.nama + " berhasil ditambahkan ke Gudang");
        } else {
            System.out.println("Gagal! Tumpukan barang di Gudang sudah penuh");
        }
    }

    public Barang18 ambilBarang() {
        if (!cekKosong()) {
            Barang18 delete = tumpukan[top];
            top--;
            System.out.println("Barang " + delete.nama + " diambil dari Gudang.");
            return delete;
        } else {
            System.out.println("Tumpukan barang kosong.");
            return null;
        }
    }

    public Barang18 lihatBarangTeratas() {
        if (!cekKosong()) { //modifikasi
            Barang18 barangTeratas = tumpukan[top];
            System.out.println("Barang teratas: " + barangTeratas.nama);
            return barangTeratas;
        } else {
            System.out.println("Tumpukan barang kosong.");
            return null;
        }
    }

    public void tampilkanBarang() {
        if (!cekKosong()) {
            System.out.println("Rincian tumpukan barang di Gudang: ");
            for (int i = top; i >= 0; i--) { //modifikasi
                System.out.printf("Kode %d: %s (Kategori %s)\n", 
                    tumpukan[i].kode, tumpukan[i].nama, tumpukan[i].kategori);
            } 
        } else {
            System.out.println("Tumpukan barang kosong.");
        }
    }
}
```
</br>

`Utama18.java`</br></br>

    - fix error: mengubah `break` menjadi `return`, agar keluar dari program.

```java
import java.util.Scanner;
public class Utama18 {
    public static void main(String[] args) {
        Gudang18 gudang = new Gudang18(7);
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("\nMenu:");
            System.out.println("1. Tambah barang");
            System.out.println("2. Ambil barang");
            System.out.println("3. Tampilkan tumpukan barang");
            System.out.println("4. Keluar");
            System.out.print( "Pilih operasi: ");
            int pilihan = sc.nextInt(); 
            sc.nextLine();

            switch (pilihan) {
                case 1:
                    System.out.print( "Masukkan kode barang: ");
                    int kode = sc.nextInt();
                    sc.nextLine();
                    System.out.print( "Masukkan nama barang: ");
                    String nama = sc.nextLine();
                    System.out.print( "Masukkan nama kategori: ");
                    String kategori = sc.nextLine();
                    Barang18 barangBaru = new Barang18 (kode, nama, kategori); 
                    gudang.tambahBarang (barangBaru);
                    break;
                case 2:
                    gudang.ambilBarang();
                    break;
                case 3:
                    gudang.tampilkanBarang();
                    break;
                case 4:
                    System.out.println("\nKeluar dari program.");
                    return;
                default:
                    System.out.println("Pilihan tidak valid. Silahkan coba lagi :)");
            }
        }
    }
}
```
</br>
    
### Verifikasi Hasil Percobaan

`Output`:

```txt
Menu:
1. Tambah barang
2. Ambil barang
3. Tampilkan tumpukan barang
4. Keluar
Pilih operasi: 1
Masukkan kode barang: 21
Masukkan nama barang: Majalah
Masukkan nama kategori: Buku
Barang Majalah berhasil ditambahkan ke Gudang

Menu:
1. Tambah barang
2. Ambil barang
3. Tampilkan tumpukan barang
4. Keluar
Pilih operasi: 1
Masukkan kode barang: 26
Masukkan nama barang: Jaket
Masukkan nama kategori: Pakaian
Barang Jaket berhasil ditambahkan ke Gudang

Menu:
1. Tambah barang
2. Ambil barang
3. Tampilkan tumpukan barang
4. Keluar
Pilih operasi: 2
Barang Jaket diambil dari Gudang.

Menu:
1. Tambah barang
2. Ambil barang
3. Tampilkan tumpukan barang
4. Keluar
Pilih operasi: 1
Masukkan kode barang: 33
Masukkan nama barang: Pizza
Masukkan nama kategori: Makanan
Barang Pizza berhasil ditambahkan ke Gudang

Menu:
1. Tambah barang
2. Ambil barang
3. Tampilkan tumpukan barang
4. Keluar
Pilih operasi: 3
Rincian tumpukan barang di Gudang:
Kode 33: Pizza (Kategori Makanan)
Kode 21: Majalah (Kategori Buku)
```
</br></br>
**Pertanyaan**

1. Lakukan perbaikan pada kode program, sehingga keluaran yang dihasilkan sama dengan verifikasi
hasil percobaan! Bagian mana saja yang perlu diperbaiki?</br>
    **Jawab**:</br>
    - mengubah `isEmpty()` menjadi `cekKosong()` di method `lihatBarangTeratas()`. 
        ```java
        public Barang18 lihatBarangTeratas() {
        if (!cekKosong()) { // disini
            Barang18 barangTeratas = tumpukan[top];
            System.out.println("Barang teratas: " + barangTeratas.nama);
            return barangTeratas;
        } else {
        ```
        </br>
    - mengubah perulangan untuk menampilkan barang di method `tampilkanBarang()` menjadi metode decreament.
        ```java
        public void tampilkanBarang() {
        if (!cekKosong()) {
            System.out.println("Rincian tumpukan barang di Gudang: ");
            for (int i = top; i >= 0; i--) { //disini
                System.out.printf("Kode %d: %s (Kategori %s)\n", 
                    tumpukan[i].kode, tumpukan[i].nama, tumpukan[i].kategori);
            } 
        } else
        ```
        </br>

2. Berapa banyak data barang yang dapat ditampung di dalam tumpukan? Tunjukkan potongan kode
programnya!</br>
    **Jawab**:</br>
    - data barang yang dapat ditampung di dalam tumpukan dintentukan oleh kapasitas awal yang terdapat pada konstruktor berparameter ini di class `Gudang18`

        ```java
        public Gudang18 (int kapasitas) {
            size = kapasitas;
            tumpukan = new Barang18[size];
            top = -1;
        }
        ```
    </br>

3. Mengapa perlu pengecekan kondisi !cekKosong() pada method tampilkanBarang? Kalau kondisi
tersebut dihapus, apa dampaknya?</br>
    **Jawab**:</br>
    - pengecekan kondisi tersebut digunakan untuk memastikan bahwa ada barang yang berada dalam tumpukan, dikarenakan kita ingin menampilkan data barang.
    - jika tumpukan barang kosong, maka program menampilkan pesan bahwa tumpukan sedang kosong. 
    - jika kondisi tersebut dihapus maka akan berdampak pada outpum program, dimana data yang ditampilkan adalah tidak ada, sehingga dapat membingungkan penggunanya.
    </br>

4. Modifikasi kode program pada class Utama sehingga pengguna juga dapat memilih operasi lihat
barang teratas, serta dapat secara bebas menentukan kapasitas gudang!</br>
    **Jawab**:</br>
    - menambahkan menu baru di opsi 4 `lihatBarangTeratas()`
    ```java
     while (true) {
            System.out.println("\nMenu:");
            System.out.println("1. Tambah barang");
            System.out.println("2. Ambil barang");
            System.out.println("3. Tampilkan tumpukan barang");
            System.out.println("4. Lihat barang teratas");
            System.out.println("5. Keluar");
            System.out.print( "Pilih operasi: ");
            int pilihan = sc.nextInt(); 
            sc.nextLine();
    ```

    ```java
     case 4:
        gudang.lihatBarangTeratas();
        break;
    ```
    </br>

    - menambahkan inputan agar pengguna dapat menentukan kapasitas gudang</br>
    ```java
    public static void main(String[] args) {
        // Gudang18 gudang = new Gudang18(7);
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan kapasitas gudang: ");
        int kapasitas = sc.nextInt();
        Gudang18 gudang = new Gudang18(kapasitas);
    ```
    </br>
    
    - Full program [klik ini (Utama18.java)](./src/Utama18.java) dan [(Gudang18.java)](./src/Gudang18.java)

    - Output:
    ```txt
    Masukkan kapasitas gudang: 1

    Menu:
    1. Tambah barang
    2. Ambil barang
    3. Tampilkan tumpukan barang
    4. Lihat barang teratas
    5. Keluar
    Pilih operasi: 1
    Masukkan kode barang: 3
    Masukkan nama barang: adri
    Masukkan nama kategori: halo
    Barang adri berhasil ditambahkan ke Gudang

    Menu:
    1. Tambah barang
    2. Ambil barang
    3. Tampilkan tumpukan barang
    4. Lihat barang teratas
    5. Keluar
    Pilih operasi: 4
    Barang teratas: adri
    ```

</br></br>  
---
## Percobaan 2: Konversi Kode Barang ke Biner
### Langkah-langkah Percobaan 

membuat file `StackKonversi18.java`

- Full program [klik ini (StackKonversi18.java)](./src/StackKonversi18.java) 

### Verifikasi Hasil Percobaan

```txt
Masukkan kapasitas gudang: 1

Menu:
1. Tambah barang
2. Ambil barang
3. Tampilkan tumpukan barang
4. Lihat barang teratas
5. Keluar
Pilih operasi: 1
Masukkan kode barang: 13
Masukkan nama barang: Setrika
Masukkan nama kategori: Elektronik
Barang Setrika berhasil ditambahkan ke Gudang

Menu:
1. Tambah barang
2. Ambil barang
3. Tampilkan tumpukan barang
4. Lihat barang teratas
5. Keluar
Pilih operasi: 2
Barang Setrika diambil dari Gudang.
Kode unik dalam biner: 1101
```
----
### Pertanyaan
1. Pada method **konversiDesimalKeBiner**, ubah kondisi perulangan menjadi **while (kode != 0)**,
bagaimana hasilnya? Jelaskan alasannya!</br>
    **Jawab:**</br>
    - Hasilnya tetap sama, dikarenakan kedua kondisi tersebut menghasilkan hasil yang sama dalam konteks konversi desimal ke biner. Program berakhir pada saat proses konversi `kode` mencapai 0, ini memiliki proses yang sama dalam kondisi `while (kode > 0)` atau `while (kode != 0)`.</br></br>
2. Jelaskan alur kerja dari method **konversiDesimalKeBiner**!</br>
    **Jawab:**</br>
    - metode menerima input desimal `kode`.
    - objek `stack` dari kelas `StackKonversi18` digunakan untuk menyimpan sisa pembagian saat melakukan konversi desimal ke biner.
    - Melakukan perulangan while selama `kode` bukan 0:
        - Sisa pembagian dari pembagian `kode` dengan 2 dihitung dan dimasukkan ke dalam stack.
        - Lalu nilai `kode` diperbarui dengan hasil bagi kode dengan 2.
        - Proses terus berlanjut hingga `kode` mencapai 0.
    - Membuat string `biner` kosong.
    - Melakukan perulangan while sampai stack kosong:
        - Elemen teratas dari stack diambil menggunakan `pop()` dan ditambahkan ke string `biner`.
    - String `biner` yang memiliki nilai kemudian dikembalikan sebagai hasil.

</br></br>  
---
## Percobaan 3: Konversi Notasi Infix ke Postfix
### Langkah-langkah Percobaan 

membuat file `Postfix18.java` dan `PostfixMain18.java`
- fix error: 
    - menginisialisaikan beberapa variable diawal.
- Full program [klik ini (Postfix18.java)](./src/Postfix18.java) dan [(PostfixMain18.java)](./src/PostfixMain18.java)

### Verifikasi Hasil Percobaan

```txt
Masukkan ekspresi matematika (infix): 
a+b*(c+d-e)/f
Postfix: abcd+e-*f/+
```
----
### Pertanyaan

1. Pada method **derajat**, mengapa return value beberapa case bernilai sama? Apabila return
value diubah dengan nilai berbeda-beda setiap case-nya, apa yang terjadi?</br>
    **Jawab:**</br>
    - Karena beberapa operator tertentu memiliki tingkat prioritas yang sama sesuai dengan aturan urutan operasi matematika.
    -  Jika return value diubah maka prioritas akan berubah, yang dimana tidak sesuai dengan aturan urutan operasi matematika.

2. Jelaskan alur kerja method **konversi**!</br>
    **Jawab:**</br>
    - method `konversi` menerima input `Q` sebagai ekpresi matematika infix.
    - String `P` untuk menyimpan ekspresi postfix.
    - Melakukan Iterasi setiap karakter dalam ekspresi infix.
    - Jika karakter adalah operand (angka atau huruf), maka karakter tersebut langsung ditambahkan ke postfix `P`.
    - Jika karakter adalah `(`, ditambahkan ke dalam `stack`.
    - Jika karakter adalah `)`, melakukan proses `pop` dari `stack` hingga tanda kurung buka `(` ditemukan. Sementara karakter yang dipop dimasukkan ke dalam postfix `P`. 
    - Jika karakter adalah operator, maka akan dievaluasi apakah prioritas operator tersebut lebih tinggi atau sama dengan operator teratas di `stack`. Jika benar, maka operator di `stack` akan dipop dan dimasukkan ke dalam ekspresi postfix `P`, proses terus berlanjut hingga prioritas operator di `stack` lebih rendah atau `stack` kosong. Kemudian, operator saat ini dimasukkan ke dalam `stack`.
    - Setelah iterasi selesai, postfix `P` dikembalikan sebagai hasil.

3. Pada method **konversi**, apa fungsi dari potongan kode berikut?</br>
    ```java
    c = Q.charAt(i);
    ```
    **Jawab:**</br>
    - kode tersebut digunakan untuk mengambil karakter pada posisi tertentu dari string `Q`, yang merupakan ekspresi infix yang sedang diproses.
</br></br>

---
## Latihan Praktikum
Perhatikan dan gunakan kembali kode program pada Percobaan 1. Tambahkan dua method berikut
pada class Gudang:</br>
• Method lihatBarangTerbawah digunakan untuk mengecek barang pada tumpukan terbawah</br>
• Method cariBarang digunakan untuk mencari ada atau tidaknya barang berdasarkan kode
barangnya atau nama barangnya
</br></br>

**Jawab:**</br>
- `lihatBarangTerbawah`:</br></br>
    ```java
    public Barang18 lihatBarangTerbawah() {
        if (!cekKosong()) {
            Barang18 barangTerbawah = tumpukan[0];
            System.out.println("Barang terbawah: " + barangTerbawah.nama);
            return barangTerbawah;
        } else {
            System.out.println("Tumpukan barang kosong!");
            return null;
        }
    }
    ```

- Penjelasan: </br>
    - mengecek apakah tumpukan sedang kosong
    - jika tidak kosong, maka mencari barang pada index 0
    - jika ditemukan, mencetak pesan untuk memberikan informasi barang dengan nama yang dicari.

- Output:</br>
```txt
Masukkan kapasitas gudang: 1

Menu:
1. Tambah barang
2. Ambil barang
3. Tampilkan tumpukan barang
4. Lihat barang teratas
5. Lihat barang terbawah
6. Cari Barang
7. Keluar
Pilih operasi: 1
Masukkan kode barang: 19
Masukkan nama barang: Radio
Masukkan nama kategori: Elektronik
Barang Radio berhasil ditambahkan ke Gudang

Menu:
1. Tambah barang
2. Ambil barang
3. Tampilkan tumpukan barang
4. Lihat barang teratas
5. Lihat barang terbawah
6. Cari Barang
7. Keluar
Pilih operasi: 5
Barang terbawah: Radio
```
</br></br>

- `cariBarang`:</br></br>
    ```java
    public boolean cariBarang(int kodeBarang, String namaBarang) {  
        if (!cekKosong()) {
            for (int i = top; i >= 0; i--) {
                if (tumpukan[i].kode == kodeBarang || tumpukan[i].nama.equals(namaBarang)) {
                    System.out.println("Barang ditemukan:");
                    System.out.printf("Kode %d: %s (Kategori %s)\n",
                    tumpukan[i].kode, tumpukan[i].nama, tumpukan[i].kategori);
                    return true;
                }
            }
            System.out.println("Barang tidak ditemukan.");
            return false;
        } else {
            System.out.println("Tumpukan barang kosong!");
            return false;
        }
    }
    ```

    - Penjelasan: </br>
        - method menerima inputan kode atau nama barang yang ingin dicari oleh pengguna
        - mengecek apakah tumpukan sedang kosong
        - jika tidak kosong, setiap iterasi melakukan pencarian kode atau nama berdasarkan inputan di tumpukan di perulangan descending, perulangan dimulai dari elemen teratas ke elemen terbawah
        - jika ditemukan maka mencetak pesan "Barang ditemukan" dengan informasi barang yang ditemukan.
        - Setelah barang ditemukan, mengembalikan nilai true
        - Jika barang tidak ditemukan, maka mencetak pesan "Barang tidak ditemukan" dan return nilai false.

- Output:</br>
```txt
Masukkan kapasitas gudang: 1

Menu:
1. Tambah barang
2. Ambil barang
3. Tampilkan tumpukan barang
4. Lihat barang teratas
5. Lihat barang terbawah
6. Cari Barang
7. Keluar
Pilih operasi: 1
Masukkan kode barang: 19
Masukkan nama barang: Radio
Masukkan nama kategori: Elektronik
Barang Radio berhasil ditambahkan ke Gudang

Menu:
1. Tambah barang
2. Ambil barang
3. Tampilkan tumpukan barang
4. Lihat barang teratas
5. Lihat barang terbawah
6. Cari Barang
7. Keluar
Pilih operasi: 6
Masukkan kode atau nama barang yang ingin dicari: 19
Barang ditemukan:
Kode 19: Radio (Kategori Elektronik)
```
</br></br>

- `Utama18` (menu cariBarang):</br>
```java
case 6:
    System.out.print("Masukkan kode atau nama barang yang ingin dicari: ");
    String input = sc.nextLine();
    try {
        int kodeBarang = Integer.parseInt(input);
        gudang.cariBarang(kodeBarang, null); //kode barang
    } catch (NumberFormatException e) {
        gudang.cariBarang(0, input); //nama barang
    }
    break;
```

- Penjelasan:</br>
    - Pengguna memasukkan inputan berupa kode atau nama barang yang indin dicari
    - Program mengonversi input menjadi integer menggunakan `Integer.paseInt()`
    - jika berhasil di konversi ke integer, program mengeksekusi bagian di dalam blok program `try`
        - hasil konversi di simpan ke `kodeBarang`
        - memberi nilai sesuai parameter di method `cariBarang()` dengan `kodeBarang` dan `null` untuk menunjukkan kita mencari kode barang.
    - Jika program tidak berhasil konversi input menjadi integer, maka akan terjadi `NumberFormatException`, sehingga program melanjutkan ke blok `catch`
    - di dalam blok `catch`, mencari barang berdasarkan nama barang dengan memberi nilai sesuai parameter dengan `0` dan `input`, ini dikarenakan input sudah pasti adalah bukan integer sehingga `input` langsung ditaruh dalam parameter untuk dieksekusi di method `cariBarang()`.
    



