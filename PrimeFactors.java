//Program 5 Prime Factors

import java.util.*;

public class PrimeFactors {
    public static void main(String[] args){
        System.out.print("Enter a number : ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for(int i=2; i*i<=n; i++){
            while(n % i == 0){
                System.out.print(i + " ");
                n = n/i;
            }
        }
        if (n>1){
            System.out.print(n);
        }
        sc.close();
    }
}
