package Model;

import Node.NodeWaliMhs;
import java.util.ArrayList;

public class ModelWaliMhs {
    ArrayList<NodeWaliMhs> arrWMhs;
    
    public ModelWaliMhs(){
        arrWMhs = new ArrayList<>();
    }
    
    public void insertWaliMhs(String npm, String nama, String no_telp){
        this.arrWMhs.add(new NodeWaliMhs(npm, nama, no_telp));
    }
    
    public void updateWaliMhs(String npm, String new_nama, String no_telp){
        for (int i = 0; i < arrWMhs.size(); i++) {
            if(npm.equals(arrWMhs.get(i).getNpm())){
                if(new_nama.equals("-")){
                    arrWMhs.get(i).setNo_telp(no_telp);
                } else {
                    arrWMhs.get(i).setNama(new_nama);
                    arrWMhs.get(i).setNo_telp(no_telp);
                }
            }
        }
    }
    
    public void deleteWali(String npm){
        for (int i = 0; i < arrWMhs.size(); i++) {
            if(npm.equals(arrWMhs.get(i).getNpm())){
                arrWMhs.remove(i);
            }
        }
    }
    
    public void viewAllWaliMhs(){
        for (int i = 0; i < arrWMhs.size(); i++) {
            arrWMhs.get(i).viewWaliMhs();
            System.out.println("---------");
        }
    }
    
    public String getNamaWali(String npm){
        String nama="";
        for (int i = 0; i < arrWMhs.size(); i++) {
            if(npm.equals(arrWMhs.get(i).getNpm()))
                nama = arrWMhs.get(i).getNama();
        }
        return nama;
    }
    
    public String getTelpWali(String npm){
        String telp="";
        for (int i = 0; i < arrWMhs.size(); i++) {
            if(npm.equals(arrWMhs.get(i).getNpm()))
                telp = arrWMhs.get(i).getNo_telp();
        }
        return telp;
    }
}