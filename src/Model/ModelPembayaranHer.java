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
    
    public void insertPembayaran(){
        LocalDate tgl = LocalDate.now();
        this.arrPembHer.add(new NodePembayaranHer(tgl, mhs.getNpm()));
    }
    
    public void updatePembayaran(){
        
    }
    
    public void deletePembayaran(NodeMahasiswa mhs){
        for (int i = 0; i < arrPembHer.size(); i++) {
            if(mhs.getNpm().equals(arrPembHer.get(i).getMhs())){
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