// Project Name: Sahitya G Naik
// Problem 4
// Language: Java


import java.util.*;

public class Problem4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input Array
        System.out.println("Enter numbers separated by spaces:");
        String[] inputStr = scanner.nextLine().split(" ");
        
        // Converting string array to integer array
        int[] input = new int[inputStr.length];
        for (int i = 0; i < inputStr.length; i++) {
            input[i] = Integer.parseInt(inputStr[i]);
        }

         
        Map<Integer, Integer> countMap = new HashMap<>();

        
        for (int i = 1; i <= 9; i++) {
            countMap.put(i, 0);
        }

         
        for (int num : input) {
            for (int i = 1; i <= 9; i++) {
                if (num % i == 0) {
                    countMap.put(i, countMap.get(i) + 1);
                }
            }
        }

        
        System.out.println("Multiples count: " + countMap);
    }
}
