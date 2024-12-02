package DAY2;

import java.io.File;
import java.util.Scanner;

public class Day2 {
    public static void main(String[] args) {
        Scanner input = null;
        try {
            input = new Scanner(new File("DAY2/DData2.txt"));
        } catch (Exception e) {
            System.err.println(e);
        }
        
    }
}
