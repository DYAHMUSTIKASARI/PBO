package crud;

import java.sql.Connection; 
import java.sql.DriverManager; 
import java.sql.SQLException; 

public class KoneksiMysql{
	private Connection connect; 
	private String driverName = "com.mysql.jdbc.Driver"; // Driver Untuk Koneksi Ke MySQL 
	private String jdbc = "jdbc:mysql://"; 
	private String host = "127.0.0.1"; // Sesuaikan dengan IP yang ada localhost masing-masing 
	private String port = "3306/"; // Port ini port MySQL 
	private String database = "pbo"; // sesuaikan dengan nama database yang digunakan 
	private String url = jdbc + host + port + database; 
	private String username = "root"; // username default mysql 
	private String password = ""; 
	public Connection getKoneksi() throws SQLException { 
	if (connect == null) { 
		try { 
		Class.forName(driverName); 
		System.out.println("Class Driver Ditemukan"); 
		try { 
		connect = DriverManager.getConnection("jdbc:mysql://localhost/pbo","root",""); //pbo adalah nama database, silahkan sesuaikan dengan nama database-nya
		System.out.println("Koneksi Database Sukses"); 
		} catch (SQLException se) { 
                    se.printStackTrace();
		System.out.println("Koneksi Database Gagal : " + se.getMessage()); 
		System.exit(0); 
		} 
		} catch (ClassNotFoundException cnfe) { 
		System.out.println("Class Driver Tidak Ditemukan, Terjadi Kesalahan Pada : " + cnfe.getMessage()); 
		System.exit(0); 
		}
		}
		return connect;  
		}
		}
