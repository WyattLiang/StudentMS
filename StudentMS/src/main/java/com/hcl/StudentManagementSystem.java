package com.hcl;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class StudentManagementSystem {
    List<Student> students;

    StudentManagementSystem(List<Student> s){
        students = s;
    }


    public void addStudent(){
        Scanner myObj  = new Scanner(System.in);
        boolean error=true;
        do{
            try {
                System.out.print("Enter new student's name: ");
                String name = myObj.nextLine();
                System.out.print("Enter new student's roll number: ");
                int rollNum = myObj.nextInt();
                System.out.print("Enter English marks: ");
                int englisth = myObj.nextInt();
                System.out.print("Enter Science marks: ");
                int sciecne = myObj.nextInt();
                System.out.print("Enter Math marks: ");
                int math = myObj.nextInt();
                students.add(new Student(name, rollNum, englisth, math, sciecne));
                error=false;
            }
            catch (InputMismatchException e){
                System.out.println("Error with the input.");
                myObj = new Scanner(System.in);
            }
        }while(error);


    }

    public void displayStudentInfo(){
        for(Student s: students){
            System.out.println(s.toString());
            System.out.println("Total marks: "+s.calculateTotalMarks());
            System.out.println("Grades: "+s.calculateGrade()+"\n");
        }
    }
}
