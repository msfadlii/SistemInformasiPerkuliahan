package View.Menu;

import View.ViewDosenWali;
import View.ViewJurusan;
import View.ViewMahasiswa;
import View.ViewPembayaranHer;
import auth.MenuLogin;

import java.util.Scanner;

public class MainMenu {
    public static void menu(){
        System.out.println("--- Menu Admin ---");
        System.out.println("1. Jurusan\n2. Dosen Wali\n3. Mahasiswa\n4. Pembayaran Her\n5. Logout");
        System.out.println("---            ---");
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int pilih_menu;
        do{
            input_ulang:
            menu();
            System.out.print("Masukkan menu yang ingin dipilih : ");
            pilih_menu = input.nextInt();
            switch(pilih_menu){
                case 1:
                    ViewJurusan.main(null);
                    break;
                case 2:
                    ViewDosenWali.main(null);
                    break;
                case 3:
                    ViewMahasiswa.main(null);
                    break;
                case 4:
                    ViewPembayaranHer.main(null);
                    break;
                case 5:
                    MenuLogin.main(null);
                    break;
                default:
                    System.out.println("Input tidak valid (Input 1-4) !");
                    continue;
            }
        }while(pilih_menu > 4);
    }
}