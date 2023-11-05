package Model;

import Node.NodeJurusan;
import Node.NodeMahasiswa;
import Node.NodePembayaranHer;
import Node.NodePendaftaran;
import Node.NodeWaliMhs;
import View.Menu.MainClass;
import java.time.LocalDate;
import java.util.ArrayList;

public class ModelPendaftaran {
    //ArrayList<NodePendaftaran> arrMPendaftaran;
    public NodePendaftaran nPendaft = new NodePendaftaran();
    public ModelPendaftaran(){
        
    }
    
    public void insertPendaftaran(LocalDate tgl, NodeMahasiswa nMhs, NodeWaliMhs nWaliMhs, NodeJurusan nJurusan){
        this.nPendaft.arrPendaft.add(new NodePendaftaran(tgl, nMhs, nWaliMhs, nJurusan));
    }
    
    public void viewPendaftaran(){
        for (int i = 0; i < this.nPendaft.arrPendaft.size(); i++) {
            System.out.println("Tanggal Pendaftaran : "+this.nPendaft.arrPendaft.get(i).getTgl());
            System.out.println("NPM Mahasiswa       : "+this.nPendaft.arrPendaft.get(i).getnMhs().getNpm());
            System.out.println("Jurusan             : "+this.nPendaft.arrPendaft.get(i).getnJurusan());
            System.out.println("Wali Mahasiswa      : "+this.nPendaft.arrPendaft.get(i).getnWaliMhs().getNama());
            System.out.println("Pembayaran Her      : "+this.nPendaft.arrPendaft.get(i).getnPembHer()); //ambil Status sudah atau belum
        }
    }
    
    public NodeMahasiswa searchMhs(String npm){
        NodeMahasiswa mhs=null;
        for (int i = 0; i < MainClass.mMhs.nMhs.arrMahasiswa.size(); i++) {
            if(npm.equals(MainClass.mMhs.nMhs.arrMahasiswa.get(i).getNpm())){
                mhs = MainClass.mMhs.nMhs.arrMahasiswa.get(i);
            }
        }
        return mhs;
    }
    
//    public NodeJurusan searchJur(String namaJurusan){
//        NodeJurusan jur=null;
//        for (int i = 0; i < MainClass.mJurusan.jurusans.size(); i++) {
//            if(namaJurusan.equals(MainClass.mJurusan.jurusans.get(i).getNama_jurusan())){
//                jur = MainClass.mJurusan.jurusans.get(i);
//            }
//        }
//        return jur;
//    }
    
    public NodeWaliMhs searchWalMhs(String namaWali){
        NodeWaliMhs walMhs=null;
        for (int i = 0; i < MainClass.mWaliMhs.nWaliMhs.arrWMhs.size(); i++) {
            if(namaWali.equals(MainClass.mWaliMhs.nWaliMhs.arrWMhs.get(i).getNama())){
                walMhs = MainClass.mWaliMhs.nWaliMhs.arrWMhs.get(i);
            }
        }
        return walMhs;
    }
    
    public NodePembayaranHer searchPembHer(String npm){
        NodePembayaranHer pembHer = null;
        for (int i = 0; i < MainClass.mPembHer.arrPembHer.size(); i++) {
            if(npm.equals(nPendaft.getnMhs().getNpm())){
                pembHer = MainClass.mPembHer.arrPembHer.get(i);
            }
        }
        return pembHer;
    }
    
}
