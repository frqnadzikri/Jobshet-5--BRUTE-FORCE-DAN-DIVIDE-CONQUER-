1. Kenapa dibutuhkan variabel mid pada totalDC()?
Untuk membagi array menjadi dua bagian (kiri dan kanan) pada metode Divide and Conquer.

2. Fungsi statement berikut dalam totalDC()

double lsum = totalDC(arr, l, mid);
double rsum = totalDC(arr, mid+1, r);

Untuk menghitung total nilai pada bagian kiri (lsum) dan bagian kanan (rsum) array secara rekursif.

3. Kenapa perlu return lsum + rsum?
Untuk menggabungkan hasil penjumlahan bagian kiri dan kanan sehingga mendapatkan total seluruh array.

4. Base case dari totalDC()

if(l == r){
    return arr[l];
}

Artinya jika hanya ada satu elemen, maka langsung dikembalikan nilainya.

5. Kesimpulan cara kerja totalDC()
Method ini bekerja dengan membagi array menjadi dua bagian secara rekursif, menghitung masing-masing bagian, lalu menjumlahkan hasilnya untuk mendapatkan total keseluruhan.