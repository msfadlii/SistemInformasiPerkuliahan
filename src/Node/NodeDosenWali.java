package Node;

import java.util.ArrayList;

public class NodeDosenWali extends Manusia{
    String nip, jurusan;
    public ArrayList<NodeDosenWali> arrDosenWali;
    
    public NodeDosenWali(String nip, String nama, String jurusan, String no_telp) {
        this.nip = nip;
        this.nama = nama;
        this.jurusan = jurusan;
        this.no_telp = no_telp;
    }
    public NodeDosenWali(){
        arrDosenWali = new ArrayList<>();
    }
    
    public void viewDosenWali(){
        System.out.println("NIP        : "+this.nip);
        System.out.println("Nama Dosen : "+this.nama);
        System.out.println("Jurusan    : "+this.jurusan);
        System.out.println("Nomor Telp : "+this.no_telp);
    }

    public String getNip() {
        return nip;
    }

    public String getNama() {
        return nama;
    }
    
    public String getJurusan() {
        return jurusan;
    }
     
    public void setNama(String nama) {
        this.nama = nama;
    }

    public void setJurusan(String jurusan) {
        this.jurusan = jurusan;
    }

    public void setNo_telp(String no_telp) {
        this.no_telp = no_telp;
    }   
}