package View;

import Model.ModelWaliMhs;
import Node.NodeWaliMhs;
import java.util.ArrayList;
import java.util.Scanner;

public class ViewWaliMhs {
    static Scanner input = new Scanner(System.in);
    static ModelWaliMhs mWaliMhs = new ModelWaliMhs();
    static String iNama, iTelp, iNpm;
    
    public static void menuWaliMhs(){
        System.out.println("\n--- Menu Wali Mahasiswa ---");
        System.out.println("1. Update Wali Mahasiswa\n2. Hapus Wali Mahasiswa\n3. Tampilkan Semua Wali Mahasiswa\n4. Kembali");
        System.out.println("---              ---");
    }
    
    public void inputWaliMhs(String npm){
        System.out.println("--- Tambah Wali Mahasiswa ---");
        System.out.print("Masukkan Nama Wali Mahasiswa  : ");
        iNama = input.nextLine();
        System.out.print("Masukkan Nomor Telp           : ");
        iTelp = input.nextLine();
        mWaliMhs.insertWaliMhs(npm, iNama, iTelp);
    }
    
    public void updateWaliMhs(String npm){
//        System.out.println("--- Update Wali Mahasiswa ---");
//        System.out.print("Masukkan npm Mahasiswa       : ");
//        iNpm = input.nextLine();
        System.out.print("Masukkan Nama Wali Mahasiswa : ");
        iNama = input.nextLine();
        System.out.print("Masukkan Nomor Telp          : ");
        iTelp = input.nextLine();
        mWaliMhs.updateWaliMhs(npm, iNama, iTelp);
    }
    
    public void deleteWaliMhs(){
        System.out.println("--- Hapus Wali Mahasiswa ---");
        System.out.print("Masukkan NPM Mahasiswa : ");
        iNpm = input.nextLine();
        mWaliMhs.deleteWali(iNpm);
    }
    
    public void viewAllWaliMhs(){
        mWaliMhs.viewAllWaliMhs();
    }
    
    public static void main(String[] args) {
//        int pilih_menu;
//        String iNama, iFakultas;
//        ViewWaliMhs vWMhs = new ViewWaliMhs();
//        loops: while(true){
//            menuWaliMhs();
//            System.out.print("Masukkan menu yang ingin dipilih : ");
//            pilih_menu = input.nextInt();
//            input.nextLine();
//            switch(pilih_menu){
//                case 1:
//                    System.out.println("--- Update Wali Mahasiswa ---");
//                    System.out.print("Masukkan NPM Mahasiswa       : ");
//                    iNpm = input.nextLine();
//                    System.out.print("Masukkan Nama Wali Mahasiswa : ");
//                    iNama = input.nextLine();
//                    System.out.print("Masukkan Nomor Telp          : ");
//                    iTelp = input.nextLine();
//                    mWaliMhs.updateWaliMhs(iNpm, iNama, iTelp);
//                    continue loops;
//                case 2:
//                    System.out.println("--- Hapus Wali Mahasiswa ---");
//                    System.out.print("Masukkan NPM Mahasiswa : ");
//                    iNpm = input.nextLine();
//                    mWaliMhs.deleteWali(iNpm);
//                    continue loops;
//                case 3:
//                    mWaliMhs.viewAllWaliMhs();
//                    continue loops;
//                case 4:
//                    MainMenu.main(null);
//                    break;
//                default:
//                    System.out.println("Input tidak valid (Input 1-4) !");
//                    break;
//            }
//        }
    }
}
