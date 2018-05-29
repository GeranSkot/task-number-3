package com.Aleksey;
import java.util.*;
import java.io.*;

public class Main {

    public static void main(String[] args) {
        System.out.print("can you enter the word please:");
        Scanner scan = new Scanner(System.in);
        String sc = scan.next();
        pal(sc);
    }

    public static String reverseString(String sc) {
        String r = "";
        for (int i = sc.length() - 1; i >= 0; --i)
            r += sc.charAt(i);
        return r;


    }

    public static Boolean pal(String sc) {
        if (sc.equals(reverseString(sc))) {
            System.out.println("palindrome ");
        } else {
            System.out.println("not even palindrome");
        }
        return sc.equals(reverseString(sc));

    }
}
