class PersegiPanjangNew {
    //panjang dan lebar dari persegi panjang
	public int panjang; 
    public int lebar;
    public static int jumlahObjek = 0;    

    //konstruktor dari objek PersegiPanjangNew
    public PersegiPanjangNew(){
        jumlahObjek++;
    }
    
    //konstruktor dari objek PersegiPanjangNew
    public PersegiPanjangNew(int panjangBaru, int lebarBaru){
        panjang = panjangBaru;
        lebar = lebarBaru; 
        jumlahObjek++;
    }
    
   //mengembalikan nilai getJumlahObjek
    public static int getJumlahObjek(){
        return jumlahObjek;
    }
 
   //mengembalikan nilai luas persegi panjang
    public int getLuas(){
        return panjang*lebar;
    }

    //mengembalikan nilai keliling persegi panjang
    public int getKeliling(){
        return 2*(panjang+lebar); 
    }
}

class PersegiPanjangDemoNew {
    /* Main Method */
    public static void main(String[] args){
        System.out.println("Sebelum membuat objek");
        //memanggil variabel static
        System.out.println("Jumlah objek = "+ PersegiPanjangNew.jumlahObjek);

        //Membuat objek persegiPanjang1
        PersegiPanjangNew persegiPanjang1 = new PersegiPanjangNew();
        System.out.println("\nSetelah membuat objek persegiPanjang1");
        
        //memanggil variabel instance
        System.out.println("Panjang = "+persegiPanjang1.panjang+ "\nLebar = "+persegiPanjang1.lebar);

        //memanggil method static
        System.out.println("Jumlah objek = "+ PersegiPanjangNew.getJumlahObjek());
        
        //Membuat objek PersegiPanjangNew
        PersegiPanjangNew PersegiPanjangNew = new PersegiPanjangNew(8, 5);
        System.out.println("\nSetelah membuat objek persegiPanjang1");
        //memanggil variabel instance                                             
        System.out.println("Panjang = "+ PersegiPanjangNew.panjang +"\nLebar="+PersegiPanjangNew.lebar);
       
       //memanggil variabel static         
       System.out.println("Jumlah objek = "+ PersegiPanjangNew.jumlahObjek);
       }
}