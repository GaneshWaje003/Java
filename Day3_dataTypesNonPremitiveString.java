public class Day3_dataTypesNonPremitiveString {
    public static void main(String[] args) {

        // String
        String a = "gsw";

        System.out.println(a.length());
        System.out.println(a.concat("abcd"));
        System.out.println(a.toCharArray());
        System.out.println(a.substring(0, 2));
        System.out.println(a.charAt(2));

        System.out.println("------");

        String b = "12" + 12;
        String c = "abcd";
        System.out.println(b);
        System.out.println(b.repeat(4));
        System.out.println(c.toUpperCase());
        System.out.println("------");

        String s1 = "hello";
        String s2 = s1.toUpperCase();

        System.out.println(s1); // Prints: hello
        System.out.println(s2); // Prints: HELLO

        // ---------------------------- string  , string builder and string buffer 

    }
}

/*
 
 * Strings are immutable in java once created there value can't be changed
 * data type starting from capital are Non primitive as we are creating object of them
 
 * String imp methods
    1) length() - print total length start from 1 to end gsw = 3;
    2) concat(str) - concat string str with ref called string;
    3) substring(begI,endI) - create new string based on starting index and end
    4) conatains(char) - return bool if given char is present or not
    5) charAt(index) - return index of charater if present in string else
    indexOutOfBound
    6) repeat(n) - return the string with repeated n times
    7) toUpperCase and toLowerCase() -
    8) trim() - removes blank spaces in string
 
 *-------------------------------

    * String       : Use when you have fixed text that doesn't change, like names or messages.
    * StringBuilder: Use when you need to efficiently build or modify a string frequently in a single thread.
    * StringBuffer : Use when you need to build or modify a string safely across multiple threads.

    eg -> String        ->  Store and display a user's name, which does not change.
    eg -> StringBuilder ->  Efficiently build a comma-separated list of items from a loop in a single-threaded application.
    eg -> StringBuffer  ->  Safely build a log message from multiple threads writing to the same string buffer.

  * Question asked by interviewer
  
  1) is java String are mutalbe | immutable --> immutable
    String s = "hello";
    s = s.toUpperCase();   // Creates a new String object "HELLO", original "hello" remains unchanged.
    System.out.println(s); // Prints: HELLO
  
  2) Difference between == and .equals() when comparing Strings?
    Answer:

    # == compares reference equality (if two references point to the same object).
    # .equals() compares content equality (if the characters inside the strings are the same).

    String a = new String("java");
    String b = new String("java");

    System.out.println(a == b);        // false, different objects
    System.out.println(a.equals(b));   // true, same contents

  3) How to repeat a string multiple times  ---> by using .repeat(n) 
  4) Check if two strings are anagrams
  5) Reverse a string --> .reverse().toString();

  */