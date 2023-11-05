package View.Menu;

import Model.ModelPenentuanDosenWali;
import auth.MenuLogin;
import java.util.Scanner;

public class SekJurMenu {
    static ModelPenentuanDosenWali mPenDosWal = new ModelPenentuanDosenWali();
    
    public static void menuSekjur(){
        System.out.println("--- Menu Sekretaris Jurusan ---");
        System.out.println("1. Penentuan Dosen Wali untuk Mahasiswa\n2. Lihat Dosen Wali dan Mahasiswa\n3. Logout");
    }
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int pilih_menu;
        String iNip, iNpm;
        loops: while(true){
            menuSekjur();
            System.out.print("Masukkan menu yang ingin dipilih : ");
            pilih_menu = input.nextInt();
            input.nextLine();
            switch(pilih_menu){
                case 1:
                    System.out.print("Masukkan NIP  : ");
                    iNip = input.nextLine();
                    System.out.print("Masukkan NPM  : ");
                    iNpm = input.nextLine();
                    mPenDosWal.hubungkanMhsDosWal(iNpm, iNip);
                    continue loops;
                case 2:
                    
                    continue loops;
                case 3:
                    MenuLogin.main(null);
                    break;
                default:
                    System.out.println("Input tidak valid (Input 1-4) !");
                    break;
            }
        }
    }
}
