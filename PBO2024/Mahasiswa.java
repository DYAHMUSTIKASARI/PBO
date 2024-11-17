
//nama package
package pbo2024.satu; 


public class Mahasiswa {
  //property  
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

    //konstruktor default
    public Mahasiswa() {
        System.out.println("data belum diset");
        
    }

    public void tampilData() {
        System.out.println("NIM : " + NIM);
        System.out.println("Nama: " + nama);
        System.out.println("Kelas : " + kelas);
    }

  //metode void dengan parameter tipe data masukan String  
  public void Alamat(String alamatMhs) {
        System.out.println("Alamat : " + alamatMhs);
    }

  //metode return dengan parameter tipe data masukan int
  public int prediksiTahunLulus(int tahunMasuk) {
        return tahunMasuk + 4;
    }

  //getter dengan nilai balik tipe doubel
  public double getIPK() {
        return ipk;
    }

  //metode return tanpa parameter dengan nilai balik String  
  public String kelulusan() {
        if (ipk >= 3.0) {
            return "Lulus";
        } else {
            return "Tidak Lulus";
        }
    }
}

