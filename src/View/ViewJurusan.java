package View;

import Model.ModelJurusan;
import View.Menu.MainMenu;

import java.util.Scanner;

public class ViewJurusan {
    static ModelJurusan mJurusan = new ModelJurusan();
    public static void menuJurusan(){
        System.out.println("\n--- Menu Jurusan ---");
        System.out.println("1. Tambah Jurusan\n2. Update Fakultas\n3. Hapus Jurusan\n4. Tampilkan Semua Jurusan\n5. Kembali");
        System.out.println("---              ---");
    }
        
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int pilih_menu;
        String iNama, iFakultas;
        loops: while(true){
            menuJurusan();
            System.out.print("Masukkan menu yang ingin dipilih : ");
            pilih_menu = input.nextInt();
            input.nextLine();
            switch(pilih_menu){
                case 1:
                    System.out.println("--- Tambah Jurusan ---");
                    System.out.print("Masukkan Nama Jurusan : ");
                    iNama = input.nextLine();
                    System.out.print("Masukkan Nama Fakultas : ");
                    iFakultas = input.nextLine();
                    mJurusan.insertJurusan(iNama, iFakultas);
                    continue loops;
                case 2:
                    System.out.println("--- Update Jurusan ---");
                    System.out.print("Masukkan Nama Jurusan : ");
                    iNama = input.nextLine();
                    System.out.print("Masukkan Nama Fakultas : ");
                    iFakultas = input.nextLine();
                    mJurusan.updateJurusan(iNama, iFakultas);
                    continue loops;
                case 3:
                    System.out.println("--- Hapus Jurusan ---");
                    System.out.print("Masukkan Nama Jurusan : ");
                    iNama = input.nextLine();
                    mJurusan.deleteJurusan(iNama);
                    continue loops;
                case 4:
                    mJurusan.viewAllJurusan();
                    continue loops;
                case 5:
                    MainMenu.main(null);
                    break;
                default:
                    System.out.println("Input tidak valid (Input 1-4) !");
                    break;
            }
        }
    }
}
