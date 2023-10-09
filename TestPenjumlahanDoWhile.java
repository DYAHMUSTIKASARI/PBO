import java.util.Scanner;
public class TestPenjumlahanDoWhile {
 
public static void main(String[] args){ 
 
     int angka; 
     int sum = 0; 
	   int data;
	 
     Scanner input = new Scanner(System.in);
     do {
		 System.out.println("Masukkan angka kecuali 0");
		 data = input.nextInt();
		 sum += data;
		 } 
		 while( data!= 0);
		 System.out.println("Hasil Penjumlahannya adalah "+sum);
	} 
}
