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
        int totalTimes = 0;
        int unSafe = 0;
        int safe = 0;
        String regex = "[ ]";

        int sign = 0;

        while (input.hasNextLine()) {
            String line = input.nextLine();
            String[] arr = line.split(regex);
            int[] difference = new int[arr.length];
            totalTimes++;

            if (Integer.parseInt(arr[0]) - Integer.parseInt(arr[1]) < 0) {
                sign = 1;
            } else {
                sign = -1;
            }

            for (int i = 0; i < arr.length - 1; i++) {
                int diff = ((Integer.parseInt(arr[i]) - Integer.parseInt(arr[i + 1]) < 0) ? 1 : -1);
                difference[i] = diff;
                int absDiff = Math.abs(Integer.parseInt(arr[i]) - Integer.parseInt(arr[i + 1]));
                if ((absDiff >= 4) || (absDiff == 0)) {
                    unSafe++;
                    break;
                }
                if(difference[i] != sign){
                    unSafe++;
                    break;
                }
            }

        }
        safe = totalTimes - unSafe;
        System.err.println("total times " + totalTimes + " safe " + safe + " unsafe " + unSafe);
    }
}
