/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package crud;

/**
 *
 * @author Izzuel
 */
public abstract class AbstractCRUD {
    protected String id, nama, alamat;

    public abstract void setID(String id);
    public abstract String getID();
    public abstract void setNama(String nama);
    public abstract String getNama();
    public abstract void setAlamat(String alamat);
    public abstract String getAlamat();
}
