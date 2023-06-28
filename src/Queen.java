package com.Shirisha;

import java.util.*;

public class   Queen {
    public static void main(String[] args) {
        System.out.println("She was the queen of hearts who defeated the heartless king");
        System.out.println("but alas! there was a loop in the plan, a flaw");
        Queen.weapon();
    }

    public static void weapon(){
        System.out.println("Select the weapon used to kill the queen");
        //menu
        Scanner sc= new Scanner(System.in);
        System.out.println("enter a. for poison");
        System.out.println("enter b. for an arrow");
        System.out.println("enter c. for framed for treason");
        System.out.println("enter d. for a gunshot");
        System.out.println("enter e. for hunger");
        System.out.println("enter f. for other");
        System.out.println("enter *. if you believe the queen faked her death and is till alive");
        char ch;
        //how to input a character in java using Scanner class
        ch= sc.next().charAt(0);
        switch(ch){
            case 'a': case 'b': case 'c': case 'd': case 'e': case 'f':
                System.out.println("wrong choice!!!");
                break;
            case '*':
                System.out.println("you guessed right!!!");
                break;
            default:
                System.out.println("the choice doesn't exist!");
        }

    }
}
