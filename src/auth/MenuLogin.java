package auth;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

import View.ViewPendaftaran;
import auth.user1;

public class MenuLogin {
   public static void main(String []args){
       Scanner input = new Scanner(System.in);
       List <user> userslist = new ArrayList<>();
       user admin = new user("admin" , "admin123");

       while(true){
           System.out.println("======================");    
       System.out.println("1.Daftar akun ");
       System.out.println("2.Login akun");
       System.out.println("3.Keluar");
       System.out.println("Pilihan Menu : ");
           System.out.println("======================");
       int pilih ;
       pilih = input.nextInt();
       
       if (pilih == 1){
               System.out.println("Registrasi Akun");
               System.out.print("Masukkan username : ");
               String username = input.next();
               System.out.print("Masukkan password : ");
               String password = input.next();
               userslist.add(new user (username , password));
               System.out.println("Akun berhasil didaftarkan");
               
       }else if (pilih == 2){
               System.out.print("Masukkan username : ");
               String username = input.next();
               System.out.print("Masukkan password : ");
               String password = input.next();
               boolean loggedIn = false;
               
               for (user User : userslist){
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
                   MainMenu.main(null);
               }
           }
           else{
               System.out.println("Login gagal. Username atau password anda salah ");

           }
       }else if(pilih == 3){
           break;
       }
               
   }
  }
}
