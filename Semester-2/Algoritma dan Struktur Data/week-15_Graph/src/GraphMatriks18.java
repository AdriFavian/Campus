public class GraphMatriks18 {
    int vertex;
    int[][] matriks;

    public GraphMatriks18(int v) {
        vertex = v;
        matriks = new int[v][v];
    }

    public void makeEdge(int asal, int tujuan, int jarak) {
        matriks[asal][tujuan] = jarak;
    }

    public void removeEdge(int asal, int tujuan) {
        matriks[asal][tujuan] = 0; //sebelumnya -1;
    }

    public void printGraph() {
        for (int i = 0; i < vertex; i++) {
            System.out.print("Gedung " + (char) ('A' + i) + ": ");
            for (int j = 0; j < vertex; j++) {
                System.out.print("Gedung " + (char) ('A' + j) + " (" + matriks[i][j] + " m), ");
            }
            System.out.println();
        }
    }

    public void degree(int index) {
        int inDegree = 0, outDegree = 0;
        //in
        for (int i = 0; i < vertex; i++) {
            if (matriks[i][index] != 0) {
                inDegree++;
            }
        }
        //out
        for (int i = 0; i < vertex; i++) {
            if (matriks[index][i] != 0) {
                outDegree++;
            }
        }
        System.out.println("InDegree dari Gedung " + (char) ('A' + index) + ": " + inDegree);
        System.out.println("ouotDegree dari Gedung " + (char) ('A' + index) + ": " + outDegree);
        System.out.println("Degree dari Gedung " + (char) ('A' + index) + ": " + (inDegree + outDegree));
    }
}
