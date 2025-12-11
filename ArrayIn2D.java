//Function Program 1 2Dimensional Array

import java.util.*;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;

public interface ArrayIn2D {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of rows (M): ");
        int m = sc.nextInt();
        System.out.print("Enter number of columns (N): ");
        int n = sc.nextInt();

        int[][] arr = new int[m][n];
        System.out.println("Enter " + (m*n) + " integers:");
        for(int i = 0; i < m; i++){
            for(int j = 0; j < n; j++){
                arr[i][j] = sc.nextInt();
            }
        }

        PrintWriter pw = new PrintWriter(new OutputStreamWriter(System.out));
        pw.println("2D Array is: ");
        for(int i=0; i<m; i++){
            for(int j=0; j<n; j++){
                pw.print(arr[i][j] + " ");
            }
            pw.println();
        }
        pw.flush();
        sc.close();
    }
}
