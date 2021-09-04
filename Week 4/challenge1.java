/*
The -Ber months have already begun so Christmas Eve is almost upon us, so naturally we need to prepare some milk and cookies for Santa! 
Create a function that accepts a Date object and returns true if it's Christmas Eve (December 24th) and false otherwise. 
Keep in mind that some languages (ahem*Javascript*) 
Date month is 0 based, meaning December is the 11th month while January is 0. For example:

timeForMilkAndCookies(new Date(2013, 11, 24)) ➞ true

timeForMilkAndCookies(new Date(2013, 0, 23)) ➞ false

timeForMilkAndCookies(new Date(3000, 11, 24)) ➞ true
*/

import java.time.LocalDate;
public class challenge1{
   
    public static boolean timeForMilkAndCookies(LocalDate check){
        LocalDate christmas = LocalDate.of(0,12,24); //Christmas Eve Template
        int monthChrismas = christmas.getMonthValue(); 
        int dayChristmas = christmas.getDayOfMonth();
        int monthGiven = check.getMonthValue();
        int dayGiven = check.getDayOfMonth();
        if((monthChrismas-monthGiven==0)&&(dayChristmas-dayGiven==0)){ //If Both Returns Zero, then it is time for milk and cookies
            return true;
        }
        return false;
    }
    public static void main(String[] args){
        LocalDate date = LocalDate.of(3000, 11, 24); //Using LocalDate since Date is already Depreciated in Java 8
        System.out.println(timeForMilkAndCookies(date));
    }
}