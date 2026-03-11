1. if digunakan sebagai kondisi dasar (base case) untuk menghentikan rekursi saat n = 1.
else digunakan untuk melanjutkan proses rekursi dengan memanggil faktorialDC(n-1).

2. Bisa. Perulangan tidak harus memakai for, bisa juga menggunakan while.

Contoh:

int i = 1;
while(i <= n){
    fakto = fakto * i;
    i++;
}

3. fakto *= i; → digunakan pada perulangan (iterasi) di metode Brute Force.

int fakto = n * faktorialDC(n-1); → digunakan pada rekursi di metode Divide and Conquer.

4. faktorialBF() → menghitung faktorial menggunakan perulangan (loop).

faktorialDC() → menghitung faktorial menggunakan rekursi (pemanggilan fungsi sendiri).