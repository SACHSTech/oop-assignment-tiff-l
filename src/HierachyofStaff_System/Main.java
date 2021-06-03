package HierachyofStaff_System;

import java.io.*;
import java.util.Arrays;
import HierachyofStaff_System.*;
import java.util.ArrayList;

/**
 * This program allows users to view and enter infromation about individual
 * employees at a school. The program displays the hierarchy of staff at a
 * school: Principals, Vice Principals and Teachers
 * 
 * @author: T. Lee
 * 
 */

public class Main {

  public static void main(String[] args) throws IOException {
    BufferedReader key = new BufferedReader(new InputStreamReader(System.in));

    // Initialize objects
    // Principal
    Principal Evans;
    // Vps
    VicePrincipal Lamanna;
    VicePrincipal Yang;
    VicePrincipal newVicePrincipal;
    // Teachers
    Teacher Harper;
    Teacher Lee;
    Teacher Fabroa;
    Teacher newTeacher;
    // Positions
    Position Brent;
    Position newPosition;

    // Declare + initialize variables
    String choice = "";
    String password;
    int payrollTotal;

    // Menu array

    String[] menu = new String[9];
    menu[0] = "";
    menu[1] = "1 - Principal";
    menu[2] = "2 - Vice principals";
    menu[3] = "3 - Teachers";
    menu[4] = "4 - Other positions";
    menu[5] = "5 - Summary";
    menu[6] = "";
    menu[7] = "--------------------------------------------";
    menu[8] = "";

    System.out.println(
        "Hello and welcome to the database. Access will be granted to once you enter the password below. Password: 0000.");

    System.out.println("Password: ");
    password = key.readLine();
    System.out.println("");

    if (password.equals("0000")) {
      System.out.println("You have access to the following information: ");
      for (String Menu : menu) {
        System.out.println(Menu);
      }
      choice = key.readLine();

    } else {
      System.out.println("Please try again later");
    }

    // Creating: existing faculty
    Evans = new Principal("Chris", "Evans", "Chris.evans@ycdsbk12.ca", 55, 175000, 3000);
    Lamanna = new VicePrincipal("Julia", "Lamanna", "Julia.Lamanna@ycdsbk12.ca", 56, 134000, 1);
    Yang = new VicePrincipal("Irene", "Yang", "Irene.Yang@ycdsbk12.ca", 43, 125000, 3);
    Harper = new Teacher("Collins", "Harper", "Collins.Harper@ycdsbk12.ca", 20, 80000, 4, 22);
    Lee = new Teacher("Grace", "Lee", "Grace.Lee@ycdsbk12.ca", 35, 88000, 2, 28);
    Fabroa = new Teacher("Eric", "Fabroa", "Eric.Fabroa@ycdsbk12.ca", 45, 93000, 4, 30);
    Brent = new Position("Jack", "Brent", "Janitor", "Jack.Brent@ycdsbk12.ca", 50, 55000, 33);

    // Creating: object - school
    School theSchool = new School(Evans);

    // Add current vps + teachers + positions to arraylist
    theSchool.addVicePrincipal(Lamanna);
    theSchool.addVicePrincipal(Yang);
    theSchool.addTeacher(Harper);
    theSchool.addTeacher(Lee);
    theSchool.addTeacher(Fabroa);
    theSchool.addPosition(Brent);

    // Loops if choice is 1, 2, 3, 4 or 5. It will stop looping if any other key is
    // entered
    while (choice.equals("1") || choice.equals("2") || choice.equals("3") || choice.equals("4") || choice.equals("5")) {
      if (choice.equals("1")) {
        // Prints the current principal
        System.out.println(Evans);
        System.out.println("");

        // times out program, which allows user to read the information before moving on
        try {
          Thread.sleep(1500);
        } catch (InterruptedException ex) {
          Thread.currentThread().interrupt();
        }

        // Print menu again
        System.out.println("Select the following options or press enter again to exit");
        for (String Menu : menu) {
          System.out.println(Menu);
        }

        choice = key.readLine();

      } else if (choice.equals("2")) {
        theSchool.printVicePrincipals();

        // times out program, which allows user to read the information before moving on
        try {
          Thread.sleep(1500);
        } catch (InterruptedException ex) {
          Thread.currentThread().interrupt();
        }

        // User is able to another vp (add as many as you need)
        System.out.println("Do you want to add another vice principal? (options: yes/no)");
        String addVicePrincipal = key.readLine();
        if (addVicePrincipal.equalsIgnoreCase("yes")) {
          System.out.print("First Name: ");
          String first = key.readLine();

          System.out.print("Last Name: ");
          String surname = key.readLine();

          System.out.print("Email: ");
          String email = key.readLine();

          System.out.print("Age: ");
          int age = Integer.parseInt(key.readLine());

          System.out.print("Number of Projects: ");
          int proj = Integer.parseInt(key.readLine());

          // Creating new vp with information inputed above
          newVicePrincipal = new VicePrincipal(first, surname, email, age, 118000, proj);
          theSchool.addVicePrincipal(newVicePrincipal);
          // Prints the new vp added to console
          System.out.println(newVicePrincipal);
        }

        System.out.println("Please select one of the following options or click another key to exit");
        for (String Menu : menu) {
          System.out.println(Menu);
        }

        choice = key.readLine();

      } else if (choice.equals("3")) {
        // print the current teachers in arraylist
        theSchool.printTeachers();

        // times out program, which allows user to read the information before moving on
        try {
          Thread.sleep(1500);
        } catch (InterruptedException ex) {
          Thread.currentThread().interrupt();
        }

        // User is able to another teacher (add as many as you need)
        System.out.println("Do you want to add another teacher? (options: yes/no)");
        String addTeacher = key.readLine();
        if (addTeacher.equalsIgnoreCase("yes")) {
          System.out.print("First Name: ");
          String first = key.readLine();

          System.out.print("Last Name: ");
          String surname = key.readLine();

          System.out.print("Email: ");
          String email = key.readLine();

          System.out.print("Age: ");
          int age = Integer.parseInt(key.readLine());

          System.out.print("Number of Classes: ");
          int numClass = Integer.parseInt(key.readLine());

          System.out.print("Class Size: ");
          int sizeClass = Integer.parseInt(key.readLine());

          // Creating new teacher with information inputed above
          newTeacher = new Teacher(first, surname, email, age, 118000, numClass, sizeClass);
          theSchool.addTeacher(newTeacher);
          // Prints the new teacher added to console
          System.out.println(newTeacher);
        }
        System.out.println("Please select one of the following options or click another key to exit");
        // prints Menu
        for (String Menu : menu) {
          System.out.println(Menu);
        }
        choice = key.readLine();

      } else if (choice.equals("4")) {
        // print the current positions in arraylist
        theSchool.printPositions();

        // times out program, which allows user to read the information before moving on
        try {
          Thread.sleep(1500);
        } catch (InterruptedException ex) {
          Thread.currentThread().interrupt();
        }

        // allows user to another position (add as many as you need)
        System.out.println("Do you want to add another position? (options: yes/no)");
        String addPosition = key.readLine();
        if (addPosition.equalsIgnoreCase("yes")) {
          System.out.print("First Name: ");
          String first = key.readLine();

          System.out.print("Last Name: ");
          String surname = key.readLine();

          System.out.print("Email: ");
          String email = key.readLine();

          System.out.print("Job Title: ");
          String jobTitle = key.readLine();

          System.out.print("Age: ");
          int age = Integer.parseInt(key.readLine());

          System.out.print("Hours/week: ");
          int hours = Integer.parseInt(key.readLine());

          // Creating new position with information inputed above
          newPosition = new Position(first, surname, jobTitle, email, age, 55000, hours);
          theSchool.addPosition(newPosition);
          // Prints the new position added to console
          System.out.println(newPosition);
        }
        System.out.println("Please select one of the following options or click another key to exit");
        for (String Menu : menu) {
          System.out.println(Menu);
        }

        choice = key.readLine();

      } else if (choice.equals("5")) {
        System.out.println(" ");
        // Prints a summary of findings (analytics)
        System.out.println("The following is a faculty summary: ");
        System.out.println("");

        // Calcualte + print the total number of faculty members
        int total = theSchool.getTotalVPs() + theSchool.getTotalTeachers() + theSchool.getTotalPositions() + 1;
        System.out.println("Faculty Headcount: " + total);

        System.out.println("Principal: 1");

        // Prints number of vps
        System.out.println("Vice Principals: " + theSchool.getTotalVPs());

        // Prints number of teachers
        System.out.println("Teachers: " + theSchool.getTotalTeachers());

        // Prints number of people in other positions
        System.out.println("Other Positions: " + theSchool.getTotalPositions());

        // Calcualte + print the total payroll
        payrollTotal = Principal.getPrincipalSalary() + theSchool.getVpSalary() + theSchool.getTeacherSalary();
        System.out.println("Total Payroll: $" + payrollTotal);

        // Print the principal's bonus
        System.out.println("Principal's bonus (2020): $" + Evans.getPrincipalBonus());
        System.out.println("");
        System.out.println("-   -   -   -   -   -   -   -   -   -   -   -");

        // times out program, which allows user to read the information before moving on
        try {
          Thread.sleep(1500);
        } catch (InterruptedException ex) {
          Thread.currentThread().interrupt();
        }

        // Print the number of projects each vp is currently working on
        System.out.println("");
        System.out.println("Vice Principal's Number of Current Projects");
        System.out.println("");
        theSchool.printProjects();
        System.out.println("");
        System.out.println("-   -   -   -   -   -   -   -   -   -   -   -");

        // times out program, which allows user to read the information before moving on
        try {
          Thread.sleep(1500);
        } catch (InterruptedException ex) {
          Thread.currentThread().interrupt();
        }

        // Print the teacher's class info
        System.out.println("");
        System.out.println("Teacher's class information: ");
        System.out.println("");
        theSchool.printClass();
        System.out.println("-   -   -   -   -   -   -   -   -   -   -   -");

        // times out program, which allows user to read the information before moving on
        try {
          Thread.sleep(1500);
        } catch (InterruptedException ex) {
          Thread.currentThread().interrupt();
        }

        // Print the position info
        System.out.println("");
        System.out.println("Specific position information: ");
        System.out.println("");
        theSchool.printJobs();
        System.out.println("-   -   -   -   -   -   -   -   -   -   -   -");

        // times out program, which allows user to read the information before moving on
        try {
          Thread.sleep(1500);
        } catch (InterruptedException ex) {
          Thread.currentThread().interrupt();
        }

        System.out.println("");
        System.out.println("Please select one of the following options or click another key to exit");
        for (String Menu : menu) {
          System.out.println(Menu);
        }

        choice = key.readLine();

      }
    }

  }

}