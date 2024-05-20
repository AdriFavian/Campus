#!/bin/bash

echo "Program Manajemen File"
echo "======================"
echo "Pilih Menu:"
echo "1. Lihat File"
echo "2. Hapus File/Folder"
echo "3. Memindah file/Folder"
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
    *)
        echo "Pilihan tidak valid!"
    ;;
esac