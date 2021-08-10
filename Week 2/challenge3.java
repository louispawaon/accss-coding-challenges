/*Challenge 3

Hermione has come up with a precise formula for determining whether or not a phrase was ssspoken by a parssseltongue 
(a reference from the Harry Potter universe; the language of ssserpents and those who can converse with them).

Each word in a sssentence must contain either:
Two or more consecutive instances of the letter "s" (i.e. must be together ss..), or...
Zero instances of the letter "s" by itself.
For example:

isParselTongue("Sshe ssselects to eat that apple. ") ➞ true

isParselTongue("She ssselects to eat that apple. ") ➞ false
// "She" only contains one "s".

isParselTongue("Beatrice samples lemonade") ➞ false
// While "samples" has 2 instances of "s", they are not together.*/

import java.util.*;
public class challenge3 {
    static boolean isParselTongue(String code){
        boolean decision = false;
        if(code.contains("ss")){ 
            decision=true; //if word may include a "ss" pattern, automatically it will return true
        }
        else{
            decision=false;
        }
        return decision;  
}
    public static void main(String[] args){
        String cipher = "Sshe ssselects to eat that apple. ".toLowerCase(); //lowercased the trial string to make things easier
        String[] message = cipher.split(" "); //split the string into a string array 
        ArrayList<String>decode=new ArrayList<String>(); 
        ArrayList<Boolean>verdict = new ArrayList<Boolean>();
        Boolean decision = true;
        for (String s:message){ //iterate through the message[] and locate any word that would start with "s"
            char ch = s.charAt(0);
            if(ch=='s'){
                decode.add(s); //add every word from the message[] to the decode arraylist(arraylist to make things easier)
            }
        }
        for(String x:decode){
            verdict.add(isParselTongue(x)); //calling my boolean method and add every return value to the verdict arraylist
        }
        if(verdict.size()<2){ //this applies if there is at most 1 element in the verdict arraylist (to satisfy the condition where there is only 1 word that starts with "s")
            for(Boolean j:verdict){
                System.out.println(j);
            }
            System.exit(0); 
        }
        for(Boolean k:verdict){
            if(!k.equals(verdict.get(0))){ //checks if all boolean values in the arraylist are all equal to each other
                decision=false;
            }
        }
        System.out.println(decision); //would either print true(default value) or false
    }
}

//This is my least ingenious way to solve this challenge and I don't even know if I satisfied the challenge