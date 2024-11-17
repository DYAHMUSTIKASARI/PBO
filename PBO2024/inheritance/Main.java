package inheritance;

public class Main {
    public static void main(String[] args) {
       Mahasiswa mhs1 = new Mahasiswa(456, "str", 'k', 3.56); //instansiasi dari class Mahasiswa
       MahasiswaTI mhs2 = new MahasiswaTI(1234, "irsa", 'r', 2.45, "TI"); //instansiasi dari class MahasiswaTI

       System.out.println("Dari superclass class Mahasiswa");        
       mhs1.tampilData();
       System.out.println("Dari subclass class MahasiswaTI");
       mhs2.tampilData();

       System.out.println("Status Kelulusan: " + mhs1.kelulusan());
       System.out.println("Status Kelulusan: " + mhs2.kelulusan());
       System.out.println(mhs1.prediksiTahunLulus(2020));
      
    }
}
