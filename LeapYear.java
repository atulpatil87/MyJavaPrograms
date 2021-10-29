package kunal;

import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args) {
        int year;
        System.out.println("Enter The Year");
        Scanner in = new Scanner(System.in);
        year = in.nextInt();

        if( (year % 4 == 0))
        {
            System.out.println("THIS IS LEAP YEAR");
        }
        else {
            System.out.println("THIS IS NOT LEAP YEAR");
        }
    }
}

