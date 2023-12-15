class Mesin {
    private int kapasitas;

    public Mesin(int kapasitas) {
        this.kapasitas = kapasitas;
    }

    public void hidupkan() {
        System.out.println("Mesin dinyalakan");
    }

    public void matikan() {
        System.out.println("Mesin dimatikan");
    }
}

class Mobil {
    private String merk;
    private Mesin mesin;

    public Mobil(String merk, int kapasitasMesin) {
        this.merk = merk;
        this.mesin = new Mesin(kapasitasMesin);
    }

    public void start() {
        System.out.println("Mobil " + merk + " mulai berjalan.");
        mesin.hidupkan();
    }

    public void stop() {
        System.out.println("Mobil " + merk + " berhenti.");
        mesin.matikan();
    }
}

public class KomposisiMesinMobil {
    public static void main(String[] args) {
        // Membuat objek mobil dengan komposisi ke mesin
        Mobil mobilToyota = new Mobil("Toyota", 2000);

        // Mengakses fungsi mobil
        mobilToyota.start();
        mobilToyota.stop();
    }
}
