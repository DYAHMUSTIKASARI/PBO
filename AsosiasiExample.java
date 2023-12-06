// Contoh class untuk asosiasi
class Mobil {
    String merk;

    Mobil(String merk) {
        this.merk = merk;
    }
}

class Pemilik {
    String nama;

    Pemilik(String nama) {
        this.nama = nama;
    }
}

// Hubungan asosiasi antara Mobil dan Pemilik
class AsosiasiExample {
    public static void main(String[] args) {
        Mobil mobil = new Mobil("Toyota");
        Pemilik pemilik = new Pemilik("John Doe");

        // Asosiasi antara mobil dan pemilik
        System.out.println(pemilik.nama + " adalah pemilik mobil " + mobil.merk);
    }
}
