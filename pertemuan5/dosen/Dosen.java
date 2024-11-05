// File: Dosen.java
// Package dosen

package dosen;

public class Dosen {
    private int idDosen;
    private String namaDosen;
    private String mataKuliah;

    public Dosen(int idDosen, String namaDosen, String mataKuliah) {
        this.idDosen = idDosen;
        this.namaDosen = namaDosen;
        this.mataKuliah = mataKuliah;
    }

    // Getter and Setter for idDosen
    public int getIdDosen() {
        return idDosen;
    }

    public void setIdDosen(int idDosen) {
        this.idDosen = idDosen;
    }

    // Getter and Setter for namaDosen
    public String getNamaDosen() {
        return namaDosen;
    }

    public void setNamaDosen(String namaDosen) {
        this.namaDosen = namaDosen;
    }

    // Getter and Setter for mataKuliah
    public String getMataKuliah() {
        return mataKuliah;
    }

    public void setMataKuliah(String mataKuliah) {
        this.mataKuliah = mataKuliah;
    }

    public void tampilDataDosen() {
        System.out.println("ID Dosen: " + idDosen);
        System.out.println("Nama Dosen: " + namaDosen);
        System.out.println("Mata Kuliah: " + mataKuliah);
    }
}
