// File: Nilai.java
// Package nilai

package nilai;

import mahasiswa.Mahasiswa;

public class Nilai {
    private Mahasiswa mahasiswa;
    private double nilaiAkhir;

    public Nilai(Mahasiswa mahasiswa, double nilaiAkhir) {
        this.mahasiswa = mahasiswa;
        this.nilaiAkhir = nilaiAkhir;
    }

    // Getter and Setter for nilaiAkhir
    public double getNilaiAkhir() {
        return nilaiAkhir;
    }

    public void setNilaiAkhir(double nilaiAkhir) {
        this.nilaiAkhir = nilaiAkhir;
    }

    public void tampilkanNilai() {
        System.out.println("Nilai Akhir untuk mahasiswa " + mahasiswa.getNama() + " : " + nilaiAkhir);
    }
}
