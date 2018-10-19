package com.javarush.test.level05.lesson12.home04;

/* Display the current date
Display to the screen the current date in a form similar to «21 02 2014».
*/

import java.text.SimpleDateFormat;
import java.util.Date;

public class Solution
{
    public static void main(String[] args)
    {
        //add your code here
        SimpleDateFormat form = new SimpleDateFormat("dd MM yyyy" );
        Date currentDate = new Date();
        System.out.println( form.format(currentDate) );

    }
}
