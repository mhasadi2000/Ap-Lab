package com.company;

import java.util.ArrayList;
import java.util.Scanner;

/**the main class to make a VotingSystem and a Voting to test the
 * classes. this class includes main method.
 * @author Mohammad Hossein Asadi
 * @version 29/3/2020
 * **/
public class Main {

    public static void main(String[] args) {
        ArrayList<String> choices=new ArrayList<>();
        ArrayList<String> personChoice=new ArrayList<>();
        Scanner input=new Scanner(System.in);

        /*create a votingSystem**/
	    VotingSystem votingSystem=new VotingSystem();
        choices.add("stay at home");
        choices.add("do not think about that");
        choices.add("visit a doctor");
        votingSystem.createVoting("what should we do about corona?",0,choices);
        //int i=input.nextInt();

        /*get the info and the vote of a person**/
        System.out.println("enter your name:");
        String []c=input.nextLine().split(" ");
        String firstName=c[0];
        String lastName=c[1];
	    Person person1=new Person(firstName,lastName);
        votingSystem.getVotingList();
        String choice=input.nextLine();
	    personChoice.add(choice);
	    votingSystem.vote(0,person1,personChoice);
        personChoice.clear();

        System.out.println("enter your name:");
        String []c1=input.nextLine().split(" ");
        String firstName1=c1[0];
        String lastName1=c1[1];
        Person person2=new Person(firstName1,lastName1);
        votingSystem.getVotingList();
        String choice1=input.nextLine();
        personChoice.add(choice1);
        votingSystem.vote(0,person2,personChoice);
        personChoice.clear();

        System.out.println("enter your name:");
        String []c2=input.nextLine().split(" ");
        String firstName2=c2[0];
        String lastName2=c2[1];
        Person person3=new Person(firstName2,lastName2);
        votingSystem.getVotingList();
        String choice2=input.nextLine();
        personChoice.add(choice2);
        votingSystem.vote(0,person3,personChoice);
        personChoice.clear();

        /*show the result of voting**/
        votingSystem.getResult(0);
        System.out.println();
        votingSystem.getVotingList();

    }
}
