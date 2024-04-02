package P5;
public class PencarianBuku18 {
    Buku18 listBk[] = new Buku18[3];
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
                posisi = j; // merubah posisi menjadi nilai j
                break;
            }
        }
        return posisi;
    }

    public void Tampilposisi(String cari, int pos) {
        if (pos != -1) {//-1 adalah tidak ada
            System.out.println("data: "+ cari + " ditemukan pada indeks "+ pos);
        } else {
            System.out.println("data: "+ cari + " tidak ditemukan");
        }
    }

    public void TampilData(String cari, int pos) {
        if (pos!= -1) {
            System.out.println("Kode Buku\t : " + cari);
            System.out.println("Judul\t\t : "+listBk [pos].judulBuku);
            System.out.println("Tahun Terbit\t : "+listBk [pos].tahunTerbit);
            System.out.println("Pengarang\t : "+listBk [pos].pengarang);
            System.out.println("Stock\t\t : "+listBk [pos].stock);
        } else {
            System.out.println("data " + cari + " tidak ditemukan");
        }
    }

    public Buku18 FindBuku(int cari) {
        for (int j = 0; j < idx; j++) { 
            if (listBk[j].kodeBuku == cari) {
                return listBk[j]; // return nilai posisi j
            }
        }
        return null; // null jika tidak ditemukan
    }

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


    public int FindSeqSearch(String cari){
        // String cariS = Integer.toString(cari); // konversi int ke String
        int posisi = -1;
        for (int j = 0; j < idx; j++) {  
            if (listBk[j].judulBuku.equalsIgnoreCase(cari)) { // mencari judulBuku dari inputan cariS juga mengabaikan perbedaan huruf besar-kecil nya
                posisi = j; 
                break;
            }
        }
        return posisi;
    }

    public int FindBinarySearch(String cari, int left, int right) {
        // String cariS = Integer.toString(cari); // konversi int ke String
        int mid;
        if (right >= left) {
            mid = left + (right-left) / 2;
            if ((listBk[mid].judulBuku.equalsIgnoreCase(cari))) { // mencari judulBuku dari inputan cariS juga mengabaikan perbedaan huruf besar-kecil nya
                return (mid);
            } else if (listBk[mid].judulBuku.compareToIgnoreCase(cari) > 0) { // membandingkan 2 String judulBuku dengan cariS juga mengabaikan huruf besar-kecil nya
                return FindBinarySearch(cari, left, mid - 1); 
            } else {
                return FindBinarySearch(cari, mid + 1, right); 
            }
        }
        return -1;
    }

    int findCount = 0;
    public int getFindCount(){
        return findCount;
    }

    public int FindJudulSeq(String cari) {
        int posisi = -1;
        findCount = 0; 
        for (int j = 0; j < listBk.length; j++) {
            if (listBk[j].judulBuku.equalsIgnoreCase(cari)) {
                posisi = j;
                findCount++; // bretambah jika ditemukan
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
}
