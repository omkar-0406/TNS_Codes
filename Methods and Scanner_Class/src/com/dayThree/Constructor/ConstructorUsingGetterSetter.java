package com.dayThree.Constructor;

import java.util.*;

public class ConstructorUsingGetterSetter {
    
    String name;
    int id;
    
    // Default constructor
    public ConstructorUsingGetterSetter() {
        System.out.println("Explicit Default constructor");
    }

    // Parameterized constructor
    public ConstructorUsingGetterSetter(int id, String name) {
        System.out.println("Parameterized constructor");
        System.out.println(id + " " + name);
    }
    
    // Setters
    public void setName(String name) {
        this.name = name;
    }
    
    public void setId(int id) {
        this.id = id;
    }
    
    // Getters
    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter name: ");
        String name = sc.nextLine();
        System.out.print("Enter ID: ");
        int id = sc.nextInt();

        ConstructorUsingGetterSetter obj2 = new ConstructorUsingGetterSetter(); // Uses default constructor
        obj2.setName(name);
        obj2.setId(id);
        
        ConstructorUsingGetterSetter obj3 = new ConstructorUsingGetterSetter(obj2.getId(), obj2.getName()); // Uses parameterized constructor
        obj3.setId(id);
        
        sc.close();
    }
}
