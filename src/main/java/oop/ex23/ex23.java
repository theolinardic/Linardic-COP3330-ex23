/*
 *  UCF COP3330 Summer 2021 Assignment 1 Exercise 23 Solution
 *  Copyright 2021 Theodore Linardic
 */


package oop.ex23;

import java.util.Scanner;

public class ex23 {
    public static void main( String[] args )
    {
        Scanner userInputScanner = new Scanner(System.in);

        System.out.print("Is the car silent when you turn the key? (y/n) ");
        String answerSilent = userInputScanner.next();

        if(answerSilent.equals("y")){
            System.out.print("Are the battery terminals corroded?");
            String answerCorroded = userInputScanner.next();

            if(answerCorroded.equals("y")){
                System.out.print("Clean terminals and try starting again.");
                System.exit(0);
            }
            else{
                System.out.print("Replace cables and try again.");
                System.exit(0);
            }
        }
        else{
            System.out.print("Does the car make a slicking noise? ");
            String answerSlicking = userInputScanner.next();

            if(answerSlicking.equals("y")){
                System.out.print("Replace the battery.");
                System.exit(0);
            }
            else{
                System.out.print("Does the car crank up but fail to start?");
                String answerCrank = userInputScanner.next();

                if(answerCrank.equals("y")){
                    System.out.print("Check spark plug connections.");
                    System.exit(0);
                }
                else{
                    System.out.print("Does the engine start and then die? ");
                    String answerStart = userInputScanner.next();

                    if(answerStart.equals("y")){
                        System.out.print("Does your car have fuel injection? ");
                        String answerInjection = userInputScanner.next();

                        if(answerInjection.equals("y")){
                            System.out.print("Get it in for service.");
                            System.exit(0);
                        }
                        else{
                            System.out.print("Check to ensure the choke is opening and closing.");
                            System.exit(0);
                        }
                    }
                    else{
                        System.out.print("This should not be possible.");
                        System.exit(0);
                    }
                }
            }
        }
    }
}
