package Model;

import Node.NodeDosenWali;
import Node.NodeMahasiswa;
import View.ViewPendaftaran;
import java.util.ArrayList;

public class ModelDosenWali {
    public NodeDosenWali nDosenWali = new NodeDosenWali();
    public ModelDosenWali() {
        initDosWal();
    }
    
    public void initDosWal(){
        nDosenWali.arrDosenWali.add(new NodeDosenWali("0001", "Pak Kurniawan", "Teknik Informatika", "08123456789"));
        nDosenWali.arrDosenWali.add(new NodeDosenWali("0002", "Pak Andy", "Teknik Informatika", "081987654321"));
    }
    
    public void insertDosenWali(String nip, String nama, String jurusan, String no_telp){
        this.nDosenWali.arrDosenWali.add(new NodeDosenWali(nip, nama, jurusan, no_telp));
    }
    
    public void updateDosenWali(String nip, String nama, String jurusan, String no_telp){
        for (int i = 0; i < nDosenWali.arrDosenWali.size(); i++) {
            if(nip.equals(nDosenWali.arrDosenWali.get(i).getNip())){
                if(nama.equals("-")){
                    nDosenWali.arrDosenWali.get(i).setJurusan(jurusan);
                    nDosenWali.arrDosenWali.get(i).setNo_telp(no_telp);
                } else {
                    nDosenWali.arrDosenWali.get(i).setNama(nama);
                    nDosenWali.arrDosenWali.get(i).setJurusan(jurusan);
                    nDosenWali.arrDosenWali.get(i).setNo_telp(no_telp);
                }
            }
        }
    }
    
    public void deleteDosenWali(String nip){
        for (int i = 0; i < nDosenWali.arrDosenWali.size(); i++) {
            if(nip.equals(nDosenWali.arrDosenWali.get(i).getNip())){
                nDosenWali.arrDosenWali.remove(i);
            }
        }
    }
    
    public void viewAllDosenWali(){
        for (int i = 0; i < nDosenWali.arrDosenWali.size(); i++) {
            nDosenWali.arrDosenWali.get(i).viewDosenWali();
            System.out.println("---------------------");
        }
    }
}