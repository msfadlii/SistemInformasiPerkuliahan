package View;

import Model.ModelMahasiswa;
import Model.ModelPembayaranHer;
import Model.ModelPendaftaran;
import Model.ModelWaliMhs;
import auth.MenuLogin;

import java.util.Scanner;

public class ViewPendaftaran {
    static Scanner input = new Scanner(System.in);
    static ModelPendaftaran mPendaftaran = new ModelPendaftaran();
    static ModelMahasiswa mMahasiswa = new ModelMahasiswa();
    static ModelWaliMhs mWaliMhs = new ModelWaliMhs();
    static ModelPembayaranHer mPembHer = new ModelPembayaranHer();
    static String iNpm;
    
    public void inputMahasiswaP(){
        String iNama, iJurusan, iTelp;
        System.out.println("--- Pendaftaran Mahasiswa ---");
        System.out.print("Masukkan NPM Mahasiswa : ");
        iNpm = input.nextLine();
        System.out.print("Masukkan Nama Mahasiswa  : ");
        iNama = input.nextLine();
        System.out.print("Masukkan Jurusan         : ");
        iJurusan = input.nextLine();
        System.out.print("Masukkan Nomor Telp      : ");
        iTelp = input.nextLine();
        mMahasiswa.insertMahasiswa(iNpm, iNama, iJurusan, iTelp);
    }
    
    public void inputWaliMhsP(){
        String iNama, iTelp;
        System.out.print("Masukkan Nama Wali Mahasiswa : ");
        iNama = input.nextLine();
        System.out.print("Masukkan Nomor Telp : ");
        iTelp = input.nextLine();
        mWaliMhs.insertWaliMhs(iNpm, iNama, iTelp);
    }

    public static void main(String[] args) {
        ViewPendaftaran daftar = new ViewPendaftaran();
        daftar.inputMahasiswaP();
        daftar.inputWaliMhsP();
        boolean cek = mPembHer.searchPembayaran(iNpm);
        if(cek){
            MenuLogin.main(null);
        } else {
            System.out.println("Selesaikan Pembayaran Her melalui kasir terlebih dahulu!");
        }
    }
}
