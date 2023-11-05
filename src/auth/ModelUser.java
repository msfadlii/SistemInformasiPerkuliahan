package auth;

import java.util.ArrayList;
import java.util.Scanner;

public class ModelUser {
    public static NodeUser user = new NodeUser();
    public ArrayList <NodeUser> userslist = new ArrayList<>();
    
    public ModelUser(){
        initUser();
    }
    
    public void initUser(){
        userslist.add(new NodeUser("admin", "admin123"));
        userslist.add(new NodeUser("sekjur", "sekjur123"));
    }
    
    public void registrasi(String username, String password){
        userslist.add(new NodeUser (username , password));
        
    }
}
