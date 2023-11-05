package auth;

import Node.NodeMahasiswa;
import java.util.ArrayList;

public class NodeUser {
    String username;
    String password;
    
    public NodeUser(String username , String password){
        this.username = username;
        this.password = password;
    }
    
    public NodeUser(){
    } 
    
    public String getUsername(){
        return username;
    }

    public String getPassword() {
        return password;
    }
    
    public boolean login(String password){
       return this.password.equals(password);
    }

    public class Admin extends NodeUser{
        public Admin(String username, String password) {
            super(username, password);
        }
    }
}
