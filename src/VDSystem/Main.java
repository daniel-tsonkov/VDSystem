package VDSystem;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        String data = null;
        FileReader reader = new FileReader("C:\\Users\\dan\\IdeaProjects\\VDSystem1\\src\\VDSystem\\set.txt");
        Scanner myReader = new Scanner(reader);
        while (myReader.hasNextLine()) {
            data = myReader.nextLine();
        }
        myReader.close();

        try{
            MainScreen.setSkinTheme(data);
        } catch (Exception e) {
            e.printStackTrace();
        }
        MainScreen mainScreen = new MainScreen();
    }
}