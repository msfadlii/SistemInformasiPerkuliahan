package Node;

import java.time.LocalDate;

public class NodePembayaranHer {
    LocalDate tgl;
    String npm, kasir, status; 
    NodeMahasiswa mhs;//ambil npm
    
    public NodePembayaranHer(LocalDate tgl, String npm, String kasir, String status){
        this.tgl = tgl;
        this.npm = npm;
        this.kasir = kasir;
        this.status = status;
    }
    
    public void viewPembayaranHer(){
        System.out.println("NPM Mahaiswa       : "+this.npm);
        System.out.println("Tanggal Pembayaran : "+this.tgl);
        System.out.println("Kasir              : "+this.kasir);
        System.out.println("Status             : "+this.status);
    }

    public String getNpm() {
        return npm;
    }

    public String getMhs() {
        return mhs.getNpm();
    }

    public String getStatus() {
        return status;
    }
}
