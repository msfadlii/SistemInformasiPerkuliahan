package View;

import Model.ModelMahasiswa;
import View.Menu.MainMenu;

import java.util.Scanner;

public class ViewMahasiswa {
    static ModelMahasiswa mMahasiswa = new ModelMahasiswa();
    static ViewWaliMhs vWaliMhs = new ViewWaliMhs();
    public static void menuMahasiswa(){
        System.out.println("\n--- Menu Mahasiswa ---");
        System.out.println("1. Tambah Mahasiswa\n2. Update Mahasiswa\n3. Hapus Mahasiswa\n4. Tampilkan Semua Mahasiswa\n5. Update Wali Mahasiswa\n6. Hapus Wali Mahasiswa\n7. Tampilkan Semua Wali Mahasiswa\n8. Kembali");
        System.out.println("---              ---");
    }
        
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int pilih_menu;
        String iNpm, iNama, iJurusan, iTelp;
        loops: while(true){
            menuMahasiswa();
            System.out.print("Masukkan menu yang ingin dipilih : ");
            pilih_menu = input.nextInt();
            input.nextLine();
            switch(pilih_menu){
                case 1:
                    System.out.println("--- Tambah Mahasiswa ---");
                    System.out.print("Masukkan NPM Mahasiswa : ");
                    iNpm = input.nextLine();
                    System.out.print("Masukkan Nama Mahasiswa  : ");
                    iNama = input.nextLine();
                    System.out.print("Masukkan Jurusan         : ");
                    iJurusan = input.nextLine();
                    System.out.print("Masukkan Nomor Telp      : ");
                    iTelp = input.nextLine();
                    vWaliMhs.inputWaliMhs(iNpm);
                    mMahasiswa.insertMahasiswa(iNpm, iNama, iJurusan, iTelp);
                    continue loops;
                case 2:
                    System.out.println("--- Update Mahasiswa ---");
                    System.out.print("Masukkan NPM Mahasiswa yang ingin diubah : ");
                    iNpm = input.nextLine();
                    System.out.print("Masukkan Nama Mahasiswa : ");
                    iNama = input.nextLine();
                    System.out.print("Masukkan Jurusan        : ");
                    iJurusan = input.nextLine();
                    System.out.print("Masukkan Nomor Telp     : ");
                    iTelp = input.nextLine();
                    mMahasiswa.updateMahasiswa(iNpm, iNama, iJurusan, iTelp);
                    continue loops;
                case 3:
                    System.out.println("--- Hapus Mahasiswa ---");
                    System.out.print("Masukkan NPM Mahasiswa : ");
                    iNpm = input.nextLine();
                    mMahasiswa.deleteMahasiswa(iNpm);
                    continue loops;
                case 4:
                    mMahasiswa.viewAllMahasiswa();
                    continue loops;
//                case 5:
//                    System.out.println("--- Update Wali Mahasiswa ---");
//                    System.out.print("Masukkan NPM Mahasiswa : ");
//                    iNpm = input.nextLine();
//                    vWaliMhs.updateWaliMhs(iNpm);
//                    continue loops;
//                case 6:
//                    mWaliMhs.viewAllWaliMhs();
//                    continue loops;
                case 5:
                    System.out.println("--- Update Wali Mahasiswa ---");
                    System.out.print("Masukkan NPM Mahasiswa       : ");
                    iNpm = input.nextLine();
                    vWaliMhs.updateWaliMhs(iNpm);
                    continue loops;
                case 6:
                    vWaliMhs.deleteWaliMhs();
                    continue loops;
                case 7:
                    vWaliMhs.viewAllWaliMhs();
                    continue loops;
                case 8:
                    MainMenu.main(null);
                    break;
                default:
                    System.out.println("Input tidak valid (Input 1-4) !");
                    break;
            }
        }
    }
}
