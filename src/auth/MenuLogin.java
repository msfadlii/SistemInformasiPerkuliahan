package auth;
import View.Menu.MainClass;
import View.Menu.MainMenu;
import View.Menu.SekJurMenu;
import View.Menu.UserMahasiswaMenu;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

import View.ViewPendaftaran;
import auth.NodeUser;

public class MenuLogin {
    static Scanner input = new Scanner(System.in);
    static ModelUser cUser = new ModelUser();
    public static void main(String []args){
        menu();
    }
    public static void menu(){
        System.out.println("======================");    
        System.out.println("1.Daftar akun ");
        System.out.println("2.Login");
        System.out.println("3.Login Dosen");
        System.out.println("3.Keluar");
        System.out.println("======================");
        while(true){
            System.out.print("Pilihan Menu : ");
            int pilih ;
            pilih = input.nextInt();
            input.nextLine();
            if (pilih == 1){
                System.out.println("--- Registrasi Akun ---");
                System.out.print("Masukkan username : ");
                String username = input.nextLine();
                System.out.print("Masukkan password : ");
                String password = input.nextLine();
                cUser.registrasi(username, password);
                System.out.println("Akun berhasil didaftarkan");
                menu();
            }else if (pilih == 2){
                System.out.print("Masukkan username : ");
                String username = input.nextLine();
                System.out.print("Masukkan password : ");
                String password = input.nextLine();
                
                if(username.equals("admin")){
                    if(password.equals("admin123")){
                        System.out.println("Anda Login sebagai admin");
                        MainMenu.main(null);
                    }      
                }else if(username.equals("sekjur")){
                    if(password.equals("sekjur123")){
                        System.out.println("Anda Login sebagai Sekretaris Jurusan");
                        SekJurMenu.main(null);
                    }  
                }else{
                    for (int i=0; i<cUser.userslist.size(); i++){
                        if (cUser.userslist.get(i).getUsername().equals(username)){
                            if(cUser.userslist.get(i).getPassword().equals(password)){
                                System.out.println("Anda berhasil login sebagai mahasiswa");
                                UserMahasiswaMenu.main(username);
                            }else{
                                System.out.println("Username atau password anda salah ");
                            }
                        }
                    }
                }
            }else if(pilih == 3){
                System.out.println("--- Login Dosen ---");
                System.out.print("Masukkan NIP  : ");
                String nip = input.nextLine();
                System.out.println("Masukkan Password : ");
                String pass = input.nextLine();
                break;
            } else {
                break;
            }
        }
    }
}