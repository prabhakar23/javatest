package com.kgisl.qs1;

// import java.sql.Time;
import java.util.Scanner;

/**
 * PrintName
 */
public class PrintName {

    private static int distance;
    private static int speed;

    public static void main(String[] args) {
        System.out.println("Enter your 1st Name");
   
        Scanner scan=new Scanner(System.in);
        String s1=scan.next();
        System.out.println("Enter your 2nd Name");
         scan=new Scanner(System.in);
        String t=scan.next();
        System.out.println("Your full name is Kari Laitinen");
        System.out.println(" Your first name has "+s1.length()+ " charaters");
        System.out.println(" Your Second name has "+t.length()+ " charaters");
    
        
        System.out.println("Speed");
        Scanner scan2=new Scanner(System.in);
        int i=scan2.nextInt();
        System.out.println("Distance" );
        Scanner scan3=new Scanner(System.in);
        int j=scan3.nextInt();
          int Time= distance / speed;
        System.out.println("At 58 mph, it will take "+ Time +" hours to travel 657.5 miles.");
          
    }
        
    
    }


