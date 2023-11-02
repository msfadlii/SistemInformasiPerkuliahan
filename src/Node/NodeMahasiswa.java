package Node;

import Model.ModelMahasiswa;
import Model.ModelWaliMhs;
import View.ViewDosenWali;
import java.util.ArrayList;

public class NodeMahasiswa extends Manusia{
    String npm, ijurusan, statusPemHer;
    public ArrayList<NodeMahasiswa> arrMahasiswa;
    public ArrayList<NodeDosenWali> arrDosenWali;
    NodeJurusan jurusan = null;
    NodeWaliMhs waliMhs = null;
    
    public NodeMahasiswa(String npm, String nama, NodeJurusan jurusan, String no_telp, NodeWaliMhs waliMhs) {
        this.npm = npm;
        this.nama = nama;
        this.jurusan = jurusan;
        this.no_telp = no_telp;
        this.statusPemHer = "Belum";
        this.waliMhs = waliMhs;
//        this.arrDosenWali = new ArrayList<>();
    }
    
    public NodeMahasiswa(){
        this.arrMahasiswa = new ArrayList<>();
    }
    
    public void viewMahasiswa(){
        System.out.println("NPM                      : "+this.npm);
        System.out.println("Nama Mahasiswa           : "+this.nama);
        System.out.println("Jurusan Mahasiswa        : "+this.jurusan);
        System.out.println("Nomor Telp               : "+this.no_telp);
    }
    
    public String getNpm() {
        return npm;
    }
    
//    public String getNipDosWal(){
//        return this.nDosWal.getNip();
//    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }
    
    public void setJurusan(String jurusan) {
        this.ijurusan = jurusan;
    }

    public void setNo_telp(String no_telp) {
        this.no_telp = no_telp;
    }  

    public void setStatusPemHer(String statusPemHer) {
        this.statusPemHer = statusPemHer;
    }

    public NodeWaliMhs getWaliMhs() {
        return waliMhs;
    }

    public void setWaliMhs(NodeWaliMhs waliMhs) {
        this.waliMhs = waliMhs;
    }
    
//    public void setMhsDosWal(String nip, NodeDosenWali doswal){
//        this.nDosWal = doswal;
//    }
    public void setJurusan(NodeJurusan nodeJurusan){
        this.jurusan = nodeJurusan;
    }
}