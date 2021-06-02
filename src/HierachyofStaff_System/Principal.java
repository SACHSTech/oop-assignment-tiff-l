package HierachyofStaff_System;

import HierachyofStaff_System.*;

public class Principal extends Faculty{

  // Instance variables
  private int yearlyBonus;

  //class varibale
  private static int principalSalary = 0;

  /**
    * Constructor - creates a new principal instance
    * @param first - principal's first name
    * @param surname - principal's last name
    * @param email - principal's email address
    * @param age - principal's age
    * @param wage - principal's wage
    * @param bonus - principal's bonus
  */

  public Principal(String first, String surname, String email, int age, int wage, int bonus) {
    // Prompts parent constructor in faculty class
    super(first, surname, email, age, wage);
    yearlyBonus = bonus;

    //Calculate total salary
    principalSalary = wage + bonus;

  }

    
  /**
  * Getter method - principal's salary
  * @return princiapl's salary
  */
  public static int getPrincipalSalary() {
    return principalSalary;
  }

  /**
  * Getter method - princiapl's bonus
  * @return princiapl's bonus
  */
  public int getPrincipalBonus() {
    return yearlyBonus;
  }

  /**
  * String representation of principal
  * @return properties pertaining this principal
  */  
  public String toString() {
    System.out.println("");
    System.out.println("Principal");
    System.out.println("First Name: " + getFirstName());
    System.out.println("Last Name: " + getLastName());
    System.out.println("Email Address: " + getEmailAddress());
    System.out.println("Age: " + getFacultyAge());
    System.out.println("Wage: $" + getFacultyWage());
    System.out.println("Bonus: $" + yearlyBonus);
    return "__________________________";
  }

}
