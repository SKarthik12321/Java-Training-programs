import java.util.*;

public class string {
    static  Scanner sc = new Scanner(System.in);

    static void h(String title){
        System.out.println("\n---" + title + "---");
    }

    //1. Creation Basic Properties
    static void creation(){
        h("Creation & basics");
        String a = "Hello";
        String b = new String("Hello");
        String c = "he" + "llo";
        String d = "he".concat("llo");
        System.out.println("a==b? " + (a==b));
        System.out.println("equals" + a.equals(b));
        System.out.println("length : " + a.length());
        System.out.println("isEmpty : " + "".isEmpty());
    }

    //2. Comparison equals, compareTo, equalsIgnoreCase
    static void comparison(){
        h("Comparisons");
        String s1 = "Apple";
        String s2 = "apple";
        System.out.println("equals : " + s1.equals(s2));
        System.out.println("equalsIgnoreCase : " + s1.equalsIgnoreCase(s2));
    }

    //3. Searching substrings
    static void searching(){
        h("searching");
        System.out.print("Enter a sentence : ");
        String text = sc.nextLine();

        System.out.println("indexOf : " + text.indexOf("Java"));
        System.out.println("lastIndexOf : " + text.lastIndexOf("Java"));
        System.out.println("contains : " + text.contains("Java"));
        System.out.println("startsWith : " + text.startsWith("Ja"));
        System.out.println("endsWith : " + text.endsWith("va"));
        boolean same = text.regionMatches(true, 5, "Programming", 0, 11);
        System.out.println("same : " + same)
    }

    public static void main(String[] args){
        //creation();
        //comparison();
        searching();
    }
}
