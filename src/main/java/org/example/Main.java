package org.example;

public class Main {
    public static void main(String[] args) {
        String s = "hello";
        String s1 = new String("demo");

        String s2 = "print this string_in reverse";

        String[] splittedstring = s2.split("string_in");
        System.out.println(splittedstring[0]);
        System.out.println(splittedstring[1]);
        //System.out.println(splittedstring[2]);
        //System.out.println(splittedstring[3]);
        System.out.println(splittedstring[1].trim());

        //int sw =s2.length();
        //System.out.println(sw);

       /* for (int i = 0; i < s2.length(); i++)
        {

            System.out.println(s2.charAt(i));
        } */
        for (int i = s2.length()-1;i>=0; i--)
        {

            System.out.println(s2.charAt(i));
        }
    }
}
