package stupid.controller;

import java.util.Scanner;

public class StupidController
{
	private String myName;
	private Scanner inputReader;

	public StupidController()  //constructor
	{
		myName = "Kaden Martinsen";
		inputReader = new Scanner(System.in);
	}

	public void start()
	{
		System.out.println("this program is less stupid");
		System.out.println("My name is " + myName);
		askQuestions();
	}
	
	private void askQuestions()
	{
		System.out.println("How is your day?");
		String input = inputReader.nextLine();
		System.out.println("Oh you said: " + input + " about your day");
		
		System.out.println("My next question is this: what type of food is the best?");
		String foodInput = inputReader.next();
		System.out.println ("OK, you typed this: " + foodInput);
		
		
		
		
		
		
		
		
		
	}
}
