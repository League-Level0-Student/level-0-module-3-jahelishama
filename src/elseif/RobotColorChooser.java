
//    Copyright (c) The League of Amazing Programmers 2013-2017
//    Level 0

package elseif;

import javax.swing.JOptionPane;

import org.jointheleague.graphical.robot.Robot;

import java.awt.Color;
import java.util.Random;

public class RobotColorChooser {
	public static void main(String[] args) {
         Robot jah=new Robot(); 
         
         for (int i = 0; i < 100; i++) {
		//3. ask the user what color they would like the robot to draw
	String yah=JOptionPane.showInputDialog("what color do you want the rbot to draw");
		//4. use an if/else statement to set the pen color that the user requested
        if (yah.equals ("blue")) {
			jah.setPenColor(Color.BLUE);
		} 
        //5. if the user doesn’t enter anything, choose a random color
        jah.setRandomPenColor();
			
		
        //6. put a loop around your code so that you keep asking the user for more colors & drawing them
		
			
		
		//2. set the pen width to 10
		
	    //1. make the robot draw a shape (this will take more than one line of code
        jah.penDown();
        jah.move(100);
        jah.turn(90);
         }
	}
}
