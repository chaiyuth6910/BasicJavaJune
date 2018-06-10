package javacondition;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Multicondition {
    public static void main(String[] args) throws IOException {
        // 80-100  Grade A
        // 70-79    Grade B
        // 60-69    Grade C
        // 50-59    Grade D
        // < 50      Grade F
        System.out.print("Enter Score: ");
        InputStreamReader score = new InputStreamReader(System.in);
        BufferedReader bfscore = new BufferedReader(score);
        double  datascore = Double.parseDouble(bfscore.readLine());
        
        if(datascore >= 80 && datascore <= 100){
            System.out.println("Grade A");
        }else if(datascore >= 70 && datascore <= 79){
            System.out.println("Grade B");
        }else if(datascore >=60 && datascore <= 69){
            System.out.println("Grade C");
        }else if(datascore >= 50 && datascore <= 59){
            System.out.println("Grade D");
        }else{
            System.out.println("Grade F");
        }
        
    }
}
