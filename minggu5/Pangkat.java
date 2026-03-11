package minggu5;

public class Pangkat {
    int nilai, pangkat;

    // Konstruktor
    Pangkat(int n, int p){
        nilai = n;
        pangkat = p;
    }

    // Method Brute Force
    int pangkatBF(int a, int n){
        int hasil = 1;
        for(int i = 0; i < n; i++){
            hasil = hasil * a;
        }
        return hasil;
    }

    // Method Divide and Conquer
    int pangkatDC(int a, int n){
        if(n == 1){
            return a;
        }else{
            if(n % 2 == 1){
                return pangkatDC(a, n/2) * pangkatDC(a, n/2) * a;
            }else{
                return pangkatDC(a, n/2) * pangkatDC(a, n/2);
            }
        }
    }
}