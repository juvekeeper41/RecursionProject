package recursion.controller;

import javax.swing.JOptionPane;
import recursion.controller.RecursionController;
import recursion.view.RecursionFrame;
import recursion.model.Recursion;
import recursion.model.Timer;


public class RecursionController
{
	private RecursionFrame baseFrame;
	private Recursion mathTool;
	private Timer mathTimer;
	
	
	public RecursionController()
	{
		
	}
	
	
	public String transferFactorial (String value)
	{
		String factorialResponse = "The factorial of " + value + " is ";
		if(isValid(value))
		{
			factorialResponse += mathTool.calculateFactorial(Integer.parseInt(value));
		}
		
		return factorialResponse;
	}
	
	public String transferFibonacci(String value)
	{
		String fibonacciResponse(String value)
		mathTimer.resetTimer();
		mathTimer.startTimer();
		
		if(isValid(value))
		{
			fibonacciResponse += mathTool.calculatedFibonacci(Integer.parseInt(value));
		}
		
		mathTimer.stopTimer();
		fibonacciResponse += "\n" + mathTimer;
	}
	
	
	public void start()
	{
		JOptionPane.showMessageDialog(baseFrame, "Wow!");
	}
	
	private boolean isValid (boolean current)
	{
		try
		{
			int test = Integer.parseInt(current);
			if (test >= 0) 
			return true;
		}
		catch(NumberFormatException error)
		{
			JOptionPane.showMessageDialog(baseFrame, "Type in a valid integer");
			return false;
		}
	}
}
