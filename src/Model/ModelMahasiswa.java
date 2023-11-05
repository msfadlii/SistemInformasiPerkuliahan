package Model;

import Node.NodeDosenWali;
import Node.NodeJurusan;
import Node.NodeMahasiswa;
import Node.NodeWaliMhs;
import View.ViewDosenWali;
import View.ViewPendaftaran;
import java.util.ArrayList;
import java.lang.reflect.*;

public class ModelMahasiswa {
    public NodeMahasiswa nMhs = new NodeMahasiswa();
    
    public ModelMahasiswa(){   
    }
    
    public void insertMahasiswa(String npm, String nama, NodeJurusan jurusan, String no_telp, NodeWaliMhs waliMhs){
        this.nMhs.arrMahasiswa.add(new NodeMahasiswa(npm, nama, jurusan, no_telp, waliMhs));
    }
    
    public void updateMahasiswa(String npm, String new_nama, String new_jurusan, String new_telp){
        for (int i = 0; i < nMhs.arrMahasiswa.size(); i++) {
            if(npm.equals(nMhs.arrMahasiswa.get(i).getNpm())){
                if(new_nama.equals("-")) {
                    nMhs.arrMahasiswa.get(i).setJurusan(new_jurusan);
                    nMhs.arrMahasiswa.get(i).setNo_telp(new_telp);
                } else if (new_telp.equals("-")) {
                    nMhs.arrMahasiswa.get(i).setNama(new_nama);
                    nMhs.arrMahasiswa.get(i).setJurusan(new_jurusan);
                } else if (new_jurusan.equals("-")){
                    nMhs.arrMahasiswa.get(i).setNama(new_nama);
                    nMhs.arrMahasiswa.get(i).setNo_telp(new_telp);
                } else {
                    nMhs.arrMahasiswa.get(i).setNama(new_nama);
                    nMhs.arrMahasiswa.get(i).setNo_telp(new_telp);
                }
            }
        }
    }
    
    public void deleteMahasiswa(String npm){
        for (int i = 0; i < nMhs.arrMahasiswa.size(); i++) {
            if(npm.equals(nMhs.arrMahasiswa.get(i).getNpm())){
                nMhs.arrMahasiswa.remove(i);
            }
        }
    }
    
    public void viewAllMahasiswa(){
        for (int i = 0; i < nMhs.arrMahasiswa.size(); i++) {
            nMhs.arrMahasiswa.get(i).viewMahasiswa();
            System.out.println("-----------------");
        }
    }
    
    public void searchMahasiswa(String npm){
        for (int i = 0; i < nMhs.arrMahasiswa.size(); i++) {
            if(npm.equals(nMhs.arrMahasiswa.get(i).getNpm())){
                nMhs.arrMahasiswa.get(i).viewMahasiswa();    
            }
        }
    }
    
    public String viewDosWalForMhs(String npm){
        String output="";
        for (int i = 0; i < nMhs.arrMahasiswa.size(); i++) {
            if(npm.equals(nMhs.arrMahasiswa.get(i).getNpm())){
                if(nMhs.getStatusPemHer().equals("Belum")){
                    output = "Anda Belum Membayar Her";
                } 
//                else if (nMhs.getStatusPemHer().equals("Sudah") && nMhs.getDosWal().getNama().equals(null)){
//                    output = "Anda Belum Memiliki Dosen Wali";
//                } 
                else{
                    output = "NIP        : "+nMhs.arrMahasiswa.get(i).getDosWal().getNip()
                            + "\nNama Dosen : "+nMhs.arrMahasiswa.get(i).getDosWal().getNama()
                            + "\nJurusan    : "+nMhs.arrMahasiswa.get(i).getDosWal().getJurusan();
                }
            }
        }
        return output;
    }
    
    public String searchUsername(String username){
        String result="";
        for (int i = 0; i < nMhs.arrMahasiswa.size(); i++) {
            if(username.equals(nMhs.arrMahasiswa.get(i).getUsername())){
                result = nMhs.arrMahasiswa.get(i).getNpm();
            }
        }
        return result;
    }
    
    public void setMhsUsername(String npm, String username){
        for (int i = 0; i < nMhs.arrMahasiswa.size(); i++) {
            if(npm.equals(nMhs.arrMahasiswa.get(i).getNpm())){
                nMhs.arrMahasiswa.get(i).setUsername(username);
            }
        }
    }
}