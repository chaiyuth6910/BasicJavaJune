package javacondition;

public class JavaCondition {

    public static void main(String[] args) {
        
//        int number = 10;
//        
//        if(number > 10){
//            System.out.println("Large number");
//        }else{
//            System.out.println("Less number");
//        }

        String username = "admin";
        String password = "1234";
        
        if(username=="admin" && password == "1234"){
            System.out.println("Login success");
        }else{
            System.out.println("Login fail!!!");
        }

            
        
    }
    
}
