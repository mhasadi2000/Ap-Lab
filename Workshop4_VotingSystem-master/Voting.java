package com.company;


import ir.huri.jcal.JalaliCalendar;

import java.util.*;
/**the Voting class save the info af a voting:
 * question, voters, alternatives, hashsets and polls
 * @author Mohammad Hossein Asadi
 * @version 29/3/2020**/

public class Voting {
    private int type;
    private String question;
    ArrayList<Person> voters;
    ArrayList<String> alternatives;
    ArrayList<HashSet<Vote>> hashSets;
    HashMap<String, HashSet<Vote>> polls;

    /**construct a voting
     * @param type of voting
     * @param question of voting**/
    public Voting(int type,String question){
        this.type=type;
        this.question=question;
        alternatives=new ArrayList<>();
        voters=new ArrayList<>();
        polls=new HashMap<>();
        hashSets=new ArrayList<>();
    }

    /**set the alternatives
     * @param alternative of a voting**/
    public void createAlternative(String alternative){
        alternatives.add(alternative);
    }

    /**create a poll and set the hashMap
     * @param alternative for creating a poll**/
    public void createPoll(String alternative){
        int i=alternatives.indexOf(alternative);
        polls.put(alternative,hashSets.get(i));
    }
    /**create hashsets of votes**/
    public void createHashSets(){
        int i=0;
        while (i<alternatives.size()){
            HashSet<Vote> votes=new HashSet<>();
            hashSets.add(votes);
            i++;
        }
        if(getType()==0){
            HashSet<Vote> votes=new HashSet<>();
            hashSets.add(votes);
        }
    }
    /**make a vote
     * @param person that wants to vote
     * @param selected selected choices**/
    public void vote(Person person,ArrayList<String> selected){
        voters.add(person);
        Iterator<String> ite=selected.iterator();

        while(ite.hasNext()){
            String temp=ite.next();
            if (temp.equals("pick random")){
                Random r=new Random();
                int i=r.nextInt(alternatives.size()-1);
                JalaliCalendar jalaliCalendar = new JalaliCalendar(1399, 1, 10);
                Vote vote=new Vote(person,jalaliCalendar.toString());
                int j=alternatives.indexOf(temp);
                hashSets.get(j).add(vote);
                temp=alternatives.get(i);
            }
            if(alternatives.contains(temp)){
                JalaliCalendar jalaliCalendar = new JalaliCalendar(1399, 1, 10);
                Vote vote=new Vote(person,jalaliCalendar.toString());
                int i=alternatives.indexOf(temp);
                hashSets.get(i).add(vote);
            }
        }

    }

   // public ArrayList<String> getPolls(){

   // }
    /**@return question**/
    public String getQuestion() {
        return question;
    }
    /**@return type**/
    public int getType() {
        return type;
    }
}
