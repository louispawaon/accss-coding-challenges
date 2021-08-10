/*Challenge 3

Hermione has come up with a precise formula for determining whether or not a phrase was ssspoken by a parssseltongue 
(a reference from the Harry Potter universe; the language of ssserpents and those who can converse with them).

Each word in a sssentence must contain either:
Two or more consecutive instances of the letter "s" (i.e. must be together ss..), or...
Zero instances of the letter "s" by itself.
For example:

Sshe ssselects ssso to eat that apple.
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
            decision=true;
        }
        else{
            decision=false;
        }
        return decision;  
}
    public static void main(String[] args){
        String cipher = "Sshe ssselects ssso to eat that apple.".toLowerCase();
        String[] message = cipher.split(" ");
        ArrayList<String>decode=new ArrayList<String>();
        ArrayList<Boolean>verdict = new ArrayList<Boolean>();
        for (String s:message){
            char ch = s.charAt(0);
            if(ch=='s'){
                decode.add(s);
            }
        }
        System.out.println(decode.toString());
        for(String x:decode){
            verdict.add(isParselTongue(x));
        }
        
    }
}

//traverse string 
//find ascii S or s
// check if there is another s or S at the left or right of the string
// if yes=true if no=false
// get the words with s, then scan them if they have repeating 