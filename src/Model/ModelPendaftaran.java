package Model;

import Node.NodeJurusan;
import Node.NodeMahasiswa;
import Node.NodePembayaranHer;
import Node.NodePendaftaran;
import Node.NodeWaliMhs;
import java.time.LocalDate;
import java.util.ArrayList;

public class ModelPendaftaran {
    ArrayList<NodePendaftaran> arrMPendaftaran;
    
    public ModelPendaftaran(){
        this.arrMPendaftaran = new ArrayList<>();
    }
    
    public void insertPendaftaran(LocalDate tgl, NodeMahasiswa nMhs, NodeWaliMhs nWaliMhs, NodeJurusan nJurusan, NodePembayaranHer nPembHer){
        arrMPendaftaran.add(new NodePendaftaran(tgl, nMhs, nWaliMhs, nJurusan, nPembHer));
    }
    
    public void viewPendaftaran(){
        for (int i = 0; i < arrMPendaftaran.size(); i++) {
            System.out.println("Tanggal Pendaftaran : "+arrMPendaftaran.get(i).getTgl());
            System.out.println("NPM Mahasiswa       : "+arrMPendaftaran.get(i).getnMhs().getNpm());
            System.out.println("Jurusan             : "+arrMPendaftaran.get(i).getnJurusan());
            System.out.println("Wali Mahasiswa      : "+arrMPendaftaran.get(i).getnWaliMhs().getNama());
            System.out.println("Pembayaran Her      : "+arrMPendaftaran.get(i).getnPembHer()); //ambil Status sudah atau belum
        }
    }
}
