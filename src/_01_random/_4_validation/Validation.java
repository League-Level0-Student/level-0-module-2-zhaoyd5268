//    Copyright (c) The League of Amazing Programmers 2013-2019
//    Level 0

package _01_random._4_validation;

import java.util.Random;

import javax.swing.JOptionPane;

public class Validation {
	public static void main(String[] args) {
		
		Random randomMaker = new Random();
		
		int compliment = randomMaker.nextInt(5);
		
		System.out.println(compliment);
int i = 0;
		// 1. Use each value of randomNumber to give the user a random compliment.
for (i=0; i<12; i++) {
if (compliment==0) {
System.out.println("You are a nice person!");
} else if (compliment==1) {
System.out.println("You have a beutiful face!");
} else if (compliment==2) {
System.out.println("You are very generous to those who need it!");	
} else if (compliment==4) {
	System.out.println("People look at you and smile!");
} else if (compliment==5) {
	System.out.println("You never give up and always look on the bright side of things!");
}
compliment = randomMaker.nextInt(5);

	}
	}	// 2. Repeat all the code above 10 times
		
		// 3. Find someone to test out your program. They will like it :)
}
