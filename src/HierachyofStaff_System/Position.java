package HierachyofStaff_System;

import HierachyofStaff_System.*;

public class Position extends Faculty{

  private int totalHours;

  public Position(String first, String surname, String email, int age, int wage, int hours) {
    super(first, surname, email, age, wage);
    totalHours = hours;
  }

  public int getTotalHours(){
    return totalHours;
  }

  public String toString(){
    System.out.println("");
    System.out.println("Teacher");
    System.out.println("First Name: " + getFirstName());
    System.out.println("Last Name: " + getLastName());
    System.out.println("Email Address: " + getEmailAddress());
    System.out.println("Age: " + getFacultyAge());
    System.out.println("Wage: $" + getFacultyWage());
    System.out.println("Hours/week " + totalHours);
    return "__________________________";
  }

}
