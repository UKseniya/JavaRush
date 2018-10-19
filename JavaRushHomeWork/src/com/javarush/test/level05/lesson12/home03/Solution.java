package com.javarush.test.level05.lesson12.home03;

/* Create public static classes Dog and Cat
Add three fields to each class at your option.
    Create objects for the Tom and Jerry cartoon characters, as much as you remember.
    Example:
    Mouse jerryMouse = new Mouse(“Jerry”, 12 (height, cm), 5 (tail length, cm))
*/

public class Solution
{
    public static void main(String[] args)
    {
        Mouse jerryMouse = new Mouse("Jerry", 12 , 5);

        //add your code here
        Cat catTom = new Cat("Tom", 2, 30);
        Dog dogSpike = new Dog("Spike", 5, "brown");
    }

    public static class Mouse
    {
        String name;
        int height;
        int tail;

        public Mouse(String name, int height, int tail)
        {
            this.name = name;
            this.height = height;
            this.tail = tail;
        }
    }

    //add your classes here
    public static class Cat
    {
        String name;
        int age;
        int height;

        public Cat(String name, int age, int height)
        {
            this.name = name;
            this.age = age;
            this.height = height;
        }
    }

    public static class Dog
    {
        String name;
        int age;
        String color;

        public Dog(String name, int age, String color)
        {
            this.name = name;
            this.age = age;
            this.color = color;
        }
    }

}
