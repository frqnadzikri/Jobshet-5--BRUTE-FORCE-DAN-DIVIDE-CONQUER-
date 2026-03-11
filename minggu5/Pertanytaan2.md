1. Perbedaan pangkatBF() dan pangkatDC()

pangkatBF() menghitung pangkat dengan perulangan (loop) dan perkalian berulang.

pangkatDC() menghitung pangkat dengan rekursi metode divide and conquer dengan membagi pangkat menjadi dua bagian.

2. Apakah tahap combine ada?
Ya, ada pada bagian penggabungan hasil rekursi:

return pangkatDC(a, n/2) * pangkatDC(a, n/2);

dan

return pangkatDC(a, n/2) * pangkatDC(a, n/2) * a;

3. Apakah method perlu parameter?
Tidak harus, karena sudah ada atribut nilai dan pangkat. Method bisa dibuat tanpa parameter.

Contoh:

int pangkatBF(){
    int hasil = 1;
    for(int i=0; i<pangkat; i++){
        hasil = hasil * nilai;
    }
    return hasil;
}

4. Cara kerja method

pangkatBF() → mengalikan nilai dengan dirinya sendiri sebanyak nilai pangkat menggunakan loop.

pangkatDC() → membagi pangkat menjadi dua secara rekursif lalu menggabungkan hasilnya.