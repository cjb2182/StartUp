import java.io.*;

public class file_out{

    public static void main(String [] args)throws Exception{

        PrintWriter writer = new PrintWriter("output_file.txt","UTF-8");
        writer.println("The first line");
        writer.close();

    }
}
