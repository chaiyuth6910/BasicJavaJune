package javacondition;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Login {
    public static void main(String[] args) throws IOException {
        System.out.print("Enter username: ");
        InputStreamReader username = new InputStreamReader(System.in);
        BufferedReader bfusername = new BufferedReader(username);
        String  user = bfusername.readLine();
        
        System.out.print("Enter password: ");
        InputStreamReader password = new InputStreamReader(System.in);
        BufferedReader bfpassword = new BufferedReader(password);
        String  pass = bfpassword.readLine();
        
        // เช็ค username and password
        if(user.equals("admin") && pass.equals("1234")){
            System.out.println("Login Success");
        }else{
            System.out.println("Login Fail!!");
        }
        
    }
}
