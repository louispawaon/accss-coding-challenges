/*Challenge 1
    
Create a method that takes a string as its argument and returns the string in reversed order.

For example:

reverse("Hello World") ➞ "dlroW olleH"

reverse("The quick brown fox.") ➞ ".xof nworb kciuq ehT"

reverse("Let's go CS Chameleons!") ➞ "!snoelemahC SC og s'teL"*/
public class challenge1{

    static void reverse(char[] result){
        for (int x=result.length-1;x>=0;x--){
            System.out.print(result[x]); //reversing the character array using iteration
        }
    }
    public static void main(String[] args){
        String attempt = "Let's go CS Chameleons!"; //trial string
        char[] answer = attempt.toCharArray(); //simple conversion of string to character array
        reverse(answer); // call reverse method     
    }

}
