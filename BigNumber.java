	import java.util.Scanner;

	public class BigNumber{
 	 public static void main(String[] args){


    Scanner input = new Scanner(System.in);

    //Declare variables/types

    int x;


    //Add code here for Inputs, if/else statements, while loops

    	System.out.print("Please enter a number: ");
    		x = input.nextInt();


    	if( x > 1_000_000 ){
			System.out.println("That is a big number.");
		}

		Index.main(null);

  }
}