package com.hcl;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int option;
        List<Student> students = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        StudentManagementSystem studentManagementSystem = new StudentManagementSystem(students);
        while(true){
            System.out.println();
            System.out.println("1.Add a student");
            System.out.println("2.Display student information");
            System.out.println("3.Exit the program");
            System.out.print("Enter you command: ");
            try{
                option = scanner.nextInt();
                switch (option){
                    case 1:
                        studentManagementSystem.addStudent();
                        break;
                    case 2:
                        studentManagementSystem.displayStudentInfo();
                        break;
                    case 3:
                        System.out.println("Exit program.");
                        System.exit(0);
                        break;
                    default:
                        System.out.println("No such an option.");
                }
            }catch (InputMismatchException e){
                System.out.println("Please enter correct input.");
                scanner = new Scanner(System.in);
            }
        }

    }




}