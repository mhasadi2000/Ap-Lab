package com.company;
/**the Vote class to save a vote info
 * @author Mohammad Hossein Asadi
 * @version 29/3/2020**/
public class Vote {
    private Person person;
    private String date;
    /**construct a vote
     * @param person that want to vote
     * @param date of vote**/
    public Vote(Person person,String date){
        this.person=person;
        this.date=date;
    }

    public boolean equals(Person person){
        return true;
    }
    /**getters**/
    public String getDate() {
        return date;
    }

    public Person getPerson() {
        return person;
    }
}
