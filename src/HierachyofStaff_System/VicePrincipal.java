package HierachyofStaff_System;

import HierachyofStaff_System.*;

public class VicePrincipal extends Faculty {

  private int numOfProjects;

  public VicePrincipal(String first, String surname, String email, int age, int wage, int numProj) {
    super(first, surname, email, age, wage);
    numOfProjects = numProj;
  }

  public int getNumOfProjects(){
    return numOfProjects;
  }

  public String toString(){
    System.out.println("");
    System.out.println("Principal");
    System.out.println("First Name: " + getFirstName());
    System.out.println("Last Name: " + getLastName());
    System.out.println("Email Address: " + getEmailAddress());
    System.out.println("Age: " + getFacultyAge());
    System.out.println("Wage: $" + getFacultyWage());
    System.out.println("Number of current projects:" + numOfProjects);
    return "";
  }

}

