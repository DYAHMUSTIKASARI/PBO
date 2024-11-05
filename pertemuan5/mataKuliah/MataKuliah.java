// File: MataKuliah.java
// Package mataKuliah

package mataKuliah;

public class MataKuliah {
    private String kodeMataKuliah;
    private String namaMataKuliah;
    private int sks;

    public MataKuliah(String kodeMataKuliah, String namaMataKuliah, int sks) {
        this.kodeMataKuliah = kodeMataKuliah;
        this.namaMataKuliah = namaMataKuliah;
        this.sks = sks;
    }

    // Getter and Setter for kodeMataKuliah
    public String getKodeMataKuliah() {
        return kodeMataKuliah;
    }

    public void setKodeMataKuliah(String kodeMataKuliah) {
        this.kodeMataKuliah = kodeMataKuliah;
    }

    // Getter and Setter for namaMataKuliah
    public String getNamaMataKuliah() {
        return namaMataKuliah;
    }

    public void setNamaMataKuliah(String namaMataKuliah) {
        this.namaMataKuliah = namaMataKuliah;
    }

    // Getter and Setter for SKS
    public int getSks() {
        return sks;
    }

    public void setSks(int sks) {
        this.sks = sks;
    }

    public void tampilkanInfoMataKuliah() {
        System.out.println("Kode Mata Kuliah: " + kodeMataKuliah);
        System.out.println("Nama Mata Kuliah: " + namaMataKuliah);
        System.out.println("Jumlah SKS: " + sks);
    }
}
