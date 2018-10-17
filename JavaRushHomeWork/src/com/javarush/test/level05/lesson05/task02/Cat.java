package com.javarush.test.level05.lesson05.task02;

/* Implement method fight
Implement method boolean fight(Cat anotherCat): implement a fight mechanism depending on cats’ weight, age and strength.
Make up a dependency by yourself. The method should determine, whether current cat (the object whose fight method was called)
or anotherCat won fight, i.e. return true if current cat won and false, if it didn’t win. The following condition must be met:
    if cat1.fight(cat2) == true, then cat2.fight(cat1) == false
*/

public class Cat
{
    public String name;
    public int age;
    public int weight;
    public int strength;

    public Cat()
    {
    }

    public boolean fight(Cat anotherCat)
    {
        //add your code here


        if(this.totalScore() > anotherCat.totalScore())
            return true;
        else
            return false;
    }

    public int totalScore(){
        int ageScore;
        if(age <=1 )
            ageScore = 1;
        else if(age > 2 && age < 5)
            ageScore = 3;
        else
            ageScore = 2;

        int weightScore;
        if(weight <= 1)
            weightScore = 1;
        else if(weight > 1 && weight < 3)
            weightScore = 3;
        else
            weightScore = 2;

        int strengthScore;
        if(strength < 3)
            strengthScore = 1;
        else
            strengthScore = 3;

        int totalScore = ageScore + weightScore + strengthScore;
        return totalScore;
    }

    public static void main(String[] args)
    {
        Cat cat1 = new Cat();
        Cat cat2 = new Cat();

        cat1.name = "Tom";
        cat1.age = 3;
        cat1.weight = 1;
        cat1.strength = 2;

        cat2.name = "Patric";
        cat2.age = 4;
        cat2.weight = 2;
        cat2.strength = 9;
        System.out.println(cat1.totalScore());
        System.out.println(cat2.totalScore());
        System.out.println(cat1.fight(cat2));
        System.out.println(cat2.fight(cat1));

        }
}
