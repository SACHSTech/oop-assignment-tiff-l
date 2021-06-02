package HierachyofStaff_System;

import java.io.*;
import HierachyofStaff_System.*;
import java.util.ArrayList;

/**
* This program allows users to view and enter infromation about individual employees at a school. 
* The program displays the hierarchy of staff at a school: Principals, Vice Principals and Teachers
* @author: T. Lee
* 
*/

public class Main{

  public static void main(String[] args) throws IOException{
  BufferedReader key = new BufferedReader(new InputStreamReader(System.in));
    //Initialize objects
    Principal Evans;
    VicePrincipal Lamanna;
    VicePrincipal Yang;
    VicePrincipal newVicePrincipal;
    Teacher Harper;
    Teacher Lee;
    Teacher Fabroa;
    Teacher newTeacher; 

    //Declare + initialize variables
    String choice = ""; 
    String password; 
    int payrollTotal; 

    System.out.println("Hello and welcome to the database. Access will be granted to once you enter the password below. Password:0000.");
    
    System.out.println("Password: "); 
    password = key.readLine(); 

    if(password.equals("0000")){
      System.out.println("You have access to the following information: "); 
      System.out.println("1 - Principal");
      System.out.println("2 - Vice principal");
      System.out.println("3 - Teachers");
      System.out.println("4 - Summary");
      choice = key.readLine();

    } else{
      System.out.println("Please try again later");
    }

    Evans = new Principal("Chris", "Evans", "Chris.evans@ycdsbk12.ca", 55, 175000, 3000);
   Lamanna = new VicePrincipal ("Julia", "Lamanna", "Julia.Lamanna@ycdsbk12.ca", 56, 134000, 1);
    Yang = new VicePrincipal ("Irene", "Yang", "Irene.Yang@ycdsbk12.ca", 43, 125000, 3); 
    Harper = new Teacher("Collins", "Harper", "Collins.Harper@ycdsbk12.ca", 20, 80000, 4, 22); 
    Lee = new Teacher("Grace", "Lee", "Grace.Lee@ycdsbk12.ca", 35, 88000, 2, 28); 
    Fabroa = new Teacher("Eric", "Fabroa", "Eric.Fabroa@ycdsbk12.ca", 45, 93000, 4, 30);

    School theSchool = new School(Evans);

    theSchool.addVicePrincipal(Lamanna);
    theSchool.addVicePrincipal(Yang);
    theSchool.addTeacher(Harper);
    theSchool.addTeacher(Lee);
    theSchool.addTeacher(Fabroa);

    while (choice.equals("1") ||choice.equals("2") ||choice.equals("3") ||choice.equals("4")){
      if(choice.equals("1")){
        System.out.println(Evans);
        System.out.println("Press enter again to exit"); 
        choice = key.readLine(); 

      } else if(choice.equals("2")){
        theSchool.printVicePrincipals();   

        System.out.println("Do you want to add another vice principal? (options: yes/no"); 
        String addVicePrincipal = key.readLine(); 
        if(addVicePrincipal.equalsIgnoreCase("yes")){
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

          newVicePrincipal = new VicePrincipal(first, surname, email, age, 118000, proj);
          theSchool.addVicePrincipal(newVicePrincipal);
          System.out.println(newVicePrincipal);
        }

        System.out.println("Press enter again to exit"); 
        choice = key.readLine(); 

      } else if(choice.equals("3")){
        theSchool.printTeachers();     
        System.out.println("Do you want to add another teacher? (options: yes/no"); 
        String addTeacher = key.readLine(); 
        if(addTeacher.equalsIgnoreCase("yes")){
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

          newTeacher = new Teacher(first, surname, email, age, 118000, numClass, sizeClass);
          theSchool.addTeacher(newTeacher);
          System.out.println(newTeacher);
        }

        System.out.println("Press enter again to exit"); 
        choice = key.readLine(); 

      } else if(choice.equals("4")){
        System.out.println(" "); 
        System.out.println("Here's a summary");
        System.out.println(""); 
        int total = theSchool.getTotalVPs() + theSchool.getTotalTeachers() + 1; 
        System.out.println("Faculty Headcount: " + total);
        System.out.println("Principal: 1");
        System.out.println("Vice Principals: " + theSchool.getTotalVPs());
        System.out.println("Teachers: " + theSchool.getTotalTeachers());

        payrollTotal = Principal.getPrincipalPayroll() + theSchool.getVpPayroll() + theSchool.getTeacherPayroll();
        System.out.println(payrollTotal);

        System.out.println("Principal's bonus 2020: $" + Evans.getPrincipalBonus());
        System.out.println("");
        System.out.println("\nVice Principal's Number of Current Projects");
        theSchool.printProjects();
       // System.out.println("")
        //System.out.println("")

        System.out.println("Press enter again to exit"); 
        choice = key.readLine(); 

      }
    }


  }
  
}
