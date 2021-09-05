/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 first_name last_name
 */

import java.util.Scanner;

/* Will all be located in main, will prompt user for name
will then take name and put it in a variable and print a
statement plus variable
*/
public class Solution01 {
    public static void main(String[] args) {
        Scanner Input = new Scanner(System.in);
        System.out.print("What is your name?");
        String Name =  Input.next();
        System.out.println("Hello, " + Name + ", nice to meet you!");
    }

}
