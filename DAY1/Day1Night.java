package DAY1;

import java.io.File;
import java.util.Collections;
import java.util.Scanner;
import java.util.Vector;

public class Day1Night {
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
        
        int total = 0;
        for(int i =0; i < L1.size(); i++){
            total += (freqFinder(L2, L1.get(i))) * L1.get(i);
    
        }
        System.out.println(total);
    }

    public static int freqFinder(Vector<Integer> list, int key) {
        int freq = 0;

        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) == key) {
                freq++;
            }
        }
        return freq;
    }
}
