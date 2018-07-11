import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.io.PrintWriter;


public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        File file = new File("text.in");
        PrintWriter write = new PrintWriter("text.out");
        if(file.isFile()){
            write.println("It works!");
            Scanner scan = new Scanner(file);
            String str = scan.nextLine();
            System.out.println(str);
        }
        else{
            write.println("It doesn't work");
        }
        write.close();
    }
}

