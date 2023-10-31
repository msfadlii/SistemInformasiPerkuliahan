package View;

import Model.ModelPembayaranHer;
import java.time.LocalDate;
import java.util.Scanner;

public class ViewPembayaranHer {
    static ModelPembayaranHer mPembHer = new ModelPembayaranHer();
    public static void menuPembHer(){
        System.out.println("\n--- Menu Pembayaran Her ---");
        System.out.println("1. Pembayaran Her\n2. Hapus Pembayaran\n3. Tampilkan Semua Pembayaran\n4. Kembali");
        System.out.println("---              ---");
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int pilih_menu, iKasir;
        String iNpm, namaKasir="";
        loops: while(true){
            menuPembHer();
            System.out.print("Masukkan menu yang ingin dipilih : ");
            pilih_menu = input.nextInt();
            input.nextLine();
            switch(pilih_menu){
                case 1:
                    System.out.println("--- Pembayaran Her ---");
                    System.out.println("Pilih Kasir\n1. Pak Kasir\n2. Bu Kasir");
                    iKasir = input.nextInt();
                    System.out.print("Masukkan NPM Mahasiswa : ");
                    iNpm = input.nextLine();
                    input.nextLine();
                    switch(iKasir){
                        case 1:
                            namaKasir = "Pak Kasir";
                            break;
                        case 2:
                            namaKasir = "Bu Kasir";
                            break;
                    }
                    mPembHer.insertPembayaran(iNpm, namaKasir);
                    continue loops;
                case 2:
                    System.out.println("--- Hapus Pembayaran ---");
                    System.out.print("Masukkan NPM Mahasiswa : ");
                    iNpm = input.nextLine();
                    mPembHer.deletePembayaran(iNpm);
                    continue loops;
                case 3:
                    mPembHer.viewAllPembayaran();
                    continue loops;
                case 4:
                    MainMenu.main(null);
                    break;
                default:
                    System.out.println("Input tidak valid (Input 1-4) !");
                    break;
            }
        }
    }
}
