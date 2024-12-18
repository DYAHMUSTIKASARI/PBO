package pbo2024;

import java.util.ArrayList;
import java.util.List;
public class DaftarMahasiswa {
    
         public static void main(String[] args) {
        // Membuat List untuk menyimpan nama mahasiswa
        List<String> mahasiswa = new ArrayList<>();

        // Menambahkan nama mahasiswa ke dalam List
        mahasiswa.add("Ali");
        mahasiswa.add("Budi");
        mahasiswa.add("Citra");

        // Menampilkan semua mahasiswa
        System.out.println("Daftar Mahasiswa:");
        for (String nama : mahasiswa) {
            System.out.println("- " + nama);
        }

        // Menghapus mahasiswa "Budi"
        mahasiswa.remove("Budi");
        System.out.println("\nSetelah menghapus Budi:");
        for (String nama : mahasiswa) {
            System.out.println("- " + nama);
        }

        // Mengganti nama mahasiswa
        mahasiswa.set(0, "Dina");
        System.out.println("\nSetelah mengganti Ali menjadi Dina:");
        for (String nama : mahasiswa) {
            System.out.println("- " + nama);
        }

        // Menampilkan jumlah mahasiswa
        System.out.println("\nJumlah mahasiswa saat ini: " + mahasiswa.size());
    }
}
