package Node;

import java.time.LocalDate;

public class NodePembayaranHer {
    LocalDate tgl;
    String npm, kasir; 
    NodeMahasiswa mhs;//ambil npm
    
    public NodePembayaranHer(LocalDate tgl, String npm, String kasir){
        this.tgl = tgl;
        this.npm = npm;
        this.kasir = kasir;
    }
    
    public void viewPembayaranHer(){
        System.out.println("NPM Mahaiswa       : "+this.npm);
        System.out.println("Tanggal Pembayaran : "+this.tgl);
        System.out.println("Kasir              : "+this.kasir);
    }

    public String getMhs() {
        return mhs.getNpm();
    }
    
    
}
