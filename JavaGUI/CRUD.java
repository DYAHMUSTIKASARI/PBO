package crud;

import java.sql.Connection; 
import java.sql.PreparedStatement;
import java.sql.Statement; 
import java.sql.ResultSet; 
import java.sql.SQLException; 

public class CRUD extends AbstractCRUD implements DatabaseActions {
    private String id, nama, alamat; 
	 private Connection CRUDkoneksi; 
	 private PreparedStatement CRUDpsmt; 
	 private Statement CRUDstat; 
	 private ResultSet CRUDhasil;
	 private String CRUDquery; 
 
 public CRUD(){ 
 try { 
     KoneksiMysql connection = new KoneksiMysql(); 
     CRUDkoneksi = connection.getKoneksi(); 
 }catch(SQLException ex){ 
     System.out.println(ex);
 } 
 }

 @Override
 public void setID(String id) 
 { 
 this.id = id; 
 }

@Override
 public String getID() 
 { 
 return id; 
 }

@Override
 public void setNama(String nama)
 {
 this.nama = nama; 
 }

@Override
 public String getNama() 
 { 
 return nama; 
 }

@Override
 public void setAlamat(String alamat) 
 { 
 this.alamat = alamat; 
 }

@Override
 public String getAlamat() 
 { 
 return alamat; 
 }

@Override
 public ResultSet tampilData() 
 { CRUDquery = "select * from siswa"; 
 try { 
 CRUDstat = CRUDkoneksi.createStatement(); 
 CRUDhasil = CRUDstat.executeQuery(CRUDquery); 
 }catch(SQLException e) { 
     e.printStackTrace();
 }
 return CRUDhasil; 
 }

@Override
 public void simpanData(String id,String nama, String alamat)
 { CRUDquery = "insert into siswa values(?,?,?)"; 
 try { 
 CRUDpsmt = CRUDkoneksi.prepareStatement(CRUDquery); 
 CRUDpsmt.setString(1, id); 
 CRUDpsmt.setString(2, nama); 
 CRUDpsmt.setString(3, alamat); 
 CRUDpsmt.executeUpdate(); 
 CRUDpsmt.close(); 
 }catch(Exception e) { 
 System.out.println(e);
 }
 }

@Override
 public void ubahData(String id, String nama, String alamat) 
 { CRUDquery = "update siswa set nama=?, alamat=? where id=?"; 
 try { 
 CRUDpsmt = CRUDkoneksi.prepareStatement(CRUDquery); 
 CRUDpsmt.setString(1, nama); 
 CRUDpsmt.setString(2, alamat); 
 CRUDpsmt.setString(3, id); 
 CRUDpsmt.executeUpdate(); 
 CRUDpsmt.close(); 
 } catch (Exception e) { 
 System.out.println(e);
 }
 }

@Override
 public void hapusData(String id) 
 { CRUDquery = "delete from siswa where id=?";
 try {
 CRUDpsmt = CRUDkoneksi.prepareStatement(CRUDquery); 
 CRUDpsmt.setString(1, id); 
 CRUDpsmt.executeUpdate(); 
 CRUDpsmt.close(); 
 } catch (Exception e) { 
 System.out.println(e); 
}
}   
}
