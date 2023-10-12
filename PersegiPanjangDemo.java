class PersegiPanjang {
    //panjang dan lebar dari persegi panjang
    int panjang;
    int lebar;
    
    //konstruktor dari objek PersegiPanjang
    PersegiPanjang(){   
    }
    
    //konstruktor dari objek PersegiPanjang
    PersegiPanjang(int panjangBaru, int lebarBaru){
        panjang = panjangBaru;
        lebar = lebarBaru;
    } 
    //mengembalikan nilai luas persegi panjang
    int getLuas(){
        return panjang*lebar;
    }
    
    //mengembalikan nilai keliling persegi panjang
    int getKeliling(){
        return 2*(panjang+lebar);
    }
}

class PersegiPanjangDemo {
    /* Main Method */
    public static void main(String[] args){
        //membuat objek peregi panjang dengan panjang=0 dan lebar=0
        PersegiPanjang persegiPanjang1 = new PersegiPanjang();
        //memanggil variabel dari class
        //memanggil method dari class
        System.out.println("Luas persegi panjang 1 ="+ persegiPanjang1.panjang+" * "+persegiPanjang1.lebar+" = "+persegiPanjang1.getLuas());
        
        //membuat objek peregi panjang dengan panjang=8 dan lebar=5
        PersegiPanjang persegiPanjang2 = new PersegiPanjang(8, 5);
        System.out.println("Luas persegi panjang 2 = "+ persegiPanjang2.panjang+" * "+persegiPanjang2.lebar+" = "+persegiPanjang2.getLuas());
    }
}
