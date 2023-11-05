package Model;

import Node.NodeJurusan;
import java.util.ArrayList;

public class ModelJurusan {
    ArrayList<NodeJurusan> jurusans;

    public ModelJurusan() {
        this.jurusans = new ArrayList<>();
        initJurusan();
    }
    
    public void initJurusan(){
        this.jurusans.add(new NodeJurusan(6, "Teknik Informatika", "FTETI"));
        this.jurusans.add(new NodeJurusan(13, "Sistem Informasi", "FTETI"));
    }
    
    public void insertJurusan(String nama, String fakultas){
        int index = jurusans.size();
        this.jurusans.add(new NodeJurusan(index+1, nama, fakultas));
    }
    
    public void viewAllJurusan(){
        for (int i = 0; i < jurusans.size(); i++) {
            this.jurusans.get(i).viewJurusan();
            System.out.println("----------------");
        }
    }
    
    public void updateJurusan(String nama_jurusan, String new_fakultas){
        for (int i = 0; i < jurusans.size(); i++) {
            if(nama_jurusan.equals(jurusans.get(i).getNama_jurusan())){
                jurusans.get(i).setNama_fakultas(new_fakultas);
            }
        }
    }
    
    public void deleteJurusan(String nama_jurusan){
        for (int i = 0; i < jurusans.size(); i++) {
            if(nama_jurusan.equals(jurusans.get(i).getNama_jurusan())){
                jurusans.remove(i);
            }
        }
    }
    
    public NodeJurusan searchJurusan(String nama_jurusan){
        NodeJurusan jurusan = null;
        for (int i = 0; i < jurusans.size(); i++) {
            if(nama_jurusan.equals(jurusans.get(i).getNama_jurusan())){
                jurusan = jurusans.get(i);
            }
        }
        return jurusan;
    }
}