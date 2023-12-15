class Siswa {
    private String nama;

    public Siswa(String nama) {
        this.nama = nama;
    }

    public String getNama() {
        return nama;
    }
}

class Guru {
    private String nama;

    public Guru(String nama) {
        this.nama = nama;
    }

    public String getNama() {
        return nama;
    }
}

class Kelas {
    private Siswa[] siswa;
    private Guru guru;

    public Kelas(Guru guru, Siswa[] siswa) {
        this.guru = guru;
        this.siswa = siswa;
    }

    public Guru getGuru() {
        return guru;
    }

    public Siswa[] getSiswa() {
        return siswa;
    }
}

public class AsosiasiGuruSiswa {
    public static void main(String[] args) {
        // Membuat objek guru
        Guru guru = new Guru("Pak Budi");

        // Membuat objek siswa
        Siswa siswa1 = new Siswa("Ani");
        Siswa siswa2 = new Siswa("Budi");
        Siswa siswa3 = new Siswa("Cici");

        // Menyimpan siswa dalam array
        Siswa[] daftarSiswa = {siswa1, siswa2, siswa3};

        // Membuat objek kelas dengan asosiasi antara guru dan siswa
        Kelas kelas = new Kelas(guru, daftarSiswa);

        // Mengakses informasi kelas
        System.out.println("Guru: " + kelas.getGuru().getNama());
        System.out.println("Daftar Siswa:");
        for (Siswa siswa : kelas.getSiswa()) {
            System.out.println("- " + siswa.getNama());
        }
    }
}
