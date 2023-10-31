package Model;

import Node.NodeDosenWali;
import java.util.ArrayList;


public class ModelDosenWali {
    ArrayList<NodeDosenWali> arrDosenWali;

    public ModelDosenWali() {
        arrDosenWali = new ArrayList<>();
    }
    
    public void insertDosenWali(String nip, String nama, String jurusan, String no_telp){
        this.arrDosenWali.add(new NodeDosenWali(nip, nama, jurusan, no_telp));
    }
    
    public void updateDosenWali(String nip, String nama, String jurusan, String no_telp){
        for (int i = 0; i < arrDosenWali.size(); i++) {
            if(nip.equals(arrDosenWali.get(i).getNip())){
                if(nama.equals("-")){
                    arrDosenWali.get(i).setJurusan(jurusan);
                    arrDosenWali.get(i).setNo_telp(no_telp);
                } else {
                    arrDosenWali.get(i).setNama(nama);
                    arrDosenWali.get(i).setJurusan(jurusan);
                    arrDosenWali.get(i).setNo_telp(no_telp);
                }
            }
        }
    }
    
    public void deleteDosenWali(String nip){
        for (int i = 0; i < arrDosenWali.size(); i++) {
            if(nip.equals(arrDosenWali.get(i).getNip())){
                arrDosenWali.remove(i);
            }
        }
    }
    
    public void viewAllDosenWali(){
        for (int i = 0; i < arrDosenWali.size(); i++) {
            arrDosenWali.get(i).viewDosenWali();
            System.out.println("---------------------");
        }
    }
}