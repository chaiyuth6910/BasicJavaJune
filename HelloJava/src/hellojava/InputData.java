package hellojava;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class InputData {
    public static void main(String[] args) throws IOException{
        
        System.out.print("Enter your name: ");
         
        // รับค่าจากผู้ใช้
        InputStreamReader in = new InputStreamReader(System.in);
        BufferedReader buffer = new BufferedReader(in);
        String data = buffer.readLine();
        
        // แสดงข้อมูลออกมา
        System.out.println("Hello "+data);
        
        System.out.print("Enter your age: ");
        InputStreamReader in1 = new InputStreamReader(System.in);
        BufferedReader buffer1 = new BufferedReader(in1);
        String data1 = buffer1.readLine();
        
        System.out.println("Your age is "+data1);
   
    }
}
