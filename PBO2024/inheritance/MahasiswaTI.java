package inheritance;


public class MahasiswaTI extends Mahasiswa{
    String prodi;
    
public MahasiswaTI(int NIM, String nama, char kelas, double ipk, String prodi){
    super(NIM, nama, kelas, ipk);
    this.prodi = prodi;
    }

@Override
public void tampilData() {
        super.tampilData();
        System.out.println("Program Studi : " + prodi); 
    }
}
