package de.hfu;

import java.util.Scanner;

public class App {

    private static void input() {
        Scanner s = new Scanner(System.in);
        System.out.print("Text: "); 
        String text = s.nextLine();
        System.out.println(text.toUpperCase());
        
    }

    public static void main( String[] args )
    {
        input();
    }
}