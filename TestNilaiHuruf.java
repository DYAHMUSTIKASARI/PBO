import java.util.Scanner;
public class TestNilaiHuruf{
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Masukkan nilai angka: ");
		int angka = input.nextInt();
		if(angka > 85)
		{
			System.out.println("A");
			}
			else if(angka >= 70 && angka <= 84)
			{
				System.out.println("B");
			}
			else if(angka >= 60 && angka <= 69)
			{
				System.out.println("C");
			}
				else if(angka >= 50 && angka <= 59)
			{
				System.out.println("D");
			}
			else
			{
				System.out.println("E");
			}
		}
	} 
