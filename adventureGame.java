import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
public class adventureGame{
    public static void main (String[] args) {
        Scanner scan = new Scanner(System.in);
        File room = new File("room.txt");
        try {
            scan = new Scanner (room);
        } catch(FileNotFoundException e) {
            System.out.println("Oops");
        } 
        while (scan.hasNextLine()){

        }
    }
}