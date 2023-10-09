import java.util.Scanner; 
public class CetakWaktu { 
	public static void main(String[] args) { 
		Scanner input = new Scanner(System.in); 
		System.out.print ("Masukkan waktu dalam detik: "); 
		int detik = input.nextInt(); 
		int menit = detik / 60; 
		int sisadetik = detik % 60; 
		System.out.print(detik+ " detik adalah "+menit+ " menit "+sisadetik+" detik.");
	}
}
