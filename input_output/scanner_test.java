import java.util.Scanner;
import java.io.*;

public class scanner_test
{
    String str = "HELLO WORLD";
    Scanner scan = new Scanner(str);
    scan.hasNext()// true
    scan.next() // first token is HELLO
    scan.hasNext()//true
    scan.next() // world
    scan.hasNext()? 

    // read from string and convert string to uppercase
    public static String readFromString(Scanner scan){
        String result="";
        String word;
        while (scan.hasNext()){
            word = scan.next(); 
            result = result + word.toUpperCase() + " ";
        }
        return result;
    }

    public static String readNameFromCommandLine(Scanner scan){

        System.out.println("What is your name? ");
        String input_name = scan.next();
        return input_name;
    }

    public static int readAgeFromCommandLine(Scanner scan){

        System.out.println("How old are you? ");
        int input_age = scan.nextInt();
        return input_age;
    }

    public static String readFromFile(String filename) throws Exception{
      
        BufferedReader buf = new BufferedReader(new FileReader("input.txt"));
        String line = buf.readLine();
        return line; 
    }

    public static void main(String [] args) throws Exception{

        Scanner scan = new Scanner(System.in); // still reading in from commandline
        System.out.println("What is your name? ");
        String your_name = scan.next();
        System.out.println("What is your sister's name?");
        String sister_name = scan.next();

        System.out.println("Your name is " + your_name + " and your sister's name is " + sister_name);

        String name = readNameFromCommandLine(scan);
        int age = readAgeFromCommandLine(scan);
        String info = "Hi, " + name + "! You are " + age + " years old.";
        System.out.println(info);

        Scanner scan_str = new Scanner(info);
        String uppercaseInfo = readFromString(scan_str);
        System.out.println(uppercaseInfo);

        String filename = "input.txt";
        String readFile = readFromFile(filename);

    }
}


