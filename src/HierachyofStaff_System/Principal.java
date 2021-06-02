package HierachyofStaff_System;

import HierachyofStaff_System.*;

public class Principal extends Faculty{

  private int yearlyBonus;

  private static int principalPayroll = 0;

  public Principal(String first, String surname, String email, int age, int wage, int bonus) {

    super(first, surname, email, age, wage);
    yearlyBonus = bonus;

    principalPayroll = wage + bonus;

  }

  public static int getPrincipalPayroll() {
    return principalPayroll;
  }

  public int getPrincipalBonus() {
    return yearlyBonus;
  }

  public String toString() {
    System.out.println("");
    System.out.println("Principal");
    System.out.println("First Name: " + getFirstName());
    System.out.println("Last Name: " + getLastName());
    System.out.println("Email Address: " + getEmailAddress());
    System.out.println("Age: " + getFacultyAge());
    System.out.println("Wage: $" + getFacultyWage());
    System.out.println("Bonus: $" + yearlyBonus);
    return "";
  }

}
