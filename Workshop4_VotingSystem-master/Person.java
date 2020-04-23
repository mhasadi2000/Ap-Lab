package com.company;
/**the Person class is used to save the info of
 * a person
 * @author Mohammad Hossein Asadi
 * @version 29/3/2020**/
public class Person {
    private String firstName;
    private String lastName;
    /**construct the person info
     * @param firstName of person
     * @param lastName of person**/
    public Person(String firstName,String lastName){
        this.firstName=firstName;
        this.lastName=lastName;
    }
    /**@return the firstName**/
    public String getFirstName() {
        return firstName;
    }
    /**@return the lastName**/
    public String getLastName() {
        return lastName;
    }
}
