package demo.aoa4eva.me;

public class FizzBuzzApp {
	/**
	 * This is an application that displays "Fizz" for multiples of 3, "Buzz" for multiples of 5, and "FizzBuzz" for multiples of both. 
	 * It has been extended so that multiples of 2 and 10 show Copy and Cat respectively, and each word shows up where the number is a multiple
	 * of any of the indicated numbers. 
	 * @author aoa4eva
	 * */
	public static void main(String[] args) {
		//local variables 
		
		//Holds the value of the Fizz and/or Buzz String 
		String fizzBuzz=null; 
		
		//Sets the counter to a range from 1 to 100, increasing by 1 after each loop
		for(int counter=1; counter<101; counter++)
		{
			//Clears the value of fizzBuzz
			fizzBuzz="";

			//Prints "Fizz" for multiples of 3
			if(counter%2==0)
			{
				fizzBuzz+="Copy";
			}
			if(counter%3==0)
			{
				fizzBuzz+="Fizz";
			}
			//Prints "Buzz" for multiples of 5
			if(counter%5==0)
			{
				fizzBuzz+="Buzz";
			}
			if(counter%10==0)
			{
				fizzBuzz+="Cat";
			}
			//converts the counter to a string value that can be displayed 
			if(counter%3!=0&&counter%5!=0)
			{
				fizzBuzz=Integer.toString(counter);
			}
			System.out.println(fizzBuzz);

		}
	}

}
