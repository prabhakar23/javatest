package com.kgisl.qs1;

import java.util.Scanner;

/**
 * Employee
 */
public class Employee {

    int empid;
    String name;
    String dept;
    float salary;
    static String a[] = new String[] { "prabhakar", "It" };
    static int a1[] = new int[] { 101 };
    static float a2[] = new float[] { 2000 };

    public static void main(String[] args) {
        selectOptions();

    }

    static void selectOptions() {
        System.out.println("Select option");
        System.out.println("1.create\t2.getOne\t3.update\t4.delete");
        System.out.println("Select your Option");
        Scanner scan = new Scanner(System.in);
        int i = scan.nextInt();
        switch (i) {

        case 1:
            create();
            selectOptions();
            break;
        case 2:
            getOne();
            selectOptions();
            break;
        case 3:
        update();
        selectOptions();
        break;
        // case 4:
        // delete();
        // selectOptions();
        // break;
        }
    }

    static void create() {
        System.out.println("create");
        for (int i = 0; i < a1.length; i++) {
            System.out.println("Employee id");
            Scanner b = new Scanner(System.in);
            int c = b.nextInt();
            a1[i] = c;
            for (int k = 0; k < a1.length; k++) {
                System.out.println("Employee Name");
                Scanner d = new Scanner(System.in);
                String e = d.next();
                a[k] = e;

                System.out.println("Department");
                Scanner f = new Scanner(System.in);
                String g = f.next();
                a[k] = g;
                for (int l = 0; l < a2.length; l++) {
                    System.out.println("Salary");
                    Scanner h = new Scanner(System.in);
                    float j = h.nextFloat();
                    a2[l] = j;
                    break;
                }
            }
        }

    }

    static void getOne() {
        System.out.println("getOne");
        System.out.println("Enter name");
        Scanner m = new Scanner(System.in);
        String n = m.next();
        for (String var : a) {
        
            if (n.equals(var)) {
               System.out.println(n);
                break;
            }
        }

    }
    static void update(){
        System.out.println("Update");
        System.out.println("Enter FindName");
        Scanner o=new Scanner(System.in);
        String find=o.next();
        System.out.println("Enter Updatename");
        Scanner p=new Scanner(System.in);
        String up=p.next();
        for(int i=0;i<a.length;i++){
            if (find.equals(a[i])) {
               a[i]=up;
                break;
            }
        }

    }
    static void delete
}