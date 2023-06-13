
package Penilaian;

public class nilaiakhir extends mahasiswa {
    private int uts;
    private int uas;
    private int tugas;

    public nilaiakhir(int uts, int uas, int tugas, String nama, String npm) {
        super();
        this.uts = uts;
        this.uas = uas;
        this.tugas = tugas;
        setNama(nama);
        setNpm(npm);
    }

    public double hitungnilaiakhir() {
        double nilaiakhir = 0.3 * uts + 0.3 * uas + 0.4 * tugas;
        return nilaiakhir;
    }
}


