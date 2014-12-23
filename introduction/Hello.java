import java.util.Scanner;

public class Hello{

    public static void main(String [] args){

        Scanner scan = new Scanner(System.in);
        System.out.println("What is your name?");
        String name = scan.next();
        System.out.println("Hi, " + name);

        System.out.println("What is your favorite color?");
        String color = scan.next();
        System.out.println("Your favorite color is " + color);

        System.out.println("What is your shirt color?");
        String shirt_color = scan.next();
        System.out.println("Your shirt color is " + shirt_color);

    }
}
