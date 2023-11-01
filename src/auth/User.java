package auth;

public class User {
    String username;
    String password;
    
    public User(String username , String password){
        this.username = username;
        this.password = password;
    }
    
    public String getUsername(){
        return username;
    }
    public boolean login(String password){
       return this.password.equals(password);
    }

    public class Admin extends User{
        public Admin(String username, String password) {
            super(username, password);
        }
    }
}
