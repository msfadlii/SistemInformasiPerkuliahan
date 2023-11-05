package View;

import Model.ModelMahasiswa;
import Model.ModelPembayaranHer;
import Model.ModelPendaftaran;
import Model.ModelWaliMhs;
import Node.NodeJurusan;
import Node.NodeMahasiswa;
import Node.NodePendaftaran;
import Node.NodeWaliMhs;
import Utility.generateNpm;
import View.Menu.MainClass;
import View.Menu.UserMahasiswaMenu;
import auth.MenuLogin;
import auth.ModelUser;
import java.time.LocalDate;

import java.util.Scanner;

public class ViewPendaftaran {
    static Scanner input = new Scanner(System.in);
    public static ModelPendaftaran mPendaftaran = new ModelPendaftaran();
    static ModelPembayaranHer mPembHer = new ModelPembayaranHer();
    static String iNpm;

    public static void main(String args) {
        String iNama, iJurusan, iTelp, wNama, wTelp;
        System.out.println("--- Pendaftaran Mahasiswa ---");
//        System.out.print("Masukkan NPM Mahasiswa : ");
//        iNpm = input.nextLine();
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
        NodeJurusan nJur;
        nJur = MainClass.mJurusan.searchJurusan(iJurusan);
        iNpm = generateNpm.buatNpm(MainClass.mJurusan.searchJurusan(iJurusan).getKode_jurusan());
        MainClass.mMhs.insertMahasiswa(iNpm, iNama,nJur , iTelp, MainClass.mWaliMhs.insertWaliMhs(wNama, wTelp));
        LocalDate tgl = LocalDate.now();
        NodeMahasiswa nMaha = mPendaftaran.searchMhs(iNpm);
        NodeWaliMhs nWalMaha = mPendaftaran.searchWalMhs(wNama);
        mPendaftaran.insertPendaftaran(tgl, nMaha, nWalMaha, nJur);
        MainClass.mMhs.setMhsUsername(iNpm, args);
        UserMahasiswaMenu.main(args);
    }
}