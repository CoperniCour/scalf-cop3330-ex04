/*
 *  UCF COP3330 Summer 2021 Assignment 1 Solution
 *  Copyright 2021 Courtney Scalf-Crickenberger
 */

//Exercise 4 - Mad Lib

package org.example;

import java.util.Scanner;
import java.text.MessageFormat;

public class Exercise4 {
    public static void main(String[] args) {
    /*Mad libs are a simple game where you create a story template with blanks for words.
     *You, or another player, then construct a list of words and place them into the story,
     *creating an often silly or funny story as a result.
     *Create a simple mad-lib program that prompts for a noun, a verb, an adverb, and an
     *adjective and injects those into a story that you create.*/

        //Get noun {01}
        Scanner getNoun = new Scanner(System.in);
        System.out.print("Enter a noun: ");
        String Noun = getNoun.nextLine();

        //Get verb {02}
        Scanner getVerb = new Scanner(System.in);
        System.out.print("Enter a verb: ");
        String Verb = getVerb.nextLine();

        //Get adjective {03}
        Scanner getAdj = new Scanner(System.in);
        System.out.print("Enter an adjective: ");
        String Adj = getAdj.nextLine();

        //Get adverb {04}
        Scanner getAdverb = new Scanner(System.in);
        System.out.print("Enter an adverb: ");
        String Adverb = getAdverb.nextLine();

        //Print out Madlib with input from user
        String Message = MessageFormat.format("Do you {0} your {1} {2} {3}? That's hilarious!", Verb, Adj, Noun, Adverb);
        System.out.println(Message);

    }
}
