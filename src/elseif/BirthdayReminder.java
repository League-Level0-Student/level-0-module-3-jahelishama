
//    Copyright (c) The League of Amazing Programmers 2013-2017
//    Level 0

package elseif;

import javax.swing.JOptionPane;

public class BirthdayReminder {

	public static void main(String[] args) {
	
		// 1. correct the birthdays for your family below
		String momsBirthday = "January 24th";
		String dadsBirthday = "June 9th";
		String myBirthday = "April 16th";

		// 2. Find out which birthday the user wants and and store their response in a variable
	String ja=JOptionPane.showInputDialog("Which birthay do you want");
		// 3. Print out what the user typed
	System.out.println("mom");
		// 4. if user asked for "mom"
			//print mom's birthday
           if (ja.equals("mom")) {
			System.out.println(momsBirthday);
		}
		// 5. if user asked for "dad"
			// print dad's birthday
           else if (ja.equals("dad")) {
			System.out.println(dadsBirthday);
		}
		// 6. if user asked for your name
			// print myBirthday
           else if (ja.equals("me")) {
			System.out.println(myBirthday);
		}
           else if(ja.equals("Maxson")) {
        	  System.out.println("4754050985094850938409-309-092=-3409000-0klfhkagghhhhhhhelppppp"); 
           } else {
         	  System.out.println("I don't remember that persons name DUMMY!"); 
            }
        	   
		//7. otherwise print "Sorry, i don't remember that person's birthday!"
           
	} 
}
