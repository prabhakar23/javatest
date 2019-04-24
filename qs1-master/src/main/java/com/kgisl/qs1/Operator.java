package com.kgisl.qs1;

/**
 * Operator
 */
public class Operator {
    int empid;
    String name;
    float salary;
	private int id;

    public Operator(int id) {
        this(101);
    }

    public Operator(String Name) {
        this("prabhakar");
    }
    public Operator(float salary){
        this(1000);
    }
    public Operator(int id,String name,float salary){
        this.id=id;
        this.name=name;

    }
}
}
