class PersegiPanjangEnkapsulasi {
    //panjang, lebar, dan jumlahObjek dengan modifier private
    private int panjang;
    private int lebar; 
    private static int jumlahObjek = 0;
    
    //konstruktor dari objek PersegiPanjang
    public PersegiPanjangEnkapsulasi(){
        jumlahObjek++;
    }
    //konstruktor dari objek PersegiPanjang
    public PersegiPanjangEnkapsulasi(int panjangBaru, int lebarBaru){
        panjang = panjangBaru;
		lebar = lebarBaru;
		jumlahObjek++;
    }

	//method setter untuk property panjang
    public void setPanjang(int panjangBaru){
        panjang = panjangBaru;
    }
    //method getter untuk property panjang 
    public int getPanjang(){
        return panjang;
    }
    //method setter untuk property lebar
    public void setLebar(int lebar){
        //gunakan kata kunci this karena nama masukan parameter 
        //lebar sama dengan nama property lebar
        this.lebar = lebar;
    }
    //method getter untuk property lebar
    public int getLebar(){
        return lebar;
    }
    //method getter untuk mengembalikan nilai getJumlahObjek     
    public static int getJumlahObjek(){
        return jumlahObjek;
    }
    //method getter untuk mengembalikan nilai luas persegi panjang
    public int getLuas(){
        return panjang*lebar;
    }
    //method getter untuk mengembalikan nilai keliling 
    public int getKeliling(){
        return 2*(panjang+lebar);
    } 
}

class PersegiPanjangEnkapsulasiDemo {
    /* Main Method */
    public static void main(String[] args) {
        System.out.println("Sebelum membuat objek");
        System.out.println("Jumlah objek = "+PersegiPanjangEnkapsulasi.getJumlahObjek());
        
        //membuat objek peregi panjang dengan panjang=0 dan lebar=0
        PersegiPanjangEnkapsulasi pp1 = new 
        PersegiPanjangEnkapsulasi();
        System.out.println("Luas persegi panjang 1 = "+pp1.getPanjang()+" * "+pp1.getLebar()+" = "+pp1.getLuas());
        System.out.println("Jumlah objek = "+PersegiPanjangEnkapsulasi.getJumlahObjek());
        
        
//membuat objek persegi panjang dengan panjang=6 dan lebar=7
        PersegiPanjangEnkapsulasi pp2 = new PersegiPanjangEnkapsulasi();
        pp2.setPanjang(6);
        pp2.setLebar(7);
        System.out.println("Luas persegi panjang 2 = "+pp2.getPanjang()+" * "+pp2.getLebar()+" = "+pp2.getLuas());
        System.out.println("Jumlah objek = "+PersegiPanjangEnkapsulasi.getJumlahObjek());

        //membuat objek peregi panjang dengan panjang=8 dan lebar=5
        PersegiPanjangEnkapsulasi pp3 = new PersegiPanjangEnkapsulasi(8, 5);
        System.out.println("Luas persegi panjang 3 = "+pp3.getPanjang()+" * "+pp3.getLebar()+" = "+pp3.getLuas());
        System.out.println("Jumlah objek = "+PersegiPanjangEnkapsulasi.getJumlahObjek());
    }
} 


