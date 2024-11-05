package main;

import mahasiswa.Mahasiswa;
import dosen.Dosen;
import nilai.Nilai;
import mataKuliah.MataKuliah;

public class Main {
    public static void main(String[] args) {
        Mahasiswa mahasiswa = new Mahasiswa(12345, "Budi", 'A', 3.5);
        mahasiswa.setAlamat("Jl. Sudirman No. 5");
        mahasiswa.tampilData();

        Dosen dosen = new Dosen(1, "Dr. Andi", "Pemrograman");
        dosen.tampilDataDosen();

        MataKuliah matkul = new MataKuliah("IF101", "Pemrograman Dasar", 3);
        matkul.tampilkanInfoMataKuliah();

        Nilai nilai = new Nilai(mahasiswa, 85.5);
        nilai.tampilkanNilai();
    }
}
