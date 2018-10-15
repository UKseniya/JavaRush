package com.javarush.test.level04.lesson06.task03;

/* Sort three numbers
Write a program that reads three numbers from keyboard and displays them in descending order.
*/

import java.io.*;

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        //add your code here
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int a = Integer.parseInt(reader.readLine());
        int b = Integer.parseInt(reader.readLine());
        int c = Integer.parseInt(reader.readLine());
        int x, y, z;

        if(a > b && a > c){
            if(b > c){
                x = a;
                y = b;
                z = c;
            }
            else{
                x = a;
                z = b;
                y = c;
            }
        }
        else if(b > a && b > c){
            if (a > c){
                x = b;
                y = a;
                z = c;
            }
            else{
                x = b;
                y = c;
                z = a;
            }
        }
        else{
            if(a > b){
                x = c;
                y = a;
                z = b;
            }
            else{
                x = c;
                y = b;
                z = a;
            }
        }
        System.out.print(x + " " + y + " " + z);

    }
}
