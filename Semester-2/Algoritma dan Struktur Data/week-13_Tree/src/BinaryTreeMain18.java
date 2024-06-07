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
