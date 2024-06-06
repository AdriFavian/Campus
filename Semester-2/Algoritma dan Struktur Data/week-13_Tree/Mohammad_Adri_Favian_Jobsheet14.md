# Week 13 - JOBSHEET 14 - Tree

**Nama :** Mohammad Adri Favian<br>
**NIM :** 2341720185<br>
**Kelas :** TI-1B<br>
**Absen :** 18

---

## Kegiatan Praktikum 1

### Percobaan 1

- Full Program
    - [Node18.java](./src/Node18.java)
    - [BinaryTree18.java](./src/BinaryTree18.java)
    - [BinaryTreeMain18.java](./src/BinaryTreeMain18.java)

Output: 
```json
Preorder Traversal :  6 4 3 5 8 7 9 10 15
inOrder Traversal :  3 4 5 6 7 8 9 10 15
PostOrder Traversal :  3 5 4 7 15 10 9 8 6
Find Node : true
Delete Node 8 

PreOrder Traversal :  6 4 3 5 9 7 10 15
```

### Pertanyaan Percobaan

1. Mengapa dalam binary search tree proses pencarian data bisa lebih efektif dilakukan dibanding 
binary tree biasa?  
    **Jawab:**  


2. Untuk apakah di class Node, kegunaan dari atribut left dan right?    
    **Jawab:**  

3.  a. Untuk apakah kegunaan dari atribut root di dalam class BinaryTree?    
    b.  Ketika objek tree pertama kali dibuat, apakah nilai dari root?  
    **Jawab:**  

4. Ketika tree masih kosong, dan akan ditambahkan sebuah node baru, proses apa yang akan terjadi?   
    **Jawab:**  

5. Perhatikan method add(), di dalamnya terdapat baris program seperti di bawah ini. Jelaskan 
secara detil untuk apa baris program tersebut?  

    ```java
    if(data<current.data){ 
        if(current.left!=null){ 
            current = current.left; 
        }else{ 
            current.left = new Node(data); 
        break; 
        } 
    } 
    ``` 

## Kegiatan Praktikum 2

### Tahapan Percobaan

- Full Program  
    - [BinaryTreeArray18.java](./src/BinaryTreeArray18.java)
    - [BinaryTreeArrayMain18.java](./src/BinaryTreeArrayMain18.java)    

Output: 
```json
InOrder Traversal : 3 4 5 6 7 8 9 
```

### Pertanyaaan Percobaan   

1. Apakah kegunaan dari atribut data dan idxLast yang ada di class **BinaryTreeArray**?</br> 
    **Jawab**:  

2. Apakah kegunaan dari method **populateData()**?  
    **Jawab**:  

3. Apakah kegunaan dari method **traverseInOrder()**?   
    **Jawab**:  

4. Jika suatu node binary tree disimpan dalam array indeks 2, maka di indeks berapakah posisi 
left child dan rigth child masin-masing?    
    **Jawab**:

5. Apa kegunaan statement int idxLast = 6 pada praktikum 2 percobaan nomor 4?   
    **Jawab**:

---

## Tugas Praktikum

1. Buat method di dalam class **BinaryTree** yang akan menambahkan node dengan cara rekursif. 
2. Buat method di dalam class **BinaryTree** untuk menampilkan nilai paling kecil dan yang paling besar yang ada di dalam tree. 
3. Buat method di dalam class **BinaryTree** untuk menampilkan data yang ada di leaf. 
4. Buat method di dalam class **BinaryTree** untuk menampilkan berapa jumlah leaf yang ada di dalam tree. 
5. Modifikasi class **BinaryTreeArray**, dan tambahkan :  
    • method **add(int data)** untuk memasukan data ke dalam tree  
    • method **traversePreOrder()** dan **traversePostOrder()** 
