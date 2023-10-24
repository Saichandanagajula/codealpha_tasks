import java.util.Scanner;
import java.util.Random;
class CodeAlpha 
{
	public static void main(String[] args) 
	{
		Random randomNum=new Random();	
		int random1=randomNum.nextInt(100);
		System.out.println("=====GUESSING NUMBER GAME=====");
		System.out.println("--Numbers between 1 to 100--");
		System.out.println("Random number is: "+random1);
	    
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter your number: ");
		int guess=scan.nextInt();
		if (guess==random1)
		{
			System.out.println("The numbers are same");
			System.out.println("*******HEYYY..!YOU WON THE GAME*********");

		}
		else if (guess<random1)
		{
			System.out.println("The number you guessed is less than the random number");
		}
		else
		{
			System.out.println("The number you guessed is greater than the random number");
		}

	}
}
