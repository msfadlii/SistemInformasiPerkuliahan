package View;

import Model.ModelDosenWali;
import View.Menu.MainMenu;

import java.util.Scanner;

public class ViewDosenWali {
    public static ModelDosenWali mDosWal = new ModelDosenWali();
    public static void menuJurusan(){
        System.out.println("\n--- Menu Dosen Wali ---");
        System.out.println("1. Tambah Dosen Wali\n2. Update Dosen Wali\n3. Hapus Dosen Wali\n4. Hubungkan Mahasiswa & Dosen WAli\n5. Tampilkan Semua Dosen Wali\n6. Kembali");
        System.out.println("---              ---");
    }
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int pilih_menu;
        String iNama, iNip, iJurusan, iTelp, iNpm;
        loops: while(true){
            menuJurusan();
            System.out.print("Masukkan menu yang ingin dipilih : ");
            pilih_menu = input.nextInt();
            input.nextLine();
            switch(pilih_menu){
                case 1:
                    System.out.println("--- Tambah Dosen Wali ---");
                    System.out.print("Masukkan NIP Dosen     : ");
                    iNip = input.nextLine();
                    System.out.print("Masukkan Nama Dosen    : ");
                    iNama = input.nextLine();
                    System.out.print("Masukkan Jurusan Dosen : ");
                    iJurusan = input.nextLine();
                    System.out.print("Masukkan Nomor Telp    : ");
                    iTelp = input.nextLine();
                    mDosWal.insertDosenWali(iNip, iNama, iJurusan, iTelp);
                    continue loops;
                case 2:
                    System.out.println("--- Update Dosen Wali ---");
                    System.out.print("Masukkan NIP Dosen yang ingin diubah : ");
                    iNip = input.nextLine();
                    System.out.print("Masukkan Nama Dosen    : ");
                    iNama = input.nextLine();
                    System.out.print("Masukkan Jurusan Dosen : ");
                    iJurusan = input.nextLine();
                    System.out.print("Masukkan Nomor Telp    : ");
                    iTelp = input.nextLine();
                    mDosWal.updateDosenWali(iNip, iNama, iJurusan, iTelp);
                    continue loops;
                case 3:
                    System.out.println("--- Hapus Dosen Wali ---");
                    System.out.print("Masukkan NIP Dosen  : ");
                    iNip = input.nextLine();
                    mDosWal.deleteDosenWali(iNip);
                    continue loops;
                case 4:
                    System.out.println("--- Hubungkan Mahasiswa & Dosen Wali");
                    System.out.print("Masukkan NIP Dosen : ");
                    iNip = input.nextLine();
                    System.out.print("Masukkan NPM Mahasiswa : ");
                    iNpm = input.nextLine();
                    
                    break;
                case 5:
                    mDosWal.viewAllDosenWali();
                    continue loops;
                case 6:
                    MainMenu.main(null);
                    break;
                default:
                    System.out.println("Input tidak valid (Input 1-4) !");
                    break;
            }
        }
    }
}
