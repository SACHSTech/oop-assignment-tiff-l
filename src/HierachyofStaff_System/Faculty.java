package HierachyofStaff_System;

import HierachyofStaff_System.*;

public class Faculty{

  // Instance Variables
  private String firstName;
  private String lastName;
  private String emailAddress;
  private int facultyAge;
  private int facultyWage;

  public Faculty(String first, String surname, String email, int age, int wage){
    firstName = first;
    lastName = surname;
    emailAddress = email;
    facultyAge = age;
    facultyWage = wage;
  }

  public String getFirstName(){
    return firstName;
  }

  public String getLastName(){
    return lastName;
  }

  public String getEmailAddress(){
    return emailAddress;
  }

  public int getFacultyAge(){
    return facultyAge;

  }

  public int getFacultyWage(){
    return facultyWage;
  }
  
}
