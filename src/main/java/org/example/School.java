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
        logger.log(this.studentName+" has a "+this.gpa+" GPA");
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        logger.log("\nEnter the Name :");
        String name=sc.nextLine();
        logger.log("\nEnter the GradeLevel :");
        String gradeLevel=sc.nextLine();
        logger.log("\nEnter the GPA :");
        double gpa=sc.nextDouble();

        School s=new School(name,gradeLevel,gpa);
        logger.log("Updated GPA :");
        gpa=sc.nextDouble();
        s.getGpa(gpa);
        s.details();

    }
}
