//Program 9 Vowel or Consonant

import java.util.*;

public class VowelOrConsonant {
    public static void main(String[] args){
        System.out.print("Enter an alphabet : ");
        Scanner sc = new Scanner(System.in);
        char ch = sc.next().toLowerCase().charAt(0);
        if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u'){
            System.out.println("Vowel");
        }
        else{
            System.out.println("Consonant");
        }
    }
}