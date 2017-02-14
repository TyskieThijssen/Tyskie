package com.oose.rmi;

import java.io.Serializable;

/**
 * Created by Thijs on 10-2-2017.
 */
public class Person implements Serializable {
    private String name;
    private int age;

    public Person(){
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getAge(){
        return age;
    }
}
