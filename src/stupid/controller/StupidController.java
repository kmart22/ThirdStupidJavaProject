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
		String foodInput = inputReader.nextLine();
		if(!foodInput.equals(""));
				{
					System.out.println ("OK, you typed this: " + foodInput);
				}
		System.out.println("Why is that food the best?");
		String whyFood = inputReader.nextLine();
		System.out.println("you said " + whyFood);
		
		System.out.println("How old are you?");
		int ageInput = inputReader.nextInt();
		System.out.println("oh wow you're " + ageInput + " year(s) old");
		
		System.out.println("What is your name?");
		String nameInput = inputReader.next();
		System.out.println("your name is " + nameInput);
		inputReader.nextLine();
		
		System.out.println("what is a number with a decimal?");
		float numberInput = inputReader.nextFloat();
		System.out.println("you said " + numberInput);
		
		
		
	
	}
}
