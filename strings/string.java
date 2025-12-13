// StringsPractice.java
// Extensive STRING-only practice collection.
// Paste into StringsPractice.java and run.

import java.util.*;

public class string{

    // helper to print section headers compactly
    static void h(String title) {
        System.out.println("\n--- " + title + " ---");
    }

    // 1. Creation & basic properties
    static void creationAndBasics() {
        h("Creation & basics");
        String a = "hello";                      // literal, interned
        String b = new String("hello");          // new String object
        String c = "he" + "llo";                 // compile-time concat -> interned
        String d = "he".concat("llo");           // runtime concat -> new String (usually)
        System.out.println("a==b? " + (a == b)); // false (different refs)
        System.out.println("a.equals(b)? " + a.equals(b)); // true (value check)
        System.out.println("length of a: " + a.length());
        System.out.println("isEmpty: " + "".isEmpty());
    }

    // 2. Comparison, equals, compareTo, equalsIgnoreCase
    static void comparisons() {
        h("Comparisons");
        String s1 = "Apple";
        String s2 = "apple";
        System.out.println("equals: " + s1.equals(s2));
        System.out.println("equalsIgnoreCase: " + s1.equalsIgnoreCase(s2));
        System.out.println("compareTo (lexicographic): " + s1.compareTo(s2));
        System.out.println("compareToIgnoreCase: " + s1.compareToIgnoreCase(s2));
    }

    // 3. Searching substrings: indexOf, lastIndexOf, contains, startsWith, endsWith, regionMatches
    static void searching() {
        h("Searching");
        String text = "java-programming-java";
        System.out.println("indexOf 'java': " + text.indexOf("java"));          // 0
        System.out.println("indexOf 'java' from 5: " + text.indexOf("java", 5));
        System.out.println("lastIndexOf 'java': " + text.lastIndexOf("java"));
        System.out.println("contains 'gram': " + text.contains("gram"));
        System.out.println("startsWith 'ja': " + text.startsWith("ja"));
        System.out.println("endsWith 'va': " + text.endsWith("va"));
        // regionMatches example: compare substring ignoring case
        boolean same = text.regionMatches(true, 5, "PROGRAMMING", 0, 11);
        System.out.println("regionMatches ignoring case: " + same);
    }

    // 4. Extracting & slicing: substring, charAt, toCharArray
    static void slicing() {
        h("Substring & char access");
        String s = "hello";
        System.out.println("substring(1,4): " + s.substring(1, 4)); // "ell"
        System.out.println("charAt(2): " + s.charAt(2));
        char[] chars = s.toCharArray();
        System.out.println("toCharArray: " + Arrays.toString(chars));
    }

    // 5. Case conversion, trimming, strip, replace, replaceAll, replaceFirst
    static void transformAndReplace() {
        h("Case / trim / replace");
        String s = "  Java  ";
        System.out.println("trim(): '" + s.trim() + "'");
        System.out.println("strip(): '" + s.strip() + "'"); // strip removes unicode whitespace
        String r = "aabbcc";
        System.out.println("replace 'b'->'B': " + r.replace('b', 'B')); // char replace
        System.out.println("replaceAll regex '\\\\w'->'#': " + r.replaceAll("\\w", "#"));
        System.out.println("replaceFirst 'a'->'A': " + r.replaceFirst("a", "A"));
    }

    // 6. Split and join
    static void splitAndJoin() {
        h("Split & Join");
        String csv = "one,two,,three, four ";
        String[] parts = csv.split(",", -1); // -1 keeps trailing empty fields
        System.out.println("split parts (len=" + parts.length + "): " + Arrays.toString(parts));
        String joined = String.join(" | ", parts);
        System.out.println("joined: " + joined);
    }

    // 7. Formatting
    static void formatting() {
        h("Formatting");
        String name = "Karthik";
        int age = 24;
        String s = String.format("Name: %s, Age: %d", name, age);
        System.out.println(s);
        System.out.println("printf style directly:");
        System.out.printf("Name:%s Age:%d%n", name, age);
    }

    // 8. Conversions: valueOf, parse (numbers), toString
    static void conversions() {
        h("Conversions");
        int n = 123;
        String fromInt = String.valueOf(n);
        String s = Integer.toString(n);
        System.out.println("valueOf: " + fromInt + " ; toString: " + s);
        // parsing back
        int p = Integer.parseInt("42");
        double d = Double.parseDouble("3.14");
        System.out.println("parsed int: " + p + ", double: " + d);
    }

    // 9. Immutability & performance note; StringBuilder usage
    static void immutabilityAndBuilder() {
        h("Immutability & StringBuilder");
        // Example where naive concatenation is slow (demonstration)
        String a = "";
        for (int i = 0; i < 5; i++) {
            a += i; // creates new String each loop (inefficient for large loops)
        }
        System.out.println("naive concat: " + a);

        // Better: StringBuilder (mutable sequence)
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < 5; i++) {
            sb.append(i);
        }
        String built = sb.toString(); // convert back to String
        System.out.println("StringBuilder result: " + built);

        // In multithreaded contexts, StringBuffer is thread-safe (synchronized).
    }

    // 10. Useful small algorithms using strings
    static void algorithms() {
        h("Algorithms (reverse, palindrome, count vowels/words, anagram)");
        String original = "level";
        // reverse (StringBuilder has reverse() built-in)
        String rev = new StringBuilder(original).reverse().toString();
        System.out.println(original + " reversed -> " + rev);
        System.out.println("palindrome? " + original.equals(rev));

        // reverse manually
        StringBuilder sb = new StringBuilder();
        for (int i = original.length() - 1; i >= 0; i--) sb.append(original.charAt(i));
        System.out.println("manual reverse -> " + sb.toString());

        // count vowels
        String s = "education";
        int vowels = 0;
        for (int i = 0; i < s.length(); i++) {
            char ch = Character.toLowerCase(s.charAt(i));
            if ("aeiou".indexOf(ch) >= 0) vowels++;
        }
        System.out.println("vowels in '" + s + "': " + vowels);

        // count words (simple split by whitespace)
        String sentence = "  split  this sentence into words   ";
        String[] words = sentence.trim().split("\\s+");
        System.out.println("words count: " + words.length);
        System.out.println("words: " + Arrays.toString(words));

        // anagram check (simple: sort chars)
        String x = "listen", y = "silent";
        boolean anagram = isAnagram(x, y);
        System.out.println(x + " & " + y + " anagram? " + anagram);
    }

    // helper for algorithms: anagram using sorting
    static boolean isAnagram(String a, String b) {
        if (a.length() != b.length()) return false;
        char[] ca = a.toCharArray();
        char[] cb = b.toCharArray();
        Arrays.sort(ca);
        Arrays.sort(cb);
        return Arrays.equals(ca, cb);
    }

    // 11. Regex basics: matches, replaceAll, split with regex
    static void regexBasics() {
        h("Regex basics");
        String s = "abc123xyz";
        System.out.println("matches digits? (\\d+): " + "123".matches("\\d+"));
        // replace all digits with '#'
        System.out.println("replaceAll digits: " + s.replaceAll("\\d", "#"));
        // split on non-word
        String t = "one.two,three four";
        String[] parts = t.split("\\W+"); // non-word separators
        System.out.println("split by non-word: " + Arrays.toString(parts));
    }

    // 12. Useful helpers: substring search counts, longest common prefix
    static void helpers() {
        h("Helpers (count occurrences, LCP)");
        String hay = "ababa";
        String needle = "aba";
        System.out.println("count occurrences of 'aba' in 'ababa': " + countOccurrences(hay, needle));

        String[] arr = {"flower", "flow", "flight"};
        System.out.println("longest common prefix: " + longestCommonPrefix(arr));
    }

    static int countOccurrences(String hay, String needle) {
        if (needle.isEmpty()) return 0;
        int count = 0;
        for (int idx = hay.indexOf(needle); idx != -1; idx = hay.indexOf(needle, idx + 1)) {
            count++;
        }
        return count;
    }

    static String longestCommonPrefix(String[] strs) {
        if (strs == null || strs.length == 0) return "";
        String prefix = strs[0];
        for (int i = 1; i < strs.length; i++) {
            while (!strs[i].startsWith(prefix)) {
                prefix = prefix.substring(0, prefix.length() - 1);
                if (prefix.isEmpty()) return "";
            }
        }
        return prefix;
    }

    // 13. Edge cases, null handling, intern, equals pitfalls
    static void edgeCases() {
        h("Edge cases & intern");
        String a = null;
        String b = "abc";
        // careful: b.equals(a) is safe, a.equals(b) would throw NullPointerException
        System.out.println("safe equals check: " + Objects.equals(a, b));
        String s1 = "pool";
        String s2 = new String("pool").intern(); // intern returns reference from string pool
        System.out.println("s1==s2 after intern? " + (s1 == s2));
    }

    // 14. Practice tasks you can try (TODOs as comments)
    static void practiceTasks() {
        h("Practice tasks (try to implement these yourself)");
        System.out.println("1) Count frequency of each char in a string.");
        System.out.println("2) Find first non-repeating character.");
        System.out.println("3) Find longest palindromic substring (center expansion).");
        System.out.println("4) Convert sentence to Title Case.");
        System.out.println("5) Check if two strings are rotations of each other.");
    }

    // main runs demos one by one
    public static void main(String[] args) {
        creationAndBasics();
        comparisons();
        searching();
        slicing();
        transformAndReplace();
        splitAndJoin();
        formatting();
        conversions();
        immutabilityAndBuilder();
        algorithms();
        regexBasics();
        helpers();
        edgeCases();
        practiceTasks();
    }
}