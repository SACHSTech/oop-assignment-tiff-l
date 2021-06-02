package HierachyofStaff_System;

import HierachyofStaff_System.*;

public class Teacher extends Faculty{

  private int totalNumOfClasses;
  private int totalNumOfStudent; 

  /**
    * Constructor - creates a new teacher instance
    * @param first - teacher's first name
    * @param surname - teacher's last name
    * @param email - teacher's email address
    * @param age - teacher's age
    * @param classNum - number of classes each teacher has
    * @param students - number of students each teacher has
  */

  public Teacher(String first, String surname, String email, int age, int wage, int classNum, int students) {
    // Prompts parent constructor in faculty class
    super(first, surname, email, age, wage);
    totalNumOfClasses = classNum;
    totalNumOfStudent = students; 
  }

  /**
  * Getter method - number of classes
  * @return total number of teachers's classes
  */
  public int getTotalNumOfClasses(){
    return totalNumOfClasses;
  }

  /**
  * Getter method - number of students//class size
  * @return teacher's class size
  */
  public int getTotalNumOfStudent(){
    return totalNumOfStudent;
  }

  /**
  * String representation of teacher
  * @return properties pertaining this teacher
  */
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
    return "__________________________";
  }

}
