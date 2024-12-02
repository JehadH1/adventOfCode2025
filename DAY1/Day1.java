package DAY1;

import java.io.File;
import java.util.Collections;
import java.util.Scanner;
import java.util.Vector;

public class Day1 {
    public static void main(String[] args) {
        Scanner input = null;
        try {
            input = new Scanner(new File("DAY1/DData1.txt"));

        } catch (Exception e) {
            System.out.println(e);
        }
        Vector<Integer> L1 = new Vector<>();
        Vector<Integer> L2 = new Vector<>();

        if (input == null) {
            return;
        }

        while (input.hasNextLine()) {
            L1.add(input.nextInt());
            L2.add(input.nextInt());
        }

        Collections.sort(L1);
        Collections.sort(L2);
        int num = 0;
        for(int i = 0; i<L1.size();i++){
            num += Math.abs((L1.get(i) - L2.get(i)));
        }

        System.out.println(num);
    }
}