package com.company;
/**this class includes main method and
 * is used to test system by these steps:
 * creat a number of student
 * check some of setters
 * enroll students
 * print lab info
 * creat another set of students
 * replace them with previous one
 * and then again print lab info
 * @author Mohammad Hossein Asadi
 * **/
public class Run {
    /**The main method**/
    public static void main(String[] args) {
        Student std1 = new Student("Ehsan","Edalat", "9031066");
        Student std2 = new Student("Seyed", "Ahmadpanah", "9031806");
        Student std3 = new Student("Ahmad", "Asadi", "9031054");
        Lab L=new Lab(3,"saturday");

        std1.print();
        std1.setGrade(15);
        std1.print();

        std2.print();
        std2.setGrade(11);
        std2.print();

        std3.print();
        std3.setFirstName("HamidReza");
        std3.print();

        L.enrollStudent(std1);
        L.enrollStudent(std2);
        L.enrollStudent(std3);
        System.out.println("done");

        L.print();

        Student[] anotherSetOfStudent=new Student[L.getCapacity()];
        anotherSetOfStudent[0] = new Student("Hamid","Godarzi", "9031067");
        anotherSetOfStudent[0].setGrade(10);
        anotherSetOfStudent[1] = new Student("Karim", "Karimy", "9031920");
        anotherSetOfStudent[1].setGrade(18);
        anotherSetOfStudent[2] = new Student("Hoseein", "Mirzaii", "9031430");
        anotherSetOfStudent[2].setGrade(12);
        L.setStudents(anotherSetOfStudent);

        L.print();


    }

}
