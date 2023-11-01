package auth;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

import View.ViewPendaftaran;
import auth.User;

public class MenuLogin {
   public static void main(String []args){
        Scanner input = new Scanner(System.in);
        List <User> userslist = new ArrayList<>();
        User admin = new User("admin" , "admin123");

        while(true){
            System.out.println("======================");    
            System.out.println("1.Daftar akun ");
            System.out.println("2.Login");
            System.out.println("3.Login Dosen");
            System.out.println("3.Keluar");
            System.out.println("======================");
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
                userslist.add(new User (username , password));
                System.out.println("Akun berhasil didaftarkan");

            }else if (pilih == 2){
                System.out.print("Masukkan username : ");
                String username = input.nextLine();
                System.out.print("Masukkan password : ");
                String password = input.nextLine();
                boolean loggedIn = false;

                for (User User : userslist){
                    if (User.getUsername().equals(username) && User.login(password)){
                        System.out.println("Anda berhasil login sebagai mahasiswa");
                        ViewPendaftaran.main(null);
                        //loggedIn = true;
                        break;
                    }
                    else{
                        System.out.println("Login gagal. Username atau password anda salah ");
                    }
                }

                if(!loggedIn){
                    if(admin.getUsername().equals(username) && admin.login(password)){
                        System.out.println("Anda berhasil login sebagai admin ");
                        View.Menu.MainMenu.main(null);
                    }
                }else{
                    System.out.println("Login gagal. Username atau password anda salah ");

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
