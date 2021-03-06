package recursion.model;

public class Recursion 
{
	
	public double calculatedFactIterative()
	{
		return 0;
	}
	
	public int calculateFibIterative()
	{
		return 0;
	}

	public long calculateFactorial(long currentNumber)
	{
		if(currentNumber == 0 || currentNumber == 1)
		{
			return 1;
		}
		else
		{
			return calculateFactorial(currentNumber - 1) * currentNumber;
		}
	}
	
	public int calculatedFibonacci(int currentNumber)
	{
		if(currentNumber == 0 || currentNumber == 1)
		{
			return 1;
		}
		else
		{
			return calculatedFibonacci(currentNumber - 1) + calculatedFibonacci(currentNumber - 2);
		}
	}
}

