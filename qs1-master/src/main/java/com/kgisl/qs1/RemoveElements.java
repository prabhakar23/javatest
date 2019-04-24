package com.kgisl.qs1;

import java.util.ArrayList;

/**
 * RemoveElements
 */
public class RemoveElements {

    public static void main(String[] args) {
        ArrayList<String> a = new ArrayList<String>();
        a.add("Prabha");
        a.add("sasi");
        a.add("gk");
        a.add("Prabha");
        a.add("diva");
        a.add("Prabha");
        for (int i = 0; i < a.size(); i++) {
            for (int j = i + 1; j < a.size(); j++) {
                if (a.get(i).equals(a.get(j))) {
                    a.remove(j);
                    j--;
                }
            }

        }
        System.out.println("After Removing Duplicates Elements"+a);
    }
}