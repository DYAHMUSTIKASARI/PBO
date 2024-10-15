public class TabelPerkalian {
	public static void main(String[] args){
     // Judul dan heading tabel
	 System.out.println(" Multiplication Table");
	 // Angka judul
	 System.out.print(" ");
	 for (int j = 1; j <= 9; j++)
		 System.out.print(" " + j);
	 System.out.println("\n --------------------------");
	 // isi tabel
	 for (int i = 1; i <= 9; i++) {
		 System.out.print(i + " | ");
                for (int j = 1; j <= 9; j++) {
                     // tampilkan perkalian
					 System.out.printf("%4d", i * j);
					 }
					 System.out.println();
	 }
	}
}
