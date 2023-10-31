package Model;

import Node.NodeMahasiswa;
import java.util.ArrayList;

public class ModelMahasiswa {
    ArrayList<NodeMahasiswa> arrMahasiswa;
    
    public ModelMahasiswa(){
        this.arrMahasiswa = new ArrayList<>();
    }
    
    public void insertMahasiswa(String npm, String nama, String jurusan, String no_telp){
        this.arrMahasiswa.add(new NodeMahasiswa(npm, nama, jurusan, no_telp));
    }
    
    public void updateMahasiswa(String npm, String new_nama, String new_jurusan, String new_telp){
        for (int i = 0; i < arrMahasiswa.size(); i++) {
            if(npm.equals(arrMahasiswa.get(i).getNpm())){
                if(new_nama.equals("-")) {
                    arrMahasiswa.get(i).setJurusan(new_jurusan);
                    arrMahasiswa.get(i).setNo_telp(new_telp);
                } else if (new_telp.equals("-")) {
                    arrMahasiswa.get(i).setNama(new_nama);
                    arrMahasiswa.get(i).setJurusan(new_jurusan);
                } else if (new_jurusan.equals("-")){
                    arrMahasiswa.get(i).setNama(new_nama);
                    arrMahasiswa.get(i).setNo_telp(new_telp);
                } else {
                    arrMahasiswa.get(i).setNama(new_nama);
                    arrMahasiswa.get(i).setNo_telp(new_telp);
                }
            }
        }
    }
    
    public void deleteMahasiswa(String npm){
        for (int i = 0; i < arrMahasiswa.size(); i++) {
            if(npm.equals(arrMahasiswa.get(i).getNpm())){
                arrMahasiswa.remove(i);
            }
        }
    }
    
    public void viewAllMahasiswa(){
        for (int i = 0; i < arrMahasiswa.size(); i++) {
            arrMahasiswa.get(i).viewMahasiswa();
            System.out.println("-----------------");
        }
    }
}