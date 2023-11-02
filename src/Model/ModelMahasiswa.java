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
    NodeJurusan nJurusan = null;
    
    public ModelMahasiswa(){   
    }
    
    public void insertMahasiswa(String npm, String nama, NodeJurusan jurusan, String no_telp, NodeWaliMhs waliMhs){
        this.nMhs.arrMahasiswa.add(new NodeMahasiswa(npm, nama, jurusan, no_telp, waliMhs));
    }
    
    public void tambahDosenWali(NodeDosenWali dosenWali){
        this.nMhs.arrDosenWali.add(dosenWali);
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
    
    public String getMhsNpm(){
        return nMhs.getNpm();
    }
    
   
    
//    public void hubMhsDosWal(String nip, String npm){
//        String nip_bener="";
//        for (int i = 0; i < ViewDosenWali.mDosWal.nDosenWali.arrDosenWali.size(); i++) {
//            if(nip.equals(ViewDosenWali.mDosWal.nDosenWali.arrDosenWali.get(i).getNip())){
//                nip_bener = nip;
//            }
//        }
//        for (int i = 0; i < nMhs.arrMahasiswa.size(); i++) {
//            if(npm.equals(nMhs.arrMahasiswa.get(i).getNpm())){
//                nMhs.setMhsDosWal(nip_bener, ViewDosenWali.mDosWal.nDosenWali);
//            }
//        }
//    }
    
//    public void viewDosWalForMhs(String npm){
//        for (int i = 0; i < ViewDosenWali.mDosWal.nDosenWali.arrDosenWali.size(); i++) {
//            if(nMhs.arrMahasiswa.get(i).getNipDosWal().equals(ViewDosenWali.mDosWal.nDosenWali.arrDosenWali.get(i).getNip())){
//                System.out.println("NIP        : "+ViewDosenWali.mDosWal.nDosenWali.arrDosenWali.get(i).getNip());
//                System.out.println("Nama Dosen : "+ViewDosenWali.mDosWal.nDosenWali.arrDosenWali.get(i).getNama());
//                System.out.println("Jurusan    : "+ViewDosenWali.mDosWal.nDosenWali.arrDosenWali.get(i).getJurusan());
//            }
//        }
//        System.out.println("Anda Belum Memiliki Dosen Wali");
//    }
}