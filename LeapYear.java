// Program to determine whether a year is a leap year
// or a normal year by inputting the year

// @author: Oudone PKL


//  for check a year is a leap year or not
public class LeapYear {

    public static void checkLeapYear() {

        int year = 2020;
        boolean leap = false;

        if (year % 4 == 0)
            if(year % 100 == 0) 
                if(year % 400 == 0)
                    leap = true;
                else leap = false;
            else leap = true;
        else leap = false;

        if(leap == true)
            System.out.println(year + " is a leap year.");
        else
            System.out.println(year + " is not a leap year.");
    }

    public static void main(String[] args) {
        
        // call the method and display to screen
        checkLeapYear();
    }
}
