import java.util.Scanner;

public class PrimeNo {

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the number: ");
		int number=sc.nextInt();
		int count=1;
		
		for(int i=1;i<number;i++)
		{
			if(number%i==0)
			{
				count++;
			}
			
		}
		
		if(count==2)
		{
			System.out.println("Number is Prime");
		}
		else
		{
			System.out.println("Number is not a prime");
		}

	}

}
