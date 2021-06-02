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

  /**
  * Getter method - faculty member's first name
  * @return faculty member's first name
  */
  public String getFirstName(){
    return firstName;
  }

  /**
  * Getter method - faculty member's last name
  * @return faculty member's last name
  */
  public String getLastName(){
    return lastName;
  }

  /**
  * Getter method - faculty member's email
  * @return faculty member's email
  */
  public String getEmailAddress(){
    return emailAddress;
  }

  /**
  * Getter method - faculty member's age
  * @return faculty member's age
  */
  public int getFacultyAge(){
    return facultyAge;

  }

  /**
  * Getter method - faculty member's wage
  * @return faculty member's wage
  */
  public int getFacultyWage(){
    return facultyWage;
  }
  
}
