/*
Create a function that creates a box based on dimension n.

For example:

makeBox(3) ➞ [
"###",
"#  #",
"###"
]

makeBox(2) ➞ [
"##",
"##"
]*/
import java.util.*;
public class challenge3 {
    
    public static void makeBox(int n){
        for(int i=0; i<=n-1;i++){
            for(int j=0; j<=n-1;j++){
                if(i==0||j==0||i==n-1||j==n-1){
                    System.out.print("#");
                }
                else{
                    System.out.print(" ");
                }  
            }
            System.out.println();
        }
    }
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();
        makeBox(num);
    }
}
