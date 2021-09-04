/*
The -Ber months have already begun so Christmas Eve is almost upon us, so naturally we need to prepare some milk and cookies for Santa! 
Create a function that accepts a Date object and returns true if it's Christmas Eve (December 24th) and false otherwise. 
Keep in mind that some languages (ahem*Javascript*) 
Date month is 0 based, meaning December is the 11th month while January is 0. For example:

timeForMilkAndCookies(new Date(2013, 11, 24)) ➞ true

timeForMilkAndCookies(new Date(2013, 0, 23)) ➞ false

timeForMilkAndCookies(new Date(3000, 11, 24)) ➞ true
*/
import java.time.*;
import java.util.*;
public class challenge1{
   
    public static boolean timeForMilkAndCookies(LocalDate check){
        LocalDate christmas = LocalDate.of(0,12,24); //Christmas Eve Template where 1 = January and so on
        int monthChrismas = christmas.getMonthValue(); 
        int dayChristmas = christmas.getDayOfMonth();
        int monthGiven = check.getMonthValue();
        int dayGiven = check.getDayOfMonth();
        if((monthChrismas-monthGiven==0)&&(dayChristmas-dayGiven==0)){ //If Both Returns Zero, then it is time for milk and cookies
            return true;
        }
        return false;
    }
    public static boolean timeForMilkAndCookiesVer2(Date check){
        Date christmas =new Date(0,11,24); //Christmas Eve Template in Date Object where 0 = January and so on
        Calendar cal = Calendar.getInstance(TimeZone.getTimeZone("UTC"));
        Calendar cal2 = Calendar.getInstance(TimeZone.getTimeZone("UTC")); //Using Calendar to retrieve the month and the day of the month 
        cal.setTime(christmas);
        cal2.setTime(check);
        int monthChrismas = cal.get(Calendar.MONTH);
        int dayChristmas = cal.get(Calendar.DAY_OF_MONTH);
        int monthGiven = cal2.get(Calendar.MONTH);
        int dayGiven = cal2.get(Calendar.DAY_OF_MONTH);
        if((monthChrismas-monthGiven==0)&&(dayChristmas-dayGiven==0)){ //If Both Returns Zero, then it is time for milk and cookies
            return true;
        }
        return false;
    }
    public static void main(String[] args){
        LocalDate date = LocalDate.of(3000, 11, 24); //Using LocalDate since Date Object is already Depreciated in Java 8
        Date test = new Date(3000, 11, 24); //Using the depreciated Date Object to satisfy the instruction
        System.out.println(timeForMilkAndCookies(date));
        System.out.println(timeForMilkAndCookiesVer2(test)); //Date Objct test 
    }
}