// Project Name: Sahitya G Naik
// Problem 2
// Language: Java



import java.util.*;

public class Problem2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number a: ");
        int a = sc.nextInt();

        for (int i = 0; i < a; i++) {
            int num = 2 * i + 1;
            if (i < a - 1) {
                System.out.print(num + ", ");
            } else {
                System.out.print(num);
            }
        }

        System.out.println();  
        sc.close();
    }
}
