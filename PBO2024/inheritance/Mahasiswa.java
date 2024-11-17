package pbo2024.satu;

public class Mahasiswa {
    int NIM;
    String nama;
    char kelas;
    double ipk;

    //konstruktor berparameter
    public Mahasiswa(int NIM, String nama, char kelas, double ipk) {
        this.NIM = NIM;
        this.nama = nama;
        this.kelas = kelas;
        this.ipk = ipk;

    }

    public void tampilData() {
        System.out.println("NIM : " + NIM);
        System.out.println("Nama: " + nama);
        System.out.println("Kelas : " + kelas);
    }

    public void Alamat(String alamatMhs) {
        System.out.println("Alamat : " + alamatMhs);
    }

    public int prediksiTahunLulus(int tahunMasuk) {
        return tahunMasuk + 4;
    }

    public double getIPK() {
        return ipk;
    }

    public String kelulusan() {
        if (ipk >= 3.0) {
            return "Lulus";
        } else {
            return "Tidak Lulus";
        }
    }
}

