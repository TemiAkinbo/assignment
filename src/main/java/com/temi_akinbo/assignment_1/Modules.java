/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.temi_akinbo.assignment_1;

import java.util.ArrayList;

/**
 *
 * @author Temi
 */
public class Modules {
    private String moduleName;
    private String id;
    private ArrayList<Student> students = new ArrayList();
    private ArrayList<CourseProgram> assCourses = new ArrayList();
    
    public Modules (String modName, String id){
        this.moduleName = modName;
        this.id = id;
    }
    
}
