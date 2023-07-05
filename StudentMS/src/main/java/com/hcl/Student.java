package com.hcl;

public class Student {
    private String name;
    private int rollNumber;
    private int english;
    private int math;
    private int science;

    public Student(){}

    public Student(String name, int rollNumber, int english, int math, int science) {
        this.name = name;
        this.rollNumber = rollNumber;
        this.english = english;
        this.math = math;
        this.science = science;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", rollNumber=" + rollNumber +
                ", english=" + english +
                ", math=" + math +
                ", science=" + science +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getRollNumber() {
        return rollNumber;
    }

    public void setRollNumber(int rollNumber) {
        this.rollNumber = rollNumber;
    }

    public int getEnglish() {
        return english;
    }

    public void setEnglish(int english) {
        this.english = english;
    }

    public int getMath() {
        return math;
    }

    public void setMath(int math) {
        this.math = math;
    }

    public int getScience() {
        return science;
    }

    public void setScience(int science) {
        this.science = science;
    }



    public int calculateTotalMarks(){
        return (science+math+english)/3;
    }

    public String calculateGrade(){
        int marks = calculateTotalMarks();
        if( marks >= 90)
                return "A";
        else if(marks >= 80)
                return "B";
        else if(marks>=70)
                return "C";
        else if(marks>=60)
                return "D";
        else
                return "F";
    }

}
