package Miscellaneous;

public class Prime {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		isPrime(29);

	}
	
	
	public static  void isPrime(int num)
	{
		boolean isPrime = true;
		for(int i=2;i<num;i++)
		{
			if(num%i==0)
			{
				 isPrime = false;
				 break;
			 }
		}
		if(isPrime)
		{
			System.out.println("Yes");
		}
		else
		{
			System.out.println("No");
		}
		

	}



}


