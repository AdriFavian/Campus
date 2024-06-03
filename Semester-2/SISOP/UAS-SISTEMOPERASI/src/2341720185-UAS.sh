#!/bin/bash

while true; do
    echo "Program Pengelola File dan Informasi Sistem"
    echo "======================================="
    echo "Time: $(date +'%H:%M:%S')"
    echo "$(date +'%A, %d %B %Y')"
    echo "---------------------------------------"
    echo "Pilih Menu:"

    echo -e "\nKelola File"
    echo "1. Lihat Isi Folder"
    echo "2. Lihat Isi File"
    echo "3. Pindah File/Folder"
    echo "4. Salin File/Folder"
    echo "5. Hapus File/Folder"
    echo "6. Rename File/Folder"
    echo "7. Lihat Semua File dan Folder di Direktori Saat Ini"
    echo "8. Edit Isi File"
    echo "9. Cari Kata/Huruf di File"
    echo "10. Hitung Jumlah String di File"
    echo "11. Konversi Isi File dari Uppercase ke Lowercase"
    echo "12. Ubah Isi File menjadi Reverse String"
    echo "13. Konversi File ke ZIP"

    echo -e "\nBuat File Baru"
    echo "14. Buat File Baru"
    echo "15. Buat Folder Baru"

    echo -e "\nInformasi"
    echo "16. Lihat Kalender"
    echo "17. Lihat Ruang Disk yang Tersedia"
    echo "18. Lihat History perintah"
    echo "19. Lihat Proses yang Sedang Berjalan"

    echo -e "\nOTHER"
    echo "20. Generate Angka Random"
    echo "21. Kalkulator Sederhana"
    echo -e "\n0. Keluar"
    echo "======================================="
    read -p "Masukkan pilihan: " pilihan

    case $pilihan in
        1)
            read -p "Masukkan nama folder: " dir
            if [ -d "$dir" ]; then
                ls "$dir"
            else
                echo "Folder tidak ditemukan!"
            fi
            ;;
        2)
            read -p "Masukkan nama file yang akan ditampilkan: " filename
            if [ -f "$filename" ]; then
                cat "$filename"
            else
                echo "File tidak ditemukan!"
            fi
            ;;
        3)
            read -p "Masukkan sumber file: " source
            read -p "Masukkan tujuan file: " destination
            if [ -e "$source" ]; then
                mv "$source" "$destination"
                echo "File/Folder '$source' berhasil dipindah ke '$destination'."
            else
                echo "Sumber file/folder tidak ditemukan!"
            fi
            ;;
        4)
            read -p "Masukkan nama file/folder untuk disalin: " source
            read -p "Masukkan tujuan file/folder: " destination
            if [ -e "$source" ]; then
                cp -r "$source" "$destination"
                echo "File/Folder '$source' berhasil disalin ke '$destination'."
            else
                echo "Nama file/folder tidak ditemukan!"
            fi
            ;;
        5)
            read -p "Masukkan path file/folder yang akan dihapus: " path
            if [ -e "$path" ]; then
                rm -r "$path"
                echo "File/Folder '$path' berhasil dihapus."
            else
                echo "File/Folder tidak ditemukan!"
            fi
            ;;
        6)
            read -p "Masukkan nama file/folder yang akan diubah namanya: " oldname
            read -p "Masukkan nama baru: " newname
            if [ -e "$oldname" ]; then
                mv "$oldname" "$newname"
                echo "File/Folder '$oldname' berhasil diubah namanya menjadi '$newname'."
            else
                echo "File/Folder tidak ditemukan!"
            fi
            ;;
        7)
            ls -a
            ;;
        8)
            read -p "Masukkan nama file yang akan diedit: " filename
            if [ -f "$filename" ]; then
                nano "$filename"
            else
                echo "File tidak ditemukan!"
            fi
            ;;
        9)
            read -p "Masukkan nama file: " filename
            read -p "Masukkan kata yang akan dicari: " kata
            if [ -f "$filename" ]; then
                grep -n "$kata" "$filename"
            else
                echo "File tidak ditemukan!"
            fi
            ;;
        10)
            read -p "Masukkan nama file: " filename
            if [ -f "$filename" ]; then
                count=$(wc -m < "$filename")
                echo "Jumlah karakter di file: $count"
            else
                echo "File tidak ditemukan!"
            fi
            ;;
        11)
            read -p "Masukkan nama file: " filename
            if [ -f "$filename" ]; then
                tr '[:upper:]' '[:lower:]' < "$filename" > temp.txt && mv temp.txt "$filename"
                echo "Isi file '$filename' berhasil dikonversi dari uppercase ke lowercase."
            else
                echo "File tidak ditemukan!"
            fi
            ;;
        12)
            read -p "Masukkan nama file: " filename
            if [ -f "$filename" ]; then
                rev "$filename" > temp.txt && mv temp.txt "$filename"
                echo "Isi file '$filename' berhasil diubah menjadi reverse string."
            else
                echo "File tidak ditemukan!"
            fi
            ;;
        13)
            read -p "Masukkan nama file yang akan di-convert ke zip: " filename
            if [ -f "$filename" ]; then
                zip "${filename}.zip" "$filename"
                echo "File '$filename' berhasil di-convert ke '${filename}.zip'."
            else
                echo "File tidak ditemukan!"
            fi
            ;;
        14)
            read -p "Masukkan nama file yang akan dibuat: " filename
            if touch "$filename"; then
                echo "File '$filename' berhasil dibuat."
            else
                echo "Gagal membuat file!"
            fi
            ;;
        15)
            read -p "Masukkan nama folder yang akan dibuat: " foldername
            if mkdir "$foldername"; then
                echo "Folder '$foldername' berhasil dibuat."
            else
                echo "Gagal membuat folder!"
            fi
            ;;
        16)
            ncal
            ;;        
        17)
            df -h
            ;;
        18)
            history 
            ;;
        19)
            ps aux
            ;;
        20)
            read -p "Masukkan angka minimal  :" min
            read -p "Masukkan angka maksimal :" max

            r_num=$(( $RANDOM % ($max - $min + 1) + $min ))
            echo "Random Number: $r_num"
            ;;
        21)
            echo "Kalkulator Sederhana"
            echo "1. Penjumlahan"
            echo "2. Pengurangan"
            echo "3. Perkalian"
            echo "4. Pembagian"
            read -p "Pilih operasi: " operasi

            case $operasi in
                1)
                    read -p "Masukkan angka pertama: " angka1
                    read -p "Masukkan angka kedua: " angka2
                    hasil=$((angka1 + angka2))
                    echo "Hasil: $hasil"
                    ;;
                2)
                    read -p "Masukkan angka pertama: " angka1
                    read -p "Masukkan angka kedua: " angka2
                    hasil=$((angka1 - angka2))
                    echo "Hasil: $hasil"
                    ;;
                3)
                    read -p "Masukkan angka pertama: " angka1
                    read -p "Masukkan angka kedua: " angka2
                    hasil=$((angka1 * angka2))
                    echo "Hasil: $hasil"
                    ;;
                4)
                    read -p "Masukkan angka pertama: " angka1
                    read -p "Masukkan angka kedua: " angka2
                    if [ $angka2 -ne 0 ]; then
                        hasil=$((angka1 / angka2))
                        echo "Hasil: $hasil"
                    else
                        echo "Tidak dapat pembagian dengan nol!"
                    fi
                    ;;
                *)
                    echo "Operasi tidak valid!"
                    ;;
            esac
            ;;
        0)
            echo "Keluar dari program."
            break
            ;;
        *)
            echo "Pilihan tidak valid!"
            ;;
    esac
    echo ""
    read -p "Tekan [Enter] untuk kembali ke menu..."
    clear
done
