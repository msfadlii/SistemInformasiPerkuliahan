package auth;

public class user1 {
    String username;
    String password;
    
    public user1(String username , String password){
        this.username = username;
        this.password = password;
    }
    
    public String getUsername(){
        return username;
    }
    public boolean login(String password){
       return this.password.equals(password);
    }
    
}
