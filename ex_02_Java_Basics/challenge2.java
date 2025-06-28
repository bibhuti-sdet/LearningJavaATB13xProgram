package ex_02_Java_Basics;

public class challenge2 {
    public static void main(String[] args) {

        String str1 = "Hello";
        String str2 = "Hello";
        String str3 = new String("Hello");
        String str4 = "hello";

        // '=='
        System.out.println("1. Using '==' operator:");
        System.out.println("str1 == str2: " + (str1 == str2));   // true: same reference (string pool)
        System.out.println("str1 == str3: " + (str1 == str3));   // false: different reference

        //  equals()
        System.out.println("\n2. Using equals() method:");
        System.out.println("str1.equals(str2): " + str1.equals(str2));  // true: content match
        System.out.println("str1.equals(str3): " + str1.equals(str3));  // true: content match
        System.out.println("str1.equals(str4): " + str1.equals(str4));  // false: case mismatch

        //  equalsIgnoreCase()
        System.out.println("\n3. Using equalsIgnoreCase() method:");
        System.out.println("str1.equalsIgnoreCase(str4): " + str1.equalsIgnoreCase(str4)); // true

        // compareTo()
        System.out.println("\n4. Using compareTo() method:");
        System.out.println("str1.compareTo(str2): " + str1.compareTo(str2));   // 0: equal
        System.out.println("str1.compareTo(str4): " + str1.compareTo(str4));   // negative: 'H' < 'h'
        System.out.println("str4.compareTo(str1): " + str4.compareTo(str1));   // positive: 'h' > 'H'
    }
}

