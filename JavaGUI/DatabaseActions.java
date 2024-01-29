package crud;

import java.sql.SQLException; 
import java.sql.ResultSet; 

public interface DatabaseActions {
    void simpanData(String id, String nama, String alamat) throws SQLException;
    void ubahData(String id, String nama, String alamat) throws SQLException;
    void hapusData(String id) throws SQLException;
    ResultSet tampilData() throws SQLException;
    
}
