package com.company;
/**the Student class is used to save and work with
 * Student's info
 * @author Mohammad Hossein Asadi
 * **/
public class Student {
    private String firstName;
    private String lastName;
    private String id;
    private int grade;
    /**construct first name,last name and id of student
     * @param fName first name
     * @param lname last name
     * @param sID id number
     * **/
    public Student(String fName, String lname, String sID){
        firstName = fName;
        lastName = lname;
        id = sID;
        grade = 0;
    }
    /**@param grade the student grade**/
    public void setGrade(int grade){
        this.grade=grade;
    }
    /**@return  grade**/
    public int getGrade(){
        return grade;
    }
    /**@param id the id num**/
    public void setId(String id){
        this.id=id;
    }
    /**@return id **/
    public String getId(){
        return id;
    }
    /**@param lastName setting last name**/
    public void setLastName(String lastName){
        this.lastName=lastName;
    }
    /**@return last name**/
    public String getLastName(){
        return lastName;
    }
    /**@return firstName**/
    public String getFirstName() {
        return firstName;
    }
    /**@param firstName set the first name**/
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
    /**print info of the student**/
    public void print() {
        System.out.println(lastName + ", student ID: " + id + ", grade: " + grade);
    }
}
