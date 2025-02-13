package com.example;

import com.example.model.Person;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );

        Person reed = new Person("Reed", 28);

        System.out.println("This is " + reed.getName() + " and he is " + reed.getAge() + " years old.");

        System.out.println( "Hello Again World!" );
    }
}
