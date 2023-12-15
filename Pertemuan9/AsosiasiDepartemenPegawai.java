public class Departemen {
    private String nama;

    public Departemen(String nama) {
        this.nama = nama;
    }

    public String getNama() {
        return nama;
    }
}

public class Pegawai {
    private String nama;
    private Departemen departemen;

    public Pegawai(String nama, Departemen departemen) {
        this.nama = nama;
        this.departemen = departemen;
    }

    public String getNama() {
        return nama;
    }

    public Departemen getDepartemen() {
        return departemen;
    }
}

public class Main {
    public static void main(String[] args) {
        // Membuat objek departemen
        Departemen departemenIT = new Departemen("Departemen IT");

        // Membuat objek pegawai dengan asosiasi ke departemen
        Pegawai pegawai1 = new Pegawai("Alice", departemenIT);
        Pegawai pegawai2 = new Pegawai("Bob", departemenIT);

        // Mengakses informasi pegawai dan departemen
        System.out.println("Pegawai 1: " + pegawai1.getNama() + ", Departemen: " + pegawai1.getDepartemen().getNama());
        System.out.println("Pegawai 2: " + pegawai2.getNama() + ", Departemen: " + pegawai2.getDepartemen().getNama());
    }
}
