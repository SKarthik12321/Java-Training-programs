package Practice;//Program 4 Harmonic Number

import java.util.*;

public class HarmonicNumbers {
    public static void main(String[] args) {
        System.out.print("Enter a number : ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        double sum = 0;
        for (int i = 1; i <= n; i++) {
            sum = sum + (1.0 / i);
        }
        System.out.println(sum);
        sc.close();
    }
}