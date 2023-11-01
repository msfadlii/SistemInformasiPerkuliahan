package View;

import Model.ModelMahasiswa;
import Model.ModelPembayaranHer;
import Model.ModelPendaftaran;
import Model.ModelWaliMhs;
import Node.NodeJurusan;
import Node.NodeWaliMhs;
import View.Menu.MainClass;
import View.Menu.UserMahasiswaMenu;
import auth.MenuLogin;

import java.util.Scanner;

public class ViewPendaftaran {
    static Scanner input = new Scanner(System.in);
    static ModelPendaftaran mPendaftaran = new ModelPendaftaran();
    static ModelPembayaranHer mPembHer = new ModelPembayaranHer();
    static String iNpm;
    
    public void inputMahasiswaP(){
//        String iNama, iJurusan, iTelp;
//        System.out.println("--- Pendaftaran Mahasiswa ---");
//        System.out.print("Masukkan NPM Mahasiswa : ");
//        iNpm = input.nextLine();
//        System.out.print("Masukkan Nama Mahasiswa  : ");
//        iNama = input.nextLine();
//        System.out.print("Masukkan Jurusan         : ");
//        iJurusan = input.nextLine();
//        System.out.print("Masukkan Nomor Telp      : ");
//        iTelp = input.nextLine();
//        NodeJurusan nJur = null;
//        nJur = MainClass.mJurusan.searchJurusan(iJurusan);
////        MainClass.mMhs.insertMahasiswa(iNpm, iNama, nJur, iTelp);
//        MainClass.mMhs.nMhs.setWaliMhs(MainClass.mWaliMhs.insertWaliMhs(wNama, wTelp));
//        MainClass.mMhs.insertMahasiswa(iNpm, iNama, nJur, iTelp, MainClass.mWaliMhs.insertWaliMhs(wNama, wTelp));
    }
    
    public void inputWaliMhsP(){
        String iNama, iTelp;
//        System.out.print("Masukkan Nama Wali Mahasiswa : ");
//        iNama = input.nextLine();
//        System.out.print("Masukkan Nomor Telp : ");
//        iTelp = input.nextLine();
//        MainClass.mWaliMhs.insertWaliMhs(iNpm, iNama, iTelp);
    }

    public static void main(String[] args) {
        ViewPendaftaran daftar = new ViewPendaftaran();
        String iNama, iJurusan, iTelp, wNama, wTelp;
        System.out.println("--- Pendaftaran Mahasiswa ---");
        System.out.print("Masukkan NPM Mahasiswa : ");
        iNpm = input.nextLine();
        System.out.print("Masukkan Nama Mahasiswa  : ");
        iNama = input.nextLine();
        System.out.print("Masukkan Jurusan         : ");
        iJurusan = input.nextLine();
        System.out.print("Masukkan Nomor Telp      : ");
        iTelp = input.nextLine();
        System.out.print("Masukkan Nama Wali Mahasiswa : ");
        wNama = input.nextLine();
        System.out.print("Masukkan Nomor Telp : ");
        wTelp = input.nextLine();
        NodeJurusan nJur = null;
        nJur = MainClass.mJurusan.searchJurusan(iJurusan);
//        MainClass.mMhs.insertMahasiswa(iNpm, iNama, nJur, iTelp);
        //MainClass.mMhs.nMhs.setWaliMhs(MainClass.mWaliMhs.insertWaliMhs(wNama, wTelp));
        MainClass.mMhs.insertMahasiswa(iNpm, iNama, nJur, iTelp, MainClass.mWaliMhs.insertWaliMhs(wNama, wTelp));
        
        daftar.inputWaliMhsP();
        UserMahasiswaMenu.main(iNpm);
//        boolean cek = mPembHer.searchPembayaran(iNpm);
//        if(cek){
//            MenuLogin.main(null);
//        } else {
//            System.out.println("Selesaikan Pembayaran Her melalui kasir terlebih dahulu!");
//        }
    }
}