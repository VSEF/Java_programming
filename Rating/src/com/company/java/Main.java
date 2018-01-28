package com.company.java;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	    int rating;
	    System.out.println("Please estimate our service (acceptable integer from 1 to 5):");
	    Scanner sc = new Scanner(System.in);
	    rating = sc.nextInt();
	    if (rating > 0 && rating <=5){
	        if (rating <=2){
	            System.out.println("What was wrong? Could you explain your this reate " + rating + "?");
	            String explanationFeedBack;
	            Scanner sc2 = new Scanner(System.in);
	            explanationFeedBack = sc2.next();
	            int expl = explanationFeedBack.length();
	            if(expl>=5){
	                System.out.println("Thanks for your details!");
                } else{
	                System.out.println("Sorry for that!");
                }
            }
	        System.out.println("Thanks for your feedback!");
        } else {
	        System.out.println("You've entered invalid data. Try again.");
        }

    }
}
