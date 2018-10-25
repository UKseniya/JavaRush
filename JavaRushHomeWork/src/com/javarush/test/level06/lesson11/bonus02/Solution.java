package com.javarush.test.level06.lesson11.bonus02;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* Add new functionality to the program.
Old task: Every cat has a name and a mom cat. Write a class to describe this situation. Create two objects: a daughter cat and
a mom cat. Display them to the screen.
    New task: Every cat has a name, a dad cat and a mom cat. Write a class to describe this situation.
    Create 6 objects: mom, dad, son, daughter, grandma (mom’s mom) and grandpa (dad’s dad).
    Display them to the screen as follows: grandpa, grandma, dad, mom, son and daughter.

    Example input:
    grandpa Vinny
    grandma Maisy
    dad Kaos
    mom Velvet
    son Mario
    daughter Fluffy

    Example output:
    Cat name is grandpa Vinny, no mother, no father
    Cat name is grandma Maisy, no mother, no father
    Cat name is dad Kaos, no mother, father is grandpa Vinny
    Cat name is mom Velvet, mother is grandma Maisy, no father
    Cat name is son Mario, mother is mom Velvet, father is dad Kaos
    Cat name is daughter Fluffy, mother is mom Velvet, father is dad Kaos
*/

public class Solution
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String grandfatherName = reader.readLine();
        Cat catGrandfather = new Cat(grandfatherName, null, null);

        String grandmotherName = reader.readLine();
        Cat catGrandmother = new Cat(grandmotherName, null, null);

        String fatherName = reader.readLine();
        Cat catFather = new Cat(fatherName, null, catGrandfather);

        String motherName = reader.readLine();
        Cat catMother = new Cat(motherName, catGrandmother, null);

        String sonName = reader.readLine();
        Cat catSon = new Cat(sonName, catMother, catFather);

        String daughterName = reader.readLine();
        Cat catDaughter = new Cat(daughterName, catMother, catFather);

        System.out.println(catGrandfather);
        System.out.println(catGrandmother);
        System.out.println(catFather);
        System.out.println(catMother);
        System.out.println(catSon);
        System.out.println(catDaughter);
    }

    public static class Cat
    {
        private String name;
        private Cat parent1;
        private Cat parent2;

        Cat(String name)
        {
            this.name = name;
        }

        public Cat(String name, Cat parent1, Cat parent2)
        {
            this.name = name;
            this.parent1 = parent1;
            this.parent2 = parent2;
        }

        @Override
        public String toString()
        {
            if (parent1 == null && parent2 == null)
                return "Cat name is " + name + ", no mother" + ", no father";
            else if(parent1 == null)
                return  "Cat name is " + name + ", no mother" + ", father is " + parent2.name;
            else if(parent2 == null)
                return "Cat name is " + name + ", mother is " + parent1.name + ", no father";
            else
                return "Cat name is " + name + ", mother is " + parent1.name + ", father is " + parent2.name;
        }
    }

}
