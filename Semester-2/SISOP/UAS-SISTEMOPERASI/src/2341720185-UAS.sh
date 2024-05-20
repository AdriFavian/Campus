#!/bin/bash

echo "Program Sederhana Saya"
echo "======================"
echo "Time: $(date +'%H:%M:%S')"
echo "$(date +'%A, %d %B %Y')"
echo ""
echo "Pilih Menu:"
echo "1. Lihat File"
echo "2. Hapus File/Folder"
echo "3. Memindah File/Folder"
echo "4. Membuat File Baru"
echo "5. Membuat Folder Baru"
echo "6. Menyalin File/Folder"
echo "7. Rename File"
echo "8. Menampilkan Isi File"
echo "9. Menampilkan Ruang Disk yang Tersedia"
echo "======================"
read -p "Masukkan pilihan: " pilihan

case $pilihan in
    1)
        read -p "Masukkan nama direktori file: " dir
        ls $dir
        ;;
    2)
        read -p "Masukkan path file/folder yang akan dihapus: " path
        rm -r $path
        ;;
    3)
        read -p "Masukkan sumber file: " source
        read -p "Masukkan tujuan file: " destination
        mv $source $destination
        ;;
    4)
        read -p "Masukkan nama file yang akan dibuat: " filename
        touch $filename
        echo "File '$filename' berhasil dibuat."
        ;;
    5)
        read -p "Masukkan nama folder yang akan dibuat: " foldername
        mkdir $foldername
        echo "Folder '$foldername' berhasil dibuat."
        ;;
    6)
        read -p "Masukkan sumber file/folder: " source
        read -p "Masukkan tujuan file/folder: " destination
        cp -r $source $destination
        echo "File/Folder '$source' berhasil disalin ke '$destination'."
        ;;
    7)
        read -p "Masukkan nama file yang akan diedit: " filename
        nano $filename
        ;;
    8)
        read -p "Masukkan nama file yang akan ditampilkan: " filename
        cat $filename
        ;;
    9)
        df -h
        ;;
    *)
        echo "Pilihan tidak valid!"
        ;;
esac
