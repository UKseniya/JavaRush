package com.javarush.test.level05.lesson05.task01;

/* Create a class Cat
Create a class Cat. A cat must have its name (name, String), age (age, int), weight (weight, int), and strength (strength, int).
*/

public class Cat
{
    private String name;
    private int age;
    private int weight;
    private int strength;

    //add your code here

    public static void main(String[] args)
    {

    }

    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name;
    }

    public int getAge(){
        return age;
    }

    public void setAge(int age){
        this.age = age;
    }

    public int getWeight(){
        return weight;
    }

    public void setWeight(int weight){
        this.weight = weight;
    }

    public int getStrength(){
        return strength;
    }

    public void setStrength(int strength){
        this.strength = strength;
    }

}
