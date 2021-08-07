/*Challenge 2
    Create a function that calculates the number of different squares in an n * n square grid. 
    This includes all possible squares formed on that grid.

    For example:

    numberSquares(2) ➞ 5

    numberSquares(4) ➞ 30

    numberSquares(5) ➞ 55*/

public class challenge2 {

    static int numberSquares(int x){
        int sum=0; //set sum
        for (int i=0;i<x+1;i++){ //iterate from x until x+1
            sum+=(i*i); //sum all perfect squares given x
        }
        return sum;

    }
    public static void main (String[] args){
        int n=4; //trial integer
        System.out.println(numberSquares(n));
    }
}
