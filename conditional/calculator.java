import java.util.Scanner;

public class calculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Masukkan angka pertama: ");
        double angka1 = input.nextDouble();
        
        System.out.print("Masukkan operator (+, -, *, /): ");
        char operator = input.next().charAt(0);
        
        System.out.print("Masukkan angka kedua: ");
        double angka2 = input.nextDouble();
        
        switch (operator) {
            case '+':
                System.out.println("Hasil: " + (angka1 + angka2));
                break;
            case '-':
                System.out.println("Hasil: " + (angka1 - angka2));
                break;
            case '*':
                System.out.println("Hasil: " + (angka1 * angka2));
                break;
            case '/':
                if (angka2 != 0) {
                    System.out.println("Hasil: " + (angka1 / angka2));
                } else {
                    System.out.println("Pembagian dengan 0 tidak valid.");
                }
                break;
            default:
                System.out.println("Operator tidak valid!");
                break;
        }
    }
}
