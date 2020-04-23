package com.company;

/**The Lab class is used to store and work with
 * information of laboratory.
 * @author Mohammad Hossein Asadi
 * **/

public class Lab {
    private Student[] students;
    private int avg;
    private String day;
    private int capacity;
    private int currentSize;
    /**construct the capacity and the day of the laboratory
     * @param cap the capacity of lab
     * @param d the day of lab
     * **/
    public Lab(int cap, String d) {
        capacity=cap;
        day=d;
        currentSize=0;
        students=new Student[capacity];
    }
    /**enroll student in the Lab
     * up to laboratory's capacity
     * @param std Student
     * **/
    public void enrollStudent(Student std) {
        System.out.println("oomad");
        if (currentSize < capacity) {
            students[currentSize] = std;
            currentSize++;
            System.out.println("has enrolled");
        } else {
            System.out.println("Lab is full!!!");
        }
    }
    /**print information of laboratory's students
     * and the the average of their grade
     * **/
    public void print() {
        int i=0;
        while(i<currentSize){
            System.out.println("firstname: "+students[i].getFirstName()+"| lastname: "+students[i].getLastName()+"| id: "+students[i].getId()+"| grade: "+students[i].getGrade());
            i++;
        }
        calculateAvg();
        System.out.println("average: "+ getAvg());
    }
    /**@return students**/
    public Student[] getStudents() {return students;}
    /**set another set of students
     * @param  students array of students
     * **/
    public void setStudents(Student[] students) {
        int i=0,k=0;
        currentSize=0;
        while(i<capacity){
            enrollStudent(students[i]);
            i++;
            System.out.println("student "+i+" replaced");
        }
    }
    /**@return avg**/
    public int getAvg() {return avg;}
    /**calculating average**/
    public void calculateAvg() {
        int i=0,sum=0;
        while (i<currentSize){
            sum+=students[i].getGrade();
            i++;
        }
        if(currentSize>0){
            avg=sum/currentSize;
        }
    }
    /**@return day**/
    public String getDay() {return day;}
    /**set the day of lab
     * @param day the day of lab**/
    public void setDay(String day) {
        this.day=day;
    }
    /**@return capacity**/
    public int getCapacity() {return capacity;}
    /**set and chang the capacity
     * @param capacity the cap of lab**/
    public void setCapacity(int capacity) {
        this.capacity=capacity;
    }
}
