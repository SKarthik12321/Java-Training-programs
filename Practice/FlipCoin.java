package Practice;//Program 1 Flipping a coin

import java.util.Scanner;

public class FlipCoin {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the no. of times to flip the coin: ");
        int n = sc.nextInt();
        if (n < 0){
            System.out.println("Please enter a positive integer");
            return;
        }
        int heads = 0;
        int tails = 0;
        for (int i = 0; i < n; i++){
            double value = Math.random();
            if (value<0.5){
                tails++;
            }
            else{
                heads++;
            }
        }
        double percentageHeads = (heads * 100.0) / n;
        double percentageTails = (tails * 100.0) / n;
        System.out.println("Heads: " + percentageHeads);
        System.out.println("Tails: " + percentageTails);
        sc.close();
    }
}