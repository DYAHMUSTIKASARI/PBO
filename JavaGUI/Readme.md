CRUD dapat dibuat dengan langkah berikut ini.
1. Siapkan database dan tabelnya seperti pada Gambar ini.
![image](https://github.com/DYAHMUSTIKASARI/PBO/assets/120073741/18161577-0005-4f23-8841-033764551ff1)

2. Siapkan Library yang dibutuhkan.
Kita akan membutuhkan beberapa lib diantaranya JavaFX untuk GUI dan JDBC Driver for SQL Server untuk koneksi JDBC ke MySQL.
Untuk JavaFX dapat diunduh di https://openjfx.io/
Untuk Connector JDBC di OS Windows bisa diunduh di sini https://go.microsoft.com/fwlink/?linkid=2247576

3. Masukkan ke IDE. Di sini contohnya menggunakan NetBeans.
Buat folder lib nya jika belum ada di dalam libraries, berikan nama sesuai dengan kebutuhan misal JavaFX , MySQL JDBC Driver
![image](https://github.com/DYAHMUSTIKASARI/PBO/assets/120073741/dfba705e-9691-4169-a703-b9b0709b4540)
Tambahkan library dengan klik menu “Window > Projects”. Pilih salah satu project lalu klik kanan “Libraries > Add Library” atau "Add JAR/Folder".

4. Buat file untuk koneksi ke Database, pada contoh ini adalah KoneksiMysql.java
   
5. Buat file untuk CRUD Database, pada contoh ini adalah CRUD.java
   
6. Desain form misalnya seperti ini
Untuk desain form sesuai dengan kode pada folder GitHub ini adalah seperti gambar di bawah ini:
![image](https://github.com/DYAHMUSTIKASARI/PBO/assets/120073741/2544af4f-a69f-4bbf-9a82-71004195fa04)
Desainlah Form Data Siswa pada tab “Design” menggunakan Palette, klik menu Window >Palette. Drag JLabel, JButton, JTextField dan JTable ke area JFrame.
Untuk edit text, misalnya tombol “jButton1” ingin diubah menjadi tombol “Simpan”, klik kanan tombol “jButton1” dan pilih “Edit Text”.
Ubah “jButton1” menjadi “Simpan”. Terapkan pula pada semua JLabel, JButton, JTextField dan JTable !
Untuk memberi nama variable, misalnya variable tombol “Simpan”, klik kanan tombol “Simpan” dan pilih “Change Variable Name”.
Ganti “New Name” yang awalnya “jButton1” menjadi “btn_simpan”. Terapkan pula pada semua JLabel, JButton, JTextField dan JTable !
Agar JFrame berada di posisi tengah, klik area JFrame. Klik Menu Window > Properties. Klik Tab “Code” dan pada “Form Size Policy” pilih “Generate Resize Code”.

7. Penerapan Abstract dan Interface
   File AbstractCRUD adalah class abstract yang metodenya harus diterapkan (extends) di class lain, dalam hal ini di-extends oleh CRUD.java
   File DatabaseActions.java adalah interface yang metodenya harus digunakan (implements) class lain, dalam hal ini digunakan oleh CRUD.java 
