package minggu5;

public class MainNilaiMahasiswa {
    public static void main(String[] args) {

        NilaiMahasiswa nm = new NilaiMahasiswa();

        System.out.println("Nilai UTS Tertinggi : " + nm.maxUTS(nm.uts,0,nm.uts.length-1));
        System.out.println("Nilai UTS Terendah : " + nm.minUTS(nm.uts,0,nm.uts.length-1));
        System.out.println("Rata-rata Nilai UAS : " + nm.rataUAS());

    }
}