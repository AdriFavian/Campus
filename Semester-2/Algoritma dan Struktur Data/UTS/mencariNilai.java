public class mencariNilai {
    int[] data;

    public mencariNilai(int[] data) {
        this.data = data;
    }

    public void tampilArray() { //menampilkan data
        System.out.print("Data: ");
        for (int nilai : data) {
            System.out.print(nilai + " ");
        }
        System.out.println();
    }

    public int binarySearch(int data[], int left, int right, int cari) {
        if (right >= left) {
            int mid = left + (right - left) / 2; 
            if (data[mid] == cari) {
                return mid;
            } else if (data[mid] > cari) {
                return binarySearch(data, left, mid - 1, cari);
            } else {
            return binarySearch(data, mid + 1, right, cari);
            }
        }
        return -1; // jika tidak ditemukan
    }

    public void selectionSortAscend() {
        for (int i=0; i < data.length - 1; i++) {
            int idxMin = i;
            for (int j=i+1; j < data.length; j++) {
                if (data[j] < data[idxMin]) {
                    idxMin = j;
                }
            } //proses swap
            int temp = data[idxMin];
            data[idxMin] = data[i];
            data[i] = temp;
        }
    }

    public void selectionSortDescend() {
        for (int i=0; i < data.length - 1; i++) {
            int idxMax = i;
            for (int j=i+1; j < data.length; j++) {
                if (data[j] > data[idxMax]) {
                    idxMax = j;
                }
            } // proses swap
            int temp = data[idxMax];
            data[idxMax] = data[i];
            data[i] = temp;
        }
    }
}
