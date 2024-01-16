public class Main {

    public static void main(String[] args) {
        
        // membuat objek HP
        Phone A53 = new Samsung();

        // membuat objek user
        PhoneUser dian = new PhoneUser(A53);
        
        dian.menyalakan();
    		dian.mematikan();
    		dian.mengeraskansuara();
    		dian.mengecilkansuara();

    }

}
