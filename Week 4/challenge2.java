/*
Create a function that takes an array of numbers and return "Boom!" if the digit 7 appears in the array. Otherwise, return "there is no 7 in the array".
a as the coefficient of x^2
b as the coefficient of x
c as the constant term

For example:

sevenBoom([1, 2, 3, 4, 5, 6, 7]) ➞ "Boom!"
// 7 contains the number seven.

sevenBoom([8, 6, 33, 100]) ➞ "there is no 7 in the array"
// None of the items contain 7 within them.

sevenBoom([2, 55, 60, 97, 86]) ➞ "Boom!"
// 97 contains the number seven.
*/
public class challenge2 {

    static boolean sevenBoom(int[] arr){
        for (int x=0;x<arr.length;x++){
                if((arr[x]%10==7)||(Integer.parseInt(Integer.toString(arr[x]).substring(0, 1)))==7) //Used Modulo 10 to return a 7 if a number ends with 7,
                                                                                                    //and used a substring to return true if the first number is 7
                {  
                    return true;
                }
        }
        return false;
        
    }

    public static void main(String[] args){
        int[] num = {8, 6, 33, 100, 70}; //Test Array
        if(sevenBoom(num)){ 
            System.out.println("Boom!"); //If True then Boom!
        }
        else{
            System.out.println("There is no 7 in the array"); //Else then no 7 in the array
        }
        
    }
}

/*
a as the coefficient of x^2
b as the coefficient of x
c as the constant term

i do not get that part of the instruction
*/
