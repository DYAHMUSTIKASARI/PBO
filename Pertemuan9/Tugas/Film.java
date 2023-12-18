public class Film {
    //property
    private String namaFilm;
    private Penonton[] listPenonton = new Penonton[300];
    private int jumlahPenonton;
    private RumahProduksi[] listRumahProduksi = new RumahProduksi[2];
    private int jumlahRumahProduksi;
    
    //konstruktor
    public Film(String namaFilm){
        this.namaFilm = namaFilm; 
		 }

    //method
    public String getNamaFilm(){
        return namaFilm;
    }
    public void tambahPenonton(Penonton p){
        listPenonton[jumlahPenonton] = p;
        jumlahPenonton++;
    }
    public Penonton[] getPenonton(){
        return listPenonton;
    }
    public int getJumlahPenonton(){
        return jumlahPenonton;
    }
    public void setRumahProduksi(RumahProduksi rp){
        listRumahProduksi[jumlahRumahProduksi] = rp;
        jumlahRumahProduksi++;
    }
    public RumahProduksi[] getRumahProduksi(){
        return listRumahProduksi;
    }
    public int getJumlahRumahProduksi(){
		return jumlahRumahProduksi;
    }
    public static void main(String[] args) {
        Film film1 = new Film("Dilan 1991");
        Film film2 = new Film("Avenger: Endgame");
        
    film1.setRumahProduksi(new RumahProduksi("Pidi Baiq"));
    film1.setRumahProduksi(new RumahProduksi("Fajar Bustomi"));
		film2.setRumahProduksi(new RumahProduksi("Anthony Russo")); 
		film2.setRumahProduksi(new RumahProduksi("Joe Russo"));
		
		film1.tambahPenonton(new Penonton("Abas"));
		film1.tambahPenonton(new Penonton("Yogi"));
		film1.tambahPenonton(new Penonton("Anisa"));
		
		film2.tambahPenonton(new Penonton("Abas"));
		film2.tambahPenonton(new Penonton("Yogi"));
 
		System.out.println("=== Box Office 2019 ===");
		System.out.println("Film 1 - "+film1.getNamaFilm());
		System.out.print("Sutradara = ");
		RumahProduksi[] rp1 = film1.getRumahProduksi();
		for(int i=0; i<film1.getJumlahRumahProduksi(); i++){
			System.out.print(rp1[i].getNamaSutradara()+", ");
			}
			System.out.println("");
			System.out.println("Jumlah penonton film "+film1.getNamaFilm()+" adalah "+film1.getJumlahPenonton());
			Penonton[] p1 = film1.getPenonton();
			System.out.print("|| ");
        
		for(int i=0; i<film1.getJumlahPenonton(); i++){
            System.out.print(p1[i].getNamaPenonton()+" || ");
        }
        
		System.out.println("\n\n");
        System.out.println("Film 2 - "+film2.getNamaFilm());
        System.out.print("Sutradara = ");
        RumahProduksi[] rp2 = film2.getRumahProduksi();
        for(int i=0; i<film2.getJumlahRumahProduksi(); i++){
            System.out.print(rp2[i].getNamaSutradara()+", ");
			}
        
		System.out.println("");
        System.out.println("Jumlah penonton film "+film2.getNamaFilm()+" adalah "+film2.getJumlahPenonton());
        Penonton[] p2 = film2.getPenonton();
        System.out.print("|| ");
        for(int i=0; i<film2.getJumlahPenonton(); i++){
            System.out.print(p2[i].getNamaPenonton()+" || ");
        }
        System.out.println("");
    }
} 
