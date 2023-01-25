package org.example;
import java.util.Scanner;

public class School {
    String studentName;
    String gradeLevel;
    double gpa;
    School(String studentName,String gradeLevel,double gpa){
        this.studentName=studentName;
        this.gradeLevel=gradeLevel;
        this.gpa=gpa;
    }
    public void getGpa(double gpa){
        this.gpa = gpa;
    }
    public void  details(){
        System.out.println(this.studentName+" has a "+this.gpa+" GPA");
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("\nEnter the Name :");
        String name=sc.nextLine();
        System.out.print("\nEnter the GradeLevel :");
        String gradeLevel=sc.nextLine();
        System.out.print("\nEnter the GPA :");
        double gpa=sc.nextDouble();

        School s=new School(name,gradeLevel,gpa);
        System.out.println("Updated GPA :");
        gpa=sc.nextDouble();
        s.getGpa(gpa);
        s.details();

    }
}