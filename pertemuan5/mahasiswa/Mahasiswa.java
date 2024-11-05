// File: Mahasiswa.java
// Package mahasiswa

package mahasiswa;

public class Mahasiswa {
    private int NIM;
    private String nama;
    private char kelas;
    private double ipk;
    private String alamat;

    public Mahasiswa(int NIM, String nama, char kelas, double ipk) {
        this.NIM = NIM;
        this.nama = nama;
        this.kelas = kelas;
        this.ipk = ipk;
    }

    public Mahasiswa() {
        System.out.println("Data belum diset");
    }

    // Getter and Setter for NIM
    public int getNIM() {
        return NIM;
    }

    public void setNIM(int NIM) {
        this.NIM = NIM;
    }

    // Getter and Setter for nama
    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    // Getter and Setter for kelas
    public char getKelas() {
        return kelas;
    }

    public void setKelas(char kelas) {
        this.kelas = kelas;
    }

    // Getter and Setter for IPK
    public double getIpk() {
        return ipk;
    }

    public void setIpk(double ipk) {
        this.ipk = ipk;
    }

    // Getter and Setter for alamat
    public String getAlamat() {
        return alamat;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }

    public void tampilData() {
        System.out.println("NIM : " + NIM);
        System.out.println("Nama: " + nama);
        System.out.println("Kelas : " + kelas);
        System.out.println("IPK : " + ipk);
        System.out.println("Alamat : " + alamat);
    }

    public int prediksiTahunLulus(int tahunMasuk) {
        return tahunMasuk + 4;
    }

    public String kelulusan() {
        if (ipk >= 3.0) {
            return "Lulus";
        } else {
            return "Tidak Lulus";
        }
    }
}
