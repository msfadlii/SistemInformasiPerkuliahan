package View.Menu;

import Model.ModelMahasiswa;
import Model.ModelWaliMhs;
import Node.NodeMahasiswa;
import View.ViewDosenWali;
import View.ViewPendaftaran;
import auth.MenuLogin;
import java.util.Scanner;

public class UserMahasiswaMenu {    
    public static void menu(){
        System.out.println("--- Selamat Datang di Kampus ITATS ---");
        System.out.println("1. Daftar Mahasiswa\n2. Lihat Data Mahasiswa\n3. Lihat Data Wali\n4. Lihat Data Dosen Wali\n5. Logout");
    }
    
    public static void main(String args) {
        Scanner input = new Scanner(System.in);
        int pilih_menu;
        loops: while(true){
            menu();
            System.out.print("Masukkan menu yang ingin dipilih : ");
            pilih_menu = input.nextInt();
            input.nextLine();
            switch(pilih_menu){
                case 1:
                    ViewPendaftaran.main(args);
                    continue loops;
                case 2:
                    MainClass.mMhs.searchMahasiswa(MainClass.mMhs.searchUsername(args));
                    continue loops;
                case 3:
                    MainClass.mWaliMhs.getWali(MainClass.mMhs.searchUsername(args));
                    continue loops;
                case 4:
                    String output = MainClass.mMhs.viewDosWalForMhs(MainClass.mMhs.searchUsername(args));
                    System.out.println(""+output);
                    continue loops;
                case 5:
                    MenuLogin.menu();
                    break;
                default:
                    System.out.println("Input tidak valid (Input 1-4) !");
                    break;
            }
        }
    }
}
