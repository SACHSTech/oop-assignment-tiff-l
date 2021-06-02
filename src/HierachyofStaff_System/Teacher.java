package HierachyofStaff_System;

import HierachyofStaff_System.*;

public class Teacher extends Faculty{

  private int totalNumOfClasses;
  private int totalNumOfStudent; 

  public Teacher(String first, String surname, String email, int age, int wage, int classNum, int student) {
    super(first, surname, email, age, wage);
    totalNumOfClasses = classNum;
    totalNumOfStudent = student; 
  }

  public int getTotalNumOfClasses(){
    return totalNumOfClasses;
  }

  public int getTotalNumOfStudent(){
    return totalNumOfStudent;
  }

  public String toString(){
    System.out.println("");
    System.out.println("Teacher");
    System.out.println("First Name: " + getFirstName());
    System.out.println("Last Name: " + getLastName());
    System.out.println("Email Address: " + getEmailAddress());
    System.out.println("Age: " + getFacultyAge());
    System.out.println("Wage: $" + getFacultyWage());
    System.out.println("Number of Classes: " + totalNumOfClasses);
    System.out.println("Class size: " + totalNumOfStudent);
    return "";
  }

}