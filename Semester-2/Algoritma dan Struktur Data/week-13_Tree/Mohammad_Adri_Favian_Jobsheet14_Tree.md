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
```powershell
Preorder Traversal :  6 4 3 5 8 7 9 10 15
inOrder Traversal :  3 4 5 6 7 8 9 10 15
PostOrder Traversal :  3 5 4 7 15 10 9 8 6
Find Node : true
Delete Node 8 

PreOrder Traversal :  6 4 3 5 9 7 10 15
```

### Pertanyaan Percobaan

1. Mengapa dalam binary search tree proses pencarian data bisa lebih efektif dilakukan dibanding binary tree biasa?  
    **Jawab:**  
    - Karena dalam binary search tree, setiap node kiri selalu lebih kecil dari node parent,
    - dan setiap node kanan selalu lebih besar dari node parent.
    - Sehingga proses pencarian menjadi lebih cepat karena mudah untuk dieliminasi
    - dibandingkan dengan binary tree biasa yang tidak memiliki aturan tertentu dalam penempatan nodenya.

2. Untuk apakah di class Node, kegunaan dari atribut left dan right?    
    **Jawab:**  
    - digunakan untuk menyimpan referensi ke node left child dan right child dari node tersebut.
    - memungkinkan pembentukan struktur tree yang memiliki cabang-cabang.

3.  a. Untuk apakah kegunaan dari atribut root di dalam class BinaryTree?    
    b.  Ketika objek tree pertama kali dibuat, apakah nilai dari root?  
    **Jawab:**</br>   
        a. Atribut root: untuk menyimpan node utama (paling atas) dalam tree. Root merupakan titik awal dalam tree.</br>
        b. Ketika objek tree pertama kali dibuat, nilai dari root adalah null, menandakan tree masih kosong (tidak punya elemen).

4. Ketika tree masih kosong, dan akan ditambahkan sebuah node baru, proses apa yang akan terjadi?   
    **Jawab:**  
    - node tersebut akan dijadikan sebagai root dari tree
    - karena belum ada node lain dalam tree tersebut.

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
    **Jawab:**  
    - digunakan untuk menambahkan sebuah node baru ke dalam binary search tree. 
    - Jika data yang akan ditambahkan lebih kecil dari data pada node saat ini (`current`), program akan memeriksa apakah current node memiliki left child. 
    - Jika left child sudah ada, maka `current` akan diupdate menjadi left child.
    - Jika tidak ada left child, maka program membuat node baru dan diatur sebagai left child dari node saat ini.
    - `break` untuk program berhenti.
    
    </br>

## Kegiatan Praktikum 2

### Tahapan Percobaan

- Full Program  
    - [BinaryTreeArray18.java](./src/BinaryTreeArray18.java)
    - [BinaryTreeArrayMain18.java](./src/BinaryTreeArrayMain18.java)    

Output: 
```powershell
InOrder Traversal : 3 4 5 6 7 8 9 
```

### Pertanyaaan Percobaan   

1. Apakah kegunaan dari atribut data dan idxLast yang ada di class **BinaryTreeArray**?</br> 
    **Jawab**:  
    - `data`: untuk menyimpan elemen-elemen dari tree dalam bentuk array.
    - `idxLast`: untuk menunjukkan indeks terakhir dari elemen yang terisi dalam array.

2. Apakah kegunaan dari method **populateData()**?  
    **Jawab**:  
    - untuk mengisi array data dengan elemen tree.
    - menetapkan idxLast sebagai batas akhir elemen.

3. Apakah kegunaan dari method **traverseInOrder()**?   
    **Jawab**:  
    - untuk menelusuri dan menampilkan elemen-elemen dari tree dengan urutan in-order (kiri, root, kanan).
    - elemen tree ditampilkan dalam urutan terurut secara ascending.

4. Jika suatu node binary tree disimpan dalam array indeks 2, maka di indeks berapakah posisi left child dan right child masing-masing?    
    **Jawab**:
    - Left child dari node yang berada di indeks 2 akan berada di indeks `2*2+1 = 5`.
    - Right child dari node yang berada di indeks 2 akan berada di indeks `2*2+2 = 6`.

5. Apa kegunaan statement int idxLast = 6 pada praktikum 2 percobaan nomor 4?   
    **Jawab**:
    - untuk menetapkan bahwa elemen terakhir yang terisi dalam array tree berada di indeks 6
    - menunjukkan bahwa tree memiliki total 7 node (indeks dimulai dari 0).

---

## Tugas Praktikum

1. Buat method di dalam class **BinaryTree** yang akan menambahkan node dengan cara rekursif. 
    ```java
    //  menambahkan node dengan cara rekursif
    void addRekursif(int data) {
        root = addRekursif(root, data);
    }

    private Node18 addRekursif(Node18 current, int data) {
        if (current == null) {
            return new Node18(data);
        }

        if (data < current.data) {
            current.left = addRekursif(current.left, data);
        } else if (data > current.data) {
            current.right = addRekursif(current.right, data);
        }
        return current;
    }
    ```
    </br>
2. Buat method di dalam class **BinaryTree** untuk menampilkan nilai paling kecil dan yang paling besar yang ada di dalam tree.
    ```java
    // menemukan nilai minimum dalam tree
    int findMin() {
        if (isEmpty()) {
            throw new IllegalStateException("Tree is empty");
        }
        Node18 current = root;
        while (current.left != null) {
            current = current.left;
        }
        return current.data;
    }

    // menemukan nilai maximum dalam tree
    int findMax() {
        if (isEmpty()) {
            throw new IllegalStateException("Tree is empty");
        }
        Node18 current = root;
        while (current.right != null) {
            current = current.right;
        }
        return current.data;
    }
    ``` 

3. Buat method di dalam class **BinaryTree** untuk menampilkan data yang ada di leaf. 
    ```java
    // menampilkan data yang ada di leaf
    void printLeaf(Node18 node) {
        if (node != null) {
            if (node.left == null && node.right == null) {
                System.out.print(" " + node.data);
            }
            printLeaf(node.left);
            printLeaf(node.right);
        }
    }
    ``` 

4. Buat method di dalam class **BinaryTree** untuk menampilkan berapa jumlah leaf yang ada di dalam tree.   
    ```java 
     //  menampilkan berapa jumlah leaf yang ada di dalam tree
    int hitungLeaf(Node18 node) {
        if (node == null) {
            return 0;
        }
        if (node.left == null && node.right == null) {
            return 1;
        }
        return hitungLeaf(node.left) + hitungLeaf(node.right);
    }
    ```
    </br>

Tambahan kode pada `BinaryTreeMain18.java` 

```java
public class BinaryTreeMain18 {
    public static void main(String[] args) {
        BinaryTree18 bt = new BinaryTree18();
        bt.addRekursif(6);
        bt.addRekursif(4);
        bt.addRekursif(8);
        bt.addRekursif(3);
        bt.addRekursif(5);
        bt.addRekursif(7);
        bt.addRekursif(9);
        bt.addRekursif(10);
        bt.addRekursif(15);
        System.out.print("Preorder Traversal : ");
        bt.traversePreOrder(bt.root);
        System.out.println("");
        System.out.print("InOrder Traversal : ");
        bt.traverseInOrder(bt.root);
        System.out.println("");
        System.out.print("PostOrder Traversal : ");
        bt.traversePostOrder(bt.root);
        System.out.println("");
        System.out.println("Find Node : " + bt.find(5));
        System.out.println("Delete Node 8 ");
        bt.delete(8);
        System.out.println("");
        System.out.print("PreOrder Traversal : ");
        bt.traversePreOrder(bt.root);
        System.out.println("");
        System.out.println("Nilai Minimum dalam tree: " + bt.findMin());
        System.out.println("Nilai Maximum dalam tree: " + bt.findMax());
        System.out.print("Menampilkan Leaf node: ");
        bt.printLeaf(bt.root);
        System.out.println("");
        System.out.println("Jumlah node leaf: " + bt.hitungLeaf(bt.root));
    }
}
```

Output program:

```powershell
Preorder Traversal :  6 4 3 5 8 7 9 10 15
InOrder Traversal :  3 4 5 6 7 8 9 10 15
PostOrder Traversal :  3 5 4 7 15 10 9 8 6
Find Node : true
Delete Node 8 

PreOrder Traversal :  6 4 3 5 9 7 10 15
Nilai Minimum dalam tree: 3
Nilai Maximum dalam tree: 15
Menampilkan Leaf node:  3 5 7 15
Jumlah node leaf: 4
```
</br>

5. Modifikasi class **BinaryTreeArray**, dan tambahkan :  
    • method **add(int data)** untuk memasukan data ke dalam tree 

    ```java
    void add(int data) {
        if (idxLast < this.data.length - 1) {
            idxLast++;
            this.data[idxLast] = data;
        } else {
            System.out.println("Tree sudah penuh!");
        }
    }
    ``` 

    • method **traversePreOrder()** dan **traversePostOrder()** 

    ```java
    void traversePreOrder(int idxStart) {
        if (idxStart <= idxLast) {
            System.out.print(data[idxStart] + " ");
            traversePreOrder(2 * idxStart + 1);
            traversePreOrder(2 * idxStart + 2); 
        }
    }
    
    void traversePostOrder(int idxStart) {
        if (idxStart <= idxLast) {
            traversePostOrder(2 * idxStart + 1);
            traversePostOrder(2 * idxStart + 2); 
            System.out.print(data[idxStart] + " ");
        }
    }
    ```

    Penambahan kode dalam `BinaryTreeArrayMain18.java`
    ```java
    public class BinaryTreeArrayMain18 {
        public static void main(String[] args) {
            BinaryTreeArray18 bta = new BinaryTreeArray18();
            int[] data = {6,4,8,3,5,7,9,0,0,0};
            int idxLast = 6;
            bta.populateData(data, idxLast);
            System.out.print("\nInOrder Traversal : ");
            bta.traverseInOrder(0);
            System.out.print("\nPreOrder Traversal : ");
            bta.traversePreOrder(0);
            System.out.print("\nPostOrder Traversal : ");
            bta.traversePostOrder(0);
            System.out.println("\n");
        }
    }
    ```

    Output:

    ```powershell
    InOrder Traversal : 3 4 5 6 7 8 9
    PreOrder Traversal : 6 4 3 5 8 7 9
    PostOrder Traversal : 3 5 4 7 9 8 6
    ```