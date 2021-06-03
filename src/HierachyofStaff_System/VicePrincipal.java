package HierachyofStaff_System;

import HierachyofStaff_System.*;

public class VicePrincipal extends Faculty {

  private int numOfProjects;

  /**
    * Constructor - creates a new vp instance
    * @param first - vp's first name
    * @param surname - vp's last name
    * @param email - vp's email address
    * @param age - vp's age
    * @param wage - vp's wage
    * @param numProj - number of current project each vp is working on 
  */

  public VicePrincipal(String first, String surname, String email, int age, int wage, int numProj) {
    // Prompts parent constructor in faculty class
    super(first, surname, email, age, wage);
    numOfProjects = numProj;
  }

  /**
  * Getter method - number of projects
  * @return vp's projects
  */
  public int getNumOfProjects(){
    return numOfProjects;
  }

  /**
  * String representation of vp
  * @return properties pertaining this vp
  */
  public String toString(){
    System.out.println("");
    System.out.println("Vice Principal");
    System.out.println("First Name: " + getFirstName());
    System.out.println("Last Name: " + getLastName());
    System.out.println("Email Address: " + getEmailAddress());
    System.out.println("Age: " + getFacultyAge());
    System.out.println("Wage: $" + getFacultyWage());
    System.out.println("Number of current projects: " + numOfProjects);
    return "__________________________";
  }

}

