package HierachyofStaff_System;

import java.io.*;
import HierachyofStaff_System.*;
import java.util.ArrayList;

public class School{

  //Instance variables
  private Faculty faculty;
  private ArrayList<VicePrincipal> vps;
  private ArrayList<Teacher> teachers;
  private ArrayList<Position> positions;

  /**
    * Constructor: creating a new school instance
    * @param theFaculty - the Faculty
    */
  public School(Faculty theFaculty){
    faculty = theFaculty;

    //initialize the following lists: vps, teachers, positions
    vps = new ArrayList<VicePrincipal>();
    teachers = new ArrayList<Teacher>();
    positions = new ArrayList<Position>();
  }

  /**
  * Method - add new vp
  * @return void
  */
  public void addVicePrincipal(VicePrincipal newVicePres){
    vps.add(newVicePres);
  }

  /**
  * Method - add new teacher
  * @return void
  */
  public void addTeacher(Teacher newTeacher){
    teachers.add(newTeacher);
  }

  /**
  * Method - add new position
  * @return void
  */
  public void addPosition(Position newPosition){
    positions.add(newPosition);
  }

  /**
  * Method - get total number of vps
  * @return number of vps
  */
  public int getTotalVPs(){
    return vps.size();
  }
  
  /**
  * Method - get total number of teachers
  * @return number of teachers
  */
  public int getTotalTeachers(){
    return teachers.size();
  }

  /**
  * Method - get total number of positions
  * @return number of positions
  */
  public int getTotalPositions(){
    return positions.size();
  }

  /**
  * Method - get total vp salary
  * @return total vp salary
  */
  public int getVpSalary(){
    int totalSalary = 0;
    for(int i = 0; i < getTotalVPs(); i++){
      totalSalary = totalSalary + vps.get(i).getFacultyWage();
    }
    return totalSalary;
  }

  /**
  * Method - get total teacher salary
  * @return total teacher salary
  */
  public int getTeacherSalary(){
    int totalSalary = 0;
    for(int i = 0; i < getTotalTeachers(); i++){
      totalSalary = totalSalary + teachers.get(i).getFacultyWage();
    }
    return totalSalary;
  }

  /**
  * Method - get total position salary
  * @return total position salary
  */
  public int getPositionSalary(){
    int totalSalary = 0;
    for(int i = 0; i < getTotalPositions(); i++){
      totalSalary = totalSalary + positions.get(i).getFacultyWage();
    }
    return totalSalary;
  }
 
  /**
  * Method - prints all vps
  * @return void
  */
  public void printVicePrincipals(){
    for (int i = 0; i < getTotalVPs(); i++) {
      System.out.println(vps.get(i));
    }
  }
 
  /**
  * Method - prints all teachers
  * @return void
  */
  public void printTeachers(){
    for (int i = 0; i < getTotalTeachers(); i++) {
      System.out.println(teachers.get(i));
    }
  }

  /**
  * Method - prints all positions
  * @return void
  */
  public void printPositions(){
    for (int i = 0; i < getTotalPositions(); i++) {
      System.out.println(positions.get(i));
    }
  }

  /**
  * Method - prints number of current projects each vp is taking on
  * @return void
  */
  public void printProjects(){
     for (int i = 0; i < getTotalVPs(); i++) {
      System.out.println(vps.get(i).getFirstName() + " " + vps.get(i).getLastName() + ": " + vps.get(i).getNumOfProjects());

    }
  }

  /**
  * Method - prints class info for teachers
  * @return void
  */
  public void printClass(){
     for (int i = 0; i < getTotalTeachers(); i++) {
      System.out.println(teachers.get(i).getFirstName() + " " + teachers.get(i).getLastName());
      System.out.println("Number of classes: " + teachers.get(i).getTotalNumOfClasses());
      System.out.println("Class size: " + teachers.get(i).getTotalNumOfStudent());
      System.out.println("");
      try {
        Thread.sleep(800);
      } catch(InterruptedException ex) {
        Thread.currentThread().interrupt();
      } 
    }
  }

  /**
  * Method - prints position title + hours/week for position
  * @return void
  */
  public void printJobs(){
     for (int i = 0; i < getTotalPositions(); i++) {
      System.out.println(positions.get(i).getFirstName() + " " + positions.get(i).getLastName() + " - " + positions.get(i).getJobTitle());
      System.out.println("Hours/week: " + positions.get(i).getTotalHours());
      System.out.println("");
      try {
        Thread.sleep(800);
      } catch(InterruptedException ex) {
        Thread.currentThread().interrupt();
      } 
    }
  }
  

}
