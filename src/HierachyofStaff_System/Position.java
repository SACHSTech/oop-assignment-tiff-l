package HierachyofStaff_System;

import HierachyofStaff_System.*;

/**
    * Constructor - creates a new 'other position' instance
    * @param first - position's first name
    * @param surname - position's last name
    * @param email - position's email address
    * @param age - position's age
    * @param wage - position's wage
    * @param hours - position's hours
*/

public class Position extends Faculty{

  private int totalHours;

  public Position(String first, String surname, String email, int age, int wage, int hours) {
    // Prompts parent constructor in faculty class
    super(first, surname, email, age, wage);
    totalHours = hours;
  }


  /**
  * Getter method - number of hours for position
  * @return position's hours
  */
  public int getTotalHours(){
    return totalHours;
  }

 /**
  * String representation of position
  * @return properties pertaining this position
  */
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
