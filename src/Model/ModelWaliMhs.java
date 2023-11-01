package Model;

import Node.NodeMahasiswa;
import Node.NodeWaliMhs;
import View.Menu.MainClass;
import java.util.ArrayList;
import java.lang.reflect.*;

public class ModelWaliMhs {
    NodeWaliMhs nWaliMhs = new NodeWaliMhs();
    public ModelWaliMhs(){
        
    }
    
    public NodeWaliMhs insertWaliMhs(String nama, String no_telp){
        this.nWaliMhs.arrWMhs.add(new NodeWaliMhs(nama, no_telp));
        
        return this.nWaliMhs;
    }
    
    public void updateWaliMhs(String npm, String new_nama, String no_telp){
        for (int i = 0; i < nWaliMhs.arrWMhs.size(); i++) {
            if(npm.equals(nWaliMhs.arrWMhs.get(i).getNpm())){
                if(new_nama.equals("-")){
                    nWaliMhs.arrWMhs.get(i).setNo_telp(no_telp);
                } else {
                    nWaliMhs.arrWMhs.get(i).setNama(new_nama);
                    nWaliMhs.arrWMhs.get(i).setNo_telp(no_telp);
                }
            }
        }
    }
    
    public void deleteWali(String npm){
        for (int i = 0; i < nWaliMhs.arrWMhs.size(); i++) {
            if(npm.equals(nWaliMhs.arrWMhs.get(i).getNpm())){
                nWaliMhs.arrWMhs.remove(i);
            }
        }
    }
    
    public void viewAllWaliMhs(){
        for (int i = 0; i < nWaliMhs.arrWMhs.size(); i++) {
            nWaliMhs.arrWMhs.get(i).viewWaliMhs();
            System.out.println("---------");
        }
    }
    
    public void getWali(String npm){
        for (int i = 0; i < nWaliMhs.arrWMhs.size(); i++) {
            if(npm.equals(MainClass.mMhs.nMhs.arrMahasiswa.get(i).getNpm()))
                System.out.println("Nama Wali : "+nWaliMhs.arrWMhs.get(i).getNama());
                System.out.println("No Telp   : "+nWaliMhs.arrWMhs.get(i).getNo_telp());
        }
    }
    
    public String getTelpWali(String npm){
        String telp="";
        for (int i = 0; i < nWaliMhs.arrWMhs.size(); i++) {
            if(npm.equals(nWaliMhs.arrWMhs.get(i).getNpm()))
                telp = nWaliMhs.arrWMhs.get(i).getNo_telp();
        }
        return telp;
    }
}