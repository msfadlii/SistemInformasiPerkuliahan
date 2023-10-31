package Model;

import Node.NodeMahasiswa;
import Node.NodePembayaranHer;
import java.time.LocalDate;
import java.util.ArrayList;

public class ModelPembayaranHer {
    ArrayList<NodePembayaranHer> arrPembHer;
    NodeMahasiswa mhs;
    
    public ModelPembayaranHer(){
        this.arrPembHer = new ArrayList<>();
    }
    
    public void insertPembayaran(String npm, String namaKasir){
        LocalDate tgl = LocalDate.now();
        this.arrPembHer.add(new NodePembayaranHer(tgl, npm, namaKasir));
    }
    
    public void deletePembayaran(String npm){
        for (int i = 0; i < arrPembHer.size(); i++) {
            if(npm.equals(arrPembHer.get(i).getMhs())){
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
}