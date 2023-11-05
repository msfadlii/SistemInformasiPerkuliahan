package Node;

import Model.ModelMahasiswa;
import Model.ModelWaliMhs;
import View.Menu.MainClass;
import View.ViewDosenWali;
import auth.NodeUser;
import java.util.ArrayList;

public class NodeMahasiswa extends Manusia{
    String npm, ijurusan, statusPemHer="Belum", username;
    public ArrayList<NodeMahasiswa> arrMahasiswa;
    NodeJurusan jurusan = null;
    NodeWaliMhs waliMhs = null;
    NodeDosenWali dosWal =null;
    
    public NodeMahasiswa(String npm, String nama, NodeJurusan jurusan, String no_telp, NodeWaliMhs waliMhs) {
        this.npm = npm;
        this.nama = nama;
        this.jurusan = jurusan;
        this.no_telp = no_telp;
        this.statusPemHer = "Belum";
        this.waliMhs = waliMhs;
        this.username = "";
    }
    
    public NodeMahasiswa(){
        this.arrMahasiswa = new ArrayList<>();
    }
    
    public void viewMahasiswa(){
        System.out.println("NPM                      : "+this.npm);
        System.out.println("Nama Mahasiswa           : "+this.nama);
        System.out.println("Jurusan Mahasiswa        : "+this.jurusan.getNama_jurusan());
        System.out.println("Nomor Telp               : "+this.no_telp);
    }
    
    public String getNpm() {
        return npm;
    }

    public String getNama() {
        return nama;
    }

    public String getStatusPemHer() {
        return statusPemHer;
    }

    public NodeJurusan getJurusan() {
        return jurusan;
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

    public void setJurusan(NodeJurusan nodeJurusan){
        this.jurusan = nodeJurusan;
    }

    public void setDosWal(NodeDosenWali dosWal) {
        this.dosWal = dosWal;
    }

    public NodeDosenWali getDosWal() {
        return dosWal;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getUsername() {
        return username;
    }
}