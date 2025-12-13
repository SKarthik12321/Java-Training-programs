package Practice;

import java.util.*;

public class SumOfThreeZero {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n : ");
        int n = sc.nextInt();
        int[] a = new int[n];
        System.out.print("Enter " + n + " integers:");
        for(int i = 0; i < n; i++){
            a[i] = sc.nextInt();
        }
        int count = 0;
        System.out.print("Triplets whose sum is 0: ");
        for(int i=0; i<n-2; i++){
            for (int j = i+1; j<n-1; j++){
                for (int k=j +1; k<n; k++){
                    if (a[i] + a[j] + a[k] == 0){
                        System.out.println(a[i] + " " + a[j] + " " + a[k]);
                        count++;
                    }
                }
            }
        }
        System.out.println("Number of distant triplets: " + count);
        sc.close();
    }
}
