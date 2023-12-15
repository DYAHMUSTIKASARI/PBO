class Penduduk {
    private String nama;

    public Penduduk(String nama) {
        this.nama = nama;
    }

    public String getNama() {
        return nama;
    }
}

class Rumah {
    private String alamat;
    private Penduduk[] penduduk;

    public Rumah(String alamat) {
        this.alamat = alamat;
        this.penduduk = new Penduduk[5]; // Agregasi dengan batas 5 penduduk
    }

    public void tambahPenduduk(Penduduk orang) {
        for (int i = 0; i < penduduk.length; i++) {
            if (penduduk[i] == null) {
                penduduk[i] = orang;
                break;
            }
        }
    }

    public Penduduk[] getPenduduk() {
        return penduduk;
    }

    public String getAlamat() {
        return alamat;
    }
}

public class AgregasiPendudukRumah {
    public static void main(String[] args) {
        // Membuat objek penduduk
        Penduduk orang1 = new Penduduk("Alice");
        Penduduk orang2 = new Penduduk("Bob");

        // Membuat objek rumah dengan agregasi ke penduduk
        Rumah rumah = new Rumah("Jl. ABC No. 123");
        rumah.tambahPenduduk(orang1);
        rumah.tambahPenduduk(orang2);

        // Mengakses informasi rumah dan penduduk
        System.out.println("Alamat Rumah: " + rumah.getAlamat());
        System.out.println("Penduduk di Rumah:");
        for (Penduduk penduduk : rumah.getPenduduk()) {
            if (penduduk != null) {
                System.out.println("- " + penduduk.getNama());
            }
        }
    }
}
