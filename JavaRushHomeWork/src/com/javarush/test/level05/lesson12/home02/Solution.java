package com.javarush.test.level05.lesson12.home02;

/* A Man and A Woman
1. Create public static classes Man and Woman within the class Solution.
    2. Classes must have fields: name(String), age(int), address(String).
    3. Create constructors to pass all the possible parameters to.
    4. Use the constructor to create two objects of each class with all the data.
    5. Display the objects in format [name + " " + age + " " + address].
*/

public class Solution
{
    public static void main(String[] args)
    {
        //create two object of every class here
        Man man1 = new Man("Tom", 34, "London, 54523");
        Man man2 = new Man("John", 28, "San Ramon, 23423");
        Woman woman1 = new Woman("Katty", 14, "New York, 43242");
        Woman woman2 = new Woman("Sveta", 40, "Atyrau, 34234");

        man1.toPrint();
        man2.toPrint();
        woman1.toPrint();
        woman2.toPrint();

        //output them to screen here
    }

    //add your classes here
    public static class Man
    {
        private String name;
        private int age;
        private String address;

        public Man(String name, int age, String address)
        {
            this.name = name;
            this.age = age;
            this.address = address;
        }

        public void toPrint()
        {
            System.out.println(name + " " + age + " " + address);
        }
    }
    public static class Woman
    {
       private String name;
       private int age;
       private String address;

        public Woman(String name, int age, String address)
        {
            this.name = name;
            this.age = age;
            this.address = address;
        }

        public void toPrint()
        {
            System.out.println(name + " " + age + " " + address);
        }
    }
}
