package Node;

import Model.ModelWaliMhs;

public class NodeMahasiswa extends Manusia{
    String npm, jurusan;
    ModelWaliMhs waliMhs;
    NodeWaliMhs nWaliMhs;
    
    public NodeMahasiswa(String npm, String nama, String jurusan, String no_telp) {
        this.npm = npm;
        this.nama = nama;
        this.jurusan = jurusan;
        this.no_telp = no_telp;
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

    public String getNama() {
        return nama;
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