package Model;

import Node.NodeMahasiswa;
import Node.NodePembayaranHer;
import View.Menu.MainClass;
import View.ViewPendaftaran;
import java.time.LocalDate;
import java.util.ArrayList;

public class ModelPembayaranHer {
    ArrayList<NodePembayaranHer> arrPembHer;
    NodeMahasiswa mhs;
    
    public ModelPembayaranHer(){
        this.arrPembHer = new ArrayList<>();
    }
    
    public void insertPembayaran(NodeMahasiswa npm, String namaKasir, String status){
//        if(status.equals("Belum")){
//            LocalDate tgl = LocalDate.parse("-");
//            this.arrPembHer.add(new NodePembayaranHer(tgl, npm, namaKasir, status));
//            mhs.setStatusPemHer(status);
//        } else {
            LocalDate tgl = LocalDate.now();
            MainClass.mMhs.nMhs.setStatusPemHer(status);
            ViewPendaftaran.mPendaftaran.nPendaft.setnPembHer(status);
            this.arrPembHer.add(new NodePembayaranHer(tgl, npm, namaKasir, status));
//        }
    }
    
    public void deletePembayaran(String npm){
        for (int i = 0; i < arrPembHer.size(); i++) {
            if(npm.equals(arrPembHer.get(i).getNpm())){
                arrPembHer.remove(i);
            }
        }
    }
    
    public void viewAllPembayaran(){
        for (int i = 0; i < arrPembHer.size(); i++) {
            arrPembHer.get(i).viewPembayaranHer();
            System.out.println("---------------------");
        }
    }
    
    public boolean searchPembayaran(String npm){
        for (int i = 0; i < arrPembHer.size(); i++) {
            if(npm.equals(arrPembHer.get(i).getNpm())){
                if(arrPembHer.get(i).getStatus().equals("Sudah")){
                    return true;
                }
                return false;
            }
        }
        return false;
    }
}