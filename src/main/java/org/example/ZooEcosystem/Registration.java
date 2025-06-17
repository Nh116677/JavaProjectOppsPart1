package org.example.ZooEcosystem;

public class Registration {
    private String email;
    private String userName;
    private String password;

    public boolean setEmail(String email){
        if (email.endsWith(("@yahoo.com"))){
            this.email = email;
            return true;
        }else{
            System.out.println("Invalid email.  Only Yahoo emails are allowed.");
            return false;
        }
    }
    public boolean setUserName(String userName){
        if (userName != null && userName.length()>6){
            this.userName = userName;
            return true;
        }else{
            System.out.println("Username must be longer than 6 characters.");
            return false;
        }
    }

    public boolean setPassword(String password){
        if (password != null && password.length()>6 && !password.contains(userName)){
            this.password=password;
            return true;
        }else{
            System.out.println("Invalid password.  It must be longer than 6 characters and cannot contain the username.");
            return false;
        }
    }
    public void displayUserInfo(){
        System.out.println("Email: " + email);
        System.out.println("Username: " + userName);
    }
}
