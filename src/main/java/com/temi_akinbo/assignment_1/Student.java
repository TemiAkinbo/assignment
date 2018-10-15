/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.temi_akinbo.assignment_1;

import java.util.ArrayList;
import org.joda.time.DateTime;

/**
 *
 * @author Temi
 */

public class Student {
    
    private String name;
    private int age;    
    private DateTime dob;
    private int id;
    private String username;
    private ArrayList<String> courses = new ArrayList();
    private ArrayList<Modules> regModules = new ArrayList();
    
    public Student(String name,int age){
        this.name = name;
        this.age = age;
    }
    
    public void setName(String name){
        this.name = name;
    }
    
    public String getName(){
        return this.name;
    }
    
    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public DateTime getDob() {
        return dob;
    }

    public void setDob(DateTime dob) {
        this.dob = dob;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUsername() {
        this.username = this.name + this.age;
        return username;
    }


    public ArrayList<String> getCourses() {
        return courses;
    }

    public void setCourses(ArrayList<String> courses) {
        this.courses = courses;
    }

    public ArrayList<Modules> getRegModules() {
        return regModules;
    }

    public void setRegModules(ArrayList<Modules> regModules) {
        this.regModules = regModules;
    }
}
