package com.company;

import java.util.*;

/**the VotingSystem save the list of voting, create a voting and
 * give the result
 * @author Mohammad Hossein Asadi
 * @version 29/3/2020**/

public class VotingSystem {
    ArrayList<Voting> votingList;
    /**construct a voting list**/
    public VotingSystem(){
        votingList=new ArrayList<>();
    }
    /**create a voting and set the alternatives of a voting
     * @param question the question of voting
     * @param type the type of voting
     * @param choices the arrayList of alternatives**/
    public void createVoting(String question,int type , ArrayList<String> choices){
        Voting v1=new Voting(type,question);
        Iterator<String> ite=choices.iterator();
        while (ite.hasNext()){
            v1.createAlternative(ite.next());
        }
        if (type==0){
            v1.createAlternative("pick random");
        }
        v1.createHashSets();
        votingList.add(v1);
    }
    /**print the question, alternatives and persons who vote up to now
     * **/
    public void getVotingList(){
        Iterator<Voting> ite=votingList.iterator();

        while (ite.hasNext()){
            Voting temp=ite.next();
            System.out.println("question: "+temp.getQuestion());
            System.out.println(temp.alternatives);
            int i=0;
            while(i<temp.voters.size()){
                System.out.println("voter : "+temp.voters.get(i).getFirstName()+" "+temp.voters.get(i).getLastName());
                i++;
            }
            System.out.println("up to now");

        }

    }

    //public void getVoting(int index){
    //    votingList.get(index);
    //}
    /**make a vote
     * @param index index of voting
     * @param person who want  to vote
     * @param choices of a person**/
    public void vote(int index,Person person,ArrayList<String> choices){
        votingList.get(index).vote(person,choices);
    }
    /**find and print the result of a voting
     * @param index of a voting**/
    public void getResult(int index){
        Voting voting=votingList.get(index);
        Iterator<String> ite=voting.alternatives.iterator();
        Iterator<String> it=voting.alternatives.iterator();
        HashMap<Integer,String> voteOfAlternative=new HashMap<>();
        int numberOfVotes=0;
        while (ite.hasNext()) {
            //create polls
            voting.createPoll(ite.next());
        }
        int sum;
        while (it.hasNext()){
            String temp=it.next();
            if (voting.polls.containsKey(temp)){
                sum=voting.polls.get(temp).size();
                voteOfAlternative.put(sum,temp);
                System.out.println(temp+"|votes: "+sum);
                numberOfVotes+=sum;
            }
        }
        int s=0;
        String alter = null;
        for (int i:voteOfAlternative.keySet()) {
            if (i>s){
                s=i;
                alter=voteOfAlternative.get(i);
            }
        }
        //System.out.println("number of votes: "+(numberOfVotes));
        System.out.println("winner: "+alter+" |votes: "+s);

    }

}
