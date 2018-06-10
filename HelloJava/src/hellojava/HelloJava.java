package hellojava;

public class HelloJava {

    public static void main(String[] args) {
        System.out.println("\tHello Java");
        System.out.println("\'สวัสดีจาวา\'");

        showinfo("Samit", 33); 
    }

    public static void showinfo(String name, int age) {
        System.out.println("สวัสดี " + name + " คุณอายุ " + age);
    }

} // class
