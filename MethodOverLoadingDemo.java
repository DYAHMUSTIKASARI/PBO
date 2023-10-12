public class MethodOverLoadingDemo { 
/* Main Method */ 
	public static void main(String[]args){ 
	/* Memanggil method max dengan parmeter masukan integer */ 
	System.out.println("Angka terbesar dari 3 dan 9 adalah "+max(3, 9)); 
	/* Memanggil method max dengan parmeter masukan double */ 
	System.out.println("Angka terbesar dari 4.25 dan 4.0 adalah "+max(4.25, 4.0)); 
	/* Memanggil method max dengan parmeter masukan 3 double */ 
	System.out.println("Angka terbesar dari 4.25, 4.0, dan 5.6 adalah "+max(4.25,4.0,5.6)); }
	// Mengembalikan nilai terbesar dari 2 parameter masukan integer 
	
	public static int max(int angka1, int angka2){ 
	if(angka1 > angka2) 
		return angka1; 
	else 
		return angka2; 
	} 
	// Mengembalikan nilai terbesar dari 2 parameter masukan double 
	public static double max(double angka1, double angka2){ 
	if(angka1 > angka2) 
		return angka1;
	else 
		return angka2; 
	} 
	// Mengembalikan nilai terbesar dari 3 parameter masukan double 
    public static double max(double angka1, double angka2, double angka3){
		return max(max(angka1, angka2), angka3);
		}
} 	
