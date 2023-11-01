package Node;

import java.util.ArrayList;

public class NodeWaliMhs extends Manusia{
    public ArrayList<NodeWaliMhs> arrWMhs;
    String npm;
    public NodeWaliMhs(String nama, String no_telp) {
//        this.mahasiswa = mahasiswa;
        this.nama = nama;
        this.no_telp = no_telp;
    }
    public NodeWaliMhs(){
        this.arrWMhs = new ArrayList<>();
    }

    public void viewWaliMhs(){
//        System.out.println("NPM                  : "+this.mahasiswa.getNpm());
        System.out.println("Nama Wali Mahasiswa  : "+this.nama);
        System.out.println("No Telepon           : "+this.no_telp);
    }
    
    public String getNpm() {
        return npm;
    }

    public String getNama() {
        return nama;
    }

    public String getNo_telp() {
        return no_telp;
    }
    
    public void setNama(String nama) {
        this.nama = nama;
    }

    public void setNo_telp(String no_telp) {
        this.no_telp = no_telp;
    }   
}
