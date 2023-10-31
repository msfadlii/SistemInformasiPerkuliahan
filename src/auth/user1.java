package auth;

public class user {
    String username;
    String password;
    
    public user(String username , String password){
        this.username = username;
        this.password = password;
    }
    
    public String getUsername(){
        return username;
    }
    public boolean login(String password){
       return this.password.equals(password);
    }

    public class Admin extends user{
        public Admin(String username, String password) {
            super(username, password);
        }

    }
}
