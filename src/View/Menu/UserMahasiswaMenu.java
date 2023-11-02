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
        System.out.println("1. Lihat Data Mahasiswa\n2. Lihat Data Wali\n3. Lihat Data Dosen Wali\n4. Logout");
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
                    MainClass.mMhs.searchMahasiswa(args);
                    continue loops;
                case 2:
                    MainClass.mWaliMhs.getWali(args);
                    continue loops;
                case 3:
                  //MainClass.mMhs.viewDosWalForMhs(args);
                    continue loops;
                case 4:
                    MenuLogin.main(null);
                    continue loops;
                default:
                    System.out.println("Input tidak valid (Input 1-4) !");
                    break;
            }
        }
    }
}
