# Week 07 - JOBSHEET 6 - SEARCHING

**Nama :** Mohammad Adri Favian<br>
**NIM :** 2341720185<br>
**Kelas :** TI-1B<br>
**Absen :** 18

---
## Searching / Pencarian Menggunakan Agoritma Sequential Search

### Langkah-langkah Percobaan

`Buku18.java`</br>
- fix error pada konstruktor `Buku18`: menambahkankan keyword `this`

    ```java
    public class Buku18 {
        int kodeBuku, tahunTerbit, stock;
        String judulBuku, pengarang;

        public Buku18 (int kodeBuku, String judulBuku, int tahunTerbit, String pengarang, int stock){
            this.kodeBuku = kodeBuku;
            this.judulBuku= judulBuku;
            this.tahunTerbit= tahunTerbit;
            this.pengarang= pengarang;
            this.stock= stock;
        }

        public void tampilDataBuku (){
            System.out.println("======================");
            System.out.println("Kode buku: "+kodeBuku);
            System.out.println("Judul buku: "+judulBuku);
            System.out.println("Tahun Terbit: "+tahunTerbit);
            System.out.println("pengarang: "+pengarang);
            System.out.println("Stock: "+stock);
        }
    }
    ```
</br>

`PencarianBuku18.java`</br>
fix error:
- pada method `tampil()`: memodifikasi agar objek `Buku18` dapat dimasukkan ke `listBk` 
- pada method `FindSeqSearch()`: merubah nilai var `posisi` menjadi -1 
- pada method `FindSeqSearch()`: merubah j = posisi, menjadi posisi = j
    ```java
    public class PencarianBuku18 {
        Buku18 listBk[] = new Buku18[5];
        int idx;

        void tambah(Buku18 m){
            if (idx < listBk.length) {
                listBk[idx] = m;
                idx++;
            } else {
                System.out.println("Data anda sudah penuh :)");
            }
        }

        void tampil() {
            for (int i=0; i<idx; i++) {
                Buku18 m = listBk[i];
                m.tampilDataBuku();
            }
        }
    
        // void tampil() {
        //     for (Buku18 m : listBk[]) {
        //         m.tampilDataBuku();
        //     }
        // }

        public int FindSeqSearch(int cari){
            int posisi = -1;
            for (int j = 0; j < listBk.length; j++) {
                if (listBk[j].kodeBuku == cari) {
                    posisi = j;
                    break;
                }
            }
            return posisi;
        }

        public void Tampilposisi(int x, int pos) {
            if (pos != -1) {//-1 adalah tidak ada
                System.out.println("data: "+ x + "ditemukan pada indeks "+ pos);
            } else {
                System.out.println("data: "+ x + "tidak ditemukan");
            }
        }
    }
    ```


#### Verifikasi Hasil Pencarian

Output:
```txt
-----------------------------------------------------
Masukkan data Buku secara Urut dari KodeBuku Terkecil :
-------------------
Kode Buku       : 111       
Judul buku      : Algoritma 
Tahun Terbit    : 2019
Pengarang       : Wahyuni
Stock           : 5
-------------------
Kode Buku       : 123
Judul buku      : Big Data
Tahun Terbit    : 2020 
Pengarang       : Susilo
Stock           : 3
-------------------
Kode Buku       : 125 
Judul buku      : Desain UI
Tahun Terbit    : 2021
Pengarang       : Supriadi
Stock           : 3
-------------------
Kode Buku       : 126
Judul buku      : Web Programming
Tahun Terbit    : 2022
Pengarang       : Pustaka Adi
Stock           : 2
-------------------
Kode Buku       : 127
Judul buku      : Etika Mahasiswa
Tahun Terbit    : 2023
Pengarang       : Darmawan Adi
Stock           : 2
----------------------------------------------
Data keseluruhan Buku:
======================
Kode buku: 111
Judul buku: Algoritma
Tahun Terbit: 2019
pengarang: Wahyuni
Stock: 5
======================
Kode buku: 123
Judul buku: Big Data
Tahun Terbit: 2020
pengarang: Susilo
Stock: 3
======================
Kode buku: 125
Judul buku: Desain UI
Tahun Terbit: 2021
pengarang: Supriadi
Stock: 3
======================
Kode buku: 126
Judul buku: Web Programming
Tahun Terbit: 2022
pengarang: Pustaka Adi
Stock: 2
======================
Kode buku: 127
Judul buku: Etika Mahasiswa
Tahun Terbit: 2023
pengarang: Darmawan Adi
Stock: 2
______________________________________
______________________________________
Pencarian Data
Masukkan Kode Buku yang dicari
Kode Buku : 111
menggunakan sequential Search
data: 111 ditemukan pada indeks 0
```
</br>
Memnambahkan:

- method `TampilData()` di class `PencarianBuku18`
- pemanggilan method `TampilData()` di `main()`
</br>

Kode program setelah penambahan:
[klik ini (BukuMain18.java)](./src/BukuMain18.java) dan [(PencarianBuku18.java)](./src/PencarianBuku18.java)
</br></br>

### Verifikasi Hasil 

Jika data ditemukan:

```txt
______________________________________
Pencarian Data
Masukkan Kode Buku yang dicari
Kode Buku : 111
menggunakan sequential Search
data: 111 ditemukan pada indeks 0
Kode Buku        : 111
Judul            : Algoritma
Tahun Terbit     : 2019
Pengarang        : Wahyuni
Stock            : 5
```

Jika data tidak ditemukan:

```txt
______________________________________
Pencarian Data
Masukkan Kode Buku yang dicari
Kode Buku : 124
menggunakan sequential Search
data: 124 tidak ditemukan
data 124 tidak ditemukan
```
---

### Pertanyaan
1. Jelaskan fungsi break yang ada pada method FindSeqSearch!</br>
    **Jawab:**</br>
    digunakan untuk keluar dari kondisi pengecekan kode buku dengan data kode buku yang ada di `listBk[]` sampai ditemukan, agar tidak mengulang-ulang proses pencariannya.
    </br></br>

2. Jika Data Kode Buku yang dimasukkan tidak terurut dari kecil ke besar. Apakah program masih
dapat berjalan? Apakah hasil yang dikeluarkan benar? Tunjukkan hasil screenshoot untuk bukti
dengan kode Buku yang acak. Jelaskan Mengapa hal tersebut bisa terjadi?</br>
    **Jawab:**</br>
    - Program masih dapat berjalan, namun program tidak dapat menemukan kodebuku yang kita cari jika data tidak terurut dari kecil ke besar karena ada kesalahan kode di method `FindSeqSeacrh()` dimana nilai posisi yang ditemukan di beri nilai `posisi = -1`, yang mengakibatkan program menghasilkan output data tidak ditemukan</br>

    - Untuk memperbaiki masalah itu kita dapat modifikasi kode pada method `FindSeqSeacrh()` yang semula `j = posisi` menjadi `posisi = j`, sehingga program mengembalikan nilai posisi dari data yang ditemukan.

    - Kode program setelah modifikasi : [klik ini (PencarianBuku18.java)](./src/PencarianBuku18.java)

    - Output program setelah dimodifikasi agar dapat menemukan databuku meski dengan kode buku yang acak: (sementara jumlah databuku yang dapat ditampung saya ubah untuk menghemat text output)

    ```txt
    -----------------------------------------------------
    Masukkan data Buku  :
    -------------------
    Kode Buku       : 999
    Judul buku      : Film
    Tahun Terbit    : 2019
    Pengarang       : Geo
    Stock           : 90
    -------------------
    Kode Buku       : 12
    Judul buku      : Kilai
    Tahun Terbit    : 2018
    Pengarang       : Uroyun
    Stock           : 8
    -------------------
    Kode Buku       : 200
    Judul buku      : Fotosintesis
    Tahun Terbit    : 2024
    Pengarang       : duply
    Stock           : 34
    ----------------------------------------------
    Data keseluruhan Buku:
    ======================
    Kode buku: 999
    Judul buku: Film
    Tahun Terbit: 2019
    pengarang: Geo
    Stock: 90
    ======================
    Kode buku: 12
    Judul buku: Kilai
    Tahun Terbit: 2018
    pengarang: Uroyun
    Stock: 8
    ======================
    Kode buku: 200
    Judul buku: Fotosintesis
    Tahun Terbit: 2024
    pengarang: duply
    Stock: 34
    ______________________________________
    ______________________________________
    Pencarian Data
    Masukkan Kode Buku yang dicari
    Kode Buku : 200
    menggunakan sequential Search
    data: 200 ditemukan pada indeks 2
    Kode Buku        : 200
    Judul            : Fotosintesis
    Tahun Terbit     : 2024
    Pengarang        : duply
    Stock            : 34
    ```
    </br></br>

3. Buat method baru dengan nama FindBuku menggunakan konsep sequential search dengan tipe
method dari FindBuku adalah BukuNoAbsen. Sehingga Anda bisa memanggil method
tersebut pada class BukuMain seperti gambar berikut :

    ```java
    Buku dataBUku = data.FinBuku(cari);
    dataBuku.tampilDataBuku();
    ```

    **Jawab:**</br>
    - menambahkan method baru `FindBuku()`
    ```java
    public Buku18 FindBuku(int cari) {
        for (int j = 0; j < idx; j++) { 
            if (listBk[j].kodeBuku == cari) {
                return listBk[j]; // return nilai posisi j
            }
        }
        return null; // null jika tidak ditemukan
    }
    ```

    - Output:
    ```txt
    -----------------------------------------------------
    Masukkan data Buku  :
    -------------------
    Kode Buku       : 999    
    Judul buku      : Film
    Tahun Terbit    : 2019
    Pengarang       : Geo
    Stock           : 90
    -------------------
    Kode Buku       : 12
    Judul buku      : Kilai
    Tahun Terbit    : 2018
    Pengarang       : Uroyun
    Stock           : 8
    -------------------
    Kode Buku       : 200
    Judul buku      : Fotosintesis
    Tahun Terbit    : 2024
    Pengarang       : duply
    Stock           : 34
    ----------------------------------------------
    Data keseluruhan Buku:
    ======================
    Kode buku: 999
    Judul buku: Film
    Tahun Terbit: 2019
    pengarang: Geo
    Stock: 90
    ======================
    Kode buku: 12
    Judul buku: Kilai
    Tahun Terbit: 2018
    pengarang: Uroyun
    Stock: 8
    ======================
    Kode buku: 200
    Judul buku: Fotosintesis
    Tahun Terbit: 2024
    pengarang: duply
    Stock: 34
    ______________________________________
    ______________________________________
    Pencarian Data
    Masukkan Kode Buku yang dicari
    Kode Buku : 200
    menggunakan sequential Search
    data: 200 ditemukan pada indeks 2
    Kode Buku        : 200
    Judul            : Fotosintesis
    Tahun Terbit     : 2024
    Pengarang        : duply
    Stock            : 34
    ======================
    Kode buku: 200
    Judul buku: Fotosintesis
    Tahun Terbit: 2024
    pengarang: duply
    Stock: 34
    ```
</br></br></br>
---

## Searching / Pencarian Menggunakan Binary Search

### Langkah-langkah Percobaan Binary Search

- Menambahkan method `FindBinarySearch()` di class **`PencarianBuku18`**
- Memanggil method `FindBinarySearch()` , `Tampilposisi()`, `TampilData` di class **`BukuMain18`**</br></br>

`FindBinarySearch()`:</br>
fix error:
- modifikasi perhitungan `mid`, menambahkan `left` agar posisi awal subarray yang ingin dicari ikut diperhitungkan, sehingga menghasilkan nilai mid yang benar dan sesuai.

- memperbaiki pemnaggilan rekursif agar range yang dimiliki sudah diperbarui. 

    ```java
    public int FindBinarySearch(int cari, int left, int right) {
        int mid;
        if (right >= left) {
            mid = left + (right-left) / 2; // fix mid value
            if (cari == listBk[mid].kodeBuku) {
                return (mid);
            } else if (listBk[mid].kodeBuku > cari) {
                return FindBinarySearch(cari, left, mid - 1); // cari di kiri
            } else {
                return FindBinarySearch(cari, mid + 1, right); //cari di kanan
            }
        }
        return -1;
    }
    ```

### Verifikasi Hasil Percobaan
note: berikut adalah output program kedua method denga inputan data yang sama seperti percobaan yang sebelumnya.

```txt
______________________________________
Pencarian Data
Masukkan Kode Buku yang dicari
Kode Buku : 126
menggunakan Sequential Search
data: 126 ditemukan pada indeks 3
Kode Buku        : 126
Judul            : Web Programming
Tahun Terbit     : 2022
Pengarang        : Pustaka Adi
Stock            : 2
======================
Kode buku: 126
Judul buku: Web Programming
Tahun Terbit: 2022
pengarang: Pustaka Adi
Stock: 2
====================================================
Menggunakan Binary Search
data: 126 ditemukan pada indeks 3
Kode Buku        : 126
Judul            : Web Programming
Tahun Terbit     : 2022
Pengarang        : Pustaka Adi
Stock            : 2
```
</br></br>
### Pertanyaan

1. Tunjukkan pada kode program yang mana proses divide dijalankan!</br>
    **Jawab**:</br>
    - Pada perhitungan mid 
        ```java
        mid = left + (right-left) / 2;
        ```
    </br>
 
2. Tunjukkan pada kode program yang mana proses conquer dijalankan!</br>
    **Jawab**:</br>
    - Pada saat program menentukan dimana harus melanjutkan pencarian berdasarkan perbandingan nilai `cari` dengan nilai `mid`. 
        ```java
        if (cari == listBk[mid].kodeBuku) {
                return (mid);
            } else if (listBk[mid].kodeBuku > cari) {
                return FindBinarySearch(cari, left, mid - 1); // cari di kiri
            } else {
                return FindBinarySearch(cari, mid + 1, right); //cari di kanan
            }
        ```
    </br>

3. Jika data Kode Buku yang dimasukkan tidak urut. Apakah program masih dapat berjalan? Mengapa
demikian! Tunjukkan hasil screenshoot untuk bukti dengan kode Buku yang acak. Jelaskan
Mengapa hal tersebut bisa terjadi?</br>
    **Jawab**:</br>
    - Program dapat berjalan namun pencarian metode biner tidak akan berfungsi dengan benar 
    - Ini dikarenakan pencarian metode biner memerlukan data yang terurut
    - Hal tersebut dapat terjadi karena proses pencarian metode biner bekerja seperti berikut: setengah dari hasil pembagian array dapat di eliminasi karena telah mendapatkan hasil perbandingan antara nilai `cari` dengan nilai `mid`. Jika data tidak urut maka, logika ini tidak berlaku.</br></br>

4. Jika Kode Buku yang dimasukkan dari Kode Buku terbesar ke terkecil (missal : 20215, 20214, 
20212, 20211, 20210) dan elemen yang dicari adalah 20210. Bagaimana hasil dari binary search? 
Apakah sesuai? Jika tidak sesuai maka ubahlah kode program binary seach agar hasilnya sesuai!</br>
    **Jawab**:</br>
    - Hasil program jika tidak dimodifikasi adalah tidak yang sesuai diinginkan
    - program dimodifikasi untuk mencari dengan data descending dengan mengubah tanda pembanding `cari` dengan `kodeBuku`. </br></br>

    ```java
    if (right >= left) {
            mid = left + (right-left) / 2; 
            if (cari == listBk[mid].kodeBuku) {
                return (mid);
            } else if (listBk[mid].kodeBuku < cari) {// modifikasi 
                return FindBinarySearch(cari, left, mid - 1); 
            } else {
                return FindBinarySearch(cari, mid + 1, right); 
            }
        }
    ```
</br></br>
---

## Percobaan Pengayaan Divide and Conquer
### Langkah-langkah Percobaan Merge Sort 

`MergeSorting18`:</br>
```java
package P7;

public class MergeSorting18 {
    public void mergeSort(int[] data){
        sort(data, 0, data.length -1);
    }
    public void merge(int[] data, int left, int middle, int right){
        int [] temp = new int [data.length];
        for (int i = left; i <= right; i++){
            temp[i] = data[i];
        }
        int a = left;
        int b = middle + 1;
        int c = left;

        while (a <= middle && b <= right){
            if (temp[a] <= temp[b]) {
                data[c] = temp[a];
                a++;
            } else {
                data[c] = temp[b];
                b++;
            }
            c++;
        }
        int s = middle - a;
        for (int i = 0; i <= s; i++) {
            data[c + i] = temp[a + i];
        }
    }

    public void sort(int data[], int left, int right){
        if (left < right){
            int middle = (left + right) / 2;
            sort(data, left, middle);
            sort(data, middle + 1, right);
            merge(data, left, middle, right);
        }
    }

    public void printArray(int arr[]){
        for (int i = 0; i < arr.length; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}
```
</br>

`MergeSortMain18`:</br>

```java
package P7;

public class MergeSortMain18 {
    public static void main(String[] args) {
        int data[] = {10,40,30,50,70,20,100,90};
        System.out.println("Sorting dengan Merge Sort");
        MergeSorting18 mSort = new MergeSorting18();
        System.out.println("Data awal: ");
        mSort.printArray(data);
        mSort.mergeSort(data);
        System.out.println("\nSetelah Diurutkan: ");
        mSort.printArray(data);
    }
}
```

### Verifikasi Hasil Percobaan

```txt
Sorting dengan Merge Sort
Data awal: 
10 40 30 50 70 20 100 90 

Setelah Diurutkan: 
10 20 30 40 50 70 90 100 
```
</br>
---

## Latihan Praktikum

1. Modifikasi percobaan searching diatas dengan ketentuan berikut ini </br>

    - Ubah tipe data dari kode Buku yang awalnya int menjadi String </br>
    `Buku18`
    ```java
    package P5;
    public class Buku18 {
        int tahunTerbit, stock;
        String judulBuku, pengarang, kodeBuku; //diubah

        public Buku18 (String kodeBuku, String judulBuku, int tahunTerbit, String pengarang, int stock){ //diubah
        this.kodeBuku = kodeBuku;
        this.judulBuku= judulBuku;
        this.tahunTerbit= tahunTerbit;
        this.pengarang= pengarang;
        this.stock= stock;
    }
    ```
    </br>
    - Tambahkan method untuk pencarian kode Buku (bertipe data String) dengan menggunakan sequential search dan binary search.</br>
    `PencarianBuku18`
    ```java
    public int FindSeqSearch(int cari){
        int posisi = -1;
        for (int j = 0; j < listBk.length; j++) {
            if (Integer.parseInt(listBk[j].kodeBuku) == cari) { // konversi String ke Int
                posisi = j; 
                break;
            }
        }
        return posisi;
    }

    public int FindBinarySearch(int cari, int left, int right) {
        int mid;
        if (right >= left) {
            mid = left + (right-left) / 2; 
            if (cari == Integer.parseInt(listBk[mid].kodeBuku)) { // konversi String ke Int
                return (mid);
            } else if (Integer.parseInt(listBk[mid].kodeBuku) > cari) { // konversi String ke Int
                return FindBinarySearch(cari, left, mid - 1); 
            } else {
                return FindBinarySearch(cari, mid + 1, right); 
            }
        }
        return -1;
    }
    ```
    </br></br>

2. Modifikasi percobaan searching diatas dengan ketentuan berikut ini</br> 
    - Tambahkan method pencarian judul buku menggunakan sequential search dan binary 
search. Sebelum dilakukan searching dengan binary search data harus dilakukan pengurutan 
dengan menggunakan algoritma Sorting (bebas pilih algoritma sorting apapun)! Sehingga 
ketika input data acak, maka algoritma searching akan tetap berjalan
    `PencarianBuku18`

    ```java
    public void sortBubble(){ // sorting bubble
        int pnjnglistBk = listBk.length;
        for(int i = 0; i < pnjnglistBk-1; i++){
            for(int j = 1; j < pnjnglistBk-i; j++){
                if(listBk[j].judulBuku.length() < listBk[j-1].judulBuku.length()){
                    Buku18 tmp = listBk[j];
                    listBk[j] = listBk[j-1];
                    listBk[j-1] = tmp;
                }
            }
        }
    }


    public int FindSeqSearch(int cari){
        String cariS = Integer.toString(cari); // konversi int ke String
        int posisi = -1;
        for (int j = 0; j < idx; j++) {  
            if (listBk[j].judulBuku.equalsIgnoreCase(cariS)) { // mencari judulBuku dari inputan cariS juga mengabaikan perbedaan huruf besar-kecil nya
                posisi = j; 
                break;
            }
        }
        return posisi;
    }

    public int FindBinarySearch(int cari, int left, int right) {
        String cariS = Integer.toString(cari); // konversi int ke String
        int mid;
        if (right >= left) {
            mid = left + (right-left) / 2;
            if ((listBk[mid].judulBuku.equalsIgnoreCase(cariS))) { // mencari judulBuku dari inputan cariS juga mengabaikan perbedaan huruf besar-kecil nya
                return (mid);
            } else if (listBk[mid].judulBuku.compareToIgnoreCase(cariS) > 0) { // membandingkan 2 String judulBuku dengan cariS juga mengabaikan huruf besar-kecil nya
                return FindBinarySearch(cari, left, mid - 1); 
            } else {
                return FindBinarySearch(cari, mid + 1, right); 
            }
        }
        return -1;
    }
    ```

    `Output`:

    ```txt
    -----------------------------------------------------
    Masukkan data Buku  :
    -------------------
    Kode Buku       : 999    
    Judul buku      : indo
    Tahun Terbit    : 2020
    Pengarang       : malik
    Stock           : 5
    -------------------
    Kode Buku       : 111
    Judul buku      : dua
    Tahun Terbit    : 2019
    Pengarang       : untal
    Stock           : 9
    -------------------
    Kode Buku       : 555
    Judul buku      : jepang
    Tahun Terbit    : 2020
    Pengarang       : tako
    Stock           : 6
    ----------------------------------------------
    Data keseluruhan Buku:
    ======================
    Kode buku: 999
    Judul buku: indo
    Tahun Terbit: 2020
    pengarang: malik
    Stock: 5
    ======================
    Kode buku: 111
    Judul buku: dua
    Tahun Terbit: 2019
    pengarang: untal
    Stock: 9
    ======================
    Kode buku: 555
    Judul buku: jepang
    Tahun Terbit: 2020
    pengarang: tako
    Stock: 6
    ______________________________________
    ______________________________________
    Pencarian Data
    Masukkan Judul Buku yang dicari
    Judul Buku : jepang
    menggunakan Sequential Search
    data: jepang ditemukan pada indeks 2
    Kode Buku        : jepang
    Judul            : jepang
    Tahun Terbit     : 2020
    Pengarang        : tako
    Stock            : 6
    ====================================================
    Menggunakan Binary Search
    data: jepang ditemukan pada indeks 2
    Kode Buku        : jepang
    Judul            : jepang
    Tahun Terbit     : 2020
    Pengarang        : tako
    Stock            : 6
    ```
    </br></br>

    - Buat aturan untuk mendeteksi hasil pencarian judul buku yang lebih dari 1 hasil dalam 
bentuk kalimat peringatan! Pastikan algoritma yang diterapkan sesuai dengan kasus yang 
diberikan!

    ```java
    int findCount = 0;
    public int getFindCount(){ // digunakan di class main untuk mengetahui judul apakah lebih dari 1 
        return findCount; 
    }

    public int FindJudulSeq(String cari) {
        int posisi = -1;
        findCount = 0; 
        for (int j = 0; j < listBk.length; j++) {
            if (listBk[j].judulBuku.equalsIgnoreCase(cari)) {
                posisi = j;
                findCount++; // bretambah jika ditemukan, kirim ke method getFindCount()
            }
        }
        return posisi;
    };

     public int FindJudulBinary(String cari, int left, int right){
        int mid;
        if (right >= left) {
            mid = left + (right - left) / 2;
            if (listBk[mid].judulBuku.equalsIgnoreCase(cari)) {
                return (mid);
            } else if (listBk[mid].judulBuku.length() > cari.length()) {
                return FindJudulBinary(cari, left, mid - 1);
            } else {
                return FindJudulBinary(cari, mid + 1, right);
            }
        }
        return -1;
    }
    ```
    </br></br>
    `Output`:
    ```txt
    -----------------------------------------------------
    Masukkan data Buku  :
    -------------------
    Kode Buku       : 999
    Judul buku      : indo
    Tahun Terbit    : 2020
    Pengarang       : jj
    Stock           : 19
    -------------------
    Kode Buku       : 111
    Judul buku      : jepang
    Tahun Terbit    : 2017 
    Pengarang       : untung
    Stock           : 7
    -------------------
    Kode Buku       : 555
    Judul buku      : indo
    Tahun Terbit    : 2021
    Pengarang       : jjs
    Stock           : 2
    ----------------------------------------------
    Data keseluruhan Buku:
    ======================
    Kode buku: 999
    Judul buku: indo
    Tahun Terbit: 2020
    pengarang: jj
    Stock: 19
    ======================
    Kode buku: 111
    Judul buku: jepang
    Tahun Terbit: 2017
    pengarang: untung
    Stock: 7
    ======================
    Kode buku: 555
    Judul buku: indo
    Tahun Terbit: 2021
    pengarang: jjs
    Stock: 2
    ______________________________________
    ______________________________________
    Pencarian Data
    Masukkan Judul Buku yang dicari
    Judul Buku : indo
    menggunakan Sequential Search
    Data tidak dapat ditemukan
    data: indo ditemukan pada indeks 2
    Kode Buku        : indo
    Judul            : indo
    Tahun Terbit     : 2021
    Pengarang        : jjs
    Stock            : 2
    ====================================================
    Menggunakan Binary Search
    data: indo ditemukan pada indeks 0
    Kode Buku        : indo
    Judul            : indo
    Tahun Terbit     : 2020
    Pengarang        : jj
    Stock            : 19
    ```



   














