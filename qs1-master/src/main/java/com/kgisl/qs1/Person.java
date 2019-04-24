package com.kgisl.qs1;

/**
 * Person
 */
public class Person {

    int id;
    String name;
    int salary;
    Person(int i,String n,int s){
        id=i;
        name=n;
        salary=s;
      
    }
    void display(){
        System.out.println(id+" "+name+" "+salary);
    }
}