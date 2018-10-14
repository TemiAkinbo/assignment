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
public class CourseProgram {
    private String courseName;
    private ArrayList<Modules> modules = new ArrayList();
    private ArrayList<Student> students = new ArrayList();
    private DateTime startDate;
    private DateTime endDate;
    
    public CourseProgram(String courseName){
        this.courseName = courseName;
    }
}
