package View.Menu;

import java.util.Scanner;

public class UserMahasiswaMenu {
    public static void menu(){
        System.out.println("--- Selamat Datang di Kampus ITATS ---");
        System.out.println("1. Lihat Data Mahasiswa\n2. Lihat Data Wali\n3. Lihat Data Dosen Wali");
    }
    public static void main(String[] args) {
        menu();
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