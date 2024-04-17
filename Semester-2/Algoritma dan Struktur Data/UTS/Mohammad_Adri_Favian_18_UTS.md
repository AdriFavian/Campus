# UTS
**Nama :** Mohammad Adri Favian<br>
**NIM :** 2341720185<br>
**Kelas :** TI-1B<br>
**Absen :** 18

---

Penjelasan Output Program:
- Memasukkan nilai yang ingin dicari: `44`
- Mencari index nilai ***sebelum*** data disorting, dengan Binary Search
- Mencari index nilai ***setelah*** data disorting, dengan Selection Sort ***Ascending***
- Mencari index nilai ***setelah*** data disorting, dengan Selection Sort ***Descending***
    - Output adalah tidak ditemukan, dikarenakan metode yang digunakan dalam pencarian adalah Brute Force, dimana metode ini hanya efektif jika digunakan dalam data yang terurut secara Ascending bukan Descending 

</br>

Output:
```powershell
Data: 17 40 47 22 20 30 0 15 31 31 20 44 8 28 13 27 44 
Masukkan nilai yang ingin dicari: 44
-------------------------------------------------------------------------
Mencari nilai sebelum data diurutkan (menggunakan Binary Search)
Nilai 44 ditemukan di index: 16
-------------------------------------------------------------------------
Mencari index nilai yang dicari setelah data diurutkan secara Ascending:
Data: 0 8 13 15 17 20 20 22 27 28 30 31 31 40 44 44 47 
Nilai 44 ditemukan di index: 14
-------------------------------------------------------------------------
Mencari index nilai yang dicari setelah data diurutkan secara Descending:
Data: 47 44 44 40 31 31 30 28 27 22 20 20 17 15 13 8 0 
Nilai 44 tidak ditemukan dalam data setelah sorting descending.
```
</br>

Output: (mencari nilai yang tidak ada dalam data)
```powershell
Data: 17 40 47 22 20 30 0 15 31 31 20 44 8 28 13 27 44 
Masukkan nilai yang ingin dicari: 99999
-------------------------------------------------------------------------
Mencari nilai sebelum data diurutkan (menggunakan Binary Search)
Nilai 99999 tidak ditemukan dalam data sebelum sorting.
-------------------------------------------------------------------------
Mencari index nilai yang dicari setelah data diurutkan secara Ascending:
Data: 0 8 13 15 17 20 20 22 27 28 30 31 31 40 44 44 47
Nilai 99999 tidak ditemukan dalam data setelah sorting ascending.
-------------------------------------------------------------------------
Mencari index nilai yang dicari setelah data diurutkan secara Descending:
Data: 47 44 44 40 31 31 30 28 27 22 20 20 17 15 13 8 0
Nilai 99999 tidak ditemukan dalam data setelah sorting descending.
```