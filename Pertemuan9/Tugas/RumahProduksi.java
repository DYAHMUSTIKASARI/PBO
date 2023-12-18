public class RumahProduksi{
    //property
    private String sutradara;
   
  /*TUGAS:
  konversi property dibawah ini menggunakan kode sumber
   -listFilm: Film[] = new Film[1000];
    //Array untuk menampung Film 
	-jumlahFilm: int
    //Jumlah dari Film yang ditampung (default = 0)
	sampai property ini*/
    
    //konstruktor
    public RumahProduksi(String sutradara){
        this.sutradara = sutradara;
    }

    //method
    public String getNamaSutradara(){
        return sutradara;
    } 
   
  /*TUGAS :
  Buat dan isi method-method dibawah ini
    +buatFilm(f Film): void
         //Tambah film yang dibuat
    +getListFilm(): Film[]
         //Kembalikan list film yang ditonton
    +getJumlahFilm(): int
         //Kembalikan jumlah film yang ditonton
    sampai method ini*/
	
	public static void main(String[] args) {
        RumahProduksi rp1 = new RumahProduksi("Pidi Baiq");
        RumahProduksi rp2 = new RumahProduksi("Fajar Bustomi");
        RumahProduksi rp3 = new RumahProduksi("Anthony Russo");
        RumahProduksi rp4 = new RumahProduksi("Joe Russo");
        
        rp1.buatFilm(new Film("Dilan 1990"));
        rp1.buatFilm(new Film("Dilan 1991"));
        rp2.buatFilm(new Film("Dilan 1990"));
        rp2.buatFilm(new Film("Dilan 1991")); 
		    rp3.buatFilm(new Film("Avenger: Endgame"));
        rp4.buatFilm(new Film("Avenger: Endgame"));
        
        System.out.println("Jumlah film yang dibuat "+rp1.getNamaSutradara()+" adalah "+rp1.getJumlahFilm());
        Film[] f1 = rp1.getListFilm();
        System.out.print("|| ");
        for(int i=0; i<rp1.getJumlahFilm(); i++){
            System.out.print(f1[i].getNamaFilm()+" || ");
        }
    }
} 
