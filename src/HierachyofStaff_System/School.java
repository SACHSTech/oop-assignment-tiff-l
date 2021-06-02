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
  * Method to add new vp
  * @return void
  */
  public void addVicePrincipal(VicePrincipal newVicePres){
    vps.add(newVicePres);
  }

  /**
  * Method to add new teacher
  * @return void
  */
  public void addTeacher(Teacher newTeacher){
    teachers.add(newTeacher);
  }

  /**
  * Method to add new position
  * @return void
  */
  public void addPosition(Position newPosition){
    positions.add(newPosition);
  }

  public int getTotalVPs(){
    return vps.size();
  }
 
  public int getTotalTeachers(){
    return teachers.size();
  }

  public int getTotalPositions(){
    return positions.size();
  }

  public int getVpPayroll(){
    int totalPayroll = 0;
    for(int i = 0; i < getTotalVPs(); i++){
      totalPayroll = totalPayroll + vps.get(i).getFacultyWage();
    }
    return totalPayroll;
  }

  public int getTeacherPayroll(){
    int totalPayroll = 0;
    for(int i = 0; i < getTotalTeachers(); i++){
      totalPayroll = totalPayroll + teachers.get(i).getFacultyWage();
    }
    return totalPayroll;
  }

  public int getPositionPayroll(){
    int totalPayroll = 0;
    for(int i = 0; i < getTotalPositions(); i++){
      totalPayroll = totalPayroll + positions.get(i).getFacultyWage();
    }
    return totalPayroll;
  }
 
  public void printVicePrincipals(){
    for (int i = 0; i < getTotalVPs(); i++) {
      System.out.println(vps.get(i));
    }
  }
 
  public void printTeachers(){
    for (int i = 0; i < getTotalTeachers(); i++) {
      System.out.println(teachers.get(i));
    }
  }

  public void printPositions(){
    for (int i = 0; i < getTotalPositions(); i++) {
      System.out.println(positions.get(i));
    }
  }

  public void printProjects(){
     for (int i = 0; i < getTotalVPs(); i++) {
      System.out.println(vps.get(i).getFirstName() + " " + vps.get(i).getLastName() + ": " + vps.get(i).getNumOfProjects());
    }
  }

}
