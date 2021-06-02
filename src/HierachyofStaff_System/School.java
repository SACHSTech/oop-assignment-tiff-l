package HierachyofStaff_System;

import java.io.*;
import HierachyofStaff_System.*;
import java.util.ArrayList;

public class School{

  private Faculty faculty;
  private ArrayList<VicePrincipal> vps;
  private ArrayList<Teacher> teachers;

  public School(Faculty theFaculty){
    faculty = theFaculty;
    vps = new ArrayList<VicePrincipal>();
    teachers = new ArrayList<Teacher>();
  }

  public void addVicePrincipal(VicePrincipal newVicePres){
    vps.add(newVicePres);
  }

  public void addTeacher(Teacher newTeacher){
    teachers.add(newTeacher);
  }

  public int getTotalVPs(){
    return vps.size();
  }
 
  public int getTotalTeachers(){
    return teachers.size();
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
 
  public void printVicePrincipals(){
    for (int i = 0; i < getTotalVPs(); i++) {
      System.out.println(vps.get(i));
    }
  }

  public void printProjects(){
     for (int i = 0; i < getTotalVPs(); i++) {
      System.out.println(vps.get(i).getFirstName() + " " + vps.get(i).getLastName() + ": " + vps.get(i).getNumOfProjects());
    }
  }
 
  public void printTeachers(){
    for (int i = 0; i < getTotalTeachers(); i++) {
      System.out.println(teachers.get(i));
    }
  }

}
