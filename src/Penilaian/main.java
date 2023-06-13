
package Penilaian;

public class main {
    public static void main(String[] args) {
        nilaiakhir nilai = new nilaiakhir(80, 85, 90, "Sohibul Weli M. F.", "2110010010");
        System.out.println("Nama Mahasiswa: " + nilai.getNama());
        System.out.println("NPM Mahasiswa: " + nilai.getNpm());
        System.out.println("Nilai Akhir: " + nilai.hitungnilaiakhir());
    }
}
