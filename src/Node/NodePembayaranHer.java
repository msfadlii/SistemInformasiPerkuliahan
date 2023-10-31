package Node;

import java.time.LocalDate;

public class NodePembayaranHer {
    LocalDate tgl;
    NodeKasir kasir;    //ambil nama
    String npm; 
    NodeMahasiswa mhs;//ambil npm
    
    public NodePembayaranHer(LocalDate tgl, String npm){
        this.tgl = tgl;
        this.npm = npm;
    }
    
    public void viewPembayaranHer(){
        System.out.println("NPM Mahaiswa       : "+this.mhs.getNpm());
        System.out.println("Tanggal Pembayaran : "+this.tgl);
        System.out.println("Kasir              : "+this.kasir);
    }

    public String getMhs() {
        return mhs.getNpm();
    }
    
    
}
